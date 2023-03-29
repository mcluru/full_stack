/*
	 sub query
	 
	 1. Main Query와 반대되는 개념으로 이름을 부여한 것.
	 2. Main Query를 구성하는 소단위 쿼리(종속쿼리)
	 3. subquery안에는 select, insert, delete, update 모두 사용 가능
	 4. sub query의 결과값을 메인쿼리가 사용하는 중간값으로 사용가능
	 5. sub query 자체는 일반쿼리와 같음
	 
	 
	 서브쿼리 종류
	 1. 연관성에 따른 분류
			a. 연관성 있는 쿼리
			b. 연관성 없는 쿼리
	 
	 2. 위치에 따른 분류
			a. inline view : select절/from절 안에 위치하는 쿼리
			b. 중첩쿼리 		 : where절에 위치한 쿼리
		
	 
	 제약사항
	 1. where절 연산자 오른쪽에 위치해야하며 반드시 소괄호()로 묶어야함
	 2. 특수한 경우를 제외하고 sub query절에는 order by 사용 불가
	 3. 비교연산자에 따라서 단일행 sub query(<,>,= ...) 또는 다중행 sub query(in, exists...)
			사용 가능
*/


/* A. 다른 사용자의 객체(table, view, ...) 에 접근권한 부여하기 */

	-- 1. 현재 scott은 hr의 테이블에 접근가능한 권한이 없음
	select * from hr.employees; --(x)ORA-00942: table or view does not exist

	-- 2. hr사용자가 scott에게 employees, departments에 조회권한 부여하기
	-- 1) sysdba권한 or 소유자(hr)가 다른사용자(scott)에게 권한 부여 가능
	-- 2) hr에서 scott에 권한부여
	-- 3) 사용자를 hr로 변경후에 작업하기
	-- 4) 문법 
	--		a. 권한부여 : grant 부여할명령 on 접근허용할객체 to 권한부여받을사용자
	--		b. 권한해제 : revoke 해제할명령 on 해제할객체 from 권한해제될사용자
	grant select on employees to scott;
	grant select on departments to scott;


	select * from employees; --(x) table or view does not exist
	select * from hr.employees; -- 다른사용자걸 가져오기 때문에 어디서 가져왔는지 명시해야함
	select * from hr.departments;
	select * from  hr.countries; -- scott은 hr.countries select권한 없음


	-- 권한해제(hr계정으로)
	revoke select on employees from scott;
	revoke select on departments from scott;


	-- 3. scott에 select 권한을 받은 테이블 조회하기
	-- 다른 사용자(스키마)의 객체에 접근하려면 "스키마.객체이름" 형식으로 접근해야함
	select * from hr.employees;
	select * from hr.departments;




/* B. 단일행 sub query */
-- 실습1. 샤론스톤과 동일한 직급(instructor)인 교수들 조회하기
select * from scott.professor;
select position from scott.professor where position = 'instructor';
select position from scott.professor where name = 'Sharon Stone';

select *
	from scott.professor
	where position = (select position
											from scott.professor
											where name = 'Sharon Stone');


-- 실습2. hr에서 employees, departments를 join해서
-- 사원이름(first_name + last_name), 부서ID, 부서명(inline view)를 조회하기

select * from hr.employees;
select * from hr.departments;


select first_name || '.' || last_name 사원명
		 , e.department_id 부서명
		 , (select department_name from hr.departments dpt where e.department_id = dpt.department_id) 부서이름
	from hr.employees e;
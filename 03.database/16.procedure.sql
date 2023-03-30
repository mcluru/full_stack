/*
	A. PL/SQL?
	오라클의 Procedure Language extension to SQL의 약자.
	SQL문장에서 변수정의, 조건처리(if), 반복처리(for, loop, while)등을 지원하며
	절차형 언어(procedure Language)라고 함
	
	declare문을 이용하여 정의하고, 선언문은 사용자가 정의한다.
	PL/SQL문은 블럭구조로 되어있고, PL/SQL에서 자체 compile엔진을 가지고 있다.
	
	1. PL/SQL의 장점
		1) block구조로 다수의 SQL문을 한번에 Oracle DB서버로 전송해서 처리하기 때문에 처리속도가 빠름
		2) PL/SQL의 모든 요소는 하나 또는 두개 이상의 블럭으로 구성하여 모듈화 가능
		3) 보다 강력한 프로그램을 작성하기 위해 큰 블럭안에 소블럭을 위치시킬 수 있음
		4) variable(변수), constant(상수), cursor(커서), exception(예외처리) 등을 정의할 수 있고
				SQL문장과 procedure문장에서 사용할 수 있다
		5) 변수선언은 테이블의 데이터구조와 컬럼명을 이용하여 동적으로 변수선언할 수가 있다.
		6) exception처리를 이용해 oracle server error처리를 할 수 있다.
		7) 사용자가 에러를 정의할 수 있고, exception처리를 할수 있다.
		
		
	2. PL/SQL의 구조
		1) PL/SQL은 프로그램을 논리적인 블럭으로 나눈 구조화된 언어.
		2) 선언부(declare, 선택), 실행부(begin ... end, 필수), 예외(exceptio, 선택)로 구성됨.
				특히, 실행부는 반드시 기술을 해야함
		3) 문법 : declare
						  -선택부분
						  -변수, 상수, 커서, 사용자예외처리
						 begin
						  -필수부분
							-PL/SQL문장을 기술(select, if, for ...)
						 exception
						  -선택부분
							-예외처리로직 기술
						 end;
						 
						 
	3. PL/SQL의 종류
		1) anonymous block(익명블럭) : 이름이 없는 블럭. 보통 1회성으로 실행되는 블럭(재사용 불가)
		2) strored procedure : 매개변수를 전달받을 수 있고 재사용 가능. 보통 연속실행하거나 구현이 복잡한 트랜직션 수행하는 pl/SQL블럭
													 "데이터베이스 서버 안에 저장"됨. 처리속도가 빠름. 저장되어있단 의미로 stored procedure라고 함
		3) function : procedure와 유사하지만 처리결과를 호출한 곳으로 반환해주는 값이 있다는 차이가 있음. 단, in 파라미터만 사용가능.
									반드시 반환될 값의 데이터타입을 return문 안에 선언 필수. PL/SQL블럭내에서 return문을 사용하여 반드시 값을 리턴해야 함
		4) package : 오라클 데이터베이스 서버에 저장되어 있는 procedure와 function의 집합.
								 선언부와 본문 두 부분으로 나누어 관리함
		5) trigger : insert, delete, update등이 특정 테이블에서 실행될 때 자동으로 수행하도록 정의한 프로시저. 트리거는 테이블과 별도로 database에 저장(객체)된다.
								 오직 table에 대해서만 정의 가능
  
	
	4. 생성문법 : create or replace procedure[function] 프로시저(펑션)명 is[as]
							begin
							end
*/

-- 1. procedure/function 생성 및 실행
create or replace procedure pro_01 is
begin
	dbms_output.put_line('Hello World');
end;


-- 실행방법
-- exec pro_01 : SQL*pluse에서 사용되는 오라클 명령. 즉, 표준명령x


-- 2. exception
create or replace procedure pro_02 is
	v_counter integer;   --변수를 선언(변수명과 데이터타입)
begin
	v_counter := 10;    -- 변수초기화
	v_counter := v_counter+10;
	dbms_output.put_line('Counter = ' || v_counter);
	v_counter := v_counter/0;
exception when others then
	dbms_output.put_line('0으로 나눌 수가 없습니다');

end;


-- 3. if
create or replace procedure pro_03 is
	isSuccess boolean;
begin
	isSuccess := true;  --true, false
	if isSuccess
		then dbms_output.put_line('성공했습니다');
		else dbms_output.put_line('실패했습니다');
	end if;
end;


-- 4. for
-- 반복문 : loop, while
create or replace procedure pro_04 is
begin

	for i in 1..10 loop
		dbms_output.put_line('i = '||i);
	end loop;
end;

-- https://coding-factory.tistory.com/452
-- loop문 등 문법




/*
	B. PL/SQL 데이터타입
	
	1. 스칼라(scalar) : 단인 data type과 데이터별수 %type이 있음
			
			일반데이터타입
			1) 선언방법 : 변수명 [constant] 데이터타입 [not null] [:= 상수값 or 표현식]
					ex) counter constant integer no null := 10 + 10;
			2) 변수명(variable or identifier)의 이름은 SQL명명규칙을 따름
			3) identifier를 상수로 지정하고 싶은 경우 constant라는 키워드로 명시적으로 선언하고
					상수는 반드시 초기값을 할당해야함
			4) not null로 정의되어 있다면 초기값을 반드시 지정, 정의되어있지 않을 경우 초기값 생략 가능
			5) 초기값은 할당연산자(:=)를 사용하여 지정
			6) 일반적으로 한줄에 한개의 identifier를 정의함
			7) 일반변수의 선언방법
					v_pi constant number(7,6) := 3.131492;
					v_price constant number(4,2) := 12.34;
					v_name varchar2(10);
					v_flag boolean not null := true;
			
			
	2. %type
			1) DB테이블의 컬럼의 데이터타입을 모를 경우에도 사용할 수 있고 테이블의 컬럼의 데이터타입이 변경될 경우에도 수정할 필요없이 사용 가능
			2) 이미 선언된 다른 변수나 테이블의 컬럼을 이용해 선언(참조)할 수 있음
			3) DB테이블과 컬럼, 이미 선언한 변수명이 %type앞에 올 수 있음.
			4) %type속성을 이용하는 장점은
					... table의 column속성을 정확히 알지 몰할 경우에도 사용가능.
					... table의 column속성이 변경되어도 PL/SQL 수정할 필요 없음
			5) 선언방법 : v_empno   emp.empno%type;
			
			
	3. %rowtype
			하나 이상의 데이터값을 갖는 데이터형으로 배열과 비슷한 역할. 재사용 가능
			%rowtype 데이터형과 PL/SQL 테이블과 레코드는 복합데이터형에 속함
			
			1) 테이블이나 뷰 내부컬럼의 데이터형, 크기, 속성등을 그대로 사용가능
			2) %rowtype 앞에는 테이블(뷰)명이 옴
			3) 지정된 테이블의 구조와 동일한 구조를 갖는 변수 선언 가능
			4) 데이터베이스 컬럼들의 갯수나 datatype을 알지 못할때 사용하면 편함
			5) 테이블의 컬럼 데이터타입이 변경되어도 PL/SQL을 변경할 필요 없음
			6) 선언방법 : v_emp   emp%rowtype;
										--> v_emp.ename;
*/









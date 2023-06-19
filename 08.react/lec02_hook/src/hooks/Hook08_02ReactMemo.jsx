import React, { useMemo, useState } from 'react';
import Child2 from '../components/Child2';

// useMemo와 React.memo를 함께 사용하기
// props가 객체타입일 경우 React.memo를 사용해도 자식컴퍼넌트가 랜더링된다.
// 즉, 부모가 랜더링될 때 name객체도 초기화되기 때문에 name객체의 참조주소가
// 변경되어 자식컴퍼넌트도 랜더링된다. 이 경우 useMemo를 사용해서 최적화할 수 있다
const Hook08_02ReactMemo = () => {

  const [parentAge, setParentAge] = useState(0);
 
  console.log(`👪부모 컴퍼넌트가 랜더링 되었습니다!!`);
  
  const increaseParentAge = () => {
    setParentAge(parentAge + 1);
  }

  // 1. useMemo적용 전
  // const name = {
  //   lastname: '홍',
  //   firstname: '길동'
  // }

  // 2. useMemo적용 후
  const name = useMemo(() => {
    return {
      lastname: '홍',
      firstname: '길동'
    }
  }, []);

  return (
    <div style={{border: '2px solid navy', padding: '10px'}}>
      <h1>👪부모</h1>
      <p>age: {parentAge} 살</p>
      <button onClick={increaseParentAge}>부모 나이 증가</button>{'  '}
       <Child2 name={name} />
    </div>
  );
};

export default Hook08_02ReactMemo;
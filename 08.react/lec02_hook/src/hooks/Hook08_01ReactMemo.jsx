import React, { useState } from 'react';
import Child1 from '../components/Child1';

// react 랜더링이 다시 일어나는 경우
// 1. state가 변경될 때
// 2. 부모 컴퍼넌트가 랜더링될 때
// 3. Context value가 변경될 때
// 4. props가 변경될 때

/*
[ useMamo vs React.memo ]
  A. useMemo
  1) 값에 대한 Memoization
  2) React의 Hook으로서 컴퍼넌트 내부에서만 사용가능

  B. React.memo
  1) 고차함수(High Order Component)
  2) 고차함수 컴퍼넌트를 전달받아서 새로운 컴퍼넌트를 반환하는 함수
  3) React.memo는 props가 변경되지 않으면 전달받은 함수를 그대로 전달
  4) props(값, 객체)를 비교할 때는 얕은 비교를 한다.

  C. 고차함수(HOC)
    고차함수(컴퍼넌트)는 함수를 가져와서 새로운 함수로 반환하는 함수다.
    부모가 랜더링될 때마다 자식에 props전달하는 경우에 자식의 props가 변동이 없음에도
    자식컴퍼넌트로 re-rendering이 된다. 이때 자식 컴퍼넌트를 전달해서 props check를 통해
    props가 변동이 없다면 랜더링을 하지않도록 하여 재사용하도록 한다.
    이를 통해 컴퍼넌트의 최적화를 유지할 수 있다.
    
    주의점 : 무분별하게 사용하면 되려 독이 된다. React.memo는 props변화에만 의존하는 최적화 방법이다.
    React.memo를 사용할 경우는
      1. 컴퍼넌트가 같은 props로 자주 랜더링될 때
      2. 컴퍼넌트가 랜더링될 때마다 복잡한 로직을 처리해야 하는 경우
      .. 등 꼭 필요한 경우에만 사용하도록 한다.
    useState, useContext, useReducer등은 props가 변동이 없음에도 상태가 변동이 되는 경우
    re-rendering이 되기 때문에 props가 변동이 없을 경우에 최적화를 위해 React.memo를 사용한다.
*/
const Hook08_01ReactMemo = () => {

  const [parentAge, setParentAge] = useState(0);
  const [childAge, setChildAge] = useState(0);

  console.log(`👪부모 컴퍼넌트가 랜더링 되었습니다!!`);

  const increaseParentAge = () => {
    setParentAge(parentAge + 1);
  }

  const increaseChildAge = () => {
    setChildAge(childAge + 1);
  }
  
  return (
    <div style={{border: '2px solid navy', padding: '10px'}}>
      <h1>👪부모</h1>
      <p>age: {parentAge} 살</p>
      <button onClick={increaseParentAge}>부모 나이 증가</button>{'  '}
      <button onClick={increaseChildAge}>자녀 나이 증가</button><br /><br />
      <Child1 name={'홍길동'} age={childAge} />
    </div>
  );
};

export default Hook08_01ReactMemo;
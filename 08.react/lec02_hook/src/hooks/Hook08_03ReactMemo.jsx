import React, { useCallback, useState } from 'react';
import Child3 from '../components/Child3';

const Hook08_03ReactMemo = () => {

  const [parentAge, setParentAge] = useState(0);
 
  console.log(`👪부모 컴퍼넌트가 랜더링 되었습니다!!`);
  
  const increaseParentAge = () => {
    setParentAge(parentAge + 1);
  }

  // 1. useCallback 적용 전
  // 함수도 객체이기 때문에 부모랜더링시에 초기화 된다.
  // const tellMe = () => {
  //   console.log(`길동아 사랑해 💘💘💘`); 
  // }

  // 2. useCallback 적용 후
  const tellMe = useCallback(() => {
    console.log(`길동아 사랑해 💘💘💘`); 
  }, [])

  return (
    <div style={{border: '2px solid navy', padding: '10px'}}>
      <h1>👪부모</h1>
      <p>age: {parentAge} 살</p>
      <button onClick={increaseParentAge}>부모 나이 증가</button>{'  '}
      <Child3 name={'홍길동'} tellMe={tellMe} />
    </div>
  );
};

export default Hook08_03ReactMemo;
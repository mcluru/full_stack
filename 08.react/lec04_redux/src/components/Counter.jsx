import React from 'react';
/*
  [ Duck 패턴 ]
  리더스를 작성할 때 가장 많이 사용하는 패턴.
  프레젠테이션 컴퍼넌트와 컨테이너 컴퍼넌트를 분리작성하는 패턴.

  1. 프레젠테이션 컴퍼넌트 : 상태관리 없이 props를 전달받아서 화면에 UI만 보여준다.
  2. 컨테이너 컴퍼넌트 : 리덕스와 연동해서 리덕스로부터 상태를 전달받거나
                          redux store에서 액션을 디스패치한다.
*/
const Counter = ({number, onIncrease, onDecrease}) => {
  return (
    <div>
      <h1>{number}</h1>
      <div>
        <button onClick={onIncrease}>1씩 증가하기</button>{'  '}
        <button onClick={onDecrease}>1씩 감소하기</button>{'  '}
      </div>
    </div>
  );
};

export default Counter;
import React, { memo } from 'react';

const Child3 = ({name, tellMe}) => {
  
  console.log(`👩🏻‍🤝‍👩🏻 자녀 컴퍼넌트가 랜더링 되었습니다!`);

  return (
    <div style={{border: '2px solid navy', padding: '10px'}}>
      <h3>👩🏻‍🤝‍👩🏻 자녀</h3>
      <p>이름 : {name}</p>
      <button onClick={tellMe}>엄마 안녕</button>
    </div>
  );
};

// 1. React.mem적용 전
// export default Child3;

// 2. React.memo적용 후
export default memo(Child3);
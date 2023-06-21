import React from 'react';

const Layout = () => {
  return (
    <div>
      <header style={{backgroundColor: 'green', padding: '16px', margin:'10px', fontSize:24, color:'white'}}>
        공통레이아웃
        <div>
          <button>뒤로가기</button>
          <button>게시글목록</button>
        </div>
      </header>
    </div>
  );
};

export default Layout;
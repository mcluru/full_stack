import logo from './logo.svg';
import './App.css';
import Header from './practice/Header';
import Main from './practice/Main';
import Product from './practice/Product';
import { Route, Routes } from 'react-router-dom';
import NotFound from './practice/NotFound';

// App.js를 호출한 곳으로 return() 리턴
function App() {
  return (
    <div className="App">
      <Header/>
      <Routes>
        <Route path='/' element={<Main/>}></Route>
        <Route path='/product/:productId' element={<Product/>}></Route>
        {/* 상단에 위치하는 라우트들의 규칙 모두 확인 -> 일히차는 라우트 없을시 처리 */}
        <Route path='*' element={<NotFound/>}></Route>
      </Routes>
    </div>
  );
}

export default App; //현 컴포넌트를 다른곳에서 불러와 사용할 수 있도록 내보내기 해줌

/*
  - 컴포넌트 -
  Routes : 여러 Route를 감싸서 규칙이 일치하는 라우트 단 하나만을 렌더링시키는 역할
  Route : path속성에 경로, element속성에는 컴포넌트를 넣어준다.
  Link : a태그 대신 사용하는 컴포넌트. 생김새는 a태그지만 History API를 통해
        브라우저 주소의 경로만 바꾸는 기능이 내장되어 있다.
        문법 : <Link to="경로">링크명</Link>

*/

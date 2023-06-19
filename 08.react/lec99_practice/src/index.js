import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter } from 'react-router-dom';
/*
  index.js
  메인프로그램. 애플리케이션의 진입점.
  ReactDOM.render()메서드로 React 애플리케이션을 index.html 파일 root요소에 렌더링하는 역할
  (이 파일에서 HTML 템플릿 및 JavaScript의 컴포넌트를 조합해 렌더링하고 실제 표시한다)
  App.js(컴포넌트)와 index.html(HTML 템플릿)을 연결해주는 파일.

  App.js
  컴포넌트를 정의하는 파일. 실제로 화면에 표시되는 내용을 여기서 정의.
  애플리케이션의 구조와 기능을 정의하는 컴포넌트가 포함된다.
  애플리케이션의 최상위 컴포넌트로 사용되며, 다른 하위 컴포넌트를 포함해 조합하고
  애플리케이션의 레이아웃/기능을 구성한다.
  이 파일에서 필요한 라이브러리, 컴포넌트를 import하고 JSX를 사용하여 컴포넌트의 구조와 렌더링을 정의한다

  index.html
  HTML 템플릿 파일. 웹페이지의 진입점.
  웹브라우저에서 React 애플리케이션을 로드할 때 index.html파일이 먼저 로드됨.
  직접 표시되는 게 아닌, <div id="root"></div>과 같은 React 애플리케이션을 나타내는
  DOM 요소에 index.js에 의해 읽어와 렌더링된 결과가 표시된다.
  (index.html 이름을 바꿀 시 오류 발생)


  - 요약 -
  index.html : 웹 페이지의 진입점이며 React 애플리케이션을 포함하는 역할
  index.js   : React 애플리케이션의 진입점으로서 ReactDOM을 사용하여 index.html의 root 요소에
                애플리케이션을 렌더링
  App.js     : 애플리케이션의 주요 컴포넌트 파일로, 애플리케이션의 구조와 기능을 정의하는 역할.
                App.js는 index.js를 통해 실제로 화면에 나타나는 컴포넌트다.

*/

// createRoot()메서드를 사용해 root 객체를 생성 (root객체는 애플리케이션 렌더링에 사용됨)
// 컴포넌트를 어디에 그려줄건지, index.html파일에서 ID가 root인 요소를 찾아옴
const root = ReactDOM.createRoot(document.getElementById('root'));
// 브라우저에 컴포넌트를 보여줌
root.render(
  // 화면에 보여줘야되는 렌더링할 컴포넌트
  <BrowserRouter>  
    {/* App 컴포넌트는 애플리케이션의 최상위 컴포넌트로 사용됨
      호출한 App.js를 'root'라는 아이디를 가진 곳(index.html이 가짐)에 그려줌
    */}
    <App />
  </BrowserRouter>
);



/*
    - 라우팅 -
    사용자가 요청한 URL에 따라 해당 URL에 맞는 페이지를 보여주는 것.
    리액트로 SPA구현 = 요청에 맞는 컴포넌트만 라우팅하여 부분적으로 렌더링한다

    - 리액트 라우터(React Router) -
    사용자가 입력한 주소를 감지하는 역할. 여러 환경에서 동작할 수 있도록
    여러 종류의 라우터 컴포넌트를 제공한다.

    - 라우터 종류 -
    react-router-dom : 웹에서 쓰이는 컴포넌트 포함
    react-router-native : react-native를 활용한 앱개발에 쓰이는 컴포넌트 포함
    react-router : 위 둘을 합친 패키지

    - react-router-dom의 라우터 컴포넌트 -
      1. <BrowserRouter> : HTML5를 지원하는 브라우저의 주소를 감지.
      2. <HashRouter> : hash주소를 감지.(static페이지에 적합)
    보통 request/response로 이루어지는 동적인 페이지를 제작하으로 <BrowserRouter>를 보편적으로 사용.
  */






// const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//   <React.StrictMode>  
//     <App />
//   </React.StrictMode>
//   /*
//     StrinctMode : 잠재적 문제를 알아내기 위한 도구 (개발 과정 중에만 적용되며, 배포 후엔 작동 안함.)
//     2번 수행되는 메서드를 찾아내거나 안전하지 않은 생명주기를 사용하는 컴포넌트 발견 등
//     Double-Invoke 방식을 통해 개발자에게 알려줌

//     리액트는 랜더링 단계/커밋 단계 두가지로 동작한다.
//       랜더링 단계 : render함수 호출 -> 이전 렌더와 비교 수행
//       커밋 단계 : 라이프사이클 함수를 실행시키며 DOM노드를 추가/변경하는 단계(랜더링 단계보다 빠름)
//   */
// );

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
//reportWebVitals();  //애플리케이션 성능측정(랜더링 시간,리랜더링 횟수 등)

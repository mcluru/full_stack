import './App.css';
import { Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Layout from './Layout';
import About from './pages/About';
import Profile from './pages/Profile';
import Articles from './pages/Articles';
import Login from './pages/Login';
import NotFound from './pages/NotFound';
import MyPage from './pages/MyPage';
import Article from './pages/Article';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<Layout />}>
          <Route path="/" element={<Home />}></Route> 
          <Route path="/about" element={<About />}></Route> 
          <Route path="/profiles/:username" element={<Profile />}></Route> 
        </Route>
        <Route path="/articles" element={<Articles />}>
          <Route path="/articles/:id" element={<Article />} />
        </Route>
        <Route path='/login' element={ <Login />} />
        <Route path='/login' element={ <MyPage />} />
        <Route path='/*' element={ <NotFound />} />
      </Routes>
    </div>
  );
}

export default App;

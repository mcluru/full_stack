import React, { useContext } from 'react';
import { ThemeContext } from '../context/ThemeContext';

// 1. Context 적용전
// const Footer = ({isDark, setIsDark})  => {

//   const toggleTheme = () => {
//     setIsDark(!isDark);
//   }
//   return (
//     <footer
//       className='footer'
//       style={{
//         backgroundColor: isDark ? 'black' : 'lighgray',
//       }}
//     >
//       <button
//         className='button'
//         onClick={toggleTheme}
//       >Dark Mode</button>
//     </footer>
//   );
// };

// 2. Context 적용후
const Footer = ()  => {

  const {isDark, setIsDark} = useContext(ThemeContext);

  const toggleTheme = () => {
    setIsDark(!isDark);
  }
  return (
    <footer
      className='footer'
      style={{
        backgroundColor: isDark ? 'black' : 'lightgray',
      }}
    >
      <button
        className='button'
        onClick={toggleTheme}
      >Dark Mode</button>
    </footer>
  );
};

export default Footer;
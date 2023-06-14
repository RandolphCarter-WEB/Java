// import logo from './logo.svg';
import './App.css';
import Comp1 from "./components/Comp1";
import Comp2 from "./components/Comp2";
import {Comp3} from "./components/Comp3";

function App() {
  return (
      <div>
          <h1>frontend1 : 첫번째 App.js 페이지 입니다</h1>
          <hr/>
          <Comp1/>
          <hr/>
          <Comp2/>
          <hr />
          <Comp3 />
      </div>
  );
}

export default App;
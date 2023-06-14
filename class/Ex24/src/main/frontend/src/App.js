import './App.css';

import { Compo01 } from "./component/Compo01";
import { Compo02 } from "./component/Compo02";
import {Compo03} from "./component/Compo03";

function App() {
  return (
    <div className="mainConatiner">
        <Compo01 />
        <Compo02 />
        <hr />
        <h1>Test</h1>
        <Compo03 />
    </div>
  );
}

export default App;
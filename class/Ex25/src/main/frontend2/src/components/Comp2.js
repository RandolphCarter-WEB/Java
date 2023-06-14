import {Link, Route, Routes} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Intro from "./Intro";

function Comp2(){
    return (
        <div>
            <h1>front2 : 페이지 이동</h1>
            <ul>
                <li><Link to={"/frontend2"}>Intro</Link></li>
                <li><Link to={"/frontend2/home"}>home</Link></li>
                <li><Link to={"/frontend2/about"}>about</Link></li>
            </ul>
            <Routes>
                <Route path={"/frontend2"} element={<Intro/>}></Route>
                <Route path={"/frontend2/home"} element={<Home/>}></Route>
                <Route path={"/frontend2/about"} element={<About/>}></Route>
                {/*전혀 이상한 페이지를 호출시에는 아래와 같이 사용 가능*/}
                <Route path={"/frontend2/*"} element={<h1>잘못된 페이지 호출입니다.</h1>}></Route>
            </Routes>
        </div>
    )
}

export default Comp2;


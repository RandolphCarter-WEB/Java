import {Link, Route, Routes} from "react-router-dom";
import Home from "./Home";
import About from "./About";
import Intro from "./Intro";

function Comp2(){
    return (
        <div>
            <h1>front1 : 페이지 이동</h1>
            <ul>
                <li><Link to={process.env.PUBLIC_URL}>Intro</Link></li>
                <li><Link to={"/frontend1/home"}>home</Link></li>
                <li><Link to={"/frontend1/about"}>about</Link></li>
            </ul>
            <Routes>
                <Route path={"/frontend1"} element={<Intro/>}></Route>
                <Route path={"/frontend1/home"} element={<Home/>}></Route>
                <Route path={"/frontend1/about"} element={<About/>}></Route>
                {/*전혀 이상한 페이지를 호출시에는 아래와 같이 사용 가능*/}
                <Route path={"/frontend1/*"} element={<h1>잘못된 페이지 호출입니다.</h1>}></Route>
            </Routes>
        </div>
    )
}

export default Comp2;

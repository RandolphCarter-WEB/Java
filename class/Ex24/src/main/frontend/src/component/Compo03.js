import {Link, Route, Routes} from "react-router-dom";
import {Intro} from "./Intro";
import {Home} from "./Home";
import {About} from "./About";

export const Compo03 = () => {
    return (
        <div>
            <h1>Page Move</h1>
            <ul>
                <li><Link to={"/"}>Intro</Link></li>
                <li><Link to={"/home"}>Home</Link></li>
                <li><Link to={"/about"}>About</Link></li>
            </ul>
            <Routes>
                <Route path="/" element = {<Intro />} />
                <Route path="/home" element = {<Home />} />
                <Route path="/about" element = {<About />} />
                <Route path="*" element = {<h1>Wrong Page Search.</h1>} />
            </Routes>
        </div>
    )
}
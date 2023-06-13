import React, { useEffect, useState } from "react";
import axios from "axios";
export const Compo01 = () => {
    const [hello, setHello] = useState("default");

    useEffect(() => {
        axios.get("/api/v1/hello"
        ).then(resp => {
            setHello(resp.data);
        }).catch(err => console.log(err));
    });

    return (
        <div>
            <p>Backend Data >> {hello}</p>
        </div>
    )
}
import React, { useState, useEffect } from "react";
import axios from "axios";

export const Compo02 = () => {
    const [msg, setMsg] = useState("");
    const host = "http://localhost:8080/";

    const respHnd = ({ data }) => { setMsg(data); return data; }
    const errHnd = ({ message }) => { setMsg(message); return message; }

    const onNonCorsHeaderHnd = () => { axios.get(`${host}api/v2/non-cors`).then(respHnd).catch(errHnd); }
    const onCorsHeaderHnd = () => { axios.get(`${host}api/v2/cors`).then(respHnd).catch(errHnd); }
    const onNonProxyHnd = () => { axios.get(`/api/v2/non-proxy`).then(respHnd).catch(errHnd); }
    const onProxyHnd = () => { axios.get(`/api/v2/proxy`).then(respHnd).catch(errHnd); }

    return (
        <div>
            <p>{msg}</p>
            <button type="submit" onClick={onNonCorsHeaderHnd}>non cors header</button>
            <button type="submit" onClick={onCorsHeaderHnd}>cors header</button>
            <button type="submit" onClick={onNonProxyHnd}>non proxy</button>
            <button type="submit" onClick={onProxyHnd}>proxy</button>
        </div>
    )
}
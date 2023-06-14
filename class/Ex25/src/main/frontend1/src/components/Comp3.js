import React, {useEffect, useState} from "react";
import axios from "axios";
import {useQuery} from "@tanstack/react-query";

export const Comp3 = options => {
    let results = useQuery("itemList", () => axios.get("/api/front1/listdata").then(resp => resp.data));

    return (
        <div>
            <h3>front1 : 백엔드에서 가져온 리스트 데이터 입니다</h3>
            {/*{itemList.map((user) => (*/}
            {/*    <p key={user.id}>*/}
            {/*        {user.name} ({user.age} 살)*/}
            {/*    </p>*/}
            {/*))}*/}
            {results.isLoading && <h3>Loading ...</h3>}
            {results.error && <h3>Error!</h3>}
            {results.data && results.map(user => {
                return <p key={user.id}>{user.name} >> {user.age}</p>
            })}
        </div>
    )
}
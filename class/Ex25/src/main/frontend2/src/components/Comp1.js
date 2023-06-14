import React, {useEffect, useState} from "react";
import axios from "axios";

function Comp1() {
    const [itemList, setItemList] = useState([])

    useEffect(() => {
        axios.get('/api/front2/listdata')
            .then(response => setItemList(response.data))
            .catch(error => console.log(error))
    });

    return (
        <div>
            <h3>front2 : 백엔드에서 가져온 리스트 데이터 입니다</h3>
            {itemList.map((user) => (
                <p key={user.id}>
                    {user.name} ({user.age} 살)
                </p>
            ))}
        </div>
    )
}

export default Comp1;
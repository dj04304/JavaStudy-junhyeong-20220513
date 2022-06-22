/*
    서버에서 가지고 있는 데이터
*/

//userList 배열
let userList = [

    {
        usercode: 20220001,
        username: "junhyeong",
        password: "1234",
        name: "박준형",
        email: "aaa@gmail.com",
        role: ["ROLE_ADMIN", "ROLE_USER"],
        provider: "naver"
    },
    {
        usercode: 20220002,
        username: "junhyeong2",
        password: "1234",
        name: "박준형2",
        email: "bbb@gmail.com",
        role: ["ROLE_ADMIN", "ROLE_USER"],
        provider: "google"
    },
    {
        usercode: 20220003,
        username: "junhyeong3",
        password: "1234",
        name: "박준형3",
        email: "ccc@gmail.com",
        role: ["ROLE_ADMIN", "ROLE_USER"],
        provider: "kakao"
    }


];

/*
    클라이언트
*/
const userTableList = document.querySelector(".user-table-list");

// AJAX 통신을 통해 데이터를 서버로 부터 받음
let userJSON = JSON.stringify(userList); //userList 를 JSON으로 형 변환

load();

function load() { //load 되어졌을 때, JSON을 오브젝트로 다시 형 변환 해준다.
    let userListObj = JSON.parse(userJSON);
    
    for(let i = 0; i < userListObj.length; i++){ //반복하여 userList에 담았던 회원정보들을 출력한다.
        userTableList.appendChild(createTr(userListObj[i])); //userTableList에 appendchild를 이용해
        
    }

    for(let i = 0; i < userListObj.length; i++){ //반복하여 userList에 담았던 회원정보들을 출력한다.
        userTableList.appendChild(createTr2(userListObj[i])); //userTableList에 appendchild를 이용해
        
    }

    for(let i = 0; i < userListObj.length; i++){ //반복하여 userList에 담았던 회원정보들을 출력한다.
        userTableList.innerHTML += createTr3(userListObj[i]); // innerHTML을 이용하여 전달해주는데 += 으로 더해서 추가된다.
        
    }

}


function createTr(userData) {
    const tr = document.createElement("tr"); //tr 요소를 생성
    const td1 = document.createElement("td"); //td 요소를 생성 x 7
    const textNode1 = document.createTextNode(userData.usercode); //td 에 담을 textNode를 생성해준다.
    const td2 = document.createElement("td");
    const textNode2 = document.createTextNode(userData.username);
    const td3 = document.createElement("td");
    const textNode3 = document.createTextNode(userData.password);
    const td4 = document.createElement("td");
    const textNode4 = document.createTextNode(userData.name);
    const td5 = document.createElement("td");
    const textNode5 = document.createTextNode(userData.email);
    const td6 = document.createElement("td");
    const textNode6 = document.createTextNode(userData.role.join(", ")); //join 메소드는 배열요소를 구분해주는 역할을 한다.
    const td7 = document.createElement("td");
    const textNode7 = document.createTextNode(userData.provider);
    //생성한 td 안에 textNode추가
    td1.appendChild(textNode1);
    td2.appendChild(textNode2);
    td3.appendChild(textNode3);
    td4.appendChild(textNode4);
    td5.appendChild(textNode5);
    td6.appendChild(textNode6);
    td7.appendChild(textNode7);
    //생성한tr 에 생성한 td를 추가
    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);
    tr.appendChild(td4);
    tr.appendChild(td5);
    tr.appendChild(td6);
    tr.appendChild(td7);

    return tr; //tr을 userData에 리턴
}

///////////////////////////////////////////////////////////////////////////////////
function createTr2(userData) {
    let userDataArray = new Array(); //배열 생성

    //배열에 값들을 push해줌
    userDataArray.push(userData.usercode);
    userDataArray.push(userData.username);
    userDataArray.push(userData.password);
    userDataArray.push(userData.name);
    userDataArray.push(userData.email);
    userDataArray.push(userData.role.join(", "));
    userDataArray.push(userData.provider);
    
    const tr = document.createElement("tr"); //tr은 생성해줘야함.

    //위의 배열의 값들을 반복하여 값을 가져온다.
    for(let i = 0; i < userDataArray.length; i++){
        const textNode = document.createTextNode(userDataArray[i]); //userDataArray의 값을 createTextNode 생성하여 담음
        const td = document.createElement("td"); // td를 생성
        td.appendChild(textNode); //td에 textNode를 넣어준다.
        tr.appendChild(td); //tr에 td를 넣어준다.
    }

    return tr; //tr을 return
}

///////////////////////////////////////////////////////////////////////////////////

function createTr3(userData) { // ${} 이엘 표현식
    //tr, td를 생성
    let tr = ` 
        <tr>
            <td>${userData.usercode}</td> 
            <td>${userData.username}</td>
            <td>${userData.password}</td>
            <td>${userData.name}</td>
            <td>${userData.email}</td>
            <td>${userData.role.join(", ")}</td>
            <td>${userData.provider}</td>
        </tr>
    `

    return tr; //tr을 return
}
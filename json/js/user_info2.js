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

const btnList = document.querySelector(".user-list-load-btn");
const userTableList = document.querySelector(".user-table-list");
const removeList = document.querySelector(".user-list-remove-btn")

btnList.onclick = () => {
    
    let userListJSON = JSON.stringify(userList); //JSON 으로 형 변환

    let userListObj = JSON.parse(userListJSON);
    
    userListObj.forEach(user => { //forEach 를 사용하여 반복
        userTableList.innerHTML += `
        <tr>
            <td>${user.usercode}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.role.join(" ,")}</td>
            <td>${user.provider}</td>
        </tr>
    `;
    });
    
}

removeList.onclick = () => {

}



// function createTr(userData) {

//     let tr = `
//         <tr>
//             <td>${userData.usercode}</td>
//             <td>${userData.username}</td>
//             <td>${userData.password}</td>
//             <td>${userData.name}</td>
//             <td>${userData.email}</td>
//             <td>${userData.role.join(" ,")}</td>
//             <td>${userData.provider}</td>
//         </tr>
//     `
//     return tr;
// }
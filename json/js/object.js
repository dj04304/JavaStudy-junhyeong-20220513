let year = 1;

let studentObj = { //javascript에서는 {}로 객체를 표현할 수 있다.
    name:"박준형",
    schoolName: "코리아아이티아카데미",
    hobby: ["축구", "농구", "골프"],
    info: {
        "year": year, //"year": year의 값을 아래 console에서 받고, 위의 변수에 전달하여 1을 출력
        group: 2,
        number: 3
    }
};

console.log(studentObj.name);

for(let i = 0; i < studentObj.hobby.length; i++){
    console.log(studentObj.hobby[i]);
}

console.log(studentObj.info.year);

console.log("학생객체" + studentObj);

/*
JSON 형변환

1.Object -> JSON  => JSON.stringify(객체);  오브젝트를 JSON 문자열로 변환해준다.
2.JSON -> Object => JSON.parse(JSON);  JSON문자열을 오브젝트(객체)로 변환해줌

*/

let jsonData = JSON.stringify(studentObj);

console.log("JSON으로 변환 => " + jsonData); //studentObj를 JSON으로 변환해준다.

let jsonObj = JSON.parse(jsonData); // jsonData의 값을 다시 오브젝트(객체)로 변환해준다.

console.log(jsonObj.name); //undefined 값을 알 수 없다는 뜻이다.(JSON은 참조할 수 없다.) 그래서 jsonData를 오브젝트로 형 변환해줘서 값을 받아와야 한다.
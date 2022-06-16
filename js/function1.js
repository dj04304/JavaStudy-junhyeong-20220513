function add(x, y) {
    return x + y;
}

let result = add(10,20);

console.log(result);

// 익명 함수
let result2 = function (x, y) {
    return x + y;
}

console.log(result2(10,20));

//즉시실행함수

console.log(function (x, y) {
    return x + y;
}(10, 20));

// 화살표 함수 function이 화살표로 바꼈다고 생각

let result3 = (x ,y) => {
    return x + y;
}

console.log(result3(20,30));

//화살표 함수 (중괄호 생략 return)
let result4 = (x ,y) => x + y;

console.log(result4(30,40));
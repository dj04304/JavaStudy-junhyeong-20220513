let add2 = function(x, y) {
    return x + y;
}

// 메인을 호출하는 과정에서 \add2의 선언이 아래에 있으면 안되므로 위로 올려줘야 한다. 
main();

function main() {
    let num1 = 10;
    let num2 = 20;

    let result = add(num1, num2);
    console.log("결과: " + result);

  
    result = add2(num1, num2);
    console.log("결과2: " + result);

    result = function(x, y) {return x + y}(num1, num2);
    console.log("결과3: " + result);
}

function add(x, y) {
    return x + y;
}


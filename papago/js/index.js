const brandLogo = document.querySelector(".brand-logo-border");
const convertButton = document.querySelector(".article-footer button");
const textarea = document.querySelector(".article-body-textarea textarea"); //textarea 속성을 가져옴
const pre = document.querySelector(".article-body pre"); //pre 속성을 가져옴

const inputUrl = document.querySelector("#web-url") 
const arrow = document.querySelector(".button-url button");

brandLogo.onclick = () => {
    // alert("로고 클릭되었음."); 또는 consol을 이용해 테스팅해보는것은 중요하니 자주 사용하자
    // href 속성을 이용한 사이트 이동
    // location.href = "https://papago.naver.com"; //속성이기 때문에 대입해줘야 한다.
    // replace 메소드를 이용한 사이트 이동
    
    // href와 replace의 차이는 href는 뒤로가기가 되지만, replace는 뒤로가기가 안된다.
    // location.replace("https://papago.naver.com"); // 메소드이기 때문에 파라미터로 전달한다.

    // historyback(커스텀) 사이트와 연결
    location.href = "http://127.0.0.1:5502/src/papago/historyback.html";
}

convertButton.onclick = () => {
    pre.textContent = textarea.value; //textContent를 이용해 value 값을 전달해줌
    
    //alert(textarea.value);
    // alert("번역하기 클릭됨.");
}

textarea.onkeyup = () => { //키보드가 누르고 올라올 때
    pre.textContent = textarea.value;

}


//화살표 클릭했을 때, 홈페이지로 이동
arrow.onclick = () => {
    let protocols = new Array(); //배열 생성
    protocols.push("http://");
    protocols.push("https://");

    console.log(protocols);

    for(let i = 0; i < protocols.length; i++){
        if(inputUrl.value.includes(protocols[i])){ //http: 나 https: 가 포함되어있으면 바로 실행(includes)
            location.href = inputUrl.value;
            return;
        }
    }

    location.href = "https://" + inputUrl.value;
    
}

// inputUrl에서 onkeypress했을 때의 기능
inputUrl.onkeypress = () => { // window.event.keyCode 로 불러옴
    if(window.event.keyCode == 13){ //keyCode 13 은 enter의 keyCode 이다.
        arrow.click(); //arrow.click 을 호출함
    }
}
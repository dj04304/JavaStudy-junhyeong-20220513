const box1 = document.querySelector(".box1");
const box2 = document.querySelector(".box2");
const changeResize = document.querySelector(".btn1");
const changeBg = document.querySelector(".btn2");


changeResize.onclick = () => {
    box1.classList.toggle("box-resize")
}

changeBg.onclick = () => {
    box2.classList.toggle("box-bg-change");
}

// box1 이 영향을 받기 때문에 box1에 준다.
box1.onmouseover = () => {
    box1.classList.toggle("box-bg-change");
    box2.classList.toggle("box-resize");
}

box1.onmouseout = () => {
    box1.classList.toggle("box-bg-change");
    box2.classList.toggle("box-resize");
}


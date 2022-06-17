const box1 = document.querySelector(".box1");
const changeBtn = document.querySelector(".change-btn");

// toggle => 컴퓨터 전원과 같은 버튼 누를 때 마다 명령이 바뀜 on off
// classList 는 배열이다.
changeBtn.onclick = () => {
    box1.classList.toggle("bg-color");
}
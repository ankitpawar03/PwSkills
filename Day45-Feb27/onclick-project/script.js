var ball = document.querySelector(".ball");

ball.addEventListener("click", function(){

  ball.style.transform = "translateY(-200px)"

  setTimeout(function(){
    ball.style.transform = "translateY(0)"
  } , 300)

})
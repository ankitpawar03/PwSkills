var launch = document.querySelector(".launch");
var fire = document.querySelector(".fire");

launch.addEventListener("click", function(){

    fire.style.visibility = "visible";

});


launch.addEventListener("dblclick", function(){

    launch.style.transform = "translateY(-2200px)"

    setTimeout(function(){
        launch.style.transform = "translateY(0)"
    }, 5000)
})
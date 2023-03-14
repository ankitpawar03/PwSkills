const count = document.getElementById("count")
const dec_btn = document.getElementById("decrement");
const inc_btn = document.getElementById("increment");
const res_btn = document.getElementById("reset");

let counter = 0;

dec_btn.addEventListener("click", function(){
    counter--;
    count.textContent = counter;
})

inc_btn.addEventListener("click" , function(){
    counter++;
    count.textContent = counter;
})

res_btn.addEventListener("click", function(){
    counter = 0;
    count.textContent = counter;
})

let btn = document.querySelector("button");
let colorcode = () => {
    let codes = "0123456789ABCDEF";
    let hash = "#";

    for (let i=0; i<6; i++){
        hash = hash + codes[Math.floor(Math.random()*16)];
    }
    return hash;
}

function changeColor(){
    document.body.style.background = "linear-gradient("+Math.random()*360+"deg,"+colorcode()+","+colorcode()+","+colorcode()+")";   
}
dec_btn.addEventListener( "click" , changeColor)
inc_btn.addEventListener( "click" , changeColor)
res_btn.addEventListener( "click" , () => {
    document.body.style.background = "white";
})
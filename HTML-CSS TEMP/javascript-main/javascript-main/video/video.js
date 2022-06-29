const btn = document.querySelector(".switch-btn");
const video = document.querySelector(".video-container");

btn.addEventListener("click",function(){
    if (!btn.classList.contains("slide")){
        btn.classList.add("slide");
        video.play();
    }
    else{
        btn.classList.remove("slide")
    }
});

const preloader = document.querySelector(".preloader");

window.addEventListener("load",function(){
    preloader.classList.add("hide-preloader")
})
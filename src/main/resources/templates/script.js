const toggler = document.querySelector(".toggler-btn")
toggler.addEventListener("click", function(){
    document.querySelector("#sidebar").classList.toggle("collapsed")
})

function logEvent(action, details = "") {
    const timestamp = new Date().toLocaleString();
    console.log(`[${timestamp}] ${action}: ${details}`);
}
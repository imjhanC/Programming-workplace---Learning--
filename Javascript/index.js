//let age = 21;
//console.log(age);


//user input
//let username = window.prompt("What is your name?");
//console.log(username);
let username;
document.getElementById("myButton").onclick = function(){
    username = document.getElementById("myText").value;
    console.log(username);
}
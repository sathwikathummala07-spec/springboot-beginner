// Array
// var userArray = [
//   {"name": "John Doe", "gender": "Male"},
//   {"name": "Jane Doe", "gender": "Female"}
// ];

// var janeUser = userArray[1];
// console.log(userArray.length);
// console.log(janeUser.name);

// <button onclick="toggleUser()">Toggle</button>

var currentUserIndex = 1;

var userArray = [
    {
        "name": "John Doe",
        "gender": "Male",
        "image": "/img/john_doe.png"
    },
    {
        "name": "Jane Doe",
        "gender": "Female",
        "image": "/img/jane_doe.png"
    }
];

function toggleUser(){

    currentUserIndex = 1 - currentUserIndex;

    var nextUser = userArray[currentUserIndex];

    displayUser(nextUser);
}

function displayUser(user){

    document.getElementById("user-name").innerText = user.name;

    document.getElementById("user-gender").innerText = user.gender;

    document.getElementById("user-image").src = user.image;
}
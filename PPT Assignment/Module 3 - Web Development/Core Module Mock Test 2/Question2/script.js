function addInput() {
    var userInput = document.getElementById("user-input").value;

    if (userInput.trim() !== "") {
        var outputContainer = document.getElementById("output-container");
        var newInput = document.createElement("p");
        newInput.textContent = userInput;
        outputContainer.appendChild(newInput);
        document.getElementById("user-input").value = "";
    }
}

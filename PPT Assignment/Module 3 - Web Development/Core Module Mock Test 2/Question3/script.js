function showLoader() {
    var dataContainer = document.getElementById("data-container");
    dataContainer.innerHTML = "";

    for (var i = 0; i < 5; i++) {
        var skeleton = document.createElement("div");
        skeleton.classList.add("skeleton");
        dataContainer.appendChild(skeleton);
    }
}

function fetchData() {
    showLoader();

    fetch("https://jsonplaceholder.typicode.com/posts")
        .then(response => response.json())
        .then(data => {
            var dataContainer = document.getElementById("data-container");
            dataContainer.innerHTML = "";

            data.forEach(post => {
                var postElement = document.createElement("div");
                postElement.textContent = post.title;
                dataContainer.appendChild(postElement);
            });
        })
        .catch(error => console.log(error));
}

window.onload = fetchData;

let movies = [];

function addMovie() {

    let title = document.getElementById("title").value;
    let category = document.getElementById("category").value;

    if(title === "" || category === "") {
        alert("Please fill all fields");
        return;
    }

    let movieList = document.getElementById("movieList");

    let movieDiv = document.createElement("div");

    movieDiv.classList.add("movie");

    movieDiv.innerHTML = `
        <h3>${title}</h3>
        <p>${category}</p>

        <button class="delete-btn">
            Delete
        </button>
    `;

    movieDiv.querySelector(".delete-btn").onclick = function() {
        movieDiv.remove();
    };

    movieList.appendChild(movieDiv);

    document.getElementById("title").value = "";
    document.getElementById("category").value = "";
}

function searchMovie() {

    let input = document.getElementById("search").value.toLowerCase();

    let movies = document.querySelectorAll(".movie");

    movies.forEach(function(movie){

        let title = movie.querySelector("h3").innerText.toLowerCase();

        if(title.includes(input)) {
            movie.style.display = "block";
        }
        else {
            movie.style.display = "none";
        }

    });
}
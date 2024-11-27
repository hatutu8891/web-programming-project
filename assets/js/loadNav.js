document.addEventListener("DOMContentLoaded", function() {
    fetch('nav.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('nav').innerHTML = data;
        })
        .catch(error => console.error('Error loading nav:', error));
});

document.addEventListener("DOMContentLoaded", function() {
    fetch('../../pages/dynamic/shared/header.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('header').innerHTML = data;
        })
        .catch(error => console.error('Error fetching header:', error));
});

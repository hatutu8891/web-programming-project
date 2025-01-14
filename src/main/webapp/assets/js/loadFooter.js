document.addEventListener("DOMContentLoaded", function() {
    fetch('shared/footer.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('footer').innerHTML = data;
        })
        .catch(error => console.error('Error loading footer:', error));
});
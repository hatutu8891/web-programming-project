document.addEventListener("DOMContentLoaded", function() {
    fetch('../../pages/dynamic/shared/footer.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('footer').innerHTML = data;
        })
        .catch(error => console.error('Error loading footer:', error));
});
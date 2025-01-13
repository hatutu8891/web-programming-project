function search() {
    var query = document.getElementById("searchQuery").value;
    if(query) {
        window.location.href = "/search?query=" + encodeURIComponent(query);
    }
}
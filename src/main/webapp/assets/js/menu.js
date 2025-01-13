document.querySelectorAll('.sidebar ul li').forEach(function (item) {
    item.addEventListener('click', function (event) {
        document.querySelectorAll('.sidebar ul li').forEach(function (li) {
            if (li.classList.contains('active')) {
                li.classList.remove('active');
            }

        });

        item.classList.add('active');
    });
});

// document.onload =function () {
//     let tab10 = document.getElementById('tab-10').innerHTML;
//     let tab11 = document.getElementById('tab-11').innerHTML;
//     let tab8 = tab10 + tab11;
//     document.getElementById('tab-8').innerHTML = tab8;
// }
// document.onload =function () {
//
//     let tab12 = document.getElementById('tab-12').innerHTML;
//     let tab13 = document.getElementById('tab-13').innerHTML;
//     let tab9 = tab12 + tab13;
//     document.getElementById('tab-9').innerHTML = tab9;
// }

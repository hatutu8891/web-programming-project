// JavaScript để xử lý tính toán tổng tiền và xóa sản phẩm
document.querySelectorAll('.remove-item').forEach(button => {
    button.addEventListener('click', function() {
        let cartItem = this.closest('.cart-item');
        cartItem.remove();
        updateTotal();
    });
});

document.querySelectorAll('.item-quantity').forEach(input => {
    input.addEventListener('input', updateTotal);
});

document.querySelectorAll('.select-item').forEach(checkbox => {
    checkbox.addEventListener('change', updateTotal);
});

function updateTotal() {
    let total = 0;
    document.querySelectorAll('.cart-item').forEach(item => {
        let checkbox = item.querySelector('.select-item');
        if (checkbox.checked) {
            let price = parseInt(item.querySelector('.item-price').innerText.replace('₫', '').replace(',', ''));
            let quantity = item.querySelector('.item-quantity').value;
            total += price * quantity;
        }
    });
    document.querySelector('.price').innerText = `₫ ${total.toLocaleString()}`;
}
document.querySelectorAll('.quantity-btn').forEach(button => {
    button.addEventListener('click', function () {
        const input = this.parentElement.querySelector('.quantity-input');
        let value = parseInt(input.value);

        if (this.textContent === '-') {
            value = Math.max(1, value - 1);
        } else {
            value += 1;
        }

        input.value = value;
    });
});
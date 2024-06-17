document.getElementById('delivery-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const phone = document.getElementById('phone').value;
    const email = document.getElementById('email').value;
    const address = document.getElementById('address').value;
    const paymentMethod = document.getElementById('payment-method').value;

    const summaryContent = `
        Nombres: ${firstName}<br>
        Apellidos: ${lastName}<br>
        Teléfono: ${phone}<br>
        Correo Electrónico: ${email}<br>
        Dirección: ${address}<br>
        Método de Pago: ${paymentMethod === 'cash-on-delivery' ? 'Contra Entrega' : ''}
    `;

    document.getElementById('summary-content').innerHTML = summaryContent;
    document.getElementById('order-summary').classList.remove('hidden');
});

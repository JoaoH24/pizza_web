<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Delivery - Pizzería Luigi & Yoshi</title>
    <link rel="stylesheet" href="../css/delivery.css" />
    <link rel="stylesheet" href="../css/normalize.css" />
  </head>
  <body>
    <div class="container">
      <header>
        <nav>
          <img
            class="logo"
            src="../../assets/logo/logo-web-200.png"
            alt="logo empresarial"
          />
          <h1 class="main-title">Luigi & Yoshi</h1>
          <div class="container-labels">
            <a class="labels-menu" href="index.jsp">Pizzas</a>
            <a class="labels-menu" href="delivery.jsp">Delivery</a>
            <a class="labels-menu" href="pizza-about.jsp"
              >Sobre nosotros</a
            >
            <a class="labels-menu">Contactos</a>
          </div>
        </nav>
      </header>
      <!--            <h1>Delivery - Pizzería Luigi & Yoshi</h1> -->
      <main>
          <form id="delivery-form" action="controllerCliente" method="GET">
          <h2>Datos Personales</h2>
          <div class="form-group">
            <label for="first-name">Nombres:</label>
            <input type="text" id="first-name" name="first-name" required />
          </div>
          <div class="form-group">
            <label for="last-name">Apellidos:</label>
            <input type="text" id="last-name" name="last-name" required />
          </div>
          <div class="form-group">
            <label for="phone">Teléfono:</label>
            <input type="tel" id="phone" name="phone" required />
          </div>
          <div class="form-group">
            <label for="email">Correo Electrónico:</label>
            <input type="email" id="email" name="email" required />
          </div>
          <div class="form-group">
            <label for="address">Dirección:</label>
            <input type="text" id="address" name="address" required />
          </div>
          <div class="form-group">
            <label for="payment-method">Método de Pago:</label>
            <select id="payment-method" name="payment-method" required>
              <option value="cash-on-delivery">Contra Entrega</option>
            </select>
          </div>
          <button type="submit">Realizar Pedido</button>
        </form>
        <div id="order-summary" class="hidden">
          <h2>Resumen del Pedido</h2>
          <p id="summary-content"></p>
        </div>
      </main>
    </div>
    <script src="../js/script.js"></script>
  </body>
</html>

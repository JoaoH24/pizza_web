<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" href="../css/normalize.css" />
    <link rel="stylesheet" href="../css/styles.css" />

    <link
      rel="shortcut icon"
      href="../../assets/icons/favicon.ico"
      type="image/x-icon"
    />

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Alfa+Slab+One&family=Inter:wght@100..900&display=swap"
      rel="stylesheet"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Alfa+Slab+One&display=swap"
      rel="stylesheet"
    />
    <title>Luigi & Yoshi</title>

    <body>
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
    
      <main>
        <div class="banner">
          <h2 class="subtitle">Pizza Italiana</h2>
          <p class="description-brif">
            Sumégete en una experiencia gastronomica autenticamente italiana con
            nuestras exquisitas pizzas, donde cada bocado es un viaje directo a
            las tradicionales cocinas de italia
          </p>
          <p class="any-text">RECETA ORIGINAL</p>
          <img class="adorno" src="../../assets/images/Tabla.png" alt="condimentos">
          <img class="pizza-principal" src="../../assets/images/p1.png" alt="pizza tamaño familiar">
          <img class="hoja1" src="../../assets/images/hoja1.png" alt="">
          <img class="hoja2" src="../../assets/images/hoja2.png" alt="">
          <img class="hongo1" src="../../assets/images/hongo1.png" alt="">
          <img class="hongo2" src="../../assets/images/hongo2.png" alt="">
          <img class="pizza-vec" src="../../assets/images/pizza.png" alt="">
          <img class="tocino" src="../../assets/images/tocino.png" alt="">
          <div class="colec-pizzas">
            <img class="little-pizza" src="../../assets/images/p1.png" alt="">
            <img class="little-pizza" src="../../assets/images/p2.png" alt="">
            <img class="little-pizza" src="../../assets/images/p3.png" alt="">
            <img class="little-pizza" src="../../assets/images/p4.png" alt="">
          </div>

        </div>
        <div>
          <h2 class="subtitle-productos">Nuestras pizzas</h2>
        </div>
        <hr class="divider-prod">
        <div class="container-productos">
          <div class="container-pizza">
            <img
              class="img-pizza"
              src="../../assets/images/p1.png"
              alt="imagen de una pizza italiana"
            />
            <h3 class="pizza">Pizza Capricciosa</h3>
            <p class="description">
              Una pizza llena de sabor con una variedad de ingredientes
              tradicionales italianos.
            </p>
            <p class="description">
              <b>Ingredientes:</b> Salsa de tomate, mozzarella, jamón, champiñones,
              alcachofas, aceitunas, aceite de oliva.
            </p>
            <p class="description"> <b>Precio: </b> S/ 35.00</p>
            <button onclick="location.href=/src/html/delivery.html">Hacer pedido</button>
          </div>
    
          <div class="container-pizza">
            <img
              class="img-pizza"
              src="../../assets/images/p2.png"
              alt="imagen de una pizza italiana"
            />
            <h3 class="pizza">Pizza Napoli</h3>
            <p class="description">
              Una pizza sencilla pero con un sabor intenso, gracias a las anchoas
            </p>
            <p class="description">
              <b>Ingredientes:</b> Salsa de tomate, mozzarella, anchoas, alcaparras,
              aceitunas, orégano.
            </p>
            <p class="description"><b>Precio: </b> S/ 32.00</p>
            <button>Hacer pedido</button>
          </div>
    
          <div class="container-pizza">
            <img
              class="img-pizza"
              src="../../assets/images/p3.png"
              alt="imagen de una pizza italiana"
            />
            <h3 class="pizza">Pizza Quattro Stagioni</h3>
            <p class="description">
              Una deliciosa pizza que representa las cuatro estaciones del año con
              una variedad de ingredientes.
            </p>
            <p class="description">
              <b>Ingredientes:</b> Salsa de tomate, mozzarella, alcachofas, jamón,
              champiñones, aceitunas negras.
            </p>
            <p class="description"><b>Precio: </b> S/ 38.00</p>
            <button>Hacer pedido</button>
          </div>
    
          <div class="container-pizza">
            <img
              class="img-pizza"
              src="../../assets/images/p4.png"
              alt="imagen de una pizza italiana"
            />
            <h3 class="pizza">Pizza Marguerita</h3>
            <p class="description">
              La clásica pizza napolitana con la simpleza y frescura de sus
              ingredientes.
            </p>
            <p class="description">
              <b>Ingredientes:</b> Salsa de tomate, mozzarella, albahaca fresca, aceite
              de oliva virgen extra, sal.
            </p>
            <p class="description"><b>Precio: </b> S/ 30.00</p>
            <button>Hacer pedido</button>
          </div>
        </div>
      </main>
    </head>
      
  </body>
  </html>

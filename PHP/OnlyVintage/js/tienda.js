const CART_PRODUCTOS = "cartProductsId";

const baseDeDatos = [

    {
        "id": 1,
        "name": "Sudadera Indominus Gris",
        "image": "../../resources/images/producto1.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Gris",
        "price": 30
    },
    {
        "id": 2,
        "name": "Sudadera Indominus Negra",
        "image": "../../resources/images/producto2.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Negra",
        "price": 24.99
    },
    {
        "id": 3,
        "name": "Sudadera Indominus Verde Oscuro",
        "image": "../../resources/images/producto3.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Verde",
        "price": 49.99
    },
    {
        "id": 4,
        "name": "Sudadera Indominus Roja",
        "image": "../../resources/images/producto4.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Roja",
        "price": 30
    },
    {
        "id": 5,
        "name": "Sudadera Indominus Azul",
        "image": "../../resources/images/producto5.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Azul",
        "price": 35.95
    },
    {
        "id": 6,
        "name": "Sudadera Indominus Verde Claro",
        "image": "../../resources/images/producto6.png",
        "extraInfo": "Sudadera con capucha Indominus Tex color Verde Oscuro",
        "price": 40
    }

];

document.addEventListener("DOMContentLoaded", () => {
  loadProducts();
  loadProductCart();
});

function getProductsDb() {

  /* const url = "../json/products.json";

  console.log(url); */

 

}

async function loadProducts() {
  const products = baseDeDatos;

  let html = "";
  products.forEach(product => {
    html += `
        <div class="col-3 product-container">
            <div class="card product">
                <img
                    src="${product.image}"
                    class="card-img-top"
                    alt="${product.name}"
                />
                <div class="card-body">
                    <h5 class="card-title">${product.name}</h5>
                    <h6 class="card-text">${product.extraInfo}</h6>
                    <h6 class="card-text">${product.price} € / Unidad</h6>
                    <button type="button" class="btn btn-primary btn-cart" onClick=(addProductCart(${product.id}))>Añadir al carrito</button>
                </div>
            </div>
        </div>
      `;
  });

  document.getElementsByClassName("products")[0].innerHTML = html;
}

function openCloseCart() {
  const containerCart = document.getElementsByClassName("cart-products")[0];

  containerCart.classList.forEach(item => {
    if (item === "hidden") {
      containerCart.classList.remove("hidden");
      containerCart.classList.add("active");
    }

    if (item === "active") {
      containerCart.classList.remove("active");
      containerCart.classList.add("hidden");
    }
  });
}

function addProductCart(idProduct) {
  let arrayProductsId = [];

  let localStorageItems = localStorage.getItem(CART_PRODUCTOS);

  if (localStorageItems === null) {
    arrayProductsId.push(idProduct);
    localStorage.setItem(CART_PRODUCTOS, arrayProductsId);
  } else {
    let productsId = localStorage.getItem(CART_PRODUCTOS);
    if (productsId.length > 0) {
      productsId += "," + idProduct;
    } else {
      productsId = idProduct;
    }
    localStorage.setItem(CART_PRODUCTOS, productsId);
  }

  loadProductCart();
}

async function loadProductCart() {
  const products = baseDeDatos;

  // Convertimos el resultado del localStorage en un array
  const localStorageItems = localStorage.getItem(CART_PRODUCTOS);

  let html = "";
  if (!localStorageItems) {
    html = `
        <div class="cart-product empty">
            <p>Carrito vacio.</p>
        </div>
      `;
  } else {
    const idProductsSplit = localStorageItems.split(",");

    // Eliminamos los IDs duplicaos
    const idProductsCart = Array.from(new Set(idProductsSplit));

    idProductsCart.forEach(id => {
      products.forEach(product => {
        if (id == product.id) {
          const quantity = countDuplicatesId(id, idProductsSplit);
          const totalPrice = product.price * quantity;

          html += `
            <div class="cart-product">
                <img src="${product.image}" alt="${product.name}" />
                <div class="cart-product-info">
                    <span class="quantity">${quantity}</span>
                    <p>${product.name}</p>
                    <p>${totalPrice.toFixed(2)}</p>
                    <p class="change-quantity">
                        <button onClick="decreaseQuantity(${
                          product.id
                        })">-</button>
                        <button onClick="increaseQuantity(${
                          product.id
                        })">+</button>
                    </p>
                    <p class="cart-product-delete">
                        <button onClick=(deleteProductCart(${
                          product.id
                        }))>Eliminar</button>
                    </p>
                </div>
            </div>
        `;
        }
      });
    });
  }

  document.getElementsByClassName("cart-products")[0].innerHTML = html;
}

function deleteProductCart(idProduct) {
  const idProductsCart = localStorage.getItem(CART_PRODUCTOS);
  const arrayIdProductsCart = idProductsCart.split(",");
  const resultIdDelete = deleteAllIds(idProduct, arrayIdProductsCart);

  if (resultIdDelete) {
    let count = 0;
    let idsString = "";

    resultIdDelete.forEach(id => {
      count++;
      if (count < resultIdDelete.length) {
        idsString += id + ",";
      } else {
        idsString += id;
      }
    });
    localStorage.setItem(CART_PRODUCTOS, idsString);
  }

  const idsLocalStorage = localStorage.getItem(CART_PRODUCTOS);
  if (!idsLocalStorage) {
    localStorage.removeItem(CART_PRODUCTOS);
  }

  loadProductCart();
}

function increaseQuantity(idProduct) {
  const idProductsCart = localStorage.getItem(CART_PRODUCTOS);
  const arrayIdProductsCart = idProductsCart.split(",");
  arrayIdProductsCart.push(idProduct);

  let count = 0;
  let idsString = "";
  arrayIdProductsCart.forEach(id => {
    count++;
    if (count < arrayIdProductsCart.length) {
      idsString += id + ",";
    } else {
      idsString += id;
    }
  });
  localStorage.setItem(CART_PRODUCTOS, idsString);
  loadProductCart();
}

function decreaseQuantity(idProduct) {
  const idProductsCart = localStorage.getItem(CART_PRODUCTOS);
  const arrayIdProductsCart = idProductsCart.split(",");

  const deleteItem = idProduct.toString();
  let index = arrayIdProductsCart.indexOf(deleteItem);
  if (index > -1) {
    arrayIdProductsCart.splice(index, 1);
  }

  let count = 0;
  let idsString = "";
  arrayIdProductsCart.forEach(id => {
    count++;
    if (count < arrayIdProductsCart.length) {
      idsString += id + ",";
    } else {
      idsString += id;
    }
  });
  localStorage.setItem(CART_PRODUCTOS, idsString);
  loadProductCart();
}

function countDuplicatesId(value, arrayIds) {
  let count = 0;
  arrayIds.forEach(id => {
    if (value == id) {
      count++;
    }
  });
  return count;
}

function deleteAllIds(id, arrayIds) {
  return arrayIds.filter(itemId => {
    return itemId != id;
  });
}
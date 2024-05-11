const boton_iniciosesion = document.querySelector("#boton-iniciosesion");
const boton_registro = document.querySelector("#boton-registro");
const container = document.querySelector(".contenedor-principal");

boton_registro.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

boton_iniciosesion.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});
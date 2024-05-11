<!DOCTYPE html>
<html lang="es">
<head>
	<title>Tienda Online</title>
</head>
<body>
	<h1>Tienda Online</h1>

	<form action="cart.php" method="post">
		<h2>Producto 1</h2>
		<img src="producto1.png" alt="Producto 1">
		<p>Precio: $10</p>
		<label for="cantidad1">Cantidad:</label>
		<input type="number" id="cantidad1" name="cantidad1" value="0">

		<h2>Producto 2</h2>
		<img src="producto2.png" alt="Producto 2">
		<p>Precio: $20</p>
		<label for="cantidad2">Cantidad:</label>
		<input type="number" id="cantidad2" name="cantidad2" value="0">

		<button type="submit">Agregar al carrito</button>
	</form>
</body>
</html>


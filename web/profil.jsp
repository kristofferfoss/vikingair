<!DOCTYPE html>
<html lang="no">
<head>
<style>
	h1 {
		color: white;
		text-shadow: 2px 2px 4px black;
		font-size: 50px;
		font-variant: small-caps;
	}
	.button {
		background-color: lightskyblue;
		border: none;
		border-radius: 5px;
		color: white;
		padding: 8px 20px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 15px;
		font-variant: small-caps;
		margin: 4px 2px;
		cursor: pointer;
		box-shadow: 2px 2px 4px black;
	}
	.button2 {
		background-color: lightskyblue;
		position: absolute;
		top: 40px;
		left: 20px;
		font-size: 30px;
		box-shadow: 2px 2px 4px black;
		text-shadow: 2px 2px 4px black;
	}
</style>
<meta charset="UTF-8">
<title> Registration </title>
	<link href="css/profil.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="index.jsp">
		<button class="button button2"> Viking Airways </button>
	</form>
<div style="text-align: center;">
<h1> Din profil </h1>
<br>

   <p id="profileBox">
	Fornavn: <br>
		<input type="text" name="first_name"><br>
	Etternavn: <br>
		<input type="text" name="last_name"><br>
	Adresse: <br>
		<input type="text" name="customer_address"><br>
	Epost Adresse: <br>
		<input type="text" name="email"><br>
	Mobilnummer: <br>
		<input type="number" name="phone"><br>
	Kjønn: <br>
		<input>
		
	<form action="registrer.html">
		<button class="button"> Endre profilinfomasjon </button>
	</form>
	
	<form action="registrer.html">
			<button class="button"> Endre passord </button>
		</form>
	<form action="index.jsp">
		<button class="button"> Logg ut</button>
	</p>
</form>
</div>
</body>
</html>
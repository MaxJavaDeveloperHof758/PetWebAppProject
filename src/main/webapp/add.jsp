<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add pets</title>
<style>
body {
  background-image: url('https://gas-kvas.com/uploads/posts/2023-03/1678440423_gas-kvas-com-p-belie-risunki-na-chernom-fone-zhivotnie-35.jpg');
  background-repeat: repeat;
  background-attachment: fixed;
  background-size: cover;
}
.pet{
position: absolute;
top: 3px;
left: 15px;
width: 100px;
height: 25px;
padding: 5px;
background-color: rgb(184,134,11);
color: white;
border-radius: 0px 10px;
font-family: verdana;
font-size: 15px;
}
.text{
position: relative;
top: 100px;
color: white;
}
form{
position: relative;
top: 100px;
color: white;
}
button{
position: relative;
top: 120px;
}
</style>
</head>
<body>
<h3 class="pet">Pet Shelter</h3>
<h3 class="text">Add your pet here!</h3>
<form method="post">
<label>petType</label><br>
<input name="petType"/><br><br>
<label>petName</label><br>
<input name="petName"/><br><br>
<label>petAge</label><br>
<input name="petAge" type="number" min="0" max="20"/><br><br>
<label>petColor</label><br>
<input name="petColor"/><br><br>
<label>petOwner</label><br>
<input name="petOwner"/><br><br>
<input type="submit" value="Save"/>
</form>
<button onClick="document.location='/PetWebAppProject/'">Home Page</button>
</body>
</html>
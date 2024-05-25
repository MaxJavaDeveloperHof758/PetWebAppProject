<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit product</title>
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
top: 60px;
color: white;
font-family: verdana;
}
form{
position: absolute;
top: 120px;
color: white;
}
button{
position: absolute;
top: 72%;
left: 8px;
}
</style>
</head>
<body>
<h3 class="pet">Pet Shelter</h3>
<h3 class="text">You can edit your pet here!</h3>
<form method="post">
<input type="hidden" value="${pet.petId}" name="petId"/>
<label>petType</label><br>
<input name="petType" value="${pet.petType}"/><br><br>
<label>petName</label><br>
<input name="petName" value="${pet.petName}"/><br><br>
<label>petAge</label><br>
<input name="petAge" value="${pet.petAge}" type="number" min="0" max="20"/><br><br>
<label>petColor</label><br>
<input name="petColor" value="${pet.petColor}"/><br><br>
<label>petOwner</label><br>
<input name="petOwner" value="${pet.petOwner}"/><br><br>
<input type="submit" value="Send"/>
</form>
<button onClick="document.location='/PetWebAppProject/'">Home Page</button>
</body>
</html>
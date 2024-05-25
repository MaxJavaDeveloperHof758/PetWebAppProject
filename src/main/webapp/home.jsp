<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<style>
body {
  background-image: url('https://gas-kvas.com/grafic/uploads/posts/2023-09/1695802666_gas-kvas-com-p-kartinki-kot-52.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  margin: 0px;
}
.top{
background-color: black;
height: 50px;
opacity: .3;
}
.pet{
position: absolute;
top: -5px;
left: 5px;
color: white;
font-family: verdana;
font-size: 20px;
}
.menu{
font-size: 20px;
font-family: verdana;
position: absolute;
top: 10px;
right: 60px;
color: white;
}
.menu a{
color: white;
}
.first{
position: absolute;
top: 30%;
left: 3%;
color: white;
font-family: verdana;
font-size: 50px;
line-height: normal;
}
.second{
position: absolute;
top: 40%;
left: 3%;
color: white;
font-family: verdana;
font-size: 50px;
line-height: normal;
}
button{
height: 40px;
position: absolute;
top: 58%;
left: 3%;
font-size: 20px;
font-family: verdana;
border-radius: 50px;
}
</style>
</head>
<body>
<div class="top"></div>
<h2 class="pet">Pet Shelter</h2>
<nav class="menu">
<a href='<c:url value="/view" />'>View pets</a> |
<a href='<c:url value="/cats" />'>Cats</a> |
<a href='<c:url value="/dogs" />'>Dogs</a> |
<a href='<c:url value="/add" />'>Add pets</a>
</nav>
<h1 class="first">Adopt us.</h1>
<h1 class="second">We need your help.</h1>
<button onClick="document.location='/PetWebAppProject/view'">Find a pet to adopt</button>
</body>
</html>
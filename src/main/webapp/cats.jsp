<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pets</title>
<style>
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
.main{
position: relative;
top: 100px;
font-family: verdana;
color: white;
}
table{
position: relative;
top: 100px;
color: rgb(184,134,11);
padding: 5px;
}
th,td{
width: 80px;
text-align: center;
}
body {
  background-image: url('https://gas-kvas.com/uploads/posts/2023-02/1675475499_gas-kvas-com-p-fonovii-risunok-chernii-kot-38.jpg');
  background-repeat: repeat;
  background-attachment: fixed;
  background-size: contain;
}
button{
position: absolute;
top: 75px;
left: 15px;
}
</style>
</head>
<body>
<h3 class="pet">Pet Shelter</h3>
<h2 class="main">Here you can find a new friend!</h2>
<table>
<tr><th>Pet Type</th><th>Pet Name</th><th>Pet Age</th><th>Pet Color</th><th>Pet Owner</th></tr>
<c:forEach var="cat" items="${cats}">
<tr><td>${cat.petType}</td>
<td>${cat.petName}</td>
<td>${cat.petAge}</td>
<td>${cat.petColor}</td>
<td>${cat.petOwner}</td>
</tr>
</c:forEach>
</table>
<button onClick="document.location='/PetWebAppProject/'">Home Page</button>
</body>
</html>
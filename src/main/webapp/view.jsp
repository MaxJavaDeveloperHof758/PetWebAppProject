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
width: 100px;
text-align: center;
}
body {
  background-image: url('https://catherineasquithgallery.com/uploads/posts/2021-02/1614249728_18-p-grustnii-chernii-fon-26.jpg');
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
<tr><th>Pet Type</th><th>Pet Name</th><th>Pet Age</th><th>Pet Color</th><th>Pet Owner</th><th></th></tr>
<c:forEach var="pet" items="${pets}">
<tr><td>${pet.petType}</td>
<td>${pet.petName}</td>
<td>${pet.petAge}</td>
<td>${pet.petColor}</td>
<td>${pet.petOwner}</td>
<td>
<a href='<c:url value="/edit?id=${pet.petId}" />'>Edit</a> |
<form method="post" action='<c:url value="/delete" />' style="display:inline;">
<input type="hidden" name="petId" value="${pet.petId}">
<input type="submit" value="Delete">
</form>
</td></tr>
</c:forEach>
</table>
<button onClick="document.location='/PetWebAppProject/'">Home Page</button>
</body>
</html>
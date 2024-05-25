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
  background-image: url('https://catherineasquithgallery.com/uploads/posts/2021-02/1614432997_83-p-kartinki-na-temnom-fone-dlya-telefona-100.jpg');
  background-repeat: repeat;
  background-attachment: fixed;
  background-size: cover;
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
<h2 class="main">Here you can find a new dog!</h2>
<table>
<tr><th>Pet Type</th><th>Pet Name</th><th>Pet Age</th><th>Pet Color</th><th>Pet Owner</th></tr>
<c:forEach var="dog" items="${dogs}">
<tr><td>${dog.petType}</td>
<td>${dog.petName}</td>
<td>${dog.petAge}</td>
<td>${dog.petColor}</td>
<td>${dog.petOwner}</td>
</tr>
</c:forEach>
</table>
<button onClick="document.location='/PetWebAppProject/'">Home Page</button>
</body>
</html>
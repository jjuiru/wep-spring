<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

	<figure style="background-color: #fff; padding-top: 5px;">
    <div class="container" style="padding-top: 5px">
        <h1>account</h1>
    <table class="table table-bordered table-hover">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">id</th>
      <th scope="col">email</th>
      <th scope="col">이름</th>
    </tr>
  </thead>
  
  <tbody class="table-group-divider">
 <c:forEach var="mal" items="${memberAllList}">
<tr onclick="submitForm('${mal.memberno}%');" style="cursor: pointer;">
  <th scope="row">${mal.memberno}</th>
  <td>${mal.id}</td>
  <td>${mal.pw}</td>
  <td>${mal.name}</td>

</c:forEach>
</tr>
  </tbody>
<form id="memberForm" action="memberview.jsp" method="post">
  <input type="hidden" name="memberno" id="memberNoInput">
</form>

<script>
  function submitForm(memberno) {
    document.getElementById('memberNoInput').value = memberno;
    document.getElementById('memberForm').submit();
  }
</script>

</table>
<button type="button" class="btn btn-sm btn-outline-secondary" onclick="location.href='memberForm.jsp';">회원입력</button>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script> 
  	</figure>

</body>
</html>
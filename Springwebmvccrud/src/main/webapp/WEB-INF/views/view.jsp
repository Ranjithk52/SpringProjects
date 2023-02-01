<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
 --><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">
<script>
$(document).ready(function() {
	$('#protab').DataTable({
		"pagingType" : "full_numbers"
	});
});
</script>
<script type="text/javascript">
function deleteConfirm(){
	return confirm("Are you sure,you want to delete?");
}</script>
</head>
<body>
<h3><a href="export-to-excell">Exprot to Excell</a>&nbsp&nbsp<a href="export-to-pdf">Export To PDF</a></h3>


<a href="LoadForm">Add New Product</a>
<table border="2" id="protab">
<thead>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price</th>
<th>Edit</th>
<th>Delete</th>
</thead>
<tbody>
<c:forEach list="${listProducts}" var="p">
<tr>
<td>${p.pid}</td>
<td>${p.pname}</td>
<td>${p.qty}</td>
<td>${p.price}</td>
<td><a href="editpro?pid=${p.pid}">Edit</a></td>
<td><a href="deletepro?pid=${p.pid}" onclick="deleteConfirm()">Delete</a></td>
</tr>
</c:forEach>



</tbody>

</table>
</body>
</html>
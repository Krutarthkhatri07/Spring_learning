<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

</head>
<body background="<c:url value="/resources/image/white-3d-pedestal-background-with-realistic-palm-leaves-for-cosmetic-product-presentation-or-fashion-magazine-free-vector.jpg" />" style="width: 100%;height: auto">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product Application</h1>
				<table class="table table-striped table-dark">
					<thead>
						<tr>
							<th scope="col">S.No.</th>
							<th scope="col">Product Name</th>
							<th scope="col">Discription</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${products }" var="p">
							<tr>
								<th scope="row">${p.id }</th>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td>&#x20B9;${p.price }</td>
								<td><a href="delete/${p.id }"><i
										class="fas fa-trash-alt" style="color: #ff0505;"></i></a> <a
									href="update/${p.id}"><i class="fas fa-edit"
										style="color: #dcf80d;"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
					<a href="add-product" class="btn btn-outline-success">Add
						Product</a>
				</div>
			</div>

		</div>


	</div>
</body>
</html>

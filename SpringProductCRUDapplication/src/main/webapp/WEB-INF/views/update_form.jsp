<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp"%>
</head>
<body background="<c:url value="/resources/image/white-3d-pedestal-background-with-realistic-palm-leaves-for-cosmetic-product-presentation-or-fashion-magazine-free-vector.jpg" />" style="width: 100%;height: auto">

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offet-md-3">
				<h1 class="text-center mb-3">Change Product Details</h1>
				<form action="${pageContext.request.contextPath}/handler-product" method="post">
					<input type="text" value="${product.id}" name="id" hidden="true"/><!-- this is user for set id -->
					<div class="form-group">
						<label for="exampleInputEmail1">Product Name</label> <input
							type="text" name="name" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp"
							placeholder="Enter product Name" value="${product.name }">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Product Discription</label> <input
							type="text" name="description" class="form-control"
							id="exampleInputPassword1"
							placeholder="Enter product Discription"
							value="${product.description }">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Product Price</label> <input
							type="text" name="price" class="form-control"
							id="exampleInputPassword1" placeholder="Enter product price"
							value="${product.price }">
					</div>
					<a href="${pageContext.request.contextPath}/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Update</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

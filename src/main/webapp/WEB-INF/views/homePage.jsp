<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
ul {
	list-style-type: none;
}

li {
	color: white;
}

a {
	text-decoration: none;
	color: white;
}

body {
	background: rgb(255, 81, 0);
}

hr {
	border: 2px solid rgb(255, 255, 255);
}

.companyInfo {
	color: white;
}

.subscribeButton {
	background: red;
	color: white;
	border: none;
	margin-left: -5px;
}

.email {
	height: 26px;
	width: 370px;
	font-size: 14px;
}

.main {
	background: white;
}

.serviceName {
	margin-top: -10px;
}

.services {
	align-items: center;
	flex-direction: column;
	display: flex;
}

.carouselExampleCaptions {
	margin-top: 300px
}

.footer-header {
	color: white;
}

.footer-input {
	width: 400px;
	font-size: 14px;
	border: none;
	height: 30px
}
</style>
</head>
<body>
	<!-- Navbar -->
	<div class="d-flex justify-content-around">
		<div>
			<ul class="d-flex">
				<li class="m-2"><a href="/" target="_self">De-Kart</a></li>
				<li class="m-2"><a href="/" target="_self">Home</a></li>
			</ul>

		</div>
		<div>
			<ul class="d-flex">
				<li class="m-2"><a href="/cart" target="_self">Cart</a></li>
				<li class="m-2"><a href="/login" target="_self">Login</a></li>
				<li class="m-2"><a href="/register" target="_self">Register</a></li>
			</ul>
		</div>
	</div>
	<hr class="mt-0">
	<div
		class="jumbotron d-flex flex-column m-4 align-items-center companyInfo">
		<h3>De-Kart</h3>
		<p>Online Merchandise for Everyone</p>
		<div>
			<input type="email" class="email" placeholder="Email Address" />
			<button class="subscribeButton">subscribe</button>
		</div>
	</div>

	<!--Main Section-->
	<div class="d-flex flex-column align-items-center main">
		<h4>Services</h4>
		<p>What we offer</p>
		<div class="d-flex justify-content-around w-100">
			<div class="services">
				<i class="fa fa-laptop"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Laptops</p>
			</div>
			<div class="services">
				<i class="fa fa-laptop"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Mobiles</p>
			</div>
			<div class="services">
				<i class="fa fa-laptop"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Keyboards</p>
			</div>

		</div>
		<div class="d-flex justify-content-around w-100">
			<div class="services">
				<i class="fa fa-laptop"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Gifts</p>
			</div>
			<div class="services">
				<i class="fa fa-laptop"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Watches</p>
			</div>
			<div class="services">
				<i class="fa fa-headphones"
					style="font-size: 50px; color: rgb(255, 81, 0);"></i>
				<p class="serviceName">Headphones</p>
			</div>

		</div>
	</div>

	<!--carousel-->

	<!--footer-->
	<div class="d-flex justify-content-around">
		<div
			class="d-flex justify-content-center flex-column aligin-items-center">
			<p class="footer-header" style="margin: 0 0 0 30px">De-Kart</p>
			<ul>
				<li>Products</li>
				<li>Benefits</li>
				<li>Partners</li>
				<li>Teams</li>
			</ul>
		</div>
		<div
			class="d-flex justify-content-center flex-column aligin-items-center mt-4">
			<ul>
				<li>Documentation</li>
				<li>Support</li>
				<li>Legal Terms</li>
				<li>About</li>
			</ul>
		</div>
		<div class="d-flex justify-content-between aligin-items-center">
			<p class="footer-header " style="margin: 20px 20px 0 0">Contact
				Us</p>
			<div
				class="d-flex justify-content-around flex-column aligin-items-center">
				<input class="footer-input" type="email" name="email"
					placeholder="Enter email" /> <input class="footer-input"
					type="text" name="message" placeholder="Message"
					style="height: 50px" />
				<button style="width: 53px">send</button>
			</div>
		</div>
	</div>
</body>
</html>

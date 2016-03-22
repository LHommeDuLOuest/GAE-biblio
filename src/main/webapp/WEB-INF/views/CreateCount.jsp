<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="lyes kherbiche">
<meta name="author" content="LYES KHERBICHE">

<link href="/BootstrapFile/bootstrap/docs/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="/BootstrapFile/bootstrap/docs/examples/navbar-fixed-top/navbar-fixed-top.css"
	rel="stylesheet">
<link href="/BootstrapFile/bootstrap/docs/examples/signin/signin.css"
	rel="stylesheet">
<link
	href="/BootstrapFile/bootstrap/docs/examples/sticky-footer-navbar/sticky-footer-navbar.css"
	rel="stylesheet">
<script src="/BootstrapFile/bootstrap/dist/js/bootstrap.js"></script>
<link rel="apple-touch-icon"
	href="/BootstrapFile/bootstrap/img/pap1.ico">
<link rel="icon" href="/BootstrapFile/bootstrap/img/pap1.ico">

<!--link rel="shortcut icon" href="${pageContext.request.contextPath}/BootstrapFile/bootstrap/img/pap1.ico">
	<link href="${pageContext.request.contextPath}/BootstrapFile/bootstrap/docs/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/BootstrapFile/bootstrap/docs/examples/navbar-fixed-top/navbar-fixed-top.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/BootstrapFile/bootstrap/docs/examples/signin/signin.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath}/BootstrapFile/bootstrap/docs/examples/sticky-footer-navbar/sticky-footer-navbar.css" rel="stylesheet"> 
	<script src="${pageContext.request.contextPath}/BootstrapFile/bootstrap/dist/js/bootstrap.js"></script>
	<script src="http://code.jquery.com/jquery.js"></script-->

<!--link rel="shortcut icon" href="/img/pap1.ico">
	<link rel="shortcut icon" href="<c:url value="/btsp/img/pap1.ico"/>" >
	<link href="<c:url value="/btsp/docs/dist/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/btsp/docs/examples/navbar-fixed-top/navbar-fixed-top.css"/>" rel="stylesheet">
	<link href="<c:url value="/btsp/docs/examples/signin/signin.css"/>" rel="stylesheet">
	<link href="<c:url value="/btsp/docs/examples/sticky-footer-navbar/sticky-footer-navbar.css"/>" rel="stylesheet">
	<script src="<c:url value="/btsp/dist/js/bootstrap.js"/>"></script>
	<script src="<c:url value="/btsp/jsfolder/ajax-form.js"/>"></script>
	<script src="http://code.jquery.com/jquery.js"></script-->

<title>Create count</title>
<STYLE>
#bou {
	background-color: #35BF03;
	border-color: #35BF03;
}
</STYLE>
</head>
<body>
	<div id="bou" class="navbar navbar-default navbar-fixed-top"
		role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Titit</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a id="bou" href="/biblio?Action=home">Home</a></li>
					<li><a href="/">About</a></li>
					<li><a href="#contact">Contact</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Dropdown <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Create Count</a></li>
					<li><a href="#">Help</a></li>
					<li class="active"><a id="bou" href="/">Papillion</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!-- /container-->
	</div>
	<!--/navbar-->
	</br>
	<div class="container">
		<form class="form-signin" role="form" commandName = "userCommand" action="saveUser.ldz" method="post" acceptCharset="UTF-8">
           
			<div class="form-group">
				<legend>Create a Count</legend>
			</div>

			<div class="control-group">
			
                <div class="controls">
					<label for="text" class="control-label" path="pseudo">User : </label> 
					<input type="text" class="form-control" placeholder="UserId" path="pseudo" required/>
				</div>
				
				<div class="controls">
					<label for="text" class="control-label">Email : </label> 
					<input type="email" class="form-control" placeholder="Email address"  path="email" required autofocus/>
				</div>

				<!-- div class="controls">
					<label for="text" class="control-label">User : </label> 
					<form:input type="text" class="form-control" id="text" placeholder="UserId" path="pseudo" required/>
					<form:errors path="pseudo"/>
				</div-->

				<div class="controls">
					<label for="text" class="control-label">PassWord : </label> 
					<input type="password" class="form-control" placeholder="Password" path="pwd" required/>
				</div>

				<div class="controls">
					<label for="text" class="control-label">PassWord Confirm : </label> 
					<input type="password" class="form-control" placeholder="Password" path="cpwd" required/>
				</div>

				<!--div class="row">
     <div class="form-group">
      <label for="textarea" class="col-lg-2">Textarea : </label>
      <div class="col-lg-10">
        <input type="textarea" class="form-control" id="textarea">
      </div>
     </div>
     </div-->
				</br>
				<div class="controls">
					<button type="submit" id="bou" class="btn btn-primary btn-large">
						<i class="glyphicon glyphicon-ok"></i> Envoyer
					</button>
				</div>
			</div>
		</form>
	</div>
	<div id="footer">
		<div class="container">
			<p class="text-muted">&copy; Lyes Kherbiche</p>
		</div>
	</div>
</body>
</html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="lyes kherbiche">

<STYLE>
#bou {
	background-color: #35BF03;
	border-color: #35BF03;
}
</STYLE>

<!--link rel="shortcut icon" href="../../assets/ico/favicon.ico"-->
<!--  
    <link rel="shortcut icon" href="BootstrapFile/bootstrap/img/pap1.ico">
    <link href="BootstrapFile/bootstrap/docs/examples/navbar-fixed-top/navbar-fixed-top.css" rel="stylesheet">
    <link href="BootstrapFile/bootstrap/docs/examples/sticky-footer-navbar/sticky-footer-navbar.css" rel="stylesheet">-->
<!-- Bootstrap core CSS -->
<!--link href="../../dist/css/bootstrap.min.css" rel="stylesheet"-->
<!--link href="C:\Users\LYES\Desktop\BootstrapFile\bootstrap\docs\dist\css\bootstrap.min.css" rel="stylesheet"-->
<!--link href="BootstrapFile/bootstrap/docs/dist/css/bootstrap.min.css" rel="stylesheet">-->
<!-- Custom styles for this template -->
<!--link href="http://getbootstrap.com/examples/signin/signin.css" rel="stylesheet"-->
<!--link href="BootstrapFile/bootstrap/docs/examples/signin/signin.css" rel="stylesheet">-->
<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<title>Sign-in</title>
<link rel="shortcut icon" href="BootstrapFile/bootstrap/img/pap1.ico">
<link
	href="BootstrapFile/bootstrap/docs/examples/navbar-fixed-top/navbar-fixed-top.css"
	rel="stylesheet">
<link
	href="BootstrapFile/bootstrap/docs/examples/sticky-footer-navbar/sticky-footer-navbar.css"
	rel="stylesheet">
<link href="BootstrapFile/bootstrap/docs/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="BootstrapFile/bootstrap/docs/examples/signin/signin.css"
	rel="stylesheet">

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
				<a class="navbar-brand" href="/">Bibliotheque</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a id="bou" href="/biblio?Action=home">Home</a></li>
					<li><a href="/biblio?Action=about">About</a></li>
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
					<li><a href="/biblio?Action=newCount">Create Count</a></li>
					<li><a href="#">Help</a></li>
					<li class="active"><a id="bou" href="/">Papillion</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<div class="container">
		<form class="form-signin" role="form" action="j_spring_security_check"
			method="post">
			<input type="hidden" name="Action" value="doLogin"></input>
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="email" class="form-control" placeholder="Email address"
				required autofocus name="username"> <br> <input
				type="password" class="form-control" placeholder="Password" required
				name="password"> <label class="checkbox"> <input
				type="checkbox" value="remember-me"> Remember me
			</label>
			<button id="bou" class="btn btn-lg btn-primary btn-block"
				type="submit">
				<i class="glyphicon glyphicon-user"></i>Sign in
			</button>
		</form>
	</div>
	<!-- /container -->

	<div id="footer">
		<div class="container">
			<p class="text-muted">&copy; Lyes Kherbiche</p>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>

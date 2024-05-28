<html>
	<head>
	    <link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet" >
		<title> login</title>
	</head>
	<body >
	   <div class="container pt-5">
		   <div style="text-align: center; padding: 10px; border-style:dotted;width:400px;height:200px; border-color:orange; background-color:aqua;">
		      <p> welcome to the login page</p>
		     <h5 style="color: red;">${errorMessage}</h5>
			 <form method="post">
			    UserName :<input type="text" name="name" style="margin-bottom: 10px"/><br>
			    password :<input type="password" name="password" style="margin-bottom: 10px"><br>
			    <input type="submit"/>
			 </form>
		   </div>
	   
	   
	   </div>
	   <script type="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
	   <script type="webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>
</html>
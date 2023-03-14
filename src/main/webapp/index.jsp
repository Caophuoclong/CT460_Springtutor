<html>

<head>

</head>
<body>
    <h1>Hi, ${name}!!!</h1>
    <form method="POST" action="customer" enctype="application/x-www-form-urlencoded">
        <input placeholder="name" name="name"/>
        <input placeholder="age" name="age"/>
        <label for="male">Male</label><input type="radio" name="gender" id="male"/>
        <label for="female">Female</label><input type="radio" name="gender" id="female"/>

        <input type="submit" value="Register"/>
    </form>
</body>
</html>
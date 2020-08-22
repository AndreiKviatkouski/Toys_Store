<#import "/spring.ftl" as spring/>

<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Authorisation</legend>
        <form name="/user/auth" action="" method="POST">
            Email : <input type="email" name="lastname"/> <br/>
            Password : <input type="password" name="lastname"/> <br/>
            <input type="submit" value="Submit"/>
        </form>
    </fieldset>

</div>
</body>

</html>
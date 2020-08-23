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
        <form action="/user/auth" method="POST">
            Email : <input type="email" name="email"/> <br/>
            Password : <input type="password" name="password"/> <br/>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </fieldset>

</div>
</body>

</html>
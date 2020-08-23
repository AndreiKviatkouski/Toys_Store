<#import "/spring.ftl" as spring/>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<#if errorMessage??>
    <div style="color:red;font-style:italic;">
        ${errorMessage}
    </div>
</#if>

<div>
    <fieldset>
        <legend>Registration</legend>
        <form action="/user/reg" method="POST">
            Firstname: <label>
                <input type="text" name="firstName" maxlength="12" minlength="4" required/>
            </label> <br/>
            Lastname : <label>
                <input type="text" name="lastName"/>
            </label> <br/>
            Password : <label>
                <input type="password" name="password"/>
            </label> <br/>
            Email : <label>
                <input type="email" name="email"/>
            </label> <br/>
            Telephone: <label>
                <input type="tel" name="telephone"/>
            </label> <br/>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>

</div>
<img src="https://media1.tenor.com/images/4b9326258e851d7a3eed5929d5cf40c8/tenor.gif?itemid=11942299"
     alt="">
</body>

</html>
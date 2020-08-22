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
        <form name="/user/reg" action="" method="POST">
            <#--            <label><input type="text" name="firstName" placeholder="firsName"></label>-->
            <#--            First Name: <@spring.formInput "user.firstName" "" "text"/>    <br/>-->

            Firstname: <input type="text" name="firstname"/> <br/>
            Lastname : <input type="text" name="lastname"/> <br/>
            Password : <input type="password" name="lastname"/> <br/>
            Email : <input type="email" name="lastname"/> <br/>
            Telephone: <input type="tel" name="lastname"/> <br/>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>

</div>
<img src="https://media1.tenor.com/images/4b9326258e851d7a3eed5929d5cf40c8/tenor.gif?itemid=11942299"
     alt="">
</body>

</html>
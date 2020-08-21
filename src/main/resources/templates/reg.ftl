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
            <label><input type="text" name="firstName" placeholder="firsName"></label>
            <label><input type="text" name="lastName" placeholder="lastName"></label>
            <label><input type="text" name="password" placeholder="Password"></label>
            <label><input type="text" name="email" placeholder="email"></label>
            <label><input type="text" name="telephone" placeholder="phone"></label>

<#--            First Name: <@spring.formInput "user.firstName" "" "text"/>    <br/>-->
<#--            Last Name: <@spring.formInput "user.lastName" "" "text"/> <br/>-->
            <input type="submit" value="Create" />
        </form>
    </fieldset>
</div>


</body>

</html>
<#import "/spring.ftl" as spring/>
<html lang="en">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
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
<form action="/user/reg" method="POST">

    <div class="form-group">
        <label for="exampleInputEmail1">firstName</label>
        <input type="text" name="firstName" class="form-control" id="exampleInputFirsName1"   pattern = "[A-Z][A-Za-z' -]+" title = "Имя должно начинаться с заглавной латинской буквы и не может быть короче 2 латинских символов,  и больше 15"  maxlength="15" required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: Bob </small>
    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">lastName</label>
        <input type="text" name="lastName" class="form-control" id="exampleInputFirsName1"  pattern = "[A-Z][A-Za-z' -]+" title = "Фамилия должна начинаться с заглавной латинской буквыне может быть короче двух латинских символов, и больше 15"  maxlength="15"required><br/>
        <small id="emailHelp" class="form-text text-muted"> for example: Smith </small>
    </div>

    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Должно содержать по крайней мере одно число, одну заглавную и строчную буквы, а также не менее 8 и более символов" required><br/>
        <small id="passwordHelp" class="form-text text-muted">for example: Aa123456</small>
    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" name="email" class="form-control" id="exampleInputEmail1"   maxlength="40" minlength="4" required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: mail@mail.com</small>
    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Telephone</label>
        <input type="tel"  name="telephone" class="form-control" id="exampleInputEmail1"   pattern="\+375\-[0-9]{2}\-[0-9]{3}\-[0-9]{2}\-[0-9]{2}" title="Введите телефон в формате +375-xx-xxx-xx-xx, где вместо x должна быть цифра"required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: +375-xx-xxx-xx-xx </small>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

    <a href="/" class="btn btn-primary " role="button" aria-pressed="true">Homepage</a>
</form>
<style>
    body {
        background-image: url('https://main-cdn.goods.ru/big2/hlr-system/1721363415/100000075784b9.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
</style>
<#--<div>-->
<#--    <fieldset>-->
<#--        <legend>Registration</legend>-->
<#--        <form action="/user/reg" method="POST">-->
<#--            Firstname: <label>-->
<#--                <input type="text" name="firstName" maxlength="12" minlength="4" required/>-->
<#--            </label> <br/>-->
<#--            Lastname : <label>-->
<#--                <input type="text" name="lastName"/>-->
<#--            </label> <br/>-->
<#--            Password : <label>-->
<#--                <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Должно содержать по крайней мере одно число, одну заглавную и строчную буквы, а также не менее 8 и более символов" required/>-->
<#--            </label> <br/>-->
<#--            Email : <label>-->
<#--                <input name="telephone" name="email"/>-->
<#--            </label> <br/>-->
<#--            Telephone: <label>-->
<#--                <input type="tel" name="telephone" pattern="\+375\-[0-9]{2}\-[0-9]{3}\-[0-9]{2}\-[0-9]{2}" title="Введите телефон в формате +375-xx-xxx-xx-xx, где вместо x должна быть цифра"required/>-->
<#--            </label> <br/>-->
<#--            <input type="submit" value="Create"/>-->
<#--        </form>-->
<#--    </fieldset>-->

<#--</div>-->
</body>

</html>
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
<#if massage??>
    <div style="color:red;font-style:italic;">
        ${massage}
    </div>
</#if>
<form action="/user/reg" method="POST">

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem">
        <label for="exampleInputEmail1">firstName</label>
        <input type="text" name="firstName" class="form-control" id="exampleInputFirsName1"   pattern = "[A-Z][A-Za-z' -]+" title = "Имя должно начинаться с заглавной латинской буквы и не может быть короче 2 латинских символов,  и больше 15"  maxlength="15" required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: Bob </small>
    </div>

    <div class="form-group"style="padding-right:30rem; margin-left:30rem; margin-top: 1rem">
        <label for="exampleInputEmail1">lastName</label>
        <input type="text" name="lastName" class="form-control" id="exampleInputFirsName1"  pattern = "[A-Z][A-Za-z' -]+" title = "Фамилия должна начинаться с заглавной латинской буквыне может быть короче двух латинских символов, и больше 15"  maxlength="15"required><br/>
        <small id="emailHelp" class="form-text text-muted"> for example: Smith </small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Должно содержать по крайней мере одно число, одну заглавную и строчную буквы, а также не менее 8 и более символов" required><br/>
        <small id="passwordHelp" class="form-text text-muted">for example: Aa123456</small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" name="email" class="form-control" id="exampleInputEmail1"   maxlength="40" minlength="4" required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: mail@mail.com</small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem">
        <label for="exampleInputEmail1">Telephone</label>
        <input type="tel"  name="telephone" class="form-control" id="exampleInputEmail1"   pattern="\+375\-[0-9]{2}\-[0-9]{3}\-[0-9]{2}\-[0-9]{2}" title="Введите телефон в формате +375-xx-xxx-xx-xx, где вместо x должна быть цифра"required><br/>
        <small id="emailHelp" class="form-text text-muted">for example: +375-xx-xxx-xx-xx </small>
    </div>
    <button type="submit" class="btn btn-primary btn-lg" style="; margin-left:30rem; margin-top: 5rem" >Submit</button>
</form>


<a href="/" class="btn btn-primary btn-lg" role="button" aria-pressed="true" style="margin-left:30rem; margin-top: 5rem" >Homepage</a>

<style>
    body {
        background-image: url('https://main-cdn.goods.ru/big2/hlr-system/1721363415/100000075784b9.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
</style>

</body>

</html>
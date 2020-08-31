<html lang="en">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ItemViewPage</title>
</head>
<body>

<img src=" " class="img-fluid" alt="Responsive image">

<style>
    body {
        background-image: url('https://kartinkinaden.ru/uploads/posts/2020-07/thumbs/1595711163_5-p-fon-lego-6.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
</style>
<#--кнопка домой-->
<a href="/" class="btn btn-primary " role="button" aria-pressed="true">Homepage</a>

<#if checkAuth??>
<a href="/basket" class="btn btn-primary " role="button" aria-pressed="true"> Buy</a>

<#elseif !checkAuth??>
    <a href="/user/auth" class="btn btn-primary " role="button" aria-pressed="true"> Authorization and thenBuy</a>
</#if>

</body>
</html>
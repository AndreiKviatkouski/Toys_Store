<html lang="en">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <ul class="nav">


        <#-- проверка авторизации user-->
        <#if !checkAuth??>
        <#--        кнопка поиска-->
        <div class="input-group mb-3">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>

        <#--выпадающее меню с выбором-->
        <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
            <a class="btn btn-secondary" href="/user/reg" role="button">Reg</a>
            <a class="btn btn-secondary" href="/user/auth" role="button">Auth</a>
            <a class="btn btn-secondary" href="/info" role="button">Contact information</a>
            <div class="btn-group" role="group">
                <#--                    выпадающая строка-->
                <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Assortment
                </button>
                <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                    <a class="dropdown-item" href="/user/reg">Dolls</a>
                    <a class="dropdown-item" href="/user/auth">Soft toys</a>
                    <a class="dropdown-item" href="/user/logout">Constructors</a>
                </div>
            </div>
        </div>
<#--после авторизации-->
        <#elseif checkAuth??>

        <#--        кнопка поиска-->
        <div class="input-group mb-3">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>

        <#--выпадающее меню с выбором-->
        <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
            <a class="btn btn-secondary" href="/user/reg" role="button">Reg</a>
            <a class="btn btn-secondary" href="/user/auth" role="button">Auth</a>
            <a class="btn btn-secondary" href="/user/logout" role="button">Logout</a>
            <a class="btn btn-secondary" href="/basket" role="button">Basket</a>
            <a class="btn btn-secondary" href="/info" role="button">Contact information</a>
            <div class="btn-group" role="group">
                <#--                    выпадающая строка-->
                <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Assortment
                </button>
                <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                    <a class="dropdown-item" href="/user/auth" role="button">Dolls</a>
                    <a class="dropdown-item" href="/user/reg"role="button">Soft toys</a>
                    <a class="dropdown-item" href="/user/logout"role="button">Constructors</a>
                </div>
            </div>
        </div>
    </ul>
</nav>
            <#--    видео с YouTube-->
            </video>
            <style>
                .YouTube {
                    width: 616px;
                    max-width: 100%;
                    margin: 0 auto;
                }
                @media (max-width: 646px) {
                    .YouTube {
                        position: relative;
                        padding-bottom: 56.25%;
                        padding-top: 30px;
                        height: 0;
                        overflow: hidden;
                    }
                    .YouTube iframe {
                        position: absolute;
                        top: 0;
                        left: 0;
                        width: 100%;
                        height: 100%;
                    }
                }
            </style>
            <div class="YouTube">
                <iframe src="https://www.youtube.com/embed//wCsp-Cd1y6Y?t=38" frameborder="0" allowfullscreen="" width="616" height="462"></iframe>
            </div>


            </#if>

<div class="container">

</div>

<#if message??>
    <h2>${message}</h2>
</#if>







<#--фоновое изображение-->
<style>
    body {
        background-image: url('https://kartinkinaden.ru/uploads/posts/2020-07/thumbs/1595711163_5-p-fon-lego-6.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
</style>

<#--подключаемые скрипты JS для отображения выподающего меню с выбором-->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>

</body>
</html>
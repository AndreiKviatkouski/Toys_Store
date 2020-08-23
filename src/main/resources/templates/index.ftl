
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
                <a class="btn btn-secondary" href="/basket" role="button">Basket</a>
                <a class="btn btn-secondary" href="/info" role="button">Contact information</a>
                <div class="btn-group" role="group">
                    <button id="btnGroupDrop1" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                    </button>
                    <div class="dropdown-menu" aria-labelledby="btnGroupDrop1">
                        <a class="dropdown-item" href="#">Выпадающая ссылка</a>
                        <a class="dropdown-item" href="#">Выпадающая ссылка</a>
                    </div>
                </div>
            </div>

        <div class="d-flex">
            <div class="dropdown mr-1">
                <button type="button" class="btn btn-secondary dropdown-toggle" id="dropdownMenuOffset" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" data-offset="10,20">
                    Offset
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuOffset">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </div>

        <#elseif checkAuth??>
            <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
                <a class="btn btn-secondary" href="/user/logout" role="button">Logout</a>
            </div>
        </#if>
    </ul>
</nav>
<div class="container">

</div>

<#if message??>
    <h2>${message}</h2>
</#if>

<video width="400" height="300" controls="controls" poster="">
    <source src="https://ak.picdn.net/shutterstock/videos/6385670/preview/stock-footage-kids-room-with-bear-rocking-horse-and-cubes-looping-stop-motion-animation.webm"
            type='video/webm; codecs="vp8, vorbis"'>
</video>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>
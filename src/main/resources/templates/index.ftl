<html lang="en">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
    <#--    выарвнивание по центру, добавление цвета -->
    <div style="text-align: center; color: limegreen; background-color: #e3f2fd">
        <h1>Hello! It's Children's toys store! </h1>
    </div>
</head>
<body>

<#-- проверка авторизации  not user-->
<#if !checkAuth??>
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <ul class="nav">
            <#--        список вкладок навигации-->
            <li class="nav-item">
                <a class="nav-link" href="/toy">Toy Menu</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/reg">Reg</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/auth">Auth</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/info">Info</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/basket">Basket</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/order">Order</a>
            </li>
            <#--выпадающее меню с выбором-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                   aria-expanded="false">Cabinets</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/user">User</a>
                    <a class="dropdown-item" href="/admin">Administrator</a>
                    <a class="dropdown-item" href="/moderator">Moderator</a>
                </div>
            </li>
            <#--        кнопка поиска-->
            <li class="nav-item">
                <div class="input-group mb-3">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </li>
        </ul>
    </nav>


<#--    блок равномерного распределения карточек по экрану-->
    <style>
        ul.flex {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            /*фон блока прозрачный*/
            background:transparent;
            /*отступы внутренние*/
            padding: 3rem 4rem  3rem 4rem;
            /*отступы наружные*/
            margin-bottom:2rem;
            margin-top:5rem;
            margin-left:15rem;
            margin-right:15rem;
            left: 20rem;
            right: 20rem;
            list-style: none;
        }
    </style>

<ul class="flex">
    <#--show list toy on card-->
    <#list all>
        <#items as item>
            <div class="card m-3" style="width: 18rem;">
                <img class="card-img-top"
                     src="${item.url}"
                     alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">${item.name}</h5>
                    <p class="card-text">${item.description} Price:${item.price}$</p>
                </div>
                <div>
                    <ul class="list-group list-group-flush">
                        <a href="/addToBasket?itemId=${item.id}" class="btn btn-primary mb-2">Add to basket</a>
                        <a href="/itemViewPage?id=${item.id}" class="btn btn-success">Show toy</a>
                    </ul>
                </div>
            </div>
        </#items>
    <#else>
        <p>No toys</p>
    </#list>

</ul>



<#--   видео с YouTube&ndash;&gt;-->
<#--    <div class="YouTube">-->
<#--        <iframe src="https://www.youtube.com/embed//wCsp-Cd1y6Y?t=38" frameborder="0" allowfullscreen="" width="716"-->
<#--                height="342"></iframe>-->
<#--    </div>-->

<#--    <style>-->
<#--        .YouTube {-->
<#--            width: 616px;-->
<#--            max-width: 100%;-->
<#--            margin: 0 auto;-->
<#--            position: absolute;-->
<#--            left: 40rem;-->
<#--            bottom: 0;-->
<#--        }-->

<#--        @media (max-width: 646px) {-->
<#--            .YouTube {-->
<#--                position: relative;-->
<#--                padding-bottom: 56.25%;-->
<#--                padding-top: 30px;-->
<#--                height: 0;-->
<#--                overflow: hidden;-->
<#--            }-->

<#--            .YouTube iframe {-->
<#--                position: absolute;-->
<#--                top: 0;-->
<#--                left: 0;-->
<#--                width: 100%;-->
<#--                height: 100%;-->
<#--            }-->
<#--        }-->
<#--    </style>-->


<#--после авторизации user-->
<#elseif checkAuth??>
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <ul class="nav">
            <#--        список вкладок навигации-->
            <li class="nav-item">
                <a class="nav-link" href="/user/logout">Logout</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/info">Info</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/reg">Basket</a>
            </li>
            <#--выпадающее меню с выбором и разделением-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                   aria-expanded="false">User Menu</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/user/auth">one</a>
                    <a class="dropdown-item" href="/user/reg">two</a>
                    <div role="separator" class="dropdown-divider"></div>
                    <a class="dropdown-item" href="/user/logout">three</a>
                </div>
            </li>
            <#--        кнопка поиска-->
            <li class="nav-item">
                <div class="input-group mb-3">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </li>
        </ul>
    </nav>

    <style>
        ul.flex {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            /*фон блока прозрачный*/
            background:transparent;
            /*отступы внутренние*/
            padding: 3rem 4rem  3rem 4rem;
            /*отступы наружные*/
            margin-bottom:5rem;
            margin-top:2rem;
            margin-left:15rem;
            margin-right:15rem;
            left: 20rem;
            right: 20rem;
            list-style: none;
        }
    </style>
<#--    блок равномерного распределения карточек по экрану-->
    <ul class="flex">
        <#--show list toy on card-->
        <#list all>
            <#items as item>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top"
                         src="${item.url}"
                         alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">${item.name}</h5>
                        <p class="card-text">${item.description} Price:${item.price}$</p>
                    </div>
                    <div>
                        <ul class="list-group list-group-flush">
                            <a href="/addToBasket?itemId=${item.id}" class="btn btn-primary">Add to basket</a>
                            <a href="/itemViewPage?id=${item.id}" class="btn btn-success">Show toy</a>
                        </ul>
                    </div>
                </div>
            </#items>
        <#else>
            <p>No toys</p>
        </#list>

    </ul>





<#--после авторизации admin-->
<#elseif checkAuthAdmin??>
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <ul class="nav">
            <#--        список вкладок навигации-->

            <li class="nav-item">
                <a class="nav-link" href="/user/logout">Logout</a>
            </li>
            <#--выпадающее меню с выбором-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                   aria-expanded="false">Dropdown</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/user/auth">one</a>
                </div>
            </li>
            <#--        кнопка поиска-->
            <li class="nav-item">
                <div class="input-group mb-3">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </li>
        </ul>
    </nav>





<#--после авторизации moderator-->
<#elseif checkAuthModerator??>
    <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
        <ul class="nav">
            <#--        список вкладок навигации-->

            <li class="nav-item">
                <a class="nav-link" href="/user/logout">Logout</a>
            </li>
            <#--выпадающее меню с выбором-->
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true"
                   aria-expanded="false">Dropdown</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="/user/auth">one</a>
                </div>
            </li>
            <#--        кнопка поиска-->
            <li class="nav-item">
                <div class="input-group mb-3">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </li>
        </ul>
    </nav>


</#if>

<div class="container">

</div>

<#if message??>
    <h2>${massage}</h2>
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
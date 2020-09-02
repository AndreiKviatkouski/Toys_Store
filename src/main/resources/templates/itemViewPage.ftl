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

<#--    блок равномерного распределения карточек по экрану-->
<style>
   div.card {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-around;
        /*фон блока */
        background: antiquewhite;
        /*отступы внутренние*/
        padding: 3rem 4rem 3rem 4rem;
        /*отступы наружные*/
        margin-bottom: 2rem;
        margin-top: 1rem;
        margin-left: 20rem;
        margin-right: 20rem;
        left: 20rem;
        right: 20rem;
        list-style: none;
    }
</style>

<div class="card" style="width: 35rem;">
    <img class="card-img-top" src="${toy.url}" alt="Card image cap">
    <div class="card-body">
        <h5 class="card-title">Toy name:${toy.name}</h5>
        <p class="card-text">Toy description: ${toy.description}</p>
    </div>
    <ul class="list-group list-group-flush">
        <li class="list-group-item">Toy price: ${toy.price}</li>
        <li class="list-group-item">Toy manufacturer: ${toy.manufacturer}</li>
        <li class="list-group-item">Toy format: ${toy.format}</li>
        <li class="list-group-item">Toy status ${toy.statusToy}</li>
        <li class="list-group-item">Toy estimation:
            <#if toy.estimation??>
                ${toy.estimation}
            <#else>
                don't have estimation
            </#if>

        </li>
    </ul>
    <div class="card-body ">
        <a href="/" class="btn btn-primary m-3">Homepage</a>
        <#if checkAuth??>
            <a href="/basket" class="btn btn-primary m-3"> Buy</a>

        <#elseif !checkAuth??>
            <a href="/user/auth" class="btn btn-primary m-3"> Authorization and then Buy</a>
        </#if>

    </div>
</div>


<style>
    body {
        background-image: url('https://kartinkinaden.ru/uploads/posts/2020-07/thumbs/1595711163_5-p-fon-lego-6.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-size: cover;
    }
</style>

</body>
</html>
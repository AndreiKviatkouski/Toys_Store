<html lang="en" xmlns="http://www.w3.org/1999/html">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>Toy</title>
</head>
<body>
<#--таблица-->

<table class="table table-bordered" bgcolor="white">
    <thead class="table-success">
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Format</th>
        <th>Status</th>
        <th>Estimation</th>
        <th>Manufacturer</th>
        <th>Price</th>
        <th>Description</th>
        <th>URL image</th>
    </tr>
    </thead>
    <tbody>
    <#--        вывод листа после заголовка таблицы-->
    <#list toyAll>
        <#items as i>


            <tr>
                <th scope="row">${i_index+1}</th>
                <td>${i.name}</td>
                <td>${i.format}</td>
                <td>${i.statusToy}</td>
                <td>
                    <#--обработка null-->
                    <#if i.estimation??>
                        ${i.estimation}
                    <#else>
                        isEmpty
                    </#if></td>

                <td>${i.manufacturer}</td>
                <td>${i.price}</td>
                <td>${i.description}</td>
                <td>${i.url}</td>
            </tr>


        </#items>
    <#else>
        <p>No toys</p>
    </#list>
    </tbody>
</table>

<a href="/" class="btn btn-primary btn-lg" role="button" aria-pressed="true"
   style="margin-left:30rem; margin-top: 5rem">Homepage</a>
<a href="/toy" class="btn btn-primary btn-lg" role="button" aria-pressed="true"
   style="margin-left:30rem; margin-top: 5rem">Toypage</a>
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















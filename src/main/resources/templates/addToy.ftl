<html lang="en" xmlns="http://www.w3.org/1999/html">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<head>
    <meta charset="UTF-8">
    <title>Toy</title>
</head>
<body>
<#if massage??>
    <div style="color:red;font-style:italic;">
        ${massage}
    </div>
</#if>

<form action="/toy/addToy" method="POST">

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label for="exampleInputEmail1">Name</label>
        <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  maxlength="20" minlength="2" required ><br/>
        <small id="emailHelp" class="form-text text-muted">for example:Mario constructor</small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label>
            <select name="format">
                <option value="SOFT_TOYS">SOFT TOY</option>
                <option value="DOLLS">DOLL</option>
                <option value="CONSTRUCTOR">CONSTRUCTOR</option>
            </select>
        </label>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label>
            <select name="statusToy">
                <option value="SOLD">SOLD</option>
                <option value="IN_STOCK">IN_STOCK</option>
            </select>
        </label>
    </div>


    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label for="">Manufacturer</label>
        <input type="text" name="manufacturer" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  maxlength="20" minlength="2" required ><br/>
        <small id="emailHelp" class="form-text text-muted">for example:Lego</small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label for="">Price</label>
        <input type="number" name="price" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  maxlength="3" minlength="2" required ><br/>
        <small id="emailHelp" class="form-text text-muted">for example: 10 </small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label for="">Description</label>
        <input type="text" name="description" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  maxlength="40" minlength="2" required ><br/>
        <small id="emailHelp" class="form-text text-muted">for example:Popular toy in Belarus</small>
    </div>

    <div class="form-group" style="padding-right:30rem; margin-left:30rem; margin-top: 1rem" >
        <label for="">URL</label>
        <input type="url" name="url" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  required ><br/>
        <small id="emailHelp" class="form-text text-muted">https://www.belrynok.by/wp-content/uploads/2019/11/ggl_belrynok.by_3110_grishkashop.by_.jpg</small>
    </div>

    <button type="submit" class="btn btn-primary btn-lg" style="; margin-left:30rem; margin-top: 1rem" >Create</button>





</form>


<a href="/" class="btn btn-primary btn-lg" role="button" aria-pressed="true" style="margin-left:30rem; margin-top: 1rem" >Homepage</a>

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

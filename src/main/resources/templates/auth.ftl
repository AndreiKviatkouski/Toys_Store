<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>


<html>
<head>
    <title>Authorization</title>

</head>
<body>
<div class="mt-5">
    <form action="/user/auth" method="post">
        <div class="form-group text-light">
            <label for="exampleInputEmail1" class="offset-sm-4">Email</label>
            <input type="email" name="email" class="form-control col-4 offset-sm-4" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="form-group text-light">
            <label for="exampleInputPassword1" class="offset-sm-4">Password</label>
            <input type="password" name="password" class="form-control col-4 offset-sm-4" id="exampleInputPassword1">
        </div>
        <button type="submit" class="btn btn-primary offset-sm-4">Submit</button>
    </form>

    <a href="/" type="submit" class="btn btn-primary offset-sm-6 col-2">Homepage</a>
</div>

<style>
    body {
        background: url("https://avatars.mds.yandex.net/get-pdb/1732662/b289c777-3958-410f-b630-365c6aac533c/s1200?webp=false")
    }
</style>



</body>
</html>
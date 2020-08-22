<#import "/spring.ftl" as spring/>
<html lang="en">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
<head>
    <meta charset="UTF-8">
    <title>Homepage</title>
</head>
<body>
<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
    <ul class="nav">
        <#if !checkAuth??>
            <li class="nav-item">
                <a class="nav-link" href="/user/reg">Registration</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/auth">Authorisation</a>
            </li>
        <#elseif checkAuth??>
            <a href="/user/logout">logout</a>
        </#if>
    </ul>
</nav>
<#if message??>
    <h2>${message}</h2>
</#if>

<video width="400" height="300" controls="controls" poster="">
    <source src="https://ak.picdn.net/shutterstock/videos/6385670/preview/stock-footage-kids-room-with-bear-rocking-horse-and-cubes-looping-stop-motion-animation.webm" type='video/webm; codecs="vp8, vorbis"'>
</video>
<style>
</style>

</body>
</html>
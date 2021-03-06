<%-- 
    Document   : Login
    Created on : 31-07-2018, 9:02:39
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>EasyNotes</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abel">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
        <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
        <link rel="stylesheet" href="assets/css/Features-Blue.css">
        <link rel="stylesheet" href="assets/css/Footer-Basic.css">
        <link rel="stylesheet" href="assets/css/Footer-Clean.css">
        <link rel="stylesheet" href="assets/css/Header-Blue.css">
        <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
        <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
        <link rel="stylesheet" href="assets/css/Pretty-Header.css">
        <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
        <link rel="stylesheet" href="assets/css/Navigation-with-Search.css">
        <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>

    <body>
        <nav class="navbar navbar-default navigation-clean-button" style="height:90px;background-color:rgb(58,59,61);">
            <div class="container">
                <div class="navbar-header"><a class="navbar-brand" href="#" style="font-family:Abel, sans-serif;font-size:29px;background-color:rgba(0,0,0,0);color:rgb(255,255,255);margin:10px;">EasyNotes</a><button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></div>
                <div
                    class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav"></ul>
                    <p class="navbar-text navbar-right actions"> <a class="navbar-link login" href="Login.html" style="color:rgb(255,255,255);">Iniciar sesión</a><a class="btn btn-default action-button" role="button" href="Registrar.html" Style="color:rgb(0,0,0);padding:10px 22px;margin:10px">Registrar</a></p>
                </div>
            </div>
        </nav>
        <div class="login-clean">
            <form method="post" action="LoginUsuario">
                <h2 class="sr-only">Login Form</h2>
                <div class="illustration"><i class="icon ion-ios-locked" style="color:rgb(58,59,61);"></i></div>
                <div class="form-group"><span class="label label-default" style="font-size:15px;color:rgb(58,59,61);background-color:rgba(119,119,119,0);">Matricula</span><input class="form-control" type="text" name="matricula" required="" placeholder="Ingrese matricula"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:15px;color:rgb(58,59,61);background-color:rgba(119,119,119,0);">Contraseña</span><input class="form-control" type="password" name="pass" required="" placeholder="Ingrese contraseña"></div>
                <div
                    class="form-group"><button class="btn btn-primary btn-block" type="submit" style="background-color:rgb(26,83,135);">Ingresar</button></div>
            </form>
        </div>
        <div class="footer-basic" style="background-color:rgb(58,59,61);color:rgb(255,255,255);">
            <footer>
                <div class="social"><a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a></div>
                <ul class="list-inline">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Terms</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                </ul>
                <p class="copyright">EasyNotes © 2018</p>
            </footer>
        </div>
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/calendar.js"></script>
        <script src="assets/js/countrypicker.js"></script>
        <script src="assets/js/countrypicker.min.js"></script>
    </body>

</html>

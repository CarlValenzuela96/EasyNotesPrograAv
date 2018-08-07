<%-- 
    Document   : Agregar_Asignatura
    Created on : 31-07-2018, 8:56:53
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <div>
            <nav class="navbar navbar-default custom-header" style="margin:0px;background-color:rgb(58,59,61);">
                <div class="container-fluid">
                    <div class="navbar-header"><a class="navbar-brand" href="index.html" style="background-color:rgb(58,59,61);color:rgb(255,255,255);font-family:Abel, sans-serif;">EasyNotes</a><button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></div>
                    <div
                        class="collapse navbar-collapse" id="navbar-collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false" href="#"> <span class="caret"></span><img src="assets/img/avatar.jpg" class="dropdown-image"></a>
                                <ul class="dropdown-menu dropdown-menu-right" role="menu">
                                    <li role="presentation"><a href="index.html">Perfil</a></li>
                                    <li role="presentation" class="active"><a href="#">Salir</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="contact-clean">
            <form method="post" action="agregarRamo">
                <h2 class="text-center"><strong>Agregar Asignatura</strong><br></h2>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre asignatura</span><input class="form-control" type="text" name="nomAsign" required="" placeholder="Ingresar nombre asignatura"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Código asignatura</span><input class="form-control" type="text" name="cod" required="" placeholder="Ingresar código asignatura"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Tipo aprobación</span><select class="form-control" name="tipoAprob"><option value="1">Teórico - Práctico en conjunto </option><option value="2">Teórico - Práctico por separado</option><option value="3">Solo Teórico</option><option value="4">Solo Práctico</option></select></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Ponderación parte teórica</span><input class="form-control" type="number" name="pondNT" required="" placeholder="Ingrese ponderación parte teórica "
                                                                                                                                                                                             min="0" max="100"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Ponderación parte Práctica</span><input class="form-control" type="number" name="pondNP" required="" placeholder="Ingrese ponderación parte teórica "
                                                                                                                                                                                                   min="0" max="100"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Cantidad notas teóricas</span><input class="form-control" type="number" name="cantNT" required="" placeholder="Ingrese cantidad notas teóricas"
                                                                                                                                                                                                min="0" max="9"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Cantidad notas prácticas</span><input class="form-control" type="number" name="cantNP" required="" placeholder="Ingrese cantidad notas prácticas"
                                                                                                                                                                                                 min="0" max="9"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Horas semanales</span><input class="form-control" type="number" name="horasSem" required="" placeholder="Ingrese horas semanales de la asignatura"
                                                                                                                                                                                        min="1" max="8"></div>
                <div class="form-group">
                    <button class="btn btn-primary" type="submit" name="opc" value="0" style="margin:15px 10px 0px;">Volver</button>
                    <button class="btn btn-primary" type="submit" name="opc" value="1">Aceptar</button></div>
            </form>
        </div>
        <div class="footer-basic" style="background-color:rgb(58,59,61);color:rgb(255,255,255);">
            <footer>
                <div class="social"><a href="#"><i class="icon ion-social-instagram"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-facebook"></i></a></div>
                <ul
                    class="list-inline">
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

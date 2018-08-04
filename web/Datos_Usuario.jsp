<%-- 
    Document   : Datos_Usuario
    Created on : 31-07-2018, 9:01:24
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
            <form method="post" action="DatosUsuario">
                <h2 class="text-center">Datos usuario</h2>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre</span><input class="form-control" type="text" name="nombre" required="" placeholder="Ingresar nombre"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Apellido</span><input class="form-control" type="text" name="apellido" required="" placeholder="Ingresar apellido"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Matrícula</span><input class="form-control" type="text" name="matricula" required="" placeholder="Ingresar matrícula"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Run</span><input class="form-control" type="text" name="run" required="" placeholder="Ingresar run (ej:11.111.111-1)"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">PGA</span><input class="form-control" type="text" name="pga" required="" placeholder="Ingresar PGA"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Sexo</span><select class="form-control" name="sexo"><option value="1">Femenino</option><option value="2">Masculino</option></select></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Fecha Nacimiento</span><input class="form-control" type="date" name="fechaNac" required=""></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nacionalidad</span>
                    <!-- Stylesheet -->

                    <link rel="stylesheet" href="/path/to/bootstrap.min.css">

                    <link rel="stylesheet" href="/path/to/bootstrap-select.min.css">



                    <!-- JavaScript -->

                    <script src="/path/to/jquery.min.js"></script>

                    <script src="/path/to/bootstrap.min.js"></script>

                    <script src="/path/to/bootstrap-select.min.js"></script>


                    <select class="form-control selectpicker countrypicker"
                            data-live-search="true"
                            data-default="Chile" name="nacionalidad">
                    </select>


                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Teléfono</span><input class="form-control" type="text" name="telefono" required="" placeholder="Ingresar numero teléfono"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Email</span><input class="form-control" type="email" name="email" required="" placeholder="Ingresar email"></div>
                <div class="form-group">
                    <h2 class="text-center">Datos domicilio</h2>
                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Pais residencia</span>
                    <!-- Stylesheet -->

                    <link rel="stylesheet" href="/path/to/bootstrap.min.css">

                    <link rel="stylesheet" href="/path/to/bootstrap-select.min.css">



                    <!-- JavaScript -->

                    <script src="/path/to/jquery.min.js"></script>

                    <script src="/path/to/bootstrap.min.js"></script>

                    <script src="/path/to/bootstrap-select.min.js"></script>


                    <select class="form-control selectpicker countrypicker"
                            data-live-search="true"
                            data-default="Chile" name="paisRes">
                    </select>


                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Ciudad</span><input class="form-control" type="text" name="ciudad" required="" placeholder="Ingresar ciudad residencia"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Comuna</span><input class="form-control" type="text" name="comuna" required="" placeholder="Ingresar comuna residencia"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Calle</span><input class="form-control" type="text" name="calle" required="" placeholder="Ingresar calle residencia"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Tipo domicilio</span><select class="form-control" name="tipoVivienda"><option value="0">Casa</option><option value="1">Departamento</option></select></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Numeración</span><input class="form-control" type="number" name="numDom" required="" placeholder="Ingresar numeracion domicilio"
                                                                                                                                                                              min="1"></div>
                <div class="form-group">
                    <h2 class="text-center">Datos académicos</h2>
                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre universidad</span><input class="form-control" type="text" name="nombreUniv" required="" placeholder="Ingresar nombre universidad"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre carrera</span><input class="form-control" type="text" name="nombreCarr" required="" placeholder="Ingresar nombre carrera"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Cantidad de semestres</span><input class="form-control" type="number" name="cantSem" required="" placeholder="Ingresar cantidad de semetres de duracion de la carrera"
                                                                                                                                                                                         min="1" max="20"></div>
                <div class="form-group"><button class="btn btn-primary" type="submit">Aceptar</button></div>
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

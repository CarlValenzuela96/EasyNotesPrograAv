<%-- 
    Document   : PerfilUsuario
    Created on : 01-08-2018, 9:10:55
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
            <form method="post" action="PerfilUsuario">
                <h2 class="text-center">Datos usuario</h2>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre</span><input class="form-control" type="text" name="nombre" disabled="" value="${user.getNombre()}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Apellido</span><input class="form-control" type="text" name="apellido" disabled=""  value="${user.getApellido()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Matrícula</span><input class="form-control" type="text" name="matricula" disabled="" value="${user.getMatricula()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Run</span><input class="form-control" type="text" name="run" disabled=""  value="${user.getRun()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">PGA</span><input class="form-control" type="text" name="pga" disabled="" value="${user.getPga()}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Sexo</span><input class="form-control" type="text" name="sexo" disabled="" value="${user.getSexo()}"></div>
               
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Fecha Nacimiento</span><input class="form-control" type="text" name="fechaNac" disabled="" value="${user.getFechaNacimiento()}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Edad</span><input class="form-control" type="text" name="edad" disabled="" value="${user.getEdad()}"></div>
                
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nacionalidad</span><input class="form-control" type="text" name="nacionalidad" disabled="" value="${user.getNacionalidad()}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Teléfono</span><input class="form-control" type="text" name="telefono" disabled="" value="${user.getTelefono()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Email</span><input class="form-control" type="email" name="email" disabled="" value="${user.getEmail()}"></div>
                <div
                    class="form-group">
                    <h2 class="text-center">Datos domicilio</h2>
                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Pais residencia</span><input class="form-control" type="text" name="paisRes" disabled="" value="${dir.getPaisRecidencia()}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Ciudad</span><input class="form-control" type="text" name="ciudad" disabled="" value="${dir.getCiudad()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Comuna</span><input class="form-control" type="text" name="comuna" disabled="" value="${dir.getComuna()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Calle</span><input class="form-control" type="text" name="calle" disabled="" value="${dom.getCalle()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Tipo domicilio</span><input class="form-control" type="text" name="tipoVivienda" disabled="" value="${tipoViv}"></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Numeración</span><input class="form-control" type="number" name="numDom" disabled="" value="${numViv}" 
                                                                                                                                                                                   min="1"></div>
                <div class="form-group">
                    <h2 class="text-center">Datos académicos</h2>
                </div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre universidad</span><input class="form-control" type="text" name="nombreUniv" disabled="" value="${car.getUniversidad()}"
                                                                                                                                                                                           ></div>
                <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Nombre carrera</span><input class="form-control" type="text" name="nombreCarr" disabled="" value="${car.getNombreCarrera()}"></div>
                <div
                    class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Cantidad de semestres</span><input class="form-control" type="number" name="cantSem" disabled="" value="${car.getCantSemestres()}"
                                                                                                                                                                                         ></div>
                <div class="form-group"><button class="btn btn-primary" type="submit" name="opc" value="0" style="margin:15px 5px 0px;">volver</button><button class="btn btn-primary" name="opc" value="1" type="submit">Editar</button></div>
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

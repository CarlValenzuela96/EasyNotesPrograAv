<%-- 
    Document   : Principal
    Created on : 31-07-2018, 9:03:18
    Author     : Carlos
--%>

<%@page import="clases.Semestre"%>
<%@page import="clases.Usuario"%>
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
                                    <li role="presentation"><form method="post" action="EnviarDatosUsuario"><button class ="btn btn-link" type="submit" >Perfil</button></form></li>
                                    <li role="presentation" class="active"><a href="index.jsp">Salir</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="features-blue">
            <div class="container">
                <div class="row" style="margin:30px 30px 30px;">

                    <div class="col-md-12"><span class="label label-default" style="margin:15px 10px 30px;background-color:rgba(119,119,119,0);color:rgb(255,255,255);font-size:16px;padding:0px 750px 0px;">
                            <%
                                Usuario u = (Usuario) session.getAttribute("usuario");
                                String nombre = "Usuario: " + u.getNombre() + " " + u.getApellido();
                                out.print(nombre);
                            %>
                        </span></div>
                    <div class="col-md-12"><span class="label label-default" style="margin:15px 10px 30px;background-color:rgba(119,119,119,0);color:rgb(255,255,255);font-size:16px;">
                            <%
                                Semestre sem = (Semestre) session.getAttribute("semestreActivo");
                                String anio = "Año: " + sem.getAñoSemestre();
                                out.print(anio);
                            %>

                        </span></div>
                    <div class="col-md-12"><span class="label label-default" style="margin:15px 10px 30px;background-color:rgba(119,119,119,0);color:rgb(255,255,255);font-size:16px;">
                            <%
                             Semestre sem2 = (Semestre) session.getAttribute("semestreActivo");
                             String numSem = "Semestre: " + sem2.getNumeroSemestre();
                             out.print(numSem);
                            %>

                            </span></div>
                </div>
                <div class="intro"></div>

                <div class="row">
                    <div class="col-md-6" style="width:424px;">
                        <form method="post" action="EnviarOpcMain">
                            <div class="row">
                                <div class="col-md-12"><button class="btn btn-primary" name="opcMain" value="1" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);width:293.297px;margin:0px 0px 20px;"><i class="glyphicon glyphicon-list" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Ramos &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span></button></div>
                                <div
                                    class="col-md-12"><button class="btn btn-primary" name="opcMain" value="2" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);width:293.297px;margin:0px 0px 20px;"><i class="glyphicon glyphicon-plus-sign" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Agregar Ramo &nbsp; &nbsp; &nbsp;</span></button></div>
                                <div
                                    class="col-md-12"><button class="btn btn-primary" name="opcMain" value="3" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);width:293.297px;margin:0px 0px 20px;"><i class="glyphicon glyphicon-trash" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Borrar Ramo &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span></button></div>
                                <div
                                    class="col-md-12"><button class="btn btn-primary" name="opcMain" value="4" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);margin:0px 0px 20px;"><i class="icon ion-android-options" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Gestion Semestre &nbsp;</span></button></div>
                                <div
                                    class="col-md-12"><button class="btn btn-primary" name="opcMain" value="5" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);width:293.297px;margin:0px 0px 20px;"><i class="fa fa-book" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Historial &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</span></button></div>
                                <div
                                    class="col-md-12"><button class="btn btn-primary" name="opcMain" value="6" type="submit" style="background-color:rgba(255,255,255,0);color:rgb(255,255,255);width:293.297px;margin:0px 0px 20px;"><i class="fa fa-clock-o" style="font-size:38px;"></i><span class="label label-default" style="font-size:23px;color:rgb(255,255,255);background-color:rgba(24,57,123,0);">Horario &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></button></div>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-6" style="width:643px;">
                        <div class="row">
                            <div class="col-md-12">    

                                <script src="https://cdn.alloyui.com/3.0.1/aui/aui-min.js"></script>

                                <link href="https://cdn.alloyui.com/3.0.1/aui-css/css/bootstrap.min.css" rel="stylesheet">

                                <div id="wrapper">
                                    <div id="myScheduler"></div>
                                </div>
                                <form method="post" action="enviarEventos"><button class="btn btn-primary" value="0" name="add" type="submit"  style="margin:4px;background-color:rgb(27,87,137);"><i class="glyphicon glyphicon-calendar" style="font-size:26px;"></i><span class="label label-default" style="font-size:19px;background-color:rgba(119,119,119,0);">Agregar fecha</span></button>
                                    <button class="btn btn-primary" type="submit" value="1" name="add" style="margin:4px;background-color:rgb(27,87,137);height:44px;"><i class="icon ion-android-delete" style="font-size:26px;"></i><span class="label label-default" style="font-size:19px;background-color:rgba(119,119,119,0);">Borrar fecha</span></button></form>
                                <!--                                <a class="btn btn-primary" role="button" href="Agregar_Fecha.jsp" style="margin:4px;background-color:rgb(27,87,137);"><i class="glyphicon glyphicon-calendar" style="font-size:26px;"></i><span class="label label-default" style="font-size:19px;background-color:rgba(119,119,119,0);">Agregar fecha</span></a>
                                <a class="btn btn-primary" role="button" href="EliminarFecha.jsp" style="margin:4px;background-color:rgb(27,87,137);height:44px;"><i class="icon ion-android-delete" style="font-size:26px;"></i><span class="label label-default" style="font-size:19px;background-color:rgba(119,119,119,0);">Borrar fecha</span></a>-->
                            </div>

                        </div>
                    </div>
                </div>
            </div>
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
        <script>
            <%
                // String a="{\"color\":\"#ff0080\",\"anio\":2018,\"mes\":7,\"dia\":24,\"content\":\"Prueba 1\"}";
                String fechas = (String) session.getAttribute("jsonFechas");
                out.print("var fechas='[" + fechas + "]';");
            %>

        </script>                
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <!--<script type="text/javascript" src="assets/js/fechas.js"></script>-->
        <script src="assets/js/calendar.js"></script>
        <script src="assets/js/countrypicker.js"></script>
        <script src="assets/js/countrypicker.min.js"></script>
    </body>

</html>

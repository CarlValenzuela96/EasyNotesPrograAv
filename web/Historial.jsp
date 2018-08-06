<%-- 
    Document   : Historial
    Created on : 03-08-2018, 21:32:36
    Author     : Carlos
--%>
<%@page import="clases.Ramo"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <link rel="stylesheet" href="assets/fonts/material-icons.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Abel">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cookie">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700">
        <link rel="stylesheet" href="assets/css/Article-List.css">
        <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
        <link rel="stylesheet" href="assets/css/Features-Blue.css">
        <link rel="stylesheet" href="assets/css/Footer-Basic.css">
        <link rel="stylesheet" href="assets/css/Footer-Clean.css">
        <link rel="stylesheet" href="assets/css/Header-Blue.css">
        <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
        <link rel="stylesheet" href="assets/css/Pretty-Header.css">
        <link rel="stylesheet" href="assets/css/Navigation-Clean.css">
        <link rel="stylesheet" href="assets/css/Navigation-with-Button.css">
        <link rel="stylesheet" href="assets/css/Navigation-with-Search.css">
        <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
        <link rel="stylesheet" href="assets/css/styles.css">
    </head>

    <body>
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
        <div class="contact-clean">
            <!--        <form method="post">
                        <h2 class="text-center">Historial</h2>
                        <div class="form-group"><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Semestre</span><select class="form-control" name="año"><optgroup label="Seleccione año del semestre"></optgroup></select></div>
                        <div
                            class="form-group"><button class="btn btn-primary" type="submit">Buscar</button></div>
                </form>
                <div class="row">
                    <div class="col-md-12" style="margin:10px;"></div>
                </div>-->
            <form method="post" action="funcHistorial">
                <div class="form-group"><h2 class="text-center">Historial</h2><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Año:${año}</span><span class="label label-default" style="font-size:17px;background-color:rgba(119,119,119,0);color:rgb(58,59,61);">Semestre:${sem}</span></div>
                <div
                    class="form-group">
                    <div class="table-responsive">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Ramo</th>
                                    <th>Estado</th>
                                    <th>Nota</th>
                                </tr>
                            </thead>
                            <tbody>
                            
                                            <%
                                                Ramo[] r = (Ramo[]) request.getAttribute("ramosHist");
                                                for (int i = 0; i < r.length; i++) {
                                                    String nombreR = r[i].getNombreRamo();
                                                    String tipoR = r[i].getTipoAprobacion();
                                                    
                                                    double prom;
                                                    if (tipoR.equals("Solo Teórico") || tipoR.equals("Solo Práctico")) {
                                                        prom = r[i].getPromedioSimple().getPromFinal();
                                                    } else {
                                                        prom = r[i].getPromedioMixto().getPromFinal();
                                                    }
                                                    
                                                    String estado="";
                                                    if (prom >= 3.96) {
                                                        estado = "Aprobado";
                                                    }else{
                                                        estado = "Reprobado";
                                                    }
                                                    out.print("<tr>");
                                                    out.print("<td>"+nombreR+"</td>");
                                                    out.print("<td>"+estado+"</td>");
                                                    out.print("<td>"+prom+"</td>");
                                                    out.print("</tr>");
                                                }
                                            %>   

                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="form-group">
                    <button class="btn btn-primary" type="submit" name="opc" value="0" style="margin:15px 10px 0px;height:56px;">Volver</button>
                    <button class="btn btn-primary" type="submit" name="opc" value="1"><i class="fa fa-file-pdf-o" style="font-size:24px;"></i></button>
                    <button class="btn btn-primary" type="submit" name="opc" value="2" style="margin:15px 10px 0px;font-size:24px;"><i class="fa fa-bar-chart"></i></button></div>
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
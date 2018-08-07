<%-- 
    Document   : Grafico
    Created on : 05-08-2018, 22:51:24
    Author     : Carlos
--%>

<%@page import="clases.Historial"%>
<%@page import="clases.Ramo"%>
<%@page import="clases.Usuario"%>
<%@page import="Querys.GetDatos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>EasyNotes2</title>
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
        <div class="features-blue">
            <div class="container">
                <header style="height:50px;margin:0px 100 px 100px;"></header>
                <form style="background-color:#ffffff;"><title>Bar Chart</title>
                    <script src="http://www.chartjs.org/dist/2.7.2/Chart.bundle.js"></script>

                    <script src="http://www.chartjs.org/samples/latest/utils.js"></script>

                    <div id="container" style="width: 75%;">
                        <canvas id="grafico"></canvas>
                    </div>

                </form>
                <header style="height:50px;margin:0px 100 px 100px;">
                    <a class="btn btn-primary" type="button" href="Principal.jsp" style="font-size:22px;margin:15px 10px 5px;">Volver</a>
                </header>
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
                session = (HttpSession) request.getSession();
                GetDatos g = new GetDatos();
                

                Historial hist = (Historial) session.getAttribute("hist");

                Ramo[] r = g.getRamosUser(hist.getSemestreidSemestre().getIdSemestre());

                String ramo = "[";
                for (int i = 0; i < r.length; i++) {
                    if (i != (r.length - 1)) {
                        ramo = ramo + "'" + r[i].getNombreRamo() + "',";
                    } else {
                        ramo = ramo + "'" + r[i].getNombreRamo() + "'];";
                    }

                }

                out.println("var ramos=" + ramo);

                String notas = "[";
                for (int i = 0; i < r.length; i++) {
                    if (i != (r.length - 1)) {
                        double prom;
                        if (r[i].getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r[i].getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                            prom = r[i].getPromedioMixto().getPromFinal();
                        } else {
                            prom = r[i].getPromedioSimple().getPromFinal();
                        }
                        notas = notas + prom + ",";
                    } else {
                        double prom;
                        if (r[i].getTipoAprobacion().equals("Teórico - Práctico en conjunto") || r[i].getTipoAprobacion().equals("Teórico - Práctico por separado")) {
                            prom = r[i].getPromedioMixto().getPromFinal();
                        } else {
                            prom = r[i].getPromedioSimple().getPromFinal();
                        }
                        notas = notas + prom + "];";
                    }
                }

                out.print("var notas=" + notas);

            %>



        </script>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <!--<script src="assets/js/calendar.js"></script>-->
        <script src="assets/js/countrypicker.js"></script>
        <script src="assets/js/countrypicker.min.js"></script>
        <script src="assets/js/grafico.js"></script>
    </body>

</html>
<%-- 
    Document   : RamoSimple
    Created on : 04-08-2018, 14:14:48
    Author     : Carlos
--%>
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
        <div class="features-blue">
            <!--<div class="contact-clean">-->
            <h2 class="text-center" style="color:rgb(255,255,255);padding:0px 0px 0px;;margin:5px 0px 5px;"><strong>Asignatura : &nbsp;${asign.getNombreRamo()}</strong><br></h2>
            <h2 class="text-center" style="color:rgb(255,255,255);font-size:20px;padding:0px 0px 0px;margin:5px 0px 5px;"><strong>Tipo Aprobacion : &nbsp;${asign.getTipoAprobacion()}</strong><br></h2>
            <h2 class="text-center" style="color:rgb(255,255,255);padding:0px 0px 0px;margin:5px 0px 80px;font-size:20px;"><strong>Ponderacion &nbsp;${tip} : &nbsp;100%</strong><br></h2><span class="label label-default" style="background-color:rgba(119,119,119,0);font-size:18px;margin:0px 5px 20px;">${tip}&nbsp -&nbsp Cantidad evaluaciones:&nbsp ${cantN}</span>
            <div class="row">

                <div class="col-md-12">
                    <form method="post" action="calcularProm">
                        <div class="row" style="margin:20px 0px 0px;">
                            <div class="col-md-3" style="width:80px;height:50px;"><span class="label label-default" style="background-color:rgba(119,119,119,0);margin:20px 10px 20px;">NOTAS</span></div>
                            <c:forEach items="${notas}" var="i"  varStatus="loop">
                                <div class="col-md-3" style="width:80px;height:50px;color:rgb(0,0,0);" ><input type="text" name="nota${loop.index}" style="width:40px;height:40px;" value="${i}"></div>
                                </c:forEach> 

                            <div class="col-md-3" style="width:80px;height:50px;"><input type="text" disabled="" style="width:40px;height:40px;color:rgb(0,0,0);" value="${prom}"></div>
                        </div>
                        <div class="row" style="margin:0px 0px 0px;">
                            <div class="col-md-3" style="width:80px;height:50px;"><span class="label label-default" style="background-color:rgba(119,119,119,0);margin:20px 10px 20px;">POND</span></div>

                            <c:forEach items="${pond}" var="i" varStatus="loop">
                                <div class="col-md-3" style="width:80px;height:50px;color:rgb(0,0,0);"><input type="text" name="pond${loop.index}" style="width:40px;height:40px;" value="${i}"></div>
                                </c:forEach> 


                            <div class="col-md-3" style="width:80px;height:50px;padding:0px;"><span class="label label-default" style="background-color:rgba(119,119,119,0);margin:10px 10px 20px;">PROMEDIO</span></div>
                        </div>
                        <div class="row" style="margin:0px 0px 0px;">
                            <div class="col-md-3" style="width:80px;height:50px;"></div>
                            <div class="col-md-3" style="width:80px;height:50px;"></div>
                            <div class="col-md-3" style="width:150px;height:50px;padding:0px;"><button class="btn btn-primary" type="submit" name="seleccion" value="notaFalt">Calc. Nota Faltante</button></div>
                            <div class="col-md-3" style="width:125px;height:50px;padding:0px;"><button class="btn btn-primary" type="submit" name="seleccion" value="calcProm" >Calc. Promedio</button></div>
                        </div>
                        <div class="row">
                            <div class="col-md-12" style="margin:10px 5px 30px;"><span class="label label-default" style="background-color:rgba(119,119,119,0);">${msg}</span></div>
                        </div>

                    </form>
                    <div class="row" style="margin:0px 0px 0px;">
                        <div class="col-md-3" style="width:200px;height:50px;"></div>
                        <div class="col-md-3" style="width:200px;height:50px;"></div>
                        <div class="col-md-3" style="width:200px;height:50px;"></div>
                        <div class="col-md-3" style="width:200px;height:50px;"></div>

                        <form method="post" action="guardarNotas">
                           
                            <c:forEach items="${notas}" var="i"  varStatus="loop">
                                <input type="hidden" name="nota${loop.index}"  value="${i}">
                            </c:forEach> 
                            <c:forEach items="${pond}" var="i" varStatus="loop">
                                <input type="hidden" name="pond${loop.index}" value="${i}">
                            </c:forEach> 
                            <input type="hidden" name ="prom" value="${prom}">
                                
                                
                            <div class="col-md-3" style="width:100px;height:50px;"><button  class="btn btn-primary" type="submit" style="color:rgb(255,255,255);height:62px;width:80px;" name="opc" value="0">Volver</button></div>
                            <div class="col-md-3" style="width:100px;height:50px;"><button  class="btn btn-primary" type="submit" style="font-size:34px;width:60px;" name="opc" value="1"><i class="fa fa-save" ></i></button></div>
                        </form>
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
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/calendar.js"></script>
        <script src="assets/js/countrypicker.js"></script>
        <script src="assets/js/countrypicker.min.js"></script>
    </body>

</html>




<%-- 
    Document   : GestionSemestres
    Created on : 01-08-2018, 21:08:06
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
        <!--        <nav class="navbar navbar-default custom-header" style="margin:0px;background-color:rgb(58,59,61);">
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
                </nav>-->
        <!--inicio navbar-->
        <div>
            <nav class="navbar navbar-default custom-header" style="margin:0px;background-color:rgb(58,59,61);">
                <div class="container-fluid">
                    <div class="navbar-header"><a class="navbar-brand" href="Principal.jsp" style="background-color:rgb(58,59,61);color:rgb(255,255,255);font-family:Abel, sans-serif;">EasyNotes</a><button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></div>
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
        <!--fin navbar-->
        <div class="article-list">
            <div class="container">
                <div class="intro"></div>
                <div class="row articles">
                    <div class="col-md-12"></div>
                    <div class="col-md-4 col-sm-6 item"><i class="material-icons" style="font-size:143px;color:rgb(255,255,255);">create_new_folder</i>
                        <h3 class="name" style="color:rgb(255,255,255);font-size:24px;">Nuevo Semestre</h3>
                        <p class="description" style="color:rgb(255,255,255);">Se borra el semestre actual y se crea uno nuevo, cambiando sus caracteristicas.</p><a href="#nuevoSem" class="action" data-toggle="modal"><i class="glyphicon glyphicon-circle-arrow-right" style="color:rgb(0,0,0);font-size:35px;"></i></a></div>
                    <!--modal nuevo semestre-->
                    <div class ="modal fade" id="nuevoSem">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">Nuevo Semestre</h4>
                                </div>
                                <div class="modal-body">
                                    <p>¿Realmente desea crear nuevo semestre?,se borrara el semestre actual y se creara uno nuevo</p>    
                                </div>
                                <div class="modal-footer">
                                    <form method="post" action="borrarSemestre">
                                        <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                        <button type="submit" class="btn btn-primary">Aceptar</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--termino modal-->

                    <div class="col-md-4 col-sm-6 item"><i class="fa fa-history" style="font-size:143px;color:rgb(255,255,255);"></i>
                        <h3 class="name" style="color:rgb(255,255,255);font-size:24px;">Reiniciar Semestre</h3>
                        <p class="description" style="color:rgb(255,255,255);">Se borran todos los ramos agregado al semestre. caracteristicas del semestre no cambian. &nbsp; &nbsp; &nbsp;</p><a href="#reiniciar" class="action" data-toggle="modal"><i class="glyphicon glyphicon-circle-arrow-right" style="font-size:35px;color:rgb(0,0,0);"></i></a></div>
                    <!--modal reiniciar semestre-->
                    <div class ="modal fade" id="reiniciar">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">Reiniciar Semestre</h4>
                                </div>
                                <div class="modal-body">
                                    <p>¿Realmente desea reiniciar el semestre?,se borraran asignaturas agregadas y eventos del calendario</p>    
                                </div>
                                <div class="modal-footer">
                                    <form method="post" action="reiniciarSemestre">
                                        <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                        <button type="submit" class="btn btn-primary">Aceptar</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--termino modal-->

                    <div
                        class="col-md-4 col-sm-6 item"><i class="glyphicon glyphicon-folder-open" style="font-size:143px;color:rgb(255,255,255);"></i>
                        <h3 class="name" style="font-size:24px;color:rgb(255,255,255);">Archivar Semestre</h3>
                        <p class="description" style="color:rgb(255,255,255);">Se crea un nuevo semestre pero archivando el anterior en el historial de semestres. (Para acceder a esta funcion de debe tener al menos una asignatura con todas sus notas)</p><a href="#archivarSem" class="action" data-toggle="modal"><i class="glyphicon glyphicon-circle-arrow-right" style="color:rgb(0,4,8);font-size:35px;"></i></a></div>
                    <!--modal archivar semestre-->
                    <div class ="modal fade" id="archivarSem">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">Archivar Semestre</h4>
                                </div>
                                <div class="modal-body">
                                    <p>¿Realmente desea archivar el semestre?,se guardara el semestre actual en el historial y se creara uno nuevo</p>    
                                </div>
                                <div class="modal-footer">
                                    <form method="post" action="archivarSemestre">
                                        <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                        <button type="submit" class="btn btn-primary">Aceptar</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--termino modal-->


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
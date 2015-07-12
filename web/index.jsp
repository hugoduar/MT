<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>MyTime</title>
    <%@include file="head.jsp" %>
</head>

<body>
    <%@include file="navbar.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-2">
                <p>
                  Para utilizar MyTime selecciona el nivel, unidad de aprendizaje y hora.
                </p>
            </div>
            <div class="col-md-3">
                <form action="">
                    <div class="nivel">
                        <label for="nivel">
                            Nivel:
                        </label>
                        <select id="nivel" class="form-control">
                            <option>I</option>
                            <option>II</option>
                            <option>III</option>
                            <option>IV</option>
                        </select>
                        <label for="ua">
                            Unidad de Aprendizaje:
                        </label>
                        <select id="ua" class="form-control">
                            <option>Matemáticas Discretas</option>
                        </select>
                        <label for="hora">
                            Hora:
                        </label>
                        <select id="hora" class="form-control">
                            <option>15:00 - 16:30</option>
                        </select>
                        <br>
                        <a href="#fakelink" class="btn btn-block btn-lg btn-primary"><span class="fui-plus"></span></a>
                    </div>
                </form>
            </div>
            <div class="col-md-7">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Asignatura</th>
                            <th>Lunes</th>
                            <th>Martes</th>
                            <th>Miércoles</th>
                            <th>Jueves</th>
                            <th>Viernes</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Matemáticas Discretas</td>
                            <td>13:30 - 15:00</td>
                            <td></td>
                            <td>15:00 - 16:30</td>
                            <td>15:00 - 16:30</td>
                            <td></td>
                            <td>
                            <a href="#fakelink" class="btn btn-block btn-sm btn-danger"><span class="fui-trash"></span></a>
                            </td>
                        </tr>
                        <tr>
                            <td>Matemáticas Discretas</td>
                            <td>13:30 - 15:00</td>
                            <td></td>
                            <td>15:00 - 16:30</td>
                            <td>15:00 - 16:30</td>
                            <td></td>
                            <td><a href="#fakelink" class="btn btn-block btn-sm btn-danger"><span class="fui-trash"></span></a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <!-- /.container -->
    <%@include file="footer.jsp" %>
</body>

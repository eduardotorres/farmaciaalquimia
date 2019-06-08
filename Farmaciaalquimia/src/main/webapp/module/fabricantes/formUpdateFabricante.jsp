<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@page contentType="text/html; charset=iso-8859-1" 
      pageEncoding="iso-8859-1"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="iso-8859-1">
      <title>Cadastrando Fabricante</title>

      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">
         
        <form:form action="/fabricantes/update" method="POST" modelAttribute="fabricanteUpdate" >
        
            <h2 class="form-signin-heading">Atualizando um fabricante</h2>
            
          <spring:bind path="id">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input  type="text" path="id" class="form-control" disable="true"
                                autofocus="true"></form:input>
                    <form:errors path="id"></form:errors>
                </div>
            </spring:bind>
             <spring:bind path="name">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="name" class="form-control" placeholder="Nome do fabricante"
                                autofocus="true"></form:input>
                    <form:errors path="name"></form:errors>
                </div>
            </spring:bind>

           <spring:bind path="descricao">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="descricao" class="form-control" placeholder="Descrição do fabricante"
                                autofocus="true"></form:input>
                    <form:errors path="descricao"></form:errors>
                </div>
            </spring:bind>
            

            <button class="btn btn-lg btn-primary btn-block" type="submit">Update</button>
        </form:form>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>

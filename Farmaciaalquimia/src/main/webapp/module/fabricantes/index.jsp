<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create an account</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h3>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h3>
    	<p><a href="/fabricantes/form">Cadastrar Fabricante</a></p>
    	<p><a href="fabricantes">Listar Fabricantes</a></p>
    	
	    <c:if test="${not empty listaFabricantes}">
	
			<ul>
				<c:forEach var="fabricante" items="${listaFabricantes}">
					
					
					  <div class="row">
					    <div class="col-sm-4" style="background-color:lavenderblush;">${fabricante.descricao}</div>
			    			<div class="col-sm-2" style="background-color:lavender;">
			                       <a href="/fabricantes/delete/${fabricante.id}">Excluir</a></p>
			                </div>
			                <div class="col-sm-2" style="background-color:lavender;">
			                       <a href="/fabricantes/update/${fabricante.id}">Alterar</a></p>
			                </div>
					  </div>
  
  
				</c:forEach>
			</ul>
	
		</c:if>
		    	      
    </c:if>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>

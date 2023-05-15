<%@page import="com.lec.board.BoardMenu"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%
	// db connect
	// Connection
	// PreparedStatement
	// ResultSet
	// List<Board> boards = new ArrayList<>();
%>
<% request.setCharacterEncoding("utf-8");%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
   	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
<!-- 	<c:forEach var="board" items=${boards}>
		<table><tr><td></td></tr></table>
	</c:forEach> -->
	
<%
BoardMenu menu = new BoardMenu(1.0);
//menu.mainMenu();
menu.mainBoardMenu();
%>

</body>
</html>
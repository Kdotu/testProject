<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/header.jsp"></jsp:include>

<!------------------ body 시작 ------------------>

<a role="button" class="btn btn-primary" href="<%=request.getContextPath()%>/board/boardSelect.do">게시판으로 가기</a>

<!------------------ body 끝 -------------------->

<jsp:include page="/footer.jsp"></jsp:include>

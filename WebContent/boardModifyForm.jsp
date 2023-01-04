<%@page import="kr.or.ddit.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/header.jsp"></jsp:include>
<!------------------ body 시작 ------------------>

<%
	// 게시글 정보 가져오기
	BoardVO bvo = (BoardVO) request.getAttribute("boardVO");

%>


<div class="card card-primary">
    <div class="card-header">
      <h3 class="card-title">Board Modify Form</h3>
    </div>
    <!-- /.card-header -->
    <div class="card-body" style="align-content: center;">
      <form action="<%=request.getContextPath()%>/board/boardUpdate.do" method="post">
        <div class="row mx-8">
          <div class="col">
            <!-- text input -->
            <div class="form-group col-sm-5">
              <label>글제목</label>
		        <div>작성일자 : <%=bvo.getBoard_regdate() %></div>
		        <div>글번호 : <%=bvo.getBoard_no() %></div>
              <input type="text" name="title" class="form-control" value="<%=bvo.getBoard_title()%>">
            </div>
            <div class="form-group col-sm-5">
              <label>작성자</label>
              <input type="text" name="writer" class="form-control" value="<%=bvo.getBoard_writer()%>" readonly>
            </div>
          </div>
        </div>
        <div class="row mx-8">
          <div class="col">
            <!-- textarea -->
            <div class="form-group">
              <label>글내용</label>
              <textarea name="content" id="content" class="form-control" rows="10" cols="80" value="<%=bvo.getBoard_content()%>"></textarea>
            </div>
          </div>
        </div>
	    <div class="row" style="float:right;">
		  <div class="project-actions text-right">
	          <input type="submit" value="등록" class="btn btn-primary btn-sm" />
	          <input type="reset" value="초기화" class="btn btn-primary btn-sm" />
	      </div>    
	    </div>
      </form>
    </div>
    <!-- /.card-body -->
  </div>

<!------------------ body 끝 -------------------->

<jsp:include page="/footer.jsp"></jsp:include>

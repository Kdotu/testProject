<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/header.jsp"></jsp:include>

<!------------------ body 시작 ------------------>

<div class="card card-primary">
    <div class="card-header">
      <h3 class="card-title">Board Regist Form</h3>
    </div>
    <!-- /.card-header -->
    <div class="card-body" style="align-content: center;">
      <form action="<%=request.getContextPath()%>/board/boardInsert.do" method="post">
        <div class="row mx-8">
          <div class="col">
            <!-- text input -->
            <div class="form-group col">
              <label>글제목</label>
              <input type="text" name="title" class="form-control" placeholder="글제목입력 ...">
            </div>
          </div>
          <div class="col">
            <!-- text input -->
            <div class="form-group col">
              <label>작성자</label>
              <input type="text" name="writer" class="form-control" placeholder="작성자입력 ...">
            </div>
          </div>
        </div>
        <div class="row mx-8">
          <div class="col">
            <!-- textarea -->
            <div class="form-group">
              <label>글내용</label>
              <textarea name="content" id="content" class="form-control" rows="10" cols="80" placeholder="글내용입력 ..."></textarea>
            </div>
			<div class="form-group">
               <label for="exampleInputFile">File input</label>
               <div class="input-group">
                 <div class="custom-file">
                   <input type="file" class="custom-file-input" id="exampleInputFile">
                   <label class="custom-file-label" for="exampleInputFile">Choose file</label>
                 </div>
                 <div class="input-group-append">
                   <span class="input-group-text">Upload</span>
                 </div>
               </div>
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

<%@page import="kr.or.ddit.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/header.jsp"></jsp:include>

<!------------------ body 시작 ------------------>

<%
//  	List<BoardVO> list = (List<BoardVO>) request.getAttribute("BoardList");
%>


<section class="content">
      <!-- Default box -->
      <div class="card">
        <div class="card-header">
          <h3 class="card-title">게시판</h3>

          <div class="card-tools">
            <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
              <i class="fas fa-minus"></i>
            </button>
            <button type="button" class="btn btn-tool" data-card-widget="remove" title="Remove">
              <i class="fas fa-times"></i>
            </button>
          </div>
        </div>
        <div class="card-body p-0">
          <table class="table table-striped projects">
              <thead>
                  <tr>
                      <th style="width: 5%">
                          #
                      </th>
                      <th style="width: 20%">
                          	게시판 이름
                      </th>
                      <th style="width: 15%">
                          	작성자
                      </th>
                      <th style="width: 15%">
                          	작성내용
                      </th>
                      <th style="width: 8%" class="text-center">
                          	작성일자
                      </th>
                  </tr>
              </thead>
              <tbody>
                  <tr>
                      <td>
                          #
                      </td>
                      <td>
                          <a>
                              	게시글작성자이름1
                          <br>
                           <small>
                              Created 01.01.2019
                          </small>
                          </a>
                      </td>
                      <td>
                          <ul class="list-inline">
                              <li class="list-inline-item">
                                  <img alt="Avatar" class="table-avatar" src="/adminlte/dist/img/avatar2.png">
                              </li>
                          </ul>
                      </td>
                      <td class="project_progress">
                          <div class="progress progress-sm">
                              <div class="progress-bar bg-green" role="progressbar" aria-valuenow="57" aria-valuemin="0" aria-valuemax="100" style="width: 57%">
                              </div>
                          </div>
                          <small>
                              57% Complete
                          </small>
                      </td>
                      <td class="project-state">
                          <span class="badge badge-success">Success</span>
                      </td>
                  </tr>
              </tbody>
          </table>
          
        </div>
        <!-- /.card-body -->
      </div>
          
          <div style="float:right;">
             <div class="project-actions text-right">
                <a class="btn btn-primary btn-sm" href="<%=request.getContextPath()%>/board/boardInsert.do">
                    <i class="fas fa-folder">
                    </i>
                  	  게시글등록
                </a>
<!--                 <a class="btn btn-info btn-sm" href="#"> -->
<!--                     <i class="fas fa-pencil-alt"> -->
<!--                     </i> -->
<!--                     Edit -->
<!--                 </a> -->
<!--                 <a class="btn btn-danger btn-sm" href="#"> -->
<!--                     <i class="fas fa-trash"> -->
<!--                     </i> -->
<!--                     Delete -->
<!--                 </a> -->
            </div>
          </div>
      <!-- /.card -->

    </section>

<!------------------ body 끝 -------------------->

<jsp:include page="/footer.jsp"></jsp:include>

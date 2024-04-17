<%@page import="model.Teacher"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Feedback"  %>


<!DOCTYPE html>
<html style="font-size: 16px;" lang="en">

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta name="keywords" content="What We Do">
        <meta name="description" content="">
        <title>FPT-feedback</title>
        <link rel="stylesheet" href="css/nicepage.css" media="screen">
        <link rel="stylesheet" href="css/Page-16.css" media="screen">
        <script class="u-script" type="text/javascript" src="js/jquery-1.9.1.min.js" defer=""></script>
        <script class="u-script" type="text/javascript" src="js/nicepage.js" defer=""></script>
        <meta name="generator" content="Nicepage 5.20.8, nicepage.com">
        <link id="u-theme-google-font" rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Montserrat:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">



        <script type="application/ld+json">{
            "@context": "http://schema.org",
            "@type": "Organization",
            "name": "",
            "url": "/",
            "logo": "images/default-logo.png"
            }</script>
        <meta name="theme-color" content="#4b7de1">
        <meta property="og:title" content="Page 16">
        <meta property="og:type" content="website">
        <link rel="canonical" href="/">
        <meta data-intl-tel-input-cdn-path="intlTelInput/">
        <style>
            /* Add your CSS rules here */
            body {
                font-family: Arial, sans-serif;
                background-color: #f8f8f8;
            }

            .u-sheet-1 {
                max-width: 1200px;
                margin: 0 auto;
                padding: 20px;
            }

            .u-logo-vertical-center {
                display: flex;
                align-items: center;
                height: 100%;
            }

            .u-logo-image {
                max-height: 100%;
                margin: auto;
                margin-top: -20px
            }
            .style1 {
                font-weight: bold;
            }

            .container {
                margin: 0 auto;
                max-width: 960px;
                padding: 20px;
            }

            .col-md-8 h1 span {
                font-size: 2em;
                color: #333;
            }

            input[type="submit"] {
                background-color: #007bff;
                color: #fff;
                border: none;
                padding: 10px 20px;
                cursor: pointer;
                font-size: 16px;
                border-radius: 5px;
            }

            input[type="submit"]:hover {
                background-color: #0056b3;
            }

            .breadcrumb {
                background-color: #fff;
                padding: 8px 15px;
                border-radius: 4px;
            }

            table {
                width: 100%;
                border-collapse: collapse;
            }

            table,
            th,
            td {
                border: 1px solid #ccc;
            }

            th,
            td {
                padding: 8px;
                text-align: left;
            }</style>
    </head>

    <body data-home-page="https://website6008039.nicepage.io/Page-16.html?version=2cc06c66-8a77-b3b7-aa59-add009b8a2d8"
          data-home-page-title="Page 16" data-path-to-root="./" data-include-products="false" class="u-body u-xl-mode"
          data-lang="en">
        <%
            Feedback f = new Feedback();
            if(request.getAttribute("f")!= null){
            f = (Feedback)request.getAttribute("f");}
        %>

        <header class="u-clearfix u-header u-header" id="sec-fce5" style="background-color: #3aecf8">
            <div class="u-clearfix u-sheet u-sheet-1">
                <a href="Teacherhome.jsp" class="u-image u-logo u-image-1" >
                    <img src="images/default-logo.png" class="u-logo-image u-logo-image-1">
                </a>

                <nav class="u-menu u-menu-hamburger u-offcanvas u-menu-1" data-responsive-from="XL">
                    <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
                        <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                           href="#">
                            <svg class="u-svg-link" viewBox="0 0 24 24">
                            <use xlink:href="#menu-hamburger"></use>
                            </svg>
                            <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px"
                                 xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg">
                            <g>
                            <rect y="1" width="16" height="2"></rect>
                            <rect y="7" width="16" height="2"></rect>
                            <rect y="13" width="16" height="2"></rect>
                            </g>
                            </svg>
                        </a>
                    </div>
                    <div class="u-custom-menu u-nav-container">
                        <ul class="u-nav u-unstyled u-nav-1">
                            <li class="u-nav-item"><a
                                    class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="Teacherhome.jsp"
                                    style="padding: 10px 20px;">Home</a>
                            </li>
                            <li class="u-nav-item"><a
                                    class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="tofeedbackpageteacher?tid=${f.getTeacherId()}"
                                    style="padding: 10px 20px;">Student list feedback</a>
                            </li>

                            <li class="u-nav-item"><a
                                    class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="index.jsp"
                                    style="padding: 10px 20px;">Log out</a>
                            </li>
                        </ul>
                    </div>
                    <div class="u-custom-menu u-nav-container-collapse">
                        <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                            <div class="u-inner-container-layout u-sidenav-overflow">
                                <div class="u-menu-close"></div>
                                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                                    <li class="u-nav-item"><a class="u-button-style u-nav-link" href="Teacherhome.jsp">Home</a>
                                    </li>
                                    <li class="u-nav-item"><a class="u-button-style u-nav-link" href="tofeedbackpageteacher?tid=${f.getTeacherId()}">Student list feedback</a>
                                    </li>
                                    <li class="u-nav-item"><a class="u-button-style u-nav-link" href="index.jsp">Log out</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
                    </div>
                </nav>
            </div>
        </header>
        <section
            class="u-align-center-lg u-align-center-md u-align-center-xl u-align-left-sm u-align-left-xs u-clearfix u-container-align-center-xl u-white u-section-1"
            id="sec-ba01" data-animation-name="" data-animation-duration="0" data-animation-delay="0"
            data-animation-direction="">
            <div class="u-clearfix u-sheet ">
                <h2 class="u-align-center u-text u-text-default u-text-palette-2-base u-text-1"
                    data-animation-name="customAnimationIn" data-animation-duration="1500" data-animation-delay="0"> FPT University
                    Academic Portal</h2>

            </div>
        </section>

        <form action="tofeedbackpageteacher" method="get" style="margin-top: 50px; margin-left: 200px; margin-right: 200px;">
            <table>
                <tr style="border-bottom: 0 none">
                    <td>
                        <div>
                            <center>
                                <h3>
                                    <b> STUDENT FEEDBACK FORM FOR TEACHER</b>
                                    <input name="tid" value="<%=f.getTeacherId()%>" hidden>
                                </h3>
                            </center>
                            <span id="ctl00_mainContent_lblMege" style="color:Red;"></span>
                            <table>
                                <tr>
                                    <td>
                                        Batch (Lớp): 
                                        <span id="ctl00_mainContent_lblGroup"><%=f.getClassName()%></span>
                                    </td>
                                </tr>                               
                                <tr>
                                    <td>
                                        Subject(Môn học):<span id="ctl00_mainContent_lblSubject"><%=f.getSubId()%></span>
                                    </td>
                                    <td>
                                        Teacher (Giảng viên):
                                        <span id="ctl00_mainContent_lblTeacher"><%=f.getTeacherId()%></span>
                                    </td>
                                </tr>
                            </table>

                            <table id="ctl00_mainContent_reload" cellspacing="1" cellpadding="2" border="0"
                                   style="border-width:1px;border-style:solid;width:100%;">
                                <tr>
                                    <td>
                                        <table width="100%" style="background-color: #efefef;" border="0">
                                            <tr>
                                                <td>
                                                    <font style="font-weight: bold">
                                                    <span id="ctl00_mainContent_reload_ctl00__GroupQuestion">Regarding the teacher's
                                                        punctuality</span>
                                                    </font>
                                                    <br />
                                                    &nbsp;&nbsp;&nbsp;<font style="font-style: italic">(<span
                                                        id="ctl00_mainContent_reload_ctl00_lblNoi_dung">Sự đúng giờ của giảng viên trong giờ
                                                        học</span>)</font>
                                                    <br />
                                                    <table id="ctl00_mainContent_reload_ctl00_chkList" border="0">
                                                        <tr>
                                                            <td><%if(f.getPunctuality().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" name=\"punctuality\" value=\"4\" checked><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" name=\"punctuality\" value=\"4\" disabled><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getPunctuality().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" name=\"punctuality\" value=\"3\" checked><label for=\"punctuality\">Mostly punctual (Phần lớn đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" name=\"punctuality\" value=\"3\" disabled><label for=\"punctuality\">Always punctual (Luôn đúng giờ)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getPunctuality().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" name=\"punctuality\" value=\"2\" checked><label for=\"punctuality\">Rarely punctual (Ít khi đúng giờ)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" name=\"punctuality\" value=\"2\" disabled><label for=\"punctuality\">Rarely punctual (Ít khi đúng giờ)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getPunctuality().equals("1")){
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_3\" type=\"radio\" name=\"punctuality\" value=\"1\" checked><label for=\"punctuality\">Not at all punctual (Không bao giờ đúng giờ)</label>");}
                                                                    else{
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_3\" type=\"radio\" name=\"punctuality\" value=\"1\" disabled><label for=\"punctuality\">Not at all punctual (Không bao giờ đúng giờ)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td>
                                        <table width="100%" style="background-color: #efefef;" border="0">
                                            <tr>
                                                <td>
                                                    <font style="font-weight: bold">
                                                    <span id="ctl00_mainContent_reload_ctl01__GroupQuestion">Teaching skills of
                                                        teacher</span>
                                                    </font>
                                                    <br />
                                                    &nbsp;&nbsp;&nbsp;<font style="font-style: italic">(<span
                                                        id="ctl00_mainContent_reload_ctl01_lblNoi_dung">Kỹ năng sư phạm của giảng viên</span>)
                                                    </font>
                                                    <br />
                                                    <table id="ctl00_mainContent_reload_ctl01_chkList" border="0">
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeaching_skills().equals("4")){
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                    else{
                                                                    out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Very Good (Tốt)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeaching_skills().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" checked><label for=\"punctuality\">Good (Khá)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_1\" type=\"radio\" disabled><label for=\"punctuality\">Good (Khá)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeaching_skills().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>                                
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeaching_skills().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <table width="100%" style="background-color: #efefef;" border="0">
                                            <tr>
                                                <td>
                                                    <font style="font-weight: bold">
                                                    <span id="ctl00_mainContent_reload_ctl02__GroupQuestion">The teacher adequately covers
                                                        the topics required by the syllabus</span>
                                                    </font>
                                                    <br />
                                                    &nbsp;&nbsp;&nbsp;<font style="font-style: italic">(<span
                                                        id="ctl00_mainContent_reload_ctl02_lblNoi_dung">Đảm bảo khối lượng môn học theo chương
                                                        trình</span>)</font>
                                                    <br />
                                                    <table id="ctl00_mainContent_reload_ctl02_chkList" border="0">
                                                        <tr>

                                                            <td>
                                                                <%if(f.getTopic_coverage().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Fully covered (Đảm bảo hoàn toàn)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Fully covered (Đảm bảo hoàn toàn)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTopic_coverage().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Mostly covered (Đảm bảo phần lớn)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Mostly covered (Đảm bảo phần lớn)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTopic_coverage().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Partially covered (Chỉ đảm bảo một phần)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Partially covered (Chỉ đảm bảo một phần)</label>");}

                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTopic_coverage().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" checked><label for=\"punctuality\">Not at all covered (Không đảm bảo)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_0\" type=\"radio\" disabled><label for=\"punctuality\">Not at all covered (Không đảm bảo)</label>");}

                                                                %></td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td>
                                        <table width="100%" style="background-color: #efefef;" border="0">
                                            <tr>
                                                <td>
                                                    <font style="font-weight: bold">
                                                    <span id="ctl00_mainContent_reload_ctl03__GroupQuestion">Support from the teacher -
                                                        guidance for practical exercises, answering questions out side of class </span>
                                                    </font>
                                                    <br />
                                                    &nbsp;&nbsp;&nbsp;<font style="font-style: italic">(<span
                                                        id="ctl00_mainContent_reload_ctl03_lblNoi_dung">Hỗ trợ của giảng viên trong và ngoài
                                                        giờ - trả lời Email, hướng dẫn thực hành, giải đáp thắc mắc…</span>)</font>
                                                    <br />
                                                    <table id="ctl00_mainContent_reload_ctl03_chkList" border="0">
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeacher_support().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Very Good (Tốt)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeacher_support().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Good (Khá)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Good (Khá)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeacher_support().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Average (Trung bình)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getTeacher_support().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Poor (Kém)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <table width="100%" style="background-color: #efefef;" border="0">
                                            <tr>
                                                <td>
                                                    <font style="font-weight: bold">
                                                    <span id="ctl00_mainContent_reload_ctl04__GroupQuestion">Teacher's response to student's
                                                        questions in class</span>
                                                    </font>
                                                    <br />
                                                    &nbsp;&nbsp;&nbsp;<font style="font-style: italic">(<span
                                                        id="ctl00_mainContent_reload_ctl04_lblNoi_dung">Đáp ứng của giảng viên về những thắc
                                                        mắc của học viên trong giờ học</span>)</font>
                                                    <br />
                                                    <table id="ctl00_mainContent_reload_ctl04_chkList" border="0">
                                                        <tr>
                                                            <td>
                                                                <%if(f.getResponse_time().equals("4")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Answered immediately or just after the session (Trả lời ngay hoặc trả lời vào cuối buổi học)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Answered immediately or just after the session (Trả lời ngay hoặc trả lời vào cuối buổi học)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getResponse_time().equals("3")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Answered in the next session (Trả lời vào buổi học sau)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Answered in the next session (Trả lời vào buổi học sau)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getResponse_time().equals("2")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Some queries left unanswered (Một số câu hỏi không được trả lời)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Some queries left unanswered (Một số câu hỏi không được trả lời)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <%if(f.getResponse_time().equals("1")){
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" checked><label for=\"punctuality\">Most queries left unanswered (Phần lớn câu hỏi không được trả lời)</label>");}
                                                                else{
                                                                out.print("<input id=\"ctl00_mainContent_reload_ctl00_chkList_2\" type=\"radio\" disabled><label for=\"punctuality\">Most queries left unanswered (Phần lớn câu hỏi không được trả lời)</label>");}
                                                                %>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td></td>
                                </tr>
                            </table>
                            <br>
                            <textarea name="comment" rows="5" cols="70"
                                      id="ctl00_mainContent_txtComment" disabled><%=f.getComment()%></textarea><br />
                            <input type="submit" name="ctl00$mainContent$btSendFeedback" value="Return"
                                   id="ctl00_mainContent_btSendFeedback" /><br />
                            <br />
                            <br />
                            <hr />

                        </div>
                    </td>
                </tr>
                <tr style="border-bottom: 0 none">
                    <td>
                        <br />
                        <table width="100%" style="border: 1px solid transparent;" id="cssTable">
                            <tr>
                                <td>
                                    <div id="ctl00_divSupport">
                                        <br />
                                        <b>Mọi góp ý, thắc mắc xin liên hệ: </b><span
                                            style="color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;">Phòng
                                            dịch vụ sinh viên</span>: Email: <a
                                            href="/cdn-cgi/l/email-protection#690d000a011f1c1a0007011f000c07290f0c470c0d1c471f07"><span
                                                class="__cf_email__"
                                                data-cfemail="dbbfb2b8b3adaea8b2b5b3adb2beb59bbdbef5bebfaef5adb5">[email&#160;protected]</span></a>.
                                        Điện thoại: <span class="style1"
                                                          style="color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;">(024)7308.13.13
                                        </span>
                                        <br />
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <p style="text-align: center">
                                        © Powered by <a href="#" target="_blank">FPT University</a>&nbsp;|&nbsp;
                                        <a href="#" target="_blank">CMS</a>&nbsp;|&nbsp; <a
                                            href="#" target="_blank">library</a>&nbsp;|&nbsp; <a
                                            href="#" target="_blank">books24x7</a>
                                        <span id="ctl00_lblHelpdesk"></span>
                                    </p>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </form>
    </body>

</html>
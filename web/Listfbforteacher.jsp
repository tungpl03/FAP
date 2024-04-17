<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="model.Feedback"  %>
<%@page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap"
              rel="stylesheet">

        <title>List feedback</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Additional CSS Files -->
        <link rel="stylesheet" href="css/fontawesome.css">
        <link rel="stylesheet" href="css/templatemo-woox-travel.css">
        <link rel="stylesheet" href="css/owl.css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <!--
            
            TemplateMo 580 Woox Travel
            
            https://templatemo.com/tm-580-woox-travel
            
        -->
        <style>
            .table {
                border-collapse: collapse;
                width: 100%;
            }

            .table th, .table td {
                border: 1px solid #000;
                padding: 8px;
                text-align: left;
            }
        </style>
    </head>

    <body>
        <%
                ArrayList<Feedback> flist = new ArrayList<Feedback>();
                if(request.getAttribute("flist")!= null){
                    flist = (ArrayList<Feedback>)request.getAttribute("flist");
            }
        %>
        <!-- ***** Preloader Start ***** -->
        <div id="js-preloader" class="js-preloader">
            <div class="preloader-inner">
                <span class="dot"></span>
                <div class="dots">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
            </div>
        </div>
        <!-- ***** Preloader End ***** -->

        <!-- ***** Header Area Start ***** -->
        <header class="header-area header-sticky">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <!-- ***** Logo Start ***** -->
                            <a href="Teacherhome.jsp" class="logo">
                                <img src="images/site-logo.jpg" alt="">
                            </a>
                            <!-- ***** Logo End ***** -->
                            <!-- ***** Menu Start ***** -->
                            <ul class="nav">
                                <li><a href="Teacherhome.jsp" class="active">Home</a></li>
                                <li><a href="#">Student Feedback</a></li>
                                <li><a href="index.jsp">Log out</a></li>

                            </ul>
                            <a class='menu-trigger'>
                                <span>Menu</span>
                            </a>
                            <!-- ***** Menu End ***** -->
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <!-- ***** Header Area End ***** -->

        <!-- ***** Main Banner Area Start ***** -->
        <section id="section-1">
            <div class="content-slider">
                <input type="radio" id="banner1" class="sec-1-input" name="banner" checked>
                <input type="radio" id="banner2" class="sec-1-input" name="banner">
                <input type="radio" id="banner3" class="sec-1-input" name="banner">
                <input type="radio" id="banner4" class="sec-1-input" name="banner">
                <div class="slider">
                    <div id="top-banner-1" class="banner" style="background-image: url('images/deals-01.jpg')">
                        <div class="banner-inner-wrapper header-text">
                            <div class="main-caption">
                                <h2>FPT University Academic Portal
                                </h2>
                                <h1>Hà Nội</h1>
                                <div class="border-button"><a href="#">Go There</a></div>
                            </div>

                        </div>
                    </div>
                    <div id="top-banner-2" class="banner" style="background-image: url('images/deals2.jpg')">
                        <div class="banner-inner-wrapper header-text">
                            <div class="main-caption">
                                <h2>FPT University Academic Portal
                                </h2>
                                <h1>Đà Nẵng</h1>
                                <div class="border-button"><a href="#">Go There</a></div>
                            </div>

                        </div>
                    </div>
                    <div id="top-banner-3" class="banner" style="background-image: url('images/deal3.jpg')">
                        <div class="banner-inner-wrapper header-text">
                            <div class="main-caption">
                                <h2>FPT University Academic Portal
                                </h2>
                                <h1>Cần Thơ</h1>
                                <div class="border-button"><a href="#">Go There</a></div>
                            </div>

                        </div>
                    </div>
                    <div id="top-banner-4" class="banner" style="background-image: url('images/deals4.jpg')">
                        <div class="banner-inner-wrapper header-text">
                            <div class="main-caption">
                                <h2>FPT University Academic Portal
                                </h2>
                                <h1>Hồ Chí Minh</h1>
                                <div class="border-button"><a href="#">Go There</a></div>
                            </div>

                        </div>
                    </div>
                </div>
                <nav>
                    <div class="controls">
                        <label for="banner1"><span class="progressbar"><span class="progressbar-fill"></span></span><span
                                class="text">1</span></label>
                        <label for="banner2"><span class="progressbar"><span class="progressbar-fill"></span></span><span
                                class="text">2</span></label>
                        <label for="banner3"><span class="progressbar"><span class="progressbar-fill"></span></span><span
                                class="text">3</span></label>
                        <label for="banner4"><span class="progressbar"><span class="progressbar-fill"></span></span><span
                                class="text">4</span></label>
                    </div>
                </nav>
            </div>
        </section>
        <!-- ***** Main Banner Area End ***** -->





        <table style="display: flex; justify-content: center; margin: 90px">
            <tr style="border-bottom: 0 none">
                <td>
                    <div>
                        <h4 style="font-size: 50px; margin-bottom: 100px">
                            FPT University Academic Portal </h4>
                            <%
                        if (flist.isEmpty()) {%>
                        <p style="font-size: 30px; margin-bottom: 70px"> You haven't teached any class yet</p>
                        <%
                                }else{
                        %>
                        <p style="font-size: 30px; margin-bottom: 70px">List of feedbacks for <%=flist.get(0).getTeacherName()%> (<%=flist.get(0).getTeacherId()%>)</p>
                        <table class="table">
                            <tr style="background-color: #04b7c4">
                                <th>
                                    GroupName
                                </th>

                                <th>
                                    Lecturer
                                </th>
                                <th>
                                    Subjects
                                </th>
                                <th>
                                    ClosingDate
                                </th>
                                <th>
                                    Do Feedback
                                </th>
                                <th>
                                    Điểm
                                </th>
                            </tr>
                            <tbody>
                            <div id="ctl00_mainContent_divContent">
                                <c:forEach items="${flist}" var="item">
                                    <c:choose>
                                        <c:when test="${item.getPunctuality() == null}">
                                        </c:when>
                                        <c:otherwise>
                                            <tr>
                                                <td>${item.getClassId()}</td>
                                                <td>${item.getTeacherId()}</td>
                                                <td>${item.getSubId()}</td>
                                                <td></td>
                                                <td><a href="tofbpageforteacher?fbid=${item.getFbid()}">Open feedback</a></td> 
                                                <td>${item.getDiem()/5}</td>
                                            </tr>

                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </div>
                            </tbody>
                        </table>
                        <%
                            }
                        %>
                    </div>
                </td>
            </tr>
        </table>

        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <p style="font-size: 15px">Mọi góp ý, thắc mắc xin liên hệ: Phòng dịch vụ sinh viên: Email: <a href="#">dichvusinhvien@fe.edu.vn.</a> Điện thoại: <b>(024)7308.13.13</b>
                        </p>
                        <br>
                        <p>© Powered by <a href="#">FPT University </a>|  <a href="#">CMS</a> |  <a href="#">library</a> |  <a href="#">books24x7</a></p>
                    </div>
                </div>
            </div>
        </footer>


        <!-- Scripts -->
        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

        <script src="js/isotope.min.js"></script>
        <script src="js/owl-carousel.js"></script>
        <script src="js/wow.js"></script>
        <script src="js/tabs.js"></script>
        <script src="js/popup.js"></script>
        <script src="js/custom1.js"></script>

        <script>
            function bannerSwitcher() {
                next = $('.sec-1-input').filter(':checked').next('.sec-1-input');
                if (next.length)
                    next.prop('checked', true);
                else
                    $('.sec-1-input').first().prop('checked', true);
            }

            var bannerTimer = setInterval(bannerSwitcher, 5000);

            $('nav .controls label').click(function () {
                clearInterval(bannerTimer);
                bannerTimer = setInterval(bannerSwitcher, 5000)
            });
        </script>

    </body>

</html>
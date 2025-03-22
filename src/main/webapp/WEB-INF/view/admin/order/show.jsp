<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <title>Manager Orders - OnlineFood</title>
                <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
                <link href="/css/styles.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container-fluid px-4">
                                <h1 class="mt-4">Manage Orders</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Order</li>
                                </ol>
                                <div class="mt-5">
                                    <div class="row">
                                        <div class="col-12 mx-auto">
                                            <div class="d-flex">
                                                <h3>Table Orders</h3>
                                            </div>

                                            <hr />
                                            <div class="card mb-4">
                                                <div class="card-body">
                                                    <table id="datatablesSimple">
                                                        <thead>
                                                        <tr>
                                                            <th>ID</th>
                                                            <th>Total Price</th>
                                                            <th>User</th>
                                                            <th>Status</th>
                                                            <th>Date</th>
                                                            <th>Action</th>
                                                        </tr>
                                                        </thead>
                                                        <tfoot>
                                                        <tr>
                                                            <th>ID</th>
                                                            <th>Total Price</th>
                                                            <th>User</th>
                                                            <th>Status</th>
                                                            <th>Date</th>
                                                            <th>Action</th>
                                                        </tr>
                                                        </tfoot>
                                                        <tbody>
                                                        <c:forEach var="order" items="${orders}">
                                                            <tr>
                                                                <th>${order.id}</th>
                                                                <td>
                                                                    <fmt:formatNumber type="number"
                                                                                      value="${order.totalPrice}" /> đ
                                                                </td>
                                                                <td>${order.user.fullName}</td>
                                                                <td>${order.status}</td>
                                                                <th>${order.orderDate.format(DateTimeFormatter.ofPattern('yyyy-MM-dd HH:mm:ss'))}</th>
                                                                <td>
                                                                    <a href="/admin/order/${order.id}"
                                                                       class="btn btn-success">View</a>
                                                                    <a href="/admin/order/update/${order.id}"
                                                                       class="btn btn-warning  mx-2">Update</a>
                                                                </td>
                                                            </tr>

                                                        </c:forEach>

                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>

                                        </div>

                                    </div>

                                </div>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="/js/scripts.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
                <script src="/js/datatables-simple-demo.js"></script>

            </body>

            </html>
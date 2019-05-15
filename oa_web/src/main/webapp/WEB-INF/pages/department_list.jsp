<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>


<!-- Mirrored from admindesigns.com/demos/absolute/1.1/admin_forms-validation.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 06 Aug 2015 02:56:15 GMT -->
<head>
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <title>爱慕课OA</title>
    <meta name="keywords" content="HTML5 Bootstrap 3 Admin Template UI Theme" />
    <meta name="description" content="AbsoluteAdmin - A Responsive HTML5 Admin UI Framework">
    <meta name="author" content="AbsoluteAdmin">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Theme CSS -->
    <link rel="stylesheet" type="text/css" href="/assets/skin/default_skin/css/theme.css">

    <!-- Admin Forms CSS -->
    <link rel="stylesheet" type="text/css" href="/assets/admin-tools/admin-forms/css/admin-forms.css">

    <!-- Favicon -->
    <link rel="shortcut icon" href="/assets/img/favicon.ico">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->

</head>

<body class="admin-validation-page" data-spy="scroll" data-target="#nav-spy" data-offset="200">

<!-- Start: Main -->
<div id="main">

    <!-- Start: Header -->
    <header class="navbar navbar-fixed-top navbar-shadow">
        <div class="navbar-branding">
            <a class="navbar-brand" href="dashboard.html">
                <b>爱慕课</b>OA
            </a>
            <span id="toggle_sidemenu_l" class="ad ad-lines"></span>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown menu-merge">
                <a href="#" class="dropdown-toggle fw600 p15" data-toggle="dropdown">
                    <img src="assets/img/avatars/5.jpg" alt="avatar" class="mw30 br64">
                    <span class="hidden-xs pl15"> 10001 </span>
                    <span class="caret caret-tp hidden-xs"></span>
                </a>
                <ul class="dropdown-menu list-group dropdown-persist w250" role="menu">
                    <li class="list-group-item">
                        <a href="#" class="animated animated-short fadeInUp">
                            <span class="fa fa-user"></span> 个人信息
                            <span class="label label-warning"></span>
                        </a>
                    </li>
                    <li class="list-group-item">
                        <a href="#" class="animated animated-short fadeInUp">
                            <span class="fa fa-gear"></span> 设置密码 </a>
                    </li>
                    <li class="dropdown-footer">
                        <a href="#" class="">
                            <span class="fa fa-power-off pr5"></span> 退出 </a>
                    </li>
                </ul>
            </li>
        </ul>
    </header>
    <!-- End: Header -->

    <!-- Start: Sidebar -->
    <aside id="sidebar_left" class="nano nano-light affix">

        <!-- Start: Sidebar Left Content -->
        <div class="sidebar-left-content nano-content">

            <!-- Start: Sidebar Header -->
            <header class="sidebar-header">

                <!-- Sidebar Widget - Author -->
                <div class="sidebar-widget author-widget">
                    <div class="media">
                        <a class="media-left" href="#">
                            <img src="/assets/img/avatars/3.jpg" class="img-responsive">
                        </a>
                        <div class="media-body">
                            <div class="media-author">10001--总经理</div>
                            <div class="media-links">
                                <a href="pages_login.html">退出</a>
                            </div>
                        </div>
                    </div>
                </div>


                <!-- Sidebar Widget - Search (hidden) -->
                <div class="sidebar-widget search-widget hidden">
                    <div class="input-group">
              <span class="input-group-addon">
                <i class="fa fa-search"></i>
              </span>
                        <input type="text" id="sidebar-search" class="form-control" placeholder="Search...">
                    </div>
                </div>

            </header>
            <!-- End: Sidebar Header -->

            <!-- Start: Sidebar Menu -->
            <ul class="nav sidebar-menu">
                <li class="sidebar-label pt20">日常管理</li>
                <li>
                    <a href="#">
                        <span class="glyphicon glyphicon-book"></span>
                        <span class="sidebar-title">待处理报销单</span>
                        <span class="sidebar-title-tray">
                <span class="label label-xs bg-primary">New</span>
              </span>
                    </a>
                </li>
                <li class="active">
                    <a href="#">
                        <span class="glyphicon glyphicon-home"></span>
                        <span class="sidebar-title">个人报销单</span>
                    </a>
                </li>
                <li>
                    <a href="add.html">
                        <span class="fa fa-calendar"></span>
                        <span class="sidebar-title">填写报销单</span>
                    </a>
                </li>
                <li class="sidebar-label pt15">基础信息管理</li>
                <li>
                    <a class="accordion-toggle" href="#">
                        <span class="glyphicon glyphicon-check"></span>
                        <span class="sidebar-title">员工管理</span>
                        <span class="caret"></span>
                    </a>
                    <ul class="nav sub-nav">
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-calendar"></span> 所有员工 </a>
                        </li>
                        <li class="active">
                            <a href="admin_forms-validation.html">
                                <span class="glyphicon glyphicon-check"></span> 添加员工 </a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a class="accordion-toggle" href="#">
                        <span class="fa fa-columns"></span>
                        <span class="sidebar-title">部门管理</span>
                        <span class="caret"></span>
                    </a>
                    <ul class="nav sub-nav">
                        <li>
                            <a href="#">
                                <span class="glyphicon glyphicon-calendar"></span> 所有部门 </a>
                        </li>
                        <li class="active">
                            <a href="admin_forms-validation.html">
                                <span class="glyphicon glyphicon-check"></span> 添加部门 </a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- End: Sidebar Menu -->

            <!-- Start: Sidebar Collapse Button -->
            <div class="sidebar-toggle-mini">
                <a href="#">
                    <span class="fa fa-sign-out"></span>
                </a>
            </div>
            <!-- End: Sidebar Collapse Button -->

        </div>
        <!-- End: Sidebar Left Content -->

    </aside>

    <!-- Start: Content-Wrapper -->
    <section id="content_wrapper">

        <!-- Begin: Content -->
        <section id="content" class="table-layout animated fadeIn">

            <!-- begin: .tray-center -->
            <div class="tray tray-center">

                <!-- Begin: Content Header -->
                <div class="content-header">
                    <h2> 个人报销单</h2>
                    <p class="lead"></p>
                </div>
                <!-- message listing panel -->
                <div class="admin-form theme-primary mw1000 center-block" style="padding-bottom: 175px;">

                    <div class="panel  heading-border">

                        <!-- message toolbar header -->
                        <div class="panel-menu">
                            <div class="row">
                                <div class="hidden-xs hidden-sm col-md-3">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-default light">
                                            <i class="fa fa-refresh"></i>
                                        </button>
                                        <button type="button" class="btn btn-default light">
                                            <i class="fa fa-trash"></i>
                                        </button>
                                        <button type="button" class="btn btn-default light">
                                            <i class="fa fa-plus" onclick="javascript:window.location.href='add.html';"></i>
                                        </button>
                                    </div>
                                </div>
                                <div class="col-xs-12 col-md-9 text-right">
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-default light">
                                            <i class="fa fa-chevron-left"></i>
                                        </button>
                                        <button type="button" class="btn btn-default light">
                                            <i class="fa fa-chevron-right"></i>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- message listings table -->
                        <div class="panel-body pn">
                            <table id="message-table" class="table admin-form theme-warning tc-checkbox-1">
                                <thead>
                                <tr class="">
                                    <th class="text-center hidden-xs">Select</th>
                                    <th class="hidden-xs">事由</th>
                                    <th>状态</th>
                                    <th class="hidden-xs">创建人</th>
                                    <th class="hidden-xs">金额</th>
                                    <th class="text-center">创建时间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr class="message-unread">
                                    <td class="hidden-xs">
                                        <label class="option block mn">
                                            <input type="checkbox" name="mobileos" value="FR">
                                            <span class="checkbox mn"></span>
                                        </label>
                                    </td>
                                    <td class="">XX支行瓢饮系统开发出差</td>
                                    <td class="hidden-xs">
                                        <span class="badge badge-warning mr10 fs11"> 待审核 </span>
                                    </td>
                                    <td class="">张三</td>
                                    <td class="">￥1000.00</td>
                                    <td class="text-center fw600">2000-9-9 9:20</td>
                                    <td>
                                        <a href="add.html">修改</a>
                                        <a href="info.html">查看</a>
                                    </td>
                                </tr>
                                <tr class="message-unread">
                                    <td class="hidden-xs">
                                        <label class="option block mn">
                                            <input type="checkbox" name="mobileos" value="FR">
                                            <span class="checkbox mn"></span>
                                        </label>
                                    </td>
                                    <td class="">XX支行瓢饮系统开发出差</td>
                                    <td class="hidden-xs">
                                        <span class="badge badge-warning mr10 fs11"> 待审核 </span>
                                    </td>
                                    <td class="">张三</td>
                                    <td class="">￥1000.00</td>
                                    <td class="text-center fw600">2000-9-9 9:20</td>
                                    <td>
                                        <a href="#">修改</a>
                                        <a href="#">查看</a>
                                    </td>
                                </tr>
                                <tr class="message-unread">
                                    <td class="hidden-xs">
                                        <label class="option block mn">
                                            <input type="checkbox" name="mobileos" value="FR">
                                            <span class="checkbox mn"></span>
                                        </label>
                                    </td>
                                    <td class="">XX支行瓢饮系统开发出差</td>
                                    <td class="hidden-xs">
                                        <span class="badge badge-warning mr10 fs11"> 待审核 </span>
                                    </td>
                                    <td class="">张三</td>
                                    <td class="">￥1000.00</td>
                                    <td class="text-center fw600">2000-9-9 9:20</td>
                                    <td>
                                        <a href="#">修改</a>
                                        <a href="#">查看</a>
                                    </td>
                                </tr>
                                <tr class="message-unread">
                                    <td class="hidden-xs">
                                        <label class="option block mn">
                                            <input type="checkbox" name="mobileos" value="FR">
                                            <span class="checkbox mn"></span>
                                        </label>
                                    </td>
                                    <td class="">XX支行瓢饮系统开发出差</td>
                                    <td class="hidden-xs">
                                        <span class="badge badge-warning mr10 fs11"> 待审核 </span>
                                    </td>
                                    <td class="">张三</td>
                                    <td class="">￥1000.00</td>
                                    <td class="text-center fw600">2000-9-9 9:20</td>
                                    <td>
                                        <a href="#">修改</a>
                                        <a href="#">查看</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                    </div>
                    <!-- end: .admin-form -->

                </div>
                <!-- end: .tray-center -->
        </section>
        <!-- End: Content -->

    </section>
    <!-- End: Content-Wrapper -->

</div>
<!-- End: Main -->

<!-- BEGIN: PAGE SCRIPTS -->

<style>
    /* demo page styles */
    body { min-height: 2300px; }

    .content-header b,
    .admin-form .panel.heading-border:before,
    .admin-form .panel .heading-border:before {
        transition: all 0.7s ease;
    }
    /* responsive demo styles */
    @media (max-width: 800px) {
        .admin-form .panel-body { padding: 18px 12px; }
    }
</style>

<style>
    .ui-datepicker select.ui-datepicker-month,
    .ui-datepicker select.ui-datepicker-year {
        width: 48%;
        margin-top: 0;
        margin-bottom: 0;

        line-height: 25px;
        text-indent: 3px;

        color: #888;
        border-color: #DDD;
        background-color: #FDFDFD;

        -webkit-appearance: none; /*Optionally disable dropdown arrow*/
    }
</style>

<!-- jQuery -->
<script src="vendor/jquery/jquery-1.11.1.min.js"></script>
<script src="vendor/jquery/jquery_ui/jquery-ui.min.js"></script>

<!-- jQuery Validate Plugin-->
<script src="assets/admin-tools/admin-forms/js/jquery.validate.min.js"></script>

<!-- jQuery Validate Addon -->
<script src="assets/admin-tools/admin-forms/js/additional-methods.min.js"></script>

<!-- AdminForms JS -->
<script src="assets/admin-tools/admin-forms/js/jquery-ui-datepicker.min.js"></script>

<!-- Theme Javascript -->
<script src="assets/js/utility/utility.js"></script>
<script src="assets/js/demo/demo.js"></script>
<script src="assets/js/main.js"></script>
<!-- END: PAGE SCRIPTS -->
<script type="text/javascript" src="js/pages.js"></script>
<script type="text/javascript" src="js/items.js"></script>
<!-- END: PAGE SCRIPTS -->
</body>


</html>

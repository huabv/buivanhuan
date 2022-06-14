<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="trang-chu"/>"><span>Twitter
						Bootstrap ecommerce template</span> <img
					src="<c:url value="/assets/user/img/lenovo.png" />"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			<div class="offerNoteWrapper">
				<h1 class="dotmark">
					<i class="icon-cut"></i> Welcome to Lenovo Technical Support
					Drivers, Updates, How-To Guides, Technical Help and more
				</h1>
			</div>
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Support (24/7) : 1900 1008 </strong><br> <br>
			</p>
			<a href="<c:url value="/gio-hang"/>"> <span class="btn btn-mini">
					[ ${ TotalQuantyCart } ] <span class="icon-shopping-cart"></span>
			</span> <span class="btn btn-warning btn-mini">$</span>
			</a> <span class="btn btn-mini">&pound;</span> <span class="btn btn-mini">&euro;</span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<c:forEach var="item" items="${ menus }" varStatus="index">
						<c:if test="${ index.first }">
							<li class="active">
						</c:if>
						<c:if test="${ not index.first }">
							<li class="">
						</c:if>
						<a href="#">${ item.name } </a>
						</li>
					</c:forEach>

				</ul>
				<form action="#" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2">
				</form>
				<ul class="nav pull-right">
					<c:if test="${ empty LoginInfo}">
						<li class="dropdown"><a class="dropdown-toggle"
							href="<c:url value="/dang-ky"/>"> Đăng nhập <b class="caret"></b></a>
						</li>

					</c:if>
					<c:if test="${not empty LoginInfo}">
						<li><a href="#">${LoginInfo.display_name}<b class="Caret">
							</b></a></li>
					</c:if>

				</ul>
			</div>
		</div>
	</div>
</div>
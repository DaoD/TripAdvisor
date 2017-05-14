<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Admin</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/main.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
			<div class="right menu">
				<div class="item"><% out.print((String)session.getAttribute("username")); %></div>
				<a class="item" href="signin.jsp">Sign Out</a>
			</div>
		</div>
		<div class="ui grid" id="mainframe">
			<div class="row">
				<div class="four wide column">
					<div class="ui vertical pointing menu">
						<a class="active item" href="main.jsp">Profile</a>
						<a class="item" href="service.jsp">Service</a>
					</div>
				</div>
				<div class="twelve wide stretched column">
					<div class="ui segment">
						<form class="ui form" action="saveprofile.jsp">
							<h4 class="ui dividing header">
								Basic Information	
							</h4>
							<div class="fields">
								<div class="twelve wide field">
									<label>Company Name</label>
									<div class="field">
										<input type="text" name="companyName" placeholder="Your Company Name">
									</div>
								</div>
								<div class="four wide field">
									<label>Contact Number</label>
									<div class="field">
										<input type="text" name="contactNumber" placeholder="Your Contact Number">
									</div>
								</div>
							</div>
							<div class="two fields">
								<div class="field">
									<label>Country</label>
									<div class="ui selection dropdown">
										<input type="hidden" name="country">
										<i class="dropdown icon"></i>
										<div class="default text">Select Country</div>
										<div class="menu">
											<div class="item" data-value="cn">
												<i class="cn flag"></i>
												China
											</div>
										</div>
									</div>				
								</div>
								<div class="field">
									<label>State</label>
									<div class="ui selection dropdown">
										<input type="hidden" name="state">
										<i class="dropdown icon"></i>
										<div class="default text">Select State</div>
										<div class="menu">
											<div class="item" data-value="ah">Anhui</div>
											<div class="item" data-value="bj">Beijing</div>
											<div class="item" data-value="cq">Chongqing</div>
											<div class="item" data-value="Fj">Fujian</div>
											<div class="item" data-value="gs">Gansu</div>
											<div class="item" data-value="gd">Guangdong</div>
											<div class="item" data-value="gx">Guangxi</div>
											<div class="item" data-value="gz">Guizhou</div>
											<div class="item" data-value="hn">Hainan</div>
											<div class="item" data-value="hb">Hebei</div>
											<div class="item" data-value="hlj">Heilongjiang</div>
											<div class="item" data-value="hen">Henan</div>
											<div class="item" data-value="hk">Hong Kong</div>
											<div class="item" data-value="hub">Hubei</div>
											<div class="item" data-value="hun">Hunan</div>
											<div class="item" data-value="js">Jiangsu</div>
											<div class="item" data-value="jx">Jiangxi</div>
											<div class="item" data-value="jl">Jilin</div>
											<div class="item" data-value="ln">Liaoning</div>
											<div class="item" data-value="mc">Macau</div>
											<div class="item" data-value="nmg">Neimenggu</div>
											<div class="item" data-value="nx">Ningxia</div>
											<div class="item" data-value="qh">Qinghai</div>
											<div class="item" data-value="sd">Shandong</div>
											<div class="item" data-value="sx">Shanxi</div>
											<div class="item" data-value="sx2">Shanxi(Xi'an)</div>
											<div class="item" data-value="sh">Shanghai</div>
											<div class="item" data-value="sc">Sichuan</div>
											<div class="item" data-value="tw">Taiwan</div>
											<div class="item" data-value="tj">Tianjin</div>
											<div class="item" data-value="xz">Xizang</div>
											<div class="item" data-value="xj">Xinjiang</div>
											<div class="item" data-value="yn">Yunnan</div>
											<div class="item" data-value="zj">Zhejiang</div>
										</div>
									</div>	
								</div>
							</div>
							<div class="fields">
								<div class="twelve wide field">
									<label>Address</label>
									<input type="text" name="companyAddress" placeholder="Your company address">
								</div>
								<div class="four wide field">
									<label>ZIP Code</label>
									<input type="text" name="ZIPCode" placeholder="Your ZIP Code">
								</div>
							</div>
							<input type="hidden" name="userid" value="<% out.print(session.getAttribute("userid")); %>">
							<input type="submit" value="Save" class="ui button">
						</form>
					</div>
				</div>
			</div>	
		</div>
		
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/main.js"></script>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>基本信息-招聘服务-拉勾网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="拉勾网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在拉勾网">
<meta name="keywords" content="拉勾,拉勾网,拉勾招聘,拉钩, 拉钩网 ,互联网招聘,拉勾互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 拉勾官网, 拉勾百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">http://www.lagou.com</div> -->
<script type="text/javascript">
var ctx = "http://www.lagou.com";
// console.log(1);
</script>
<link href="http://www.lagou.com/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link href="style/css/external.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="style/js/jquery.1.10.1.min.js"></script>
<script src="style/js/jquery.lib.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/ajaxfileupload.js"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="indexlogin.jsp">
    			<img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.jsp">首页</a></li>
    			<li class="current"><a href="companylist.html">公司</a></li>
    			<li><a target="_blank" href="">论坛</a></li>
    				    			<li>
	    				<a rel="nofollow" href="">简历管理</a>
	    					    			</li>
	    							    			<li><a rel="nofollow" href="create.jsp">发布职位</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%
						String email = (String)session.getAttribute("email");
						out.print(email);
					%></span>
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<dd><a href="positions.html">我发布的职位</a></dd>
                	<dd><a href="positions.html">我收到的简历</a></dd>
                	<dd class="btm"><a href="myhome.jsp">我的公司主页</a></dd>
                	<dd><a href="resume.jsp">我要找工作</a></dd>
                                                <dd><a href="accountBind.jsp">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                </div>
    </div><!-- end #header -->
    <div id="container">
          		
  		<div style="" id="stepTip">
       		<a></a>
       		<img width="803" height="59" src="style/images/tiponce.jpg">
       	</div>
        <div class="login_box">
        	<dl class="c_section c_section_mid">
                <dt>
                    <h2><em></em>填写公司信息</h2>
                </dt>
                <dd>
	                <form id="stepForm"  action="${pageContext.request.contextPath }/AddCompanyServlet?method=doPost"  method="post">
	                	<div class="c_text_1">基本信息为必填项，是求职者加速了解公司的窗口，认真填写吧！</div>
	                 	<img width="668" height="56" class="c_steps" alt="第一步" src="style/images/step1.png">
	                    
	                    <h3>公司全称</h3>
						<input type="text" placeholder="如:福建平潭协创进出口贸易有限公司"  name="fullname">
	                    <h3>公司简称</h3> <!--非必填-->
	                    <input type="text" placeholder="请输入公司简称，如:拉勾"  name="name" >
	                    <h3>公司网址</h3>
	                    <input type="text" placeholder="请输入公司网址" name="website" id="website">
	                    
	                    <h3>所在城市</h3>
						<input type="text" placeholder="请输入公司所在城市" name="chinacity" id="chinacity">

						<h3>行业领域</h3>
							<input type="text" value="请选择行业领域" name="Industry" id="Industry" class="select">
	                    
	                    <h3>公司规模</h3>
						<input type="text" value="请选择公司规模" name="csize" id="csize" class="select">

	                    <h3>发展阶段</h3>
						<input type="text" id="phase" name="phase" class="select">

	                    <h3>一句话介绍</h3> 
	                    <input type="text" placeholder="一句话概括公司亮点，如公司愿景、领导团队等，限50字" maxlength="50" name="temptation" id="temptation">	
	                    <span style="display:none;" class="error" id="beError"></span>
						<input type="submit" value="保存，下一步"  class="btn_big fr" />
	                </form>
                </dd>
            </dl>
            </dl>
       	</div>
			<div class="clear"></div>
			<input type="hidden" value="13ae35fedd9e45cdb66fb712318d7369" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop" style="display: none;"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="about.html">联系我们</a>
		    <a target="_blank" href="http://www.lagou.com/af/zhaopin.html">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">拉勾微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">拉勾微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>

</div>
</body>
</html>
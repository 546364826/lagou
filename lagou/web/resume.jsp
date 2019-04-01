<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>简历填写-拉勾网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="拉勾网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在拉勾网">
<meta name="keywords" content="拉勾,拉勾网,拉勾招聘,拉钩, 拉钩网 ,互联网招聘,拉勾互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 拉勾官网, 拉勾百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link href="h/images/favicon.ico" rel="Shortcut Icon">
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
    		<a class="logo" href="h/">
    			<img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="indexlogin.jsp">首页</a></li>
    			<li><a href="companylist.html">公司</a></li>
    			<li><a target="_blank" href="h/toForum.html">论坛</a></li>
    				    			<li class="current"><a rel="nofollow" href="jianli.jsp">我的简历</a></li>
	    						    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span>
			<%
            String email = (String)session.getAttribute("email");
            out.print(email);
             %>
					</span>
            		<span class="red dn" id="noticeDot-0"></span>
            		<i></i>
            	</dt>
                                	<dd><a rel="nofollow" href="jianli.jsp">我的简历</a></dd>
                	                	<dd><a href="collections.html">我收藏的职位</a></dd>
                	                	                	<dd class="btm"><a href="subscribe.html">我的订阅</a></dd>
                	<dd><a href="create.jsp">我要招人</a></dd>
                                                <dd><a href="accountBind.jsp">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                    <div class="dn" id="noticeTip">
            	<span class="bot"></span>
				<span class="top"></span>
				<a target="_blank" href="delivery.html"><strong>0</strong>条新投递反馈</a>
				<a class="closeNT" href="javascript:;"></a>
            </div>
                    </div>
    </div><!-- end #header -->
    <div id="container">
        
  		<div class="clearfix">
            <div class="content_l">
            	<div class="fl" id="resume_name">
	            	<div class="nameShow fl">
	            		<h1 title="<%
							String email1 = (String)session.getAttribute("email");
							out.print(email1);
						%>的简历">
							<%
							String email2 = (String)session.getAttribute("email");
							out.print(email2);
						%>的简历</h1>
	            		<span class="rename">重命名</span> | <a target="_blank" href="h/resume/preview.html">预览</a>
            		</div>
            		<form class="fl dn" id="resumeNameForm">
            			<input type="text" value="<%
							String email3 = (String)session.getAttribute("email");
							out.print(email3);
						%>的简历" name="resumeName" class="nameEdit c9">
            			<input type="submit" value="保存"> | <a target="_blank" href="h/resume/preview.html">预览</a>
            		</form>
            	</div><!--end #resume_name-->
            	<div class="fr c5" id="lastChangedTime">最后一次更新：<span>2014-07-01 15:14 </span></div><!--end #lastChangedTime-->

            	<div class="profile_box" id="basicInfo">
            		<h2>基本信息</h2>
            		<span class="c_edit"></span>
            		<div class="basicShow">
            			<div class="m_portrait">
	                    	<div></div>
	                    	<img width="120" height="120" alt="jason" src="style/images/default_headpic.png">
	                    </div>
            		</div><!--end .basicShow-->

            		<div class="basicEdit dn">
            			<form class="formWrapper" action="${pageContext.request.contextPath }/AddPresonServlet?method=doPost" method="post" enctype="multipart/form-data">
							<input type="hidden" name="loginemail" value="<%
							String email4 = (String)session.getAttribute("email");
							out.print(email4);
						%>">

							<table>
						    <tbody><tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>
						        <input type="text" placeholder="姓名" value="jason" name="name" id="name">
						      </td>
						      <td valign="top"></td> 
						      <td>
						          <ul class="profile_radio clearfix reset">
						            <li class="current">
						           	  	 男<em></em>
						              	<input type="radio" checked="checked" name="sex" value="男">
						            </li>
						            <li>
						            	  女<em></em>
						              	<input type="radio" name="sex" value="女">
						            </li>
						          </ul>  
						      </td>
						    </tr>
						    <tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>

						        <input type="text" name="degree" id="select_topDegree" class="profile_select_190 profile_select_normal">
								<div class="boxUpDown boxUpDown_190 dn" id="box_topDegree" style="display: none;">
						        	<ul id="test1">
						        								        			<li>大专</li>
						        								        			<li>本科</li>
						        								        			<li>硕士</li>
						        								        			<li>博士</li>
						        								        			<li>其他</li>
						        								        	</ul>
						        </div>  
						      </td>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td>
						          <input type="text" name="hands" id="select_workyear" class="profile_select_190 profile_select_normal">
								  <div class="boxUpDown boxUpDown_190 dn" id="box_workyear" style="display: none;">
						          	 <ul id="test2">
						        								        			<li>应届毕业生</li>
						        								        			<li>1年</li>
						        								        			<li>2年</li>
						        								        			<li>3年</li>
						        								        			<li>4年</li>
						        								        			<li>5年</li>
						        								        			<li>6年</li>
						        								        			<li>7年</li>
						        								        			<li>8年</li>
						        								        			<li>9年</li>
						        								        			<li>10年</li>
						        								        			<li>10年以上</li>
						        								        	 </ul>
						          </div>  
						      </td>
						    </tr>
						    <tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td colspan="3">
						          <input type="text" placeholder="手机号码"  name="phone" id="tel">
						      </td>
						   	</tr>
						   	<tr>
						      <td valign="top">
						        <span class="redstar">*</span>
						      </td> 
						      <td colspan="3">
						          <input type="text" value="<%
							String email5 = (String)session.getAttribute("email");
							out.print(email5);
						%>"   name="email" id="email">
						      </td>
						    </tr>
						    <tr>
						      <td valign="top"> </td> 
						      <td colspan="3">
						          <input type="text" placeholder="目前状态"  name="idea" id="select_currentState" class="profile_select_410 profile_select_normal">
								  <div class="boxUpDown boxUpDown_410 dn" id="box_currentState" style="display: none;">
						          	  <ul id="test3" >
						        								        			<li>我目前已离职，可快速到岗</li>
						        								        			<li>我目前正在职，正考虑换个新环境</li>
						        								        			<li>我暂时不想找工作</li>
						        								        			<li>我是应届毕业生</li>
						        								        	  </ul>
						          </div>  
						      </td>
						    </tr>

						  </tbody></table>

							<div class="formWrapper">
								<input type="hidden" value="25927" name="productInfos[0].companyId">
								<h3>头像</h3>
								<input type="file" title="支持jpg、jpeg、gif、png格式，文件小于5M" onchange="img_check(this,'http://www.lagou.com/c/upload.json',380,220,5,'myfiles0','myfiles0_error','productNo0','productShow0','type0','productInfos0');" name="headpic" id="myfiles0" accept="image/*">
								<input type="hidden" value="3" name="productInfos[0].type" id="type0">
								<input type="hidden" name="productInfos[0].productPicUrl" id="productInfos0">
							</div><!--end .new_portrait-->

									<input type="submit" value="保 存" >
									<a class="btn_profile_cancel" href="javascript:;">取 消</a>
						</form><!--end #profileForm-->




<!-------------------------------------弹窗lightbox ----------------------------------------->
<div style="display:none;">
	<!-- 上传简历 -->
	<div class="popup" id="uploadFile">
	    <table width="100%">
	    	<tbody><tr>
	        	<td align="center">
	                <form>
	                    <a class="btn_addPic" href="javascript:void(0);">
	                    	<span>选择上传文件</span>
	                        <input type="file" onchange="file_check(this,'h/nearBy/updateMyResume.json','resumeUpload')" class="filePrew" id="resumeUpload" name="newResume" size="3" title="支持word、pdf、ppt、txt、wps格式文件，大小不超过10M" tabindex="3">
	                    </a>
	                </form>
	            </td>
	        </tr>
	    	<tr>
	        	<td align="left">支持word、pdf、ppt、txt、wps格式文件<br>文件大小需小于10M</td>
	        </tr>
	        <tr>
	        	<td align="left" style="color:#dd4a38; padding-top:10px;">注：若从其它网站下载的word简历，请将文件另存为.docx格式后上传</td>
	        </tr>
	    	<tr>
	        	<td align="center"><img width="55" height="16" alt="loading" style="visibility: hidden;" id="loadingImg" src="style/images/loading.gif"></td>
	        </tr>
	    </tbody></table>
	</div><!--/#uploadFile-->
	
	<!-- 简历上传成功 -->
	<div class="popup" id="uploadFileSuccess">
     	<h4>简历上传成功！</h4>
         <table width="100%">
             <tbody><tr>
                 <td align="center"><p>你可以将简历投给你中意的公司了。</p></td>
             </tr>
         	<tr>
             	<td align="center"><a class="btn_s" href="javascript:;">确&nbsp;定</a></td>
             </tr>
         </tbody></table>
     </div><!--/#uploadFileSuccess-->
     
	<!-- 没有简历请上传 -->
    <div class="popup" id="deliverResumesNo">
        <table width="100%">
            <tbody><tr>
                <td align="center"><p class="font_16">你在拉勾还没有简历，请先上传一份</p></td>
            </tr>
        	<tr>
            	<td align="center">
                    <form>
                        <a class="btn_addPic" href="javascript:void(0);">
                        	<span>选择上传文件</span>
                        	<input type="file" onchange="file_check(this,'h/nearBy/updateMyResume.json','resumeUpload1')" class="filePrew" id="resumeUpload1" name="newResume" size="3" title="支持word、pdf、ppt、txt、wps格式文件，大小不超过10M">
                        </a>
                    </form>
                </td>
            </tr>
        	<tr>
            	<td align="center">支持word、pdf、ppt、txt、wps格式文件，大小不超过10M</td>
            </tr>
        </tbody></table>
    </div><!--/#deliverResumesNo-->
    
    <!-- 上传附件简历操作说明-重新上传 -->
    <div class="popup" id="fileResumeUpload">
        <table width="100%">
            <tbody><tr>
                <td>
                	<div class="f18 mb10">请上传标准格式的word简历</div>
                </td>
            </tr>
            <tr>
                <td>
                	<div class="f16">
                		操作说明：<br>
                		打开需要上传的文件 - 点击文件另存为 - 选择.docx - 保存
                	</div>
                </td>
            </tr>
        	<tr>
            	<td align="center">
            		<a title="上传附件简历" href="#uploadFile" class="inline btn cboxElement">重新上传</a>
            	</td>
            </tr>
        </tbody></table>
    </div><!--/#fileResumeUpload-->
    
    <!-- 上传附件简历操作说明-重新上传 -->
    <div class="popup" id="fileResumeUploadSize">
        <table width="100%">
            <tbody><tr>
                <td>
                	<div class="f18 mb10">上传文件大小超出限制</div>
                </td>
            </tr>
            <tr>
                <td>
                	<div class="f16">
                		提示：<br>
                		单个附件不能超过10M，请重新选择附件简历！
                	</div>
                </td>
            </tr>
        	<tr>
            	<td align="center">
            		<a title="上传附件简历" href="#uploadFile" class="inline btn cboxElement">重新上传</a>
            	</td>
            </tr>
        </tbody></table>
    </div><!--/#deliverResumeConfirm-->
    
</div>
<!------------------------------------- end ----------------------------------------->  

<script src="style/js/Chart.min.js" type="text/javascript"></script>
<script src="style/js/profile.min.js" type="text/javascript"></script>
<!-- <div id="profileOverlay"></div> -->
<div class="" id="qr_cloud_resume" style="display: none;">
	<div class="cloud">
		<img width="134" height="134" src="">
		<a class="close" href="javascript:;"></a>
	</div>
</div>
						<script>
                        $(document).ready(function(){
                            var Uarry=$("#test1 li");//获取所有的li元素
                            $("#test1 li").click(function(){//点击事件
                                //测试直接获取值 var v=$(this).text(); alert(v);

                                var count=$(this).index();//获取li的下标
                                var Tresult=Uarry.eq(count).text();
                                $("#select_topDegree").val(Tresult);
                            })
                        })
					</script>


						<script>
                            $(document).ready(function(){
                                var Uarry=$("#test2 li");//获取所有的li元素
                                $("#test2 li").click(function(){//点击事件
                                    //测试直接获取值 var v=$(this).text(); alert(v);

                                    var count=$(this).index();//获取li的下标
                                    var Tresult=Uarry.eq(count).text();
                                    $("#box_workyear").val(Tresult);
                                })
                            })
						</script>


						<script>
                            $(document).ready(function(){
                                var Uarry=$("#test3 li");//获取所有的li元素
                                $("#test3 li").click(function(){//点击事件
                                    //测试直接获取值 var v=$(this).text(); alert(v);

                                    var count=$(this).index();//获取li的下标
                                    var Tresult=Uarry.eq(count).text();
                                    $("#box_currentState").val(Tresult);
                                })
                            })
						</script>

<script>
$(function(){
	$.ajax({
        url:ctx+"/mycenter/showQRCode",
        type:"GET",
        async:false
   	}).done(function(data){
        if(data.success){
             $('#qr_cloud_resume img').attr("src",data.content);
        }
   	}); 
	var sessionId = "resumeQR"+314873;
	if(!$.cookie(sessionId)){
		$.cookie(sessionId, 0, {expires: 1});
	}
	if($.cookie(sessionId) &amp;&amp; $.cookie(sessionId) != 5){
		$('#qr_cloud_resume').removeClass('dn');
	}
	$('#qr_cloud_resume .close').click(function(){
		$('#qr_cloud_resume').fadeOut(200);
		resumeQR = parseInt($.cookie(sessionId)) + 1;
		$.cookie(sessionId, resumeQR, {expires: 1});
	});
});
</script>
			<div class="clear"></div>
			<input type="hidden" value="97fd449bcb294153a671f8fe6f4ba655" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop" style="display: none;"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="h/about.html">联系我们</a>
		    <a target="_blank" href="h/af/zhaopin.html">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">拉勾微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">拉勾微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>

<!--  -->

<script type="text/javascript">
$(function(){
	$('#noticeDot-1').hide();
	$('#noticeTip a.closeNT').click(function(){
		$(this).parent().hide();
	});
});
var index = Math.floor(Math.random() * 2);
var ipArray = new Array('42.62.79.226','42.62.79.227');
var url = "ws://" + ipArray[index] + ":18080/wsServlet?code=314873";
var CallCenter = {
		init:function(url){
			var _websocket = new WebSocket(url);
			_websocket.onopen = function(evt) {
				console.log("Connected to WebSocket server.");
			};
			_websocket.onclose = function(evt) {
				console.log("Disconnected");
			};
			_websocket.onmessage = function(evt) {
				//alert(evt.data);
				var notice = jQuery.parseJSON(evt.data);
				if(notice.status[0] == 0){
					$('#noticeDot-0').hide();
					$('#noticeTip').hide();
					$('#noticeNo').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
					$('#noticeNoPage').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
				}else{
					$('#noticeDot-0').show();
					$('#noticeTip strong').text(notice.status[0]);
					$('#noticeTip').show();
					$('#noticeNo').text('('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
					$('#noticeNoPage').text(' ('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
				}
				$('#noticeDot-1').hide();
			};
			_websocket.onerror = function(evt) {
				console.log('Error occured: ' + evt);
			};
		}
};
CallCenter.init(url);
</script>

<div id="cboxOverlay" style="display: none;"></div>
				<div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;">
					<div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div>
						<div id="cboxTopCenter" style="float: left;"></div>
						<div id="cboxTopRight" style="float: left;"></div>
					</div><div style="clear: left;">
						<div id="cboxMiddleLeft" style="float: left;"></div>
						<div id="cboxContent" style="float: left;">
							<div id="cboxTitle" style="float: left;"></div>
							<div id="cboxCurrent" style="float: left;"></div>
							<button type="button" id="cboxPrevious"></button>
							<button type="button" id="cboxNext"></button>
							<button id="cboxSlideshow"></button>
							<div id="cboxLoadingOverlay" style="float: left;"></div>
							<div id="cboxLoadingGraphic" style="float: left;"></div>
						</div><div id="cboxMiddleRight" style="float: left;"></div>
					</div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div>
						<div id="cboxBottomCenter" style="float: left;"></div>
						<div id="cboxBottomRight" style="float: left;"></div>
					</div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
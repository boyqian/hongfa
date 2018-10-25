/*jq模拟下拉菜单分类搜索*/
function serchboxmenu() { 
	$(".top_serch dt").click(function() {
		$(".top_serch dd").toggle();
	});
	$(".top_serch dd ul li").click(function() {
		var text = $(this).text();
		$("#btn").val(text);
		$(".top_serch dd").hide();
	});
	$(".top_serch dd .hiden span").click(function() {
		$(".box-ct").hide();
	});
} 
//模拟下拉菜单分类搜索end

/*滑块*/
function setTab(name,cursel,n){
for(i=1;i<=n;i++){
var menu=document.getElementById(name+i);
var con=document.getElementById("con_"+name+"_"+i);
menu.className=i==cursel?"hover":"";
con.style.display=i==cursel?"block":"none";
}
}
/*滑块 end*/
/**信息分类*/
function showSubMenu() {
	$(".mddaa").mouseover(function() {
		$("#newSubMenu").toggle();
	});

	$(".newSubMenu").mouseleave(function() {
		$("#newSubMenu").hide();
	})
	//鼠标滑过显示 筛选框效果
	$("#newSubMenu").mouseover(function() {
		$(".newMenuBlock").mouseover(function() {
			$(this).find(".newSubMenuCon").show();
			$(this).find("h3").addClass("currentLink");
		})
	})

	$(".newMenuBlock").mouseleave(function() {
		$(this).find(".newSubMenuCon").hide();
		$(this).find("h3").removeClass("currentLink");
	})
	
} /**信息分类 end*/
/*通屏图片切换*///8个多少时改出来的JS珍藏啊，比起其他大网站上的容易，简单多了（2012-5-9 23:31），抄者请善待此代码
function showPicsBox(){
var sWidth = $("#housebox ul").width(); //获取焦点图的宽度（显示面积）
	var len = $("#housebox ul").length; //获取焦点图个数
	var index = 0;
	var picTimer;
	
	//以下代码添加数字按钮和按钮后的半透明条，还有上一页、下一页两个按钮
	var btn = "<div class='btn'>";
	for(var i=0; i < len; i++) {
		btn += "<span></span>";
	}
	btn += "</div>";
	$("#housebox_click").append(btn);
	//为小按钮添加鼠标滑入事件，以显示相应的内容
	$("#housebox_click .btn span").mouseenter(function() {
		index = $("#housebox_click .btn span").index(this);
		showPics(index);
	}).eq(0).trigger("mouseenter");

	//上一页、下一页按钮透明度处理 本站此功能略了-——-
	/*$("#housebox .preNext").css("opacity",0.2).hover(function() {
		$(this).stop(true,false).animate({"opacity":"0.5"},300);
	},function() {
		$(this).stop(true,false).animate({"opacity":"0.2"},300);
	});*/

	//上一页按钮
	$("#housebox .pre").click(function() {
		index -= 1;
		if(index == -1) {index = len - 1;}
		showPics(index);
	});

	//下一页按钮
	$("#housebox .next").click(function() {
		index += 1;
		if(index == len) {index = 0;}
		showPics(index);
	});

	//本例为左右滚动，即所有li元素都是在同一排向左浮动，所以这里需要计算出外围ul元素的宽度
	$("#foucsbox").css("width",sWidth * (len));
	
	//鼠标滑上焦点图时停止自动播放，滑出时开始自动播放
	$("#housebox").hover(function() {
		clearInterval(picTimer);
	},function() {
		picTimer = setInterval(function() {
			showPics(index);
			index++;
			if(index == len) {index = 0;}
		},4000); //此4000代表自动播放的间隔，单位：毫秒
	}).trigger("mouseleave");
	//鼠标经过li元素特效
	$(".interest-list li").hover(function(){
										  $(this).css({"background":"#F6F6F6"},600);
										  $(this).addClass("quan2",600);
                                             }).mouseleave(function(){
																	$(this).css({"background":"#fff"},600);
																	$(this).removeClass("quan2")
																	})
	
	//还款工具 
	  $(".tools li img").css({"opacity":"0.88"}).hover(function(){
																   $(this).css({"opacity":"1"},300)
																   }).mouseleave(function(){
																	   $(this).css({"opacity":"0.88"},300);
																	   })
	//显示图片函数，根据接收的index值显示相应的内容
	function showPics(index) { //普通切换
		var nowLeft = -index*sWidth; //根据index值计算ul元素的left值
		$("#housebox ul").stop(true,false).animate({"left":nowLeft},600); //通过animate()调整ul元素滚动到计算出的position
		$("#housebox_click .btn span").removeClass("current").eq(index).addClass("current"); //为当前的按钮切换到选中的效果
		$("#housebox_click .btn span").stop(true,false).animate({"opacity":"0.6"},300).eq(index).stop(true,false).animate({"opacity":"1"},300); //为当前的按钮切换到选中的效果
	}	};
//列表排序方式
function serxboxdownc(){
	$(".serxboxdown dt").click(function() {
		$(".serxboxdown dd").toggle();
	});
	$(".serxboxdown dd ul li").click(function() {
		var texto = $(this).text();
		$(".serchlox").val(texto);
		$(".serxboxdown dd").hide();
	});
	$(".serxboxdown dd .hiden span").click(function() {
		$(".box-ct").hide();
	}); /*jq列表排序方式 end*/
	/*lieb*/
}
//栏目搜索筛选
function quyu_boxbb(){
$(".serbox_bb dl dd a").click(
							  function(){
								  $(this).addClass("Oncolor")
								  }
							  )

$(".quyu_boxbb a").click(
							  function(){
								  $(".xiangxiqu").show();
								  }
							  )
}
//搜索列表 展开 关闭
function showserbox(){
	$("#selectbar span[name=cateswitch]").each(function(){
    		$(this).toggle(function(){
    			$(this).removeClass('b1').addClass('b2').text('收起').prev('.serchlv_list').children().slice(5).show();
    		},function(){
    			$(this).removeClass('b2').addClass('b1').text('展开').prev('.serchlv_list').children().slice(5).hide();
    		});
    		});
	}
//搜索列表 展开 关闭 end	
//QQ漂浮
function qq_piaofu(){
	//qq
var menuYloc = $("#swt_gg0").offset().top;
$(window).scroll(function (){
var offsetTop = menuYloc + $(window).scrollTop() +"px";
$("#swt_gg0").animate({top : offsetTop },{ duration:600 , queue:false });
});
$(".hover_showqq").click(function (){
$(this).addClass("hover_showqq_show")
$("#showqq").toggle();

});
$("#close_qq").click(
   function(){
	 $("#swt_gg0").hide();
	}
					 )
}
//QQ漂浮 end

//初始话搜索值
function serch_click(){
		var setx = $(".serchl"); //获取文本框对象   
	    setx.click(function() {
		setx.val("");
		setx.css({
        color: "#000"
		})
	}) 
}
/*初始话搜索值 end*/

//下拉菜单
function menu_down(){
$('li.mainlevel').mousemove(function(){
  $(this).find('.lbul').slideDown();
  $(this).addClass("hover")
  });
  $('li.mainlevel').mouseleave(function(){
  $(this).find('.lbul').slideUp("")
  $(this).removeClass("hover")
  });
}
//下拉菜单end

//鼠标经过增加样式
function yxbox(){
	$('.yxbox_m').mousemove(function(){
     $(this).children(".xqo").css({"display":"block"},600)
    })
	.mouseleave(function(){
       $(this).children(".xqo").css({"display":"none"},600)
    })
	}
//三级分类
function menu_sanji(){
	   $(".on_clickm").click(function() {
		$(this).next("div").slideToggle("slow").siblings(".show_box:visible").slideUp("slow");
		$(this).toggleClass("activeTitle");
		$(this).siblings(".activeTitle").removeClass("activeTitle");
	}); 
}
//三级分类 end

//文档加载初始化
$(document).ready(function() {


	/*serch end*/
	//serchboxmenu();
	//showSubMenu();
	//showPicsBox();
	//serxboxdownc();
    //quyu_boxbb();
	//showserbox();
	//zhidingboxshow();
	//menu_sanji();
	//serch_click();
	menu_down();
	//qq_piaofu();
});

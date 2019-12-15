<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OaManage</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style>
/* Custom Styles */
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
</style>
</head>
<body data-spy="scroll" data-target="#myScrollspy">
<div class="container">
   <div class="jumbotron">
        <h1>OA Manage</h1>
    </div>
    <div class="row">
        <div class="col-xs-3" id="myScrollspy">
            <ul class="nav nav-tabs nav-stacked" data-spy="affix" data-offset-top="125">
                <li class="active"><a href="#section-1">上单</a></li>
                <li><a href="#section-2">打野</a></li>
                <li><a href="#section-3">中单</a></li>
                <li><a href="#section-4">射手</a></li>
                <li><a href="#section-5">辅助</a></li>
            </ul>
        </div>
        <div class="col-xs-9">
            <h2 id="section-1">上单</h2>
            <h5>暗裔剑魔</h5>
            <p>名字：亚托克斯
				皮肤：暗裔剑魔、仲裁圣骑、霸天剑魔、狂鲨、腥红之月、腥红之月 至臻
				老版
				1.这场战争将成为我的杰作
				2.除掉他们的勇气
				3.每次击杀都让胜利靠近了一点
				4.没有撤退可言
				5.要么战斗，要么被遗忘
				6.荣誉不会拯救他们
				7.击破，然后倒下
				8.教会他们什么是恐惧
				9.现在我们逆转了形势
				</p>
            <hr>
            <h2 id="section-2">打野</h2>
            <h5>嘉文四世</h5>
            <p>保护忠良！
				德玛西亚!
				击垮敌军！
				攘除奸邪！
				为了父王！
				消除不公！
				我喜欢挑战！
				正义的惩罚！
				犯我德邦者虽远必诛
				谁敢违抗我的意志？
				德玛西亚，无可匹敌！
				德玛西亚，永世长存！
				给我找些更强的敌人！
			</p>
            <hr>
            <h2 id="section-3">中单</h2>
            <h5>流浪法师</h5>
               <p>名字：亚托克斯
				皮肤：暗裔剑魔、仲裁圣骑、霸天剑魔、狂鲨、腥红之月、腥红之月 至臻
				老版
				1.这场战争将成为我的杰作
				2.除掉他们的勇气
				3.每次击杀都让胜利靠近了一点
				4.没有撤退可言
				5.要么战斗，要么被遗忘
				6.荣誉不会拯救他们
				7.击破，然后倒下
				8.教会他们什么是恐惧
				9.现在我们逆转了形势
				</p>
            <hr>
            <h2 id="section-4">射手</h2>
            <h5>寒冰射手</h5>
               <p>名字：亚托克斯
				皮肤：暗裔剑魔、仲裁圣骑、霸天剑魔、狂鲨、腥红之月、腥红之月 至臻
				老版
				1.这场战争将成为我的杰作
				2.除掉他们的勇气
				3.每次击杀都让胜利靠近了一点
				4.没有撤退可言
				5.要么战斗，要么被遗忘
				6.荣誉不会拯救他们
				7.击破，然后倒下
				8.教会他们什么是恐惧
				9.现在我们逆转了形势
				</p>
            <hr>
            <h2 id="section-5">辅助</h2>
            <h5>提姆队长</h5>
             <p>名字：亚托克斯
				皮肤：暗裔剑魔、仲裁圣骑、霸天剑魔、狂鲨、腥红之月、腥红之月 至臻
				老版
				1.这场战争将成为我的杰作
				2.除掉他们的勇气
				3.每次击杀都让胜利靠近了一点
				4.没有撤退可言
				5.要么战斗，要么被遗忘
				6.荣誉不会拯救他们
				7.击破，然后倒下
				8.教会他们什么是恐惧
				9.现在我们逆转了形势
				</p>
        </div>
    </div>
</div>
</body>
</html>
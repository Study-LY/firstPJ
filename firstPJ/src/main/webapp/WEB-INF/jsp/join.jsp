<%--
  Created by IntelliJ IDEA.
  User: 이샛별
  Date: 2022-03-01
  Time: 오후 6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FirstPJ-Join</title>
</head>
<body>
<h2>회원가입 화면입니다.</h2>
<form name="join" action="joinok" method="post">

        아이디 <input type="email" name="user_ID" placeholder="email@gmail.com ">
        <input type="button" name="user_IDcheck" value="아이디 확인">
        <br>
        비밀번호 <input type="password" name="user_PW1"><br>
        비밀번호 확인 <input type="password" name="user_PW2">
        <input type="button" name="user_PWcheck" value="비밀번호 확인">
        <br><br>
        이름 <input type="text" name="user_name" value="이름"><br>
        생년월일 <select name="year">
            <option value="">-- 선택 --</option>
            <option value="1995">1995</option>
            <option value="1996">1996</option>
            <option value="1997">1997</option>
            <option value="1998">1998</option>
            <option value="1999">1999</option>
            <option value="2000">2000</option>
            <option value="2001">2001</option>
            <option value="2002">2002</option>
            <option value="2003">2003</option>
            <option value="2004">2004</option>
        </select>
        <select name="month">
            <option value="">-- 선택 --</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
        </select>
        <select name="day">
            <option value="">-- 선택 --</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
            <option value="25">25</option>
            <option value="26">26</option>
            <option value="27">27</option>
            <option value="28">28</option>
            <option value="29">29</option>
            <option value="30">30</option>
            <option value="31">31</option>
        </select> <br>
        성별 &nbsp;
        <label for="man">남자</label>
        <input type="radio" name="gender" value="m" id="man">
        <label for="woman">여자</label>
        <input type="radio" name="gender" value="w" id="woman"> <br>

        휴대전화
        <input type="text" name="user_phone" placeholder="010-****-****">
<!--       <input type="button" name="certification" value="인증번호 받기"><br>
        <input type="text" name="certification" placeholder="인증번호를 입력하세요">
        <input type="button" name="certification" value="확인"><br><br> -->
    <br><br>
        <input type="submit" name="join" value="회원가입">
</form>
</body>
</html>

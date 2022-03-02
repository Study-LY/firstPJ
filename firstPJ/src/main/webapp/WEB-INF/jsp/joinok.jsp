<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>FirstPJ-JoinOk</title>
</head>
<body>
<h2>회원가입 완료(확인) 화면입니다.</h2>
<form action="/" method="post">

    아이디 :  ${param.user_ID}<br>
    비밀번호 : ${param.user_PW1} <br>
    비밀번호 확인 : ${param.user_PW2} <br>
    이름 : ${param.user_name} <br>
    생년월일 :  ${param.year}-${param.month}-${param.day}<br>
    성별 :  ${param.gender}<br>
    휴대폰 번호:  ${param.user_phone}<br>
    <input type="submit" value="확인">
</form>
</body>
</html>
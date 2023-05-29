<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/HomeController" method="post">
    <fieldset>
        <legend>교육 과정</legend>
        <label for="education">영어 회화 (초급) >> </label>
        <select name="education" id="education">
            <option value="default" selected>choose time option</option>
            <option value="am 09:00 ~ 11:00">오전 9:00 ~ 11:00</option>
            <option value="am 11:00 ~ 13:00">오전 11:00 ~ 13:00</option>
            <option value="pm 13:00 ~ 15:00">오후 13:00 ~ 15:00</option>
            <option value="pm 15:00 ~ 17:00">오후 15:00 ~ 17:00</option>
        </select>
    </fieldset>
    <br/>
    <fieldset>
        <legend>신청자 기본 정보</legend>
        <label for="userName">Name : </label>
        <input type="text" name="userName" id="userName" required/> <br/>
        <label for="userEmail">Email : </label>
        <input type="email" name="userEmail" id="userEmail" required/> <br/>
        <label for="password"> Password : </label>
        <input type="password" name="password" id="password" required/> <br/>
        <label for="department">Department : </label>
        <select id="department" name="department" required>
            <option value="default" selected>choose your department</option>
            <option value="computer">Computer</option>
            <option value="computerSW">ComputerSW</option>
            <option value="machine">Machine</option>
        </select> <br/>
        Gander :
            <label><input type="radio" name="gender" value="female"/>female</label>
            <label><input type="radio" name="gender" value="male"/>male</label>
        <br/>
        Interest :
            <label><input type="checkbox" name="interest" value="trip">trip</label>
            <label><input type="checkbox" name="interest" value="game"/>play game</label>
            <label><input type="checkbox" name="interest" value="listenMusic"/>listen music</label>
            <label><input type="checkbox" name="interest" value="exercise"/>exercise</label>
    </fieldset>
    <br/>
    <button type="submit" id="submitBtn">Submit</button>
</form>
</body>
</html>
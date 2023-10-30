<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2023/10/26
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>个人所得税计算</title>
</head>
<body>
<form action="incometax" method="post">
  <table>
    <tr>
      <td>请输入收入金额:</td>
      <td>
        <input type="text" name="laborage" style="text-align: center;">元
      </td>
    </tr>
    <tr>
      <td>这里是起征金额：</td>
      <td>
        <input type="text" name="startpoint" value="2000" style="text-align: center;">元
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="计算">
    </tr>
  </table>
</form>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: tuvace
  Date: 2019-11-06
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="no">
<head>
    <meta charset="UTF-8">
    <title>Booking</title>
    <link href="css/booking.css" rel="stylesheet" type="text/css">
    <style>
        table, th, td {
            border: 1px solid black;
            text-align: center;
        }
        th, td {
            padding: 20px;
        }
    </style>
</head>

<body>
<h1>Velg en flyvning</h1>
<div>

    <table>
        <tr>
            <th></th>
            <th>Utreise</th>
            <th>Lengde</th>
            <th>Pris</th>
        </tr>
        <tr>
            <td><input type="radio"></td>
            <td><input type="text" name="Avgang" value="Avngang">-<input type="text" name="Ankomst" value="Ankomst"></td>
            <td><input type="text" name="Varighet" value="Varighet"></td>
            <td><input type="text" name="Pris" value="Pris"> Kr</td>
        </tr>
        <tr>
            <td><input type="radio"></td>
            <td><input type="text" name="Avgang" value="Avngang">-<input type="text" name="Ankomst" value="Ankomst"></td>
            <td><input type="text" name="Varighet" value="Varighet"></td>
            <td><input type="text" name="Pris" value="Pris"> Kr</td>
        </tr>
        <tr>
            <td><input type="radio"></td>
            <td><input type="text" name="Avgang" value="Avngang">-<input type="text" name="Ankomst" value="Ankomst"></td>
            <td><input type="text" name="Varighet" value="Varighet"></td>
            <td><input type="text" name="Pris" value="Pris"> Kr</td>
        </tr>
        <tr>
            <td><input type="radio"></td>
            <td><input type="text" name="Avgang" value="Avngang">-<input type="text" name="Ankomst" value="Ankomst"></td>
            <td><input type="text" name="Varighet" value="Varighet"></td>
            <td><input type="text" name="Pris" value="Pris"> Kr</td>
        </tr>
    </table>
</div>
</body>



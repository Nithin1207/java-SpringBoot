<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>Calculator</title>
        <link rel="stylesheet" href="/index.css" />
    </head>

    <body>
        <div class="container">
            <h1>Enter Two Numbers</h1>
            <form method="get" action="/calculate">
                <label for="num1">Number 1:</label>
                <input type="text" id="num1" name="num1" required />

                <label for="num2">Number 2:</label>
                <input type="text" id="num2" name="num2" required />

                <button type="submit">Calculate Sum</button>
            </form>
        </div>
    </body>

    </html>
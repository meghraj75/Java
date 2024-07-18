<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Word Count Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
            text-align: center;
        }
        p {
            font-size: 18px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Word Count Result</h2>
        <% 
            String inputText = request.getParameter("inputText");
            if (inputText != null && !inputText.isEmpty()) {
                
                String[] words = inputText.split("\\s+");
                int wordCount = words.length;
        %>
            <p>The total number of words: <%= wordCount %></p>
        <%
            } else {
        %>
            <p>No input provided.</p>
        <%
            }
        %>
    </div>
</body>
</html>

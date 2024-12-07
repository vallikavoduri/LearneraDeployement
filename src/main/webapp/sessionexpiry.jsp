<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Session Expired</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #4e54c8, #8f94fb);
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            color: #ffffff;
        }
        .container {
            background: rgba(255, 255, 255, 0.9);
            border-radius: 15px;
            padding: 40px 30px;
            max-width: 400px;
            text-align: center;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
        }
        .title {
            font-size: 28px;
            color: #2d3748;
            font-weight: bold;
            margin-bottom: 15px;
        }
        .message {
            font-size: 18px;
            color: #4a5568;
            margin: 10px 0 20px;
            line-height: 1.5;
        }
        .action-button {
            display: inline-block;
            font-size: 18px;
            font-weight: bold;
            color: #ffffff;
            background: linear-gradient(90deg, #6a11cb, #2575fc);
            padding: 12px 25px;
            border-radius: 8px;
            text-decoration: none;
            transition: all 0.3s ease;
            box-shadow: 0 4px 10px rgba(106, 17, 203, 0.3);
        }
        .action-button:hover {
            background: linear-gradient(90deg, #2575fc, #6a11cb);
            transform: translateY(-2px);
            box-shadow: 0 6px 15px rgba(106, 17, 203, 0.4);
        }
        .footer {
            margin-top: 20px;
            font-size: 14px;
            color: #718096;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="title">Session Expired</div>
        <div class="message">Oops... Your session has ended due to inactivity. Please start a new session to continue.</div>
        <a class="action-button" href="/">Start a New Session</a>
        <div class="footer">Thank you for understanding!</div>
    </div>
</body>
</html>

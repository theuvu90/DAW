<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies Banner</title>
    <style>
        .cookie-banner {
            background-color: #f4f4f4;
            color: #333;
            position: fixed;
            bottom: 30px;
            left: 30px;
            right: 30px;
            padding: 20px;
            box-sizing: border-box;
            z-index: 9999;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        }

        .cookie-banner p {
            margin: 0;
            font-size: 18px;
            line-height: 1.5;
        }

        .cookie-banner a {
            color: #333;
            text-decoration: underline;
        }

        .cookie-banner button {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 20px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .cookie-banner button:hover {
            background-color: #fff;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="content">
        <h1>Mi sitio web</h1>
        <p>Contenido principal del sitio web...</p>
    </div>

    <?php
    if (!isset($_COOKIE['cookie_banner_accepted'])) {
        include 'cookie-banner.php';
    }
    ?>
</body>
</html>

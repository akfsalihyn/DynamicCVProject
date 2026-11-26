<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Validation Error - CV Builder</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h1>Submission Error</h1>
        </div>

        <div class="error-box">
            <h2>Please correct the following issues before generating your CV:</h2>
            <p>${errorMessage}</p>
        </div>

        <a href="cvForm.jsp" class="btn btn-primary">← Return to CV Form</a>
    </div>
</body>
</html>
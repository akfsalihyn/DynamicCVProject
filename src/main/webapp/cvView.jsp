<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${cvData.fullName} - Curriculum Vitae</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="action-bar no-print">
        <a href="cvForm.jsp" class="btn btn-outline">← Back to Form</a>
        <button onclick="window.print()" class="btn btn-primary">Print / Save as PDF</button>
    </div>

    <div class="cv-sheet">
        <!-- Header -->
        <div class="cv-header">
            <h1 class="cv-name">${cvData.fullName}</h1>
            <div class="cv-title" style="${empty cvData.professionalTitle ? 'display:none;' : ''}">
                ${cvData.professionalTitle}
            </div>
            <div class="cv-contact">
                <span><strong>Email:</strong> ${cvData.email}</span>
                <span style="${empty cvData.phoneNumber ? 'display:none;' : ''}">
                    <strong>Phone:</strong> ${cvData.phoneNumber}
                </span>
                <span style="${empty cvData.profileUrl ? 'display:none;' : ''}">
                    <strong>Portfolio/Profile:</strong> ${cvData.profileUrl}
                </span>
            </div>
        </div>

        <!-- Profile Summary -->
        <div class="cv-section" style="${empty cvData.profileSummary ? 'display:none;' : ''}">
            <h2>Profile Summary</h2>
            <p>${cvData.profileSummary}</p>
        </div>

        <!-- Education -->
        <div class="cv-section">
            <h2>Education</h2>
            <div class="cv-item-header">
                <span>${cvData.highestDegree}</span>
                <span>${cvData.graduationYear}</span>
            </div>
            <div class="cv-item-sub">
                ${cvData.institutionName}
                <span style="${empty cvData.majorField ? 'display:none;' : ''}">
                    — ${cvData.majorField}
                </span>
            </div>
        </div>

        <!-- Experience -->
        <div class="cv-section" style="${empty cvData.recentJobTitle && empty cvData.companyName ? 'display:none;' : ''}">
            <h2>Experience</h2>
            <div class="cv-item-header">
                <span>${cvData.recentJobTitle}</span>
                <span>${cvData.duration}</span>
            </div>
            <div class="cv-item-sub">${cvData.companyName}</div>
            <p style="${empty cvData.responsibilities ? 'display:none;' : ''}">
                ${cvData.responsibilities}
            </p>
        </div>

        <!-- Skills -->
        <div class="cv-section">
            <h2>Skills</h2>
            <div style="${empty cvData.technicalSkills ? 'display:none;' : ''}">
                <p><strong>Technical Skills:</strong> ${cvData.technicalSkills}</p>
            </div>
            <div style="${empty cvData.softSkills ? 'display:none;' : ''}; margin-top: 8px;">
                <p><strong>Soft Skills:</strong> ${cvData.softSkills}</p>
            </div>
        </div>
    </div>
</body>
</html>
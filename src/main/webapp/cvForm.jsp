<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dynamic Online CV Builder</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h1>Dynamic Online CV Builder</h1>
            <a href="CVServlet?action=sample" class="btn btn-secondary">Preview Sample CV</a>
        </div>

        <form action="CVServlet" method="post">
            <!-- Personal Information -->
            <fieldset>
                <legend>Personal Information</legend>
                <div class="form-grid">
                    <div class="form-group">
                        <label for="fullName">Full Name <span class="required">*</span></label>
                        <input type="text" id="fullName" name="fullName" placeholder="e.g., Akif Salihin bin Mohd Hairi" required>
                    </div>
                    <div class="form-group">
                        <label for="professionalTitle">Professional Title</label>
                        <input type="text" id="professionalTitle" name="professionalTitle" placeholder="e.g., Software Developer">
                    </div>
                    <div class="form-group">
                        <label for="email">Email Address <span class="required">*</span></label>
                        <input type="email" id="email" name="email" placeholder="e.g., name@example.com" required>
                    </div>
                    <div class="form-group">
                        <label for="phoneNumber">Phone Number</label>
                        <input type="tel" id="phoneNumber" name="phoneNumber" placeholder="e.g., +60 12-345 6789">
                    </div>
                    <div class="form-group full-width">
                        <label for="profileUrl">LinkedIn / GitHub URL</label>
                        <input type="url" id="profileUrl" name="profileUrl" placeholder="https://github.com/username">
                    </div>
                    <div class="form-group full-width">
                        <label for="profileSummary">Profile Summary</label>
                        <textarea id="profileSummary" name="profileSummary" rows="3" placeholder="Brief summary of your career goals and core strengths..."></textarea>
                    </div>
                </div>
            </fieldset>

            <!-- Education -->
            <fieldset>
                <legend>Education</legend>
                <div class="form-grid">
                    <div class="form-group">
                        <label for="highestDegree">Highest Degree <span class="required">*</span></label>
                        <input type="text" id="highestDegree" name="highestDegree" placeholder="e.g., Bachelor of Computer Science (Hons.)" required>
                    </div>
                    <div class="form-group">
                        <label for="institutionName">Institution Name</label>
                        <input type="text" id="institutionName" name="institutionName" placeholder="e.g., Universiti Teknologi MARA (UiTM)">
                    </div>
                    <div class="form-group">
                        <label for="majorField">Major / Field of Study</label>
                        <input type="text" id="majorField" name="majorField" placeholder="e.g., Computer Science">
                    </div>
                    <div class="form-group">
                        <label for="graduationYear">Year of Graduation</label>
                        <input type="text" id="graduationYear" name="graduationYear" placeholder="e.g., 2026">
                    </div>
                </div>
            </fieldset>

            <!-- Experience -->
            <fieldset>
                <legend>Work / Internship Experience</legend>
                <div class="form-grid">
                    <div class="form-group">
                        <label for="recentJobTitle">Most Recent Job Title</label>
                        <input type="text" id="recentJobTitle" name="recentJobTitle" placeholder="e.g., IT Support Intern">
                    </div>
                    <div class="form-group">
                        <label for="companyName">Company Name</label>
                        <input type="text" id="companyName" name="companyName" placeholder="e.g., Setia Utama LRT 3 Sdn Bhd">
                    </div>
                    <div class="form-group full-width">
                        <label for="duration">Duration</label>
                        <input type="text" id="duration" name="duration" placeholder="e.g., Sept 2025 – Feb 2026">
                    </div>
                    <div class="form-group full-width">
                        <label for="responsibilities">Key Responsibilities / Achievements</label>
                        <textarea id="responsibilities" name="responsibilities" rows="3" placeholder="Describe key duties, technologies used, or achievements..."></textarea>
                    </div>
                </div>
            </fieldset>

            <!-- Skills -->
            <fieldset>
                <legend>Skills (At least one skill required <span class="required">*</span>)</legend>
                <div class="form-grid">
                    <div class="form-group full-width">
                        <label for="technicalSkills">Technical Skills (comma-separated)</label>
                        <input type="text" id="technicalSkills" name="technicalSkills" placeholder="e.g., Java, JSP, Servlets, MySQL, HTML, CSS, Git">
                    </div>
                    <div class="form-group full-width">
                        <label for="softSkills">Soft Skills (comma-separated)</label>
                        <input type="text" id="softSkills" name="softSkills" placeholder="e.g., Problem Solving, Teamwork, Communication">
                    </div>
                </div>
            </fieldset>

            <div class="btn-group">
                <button type="submit" class="btn btn-primary">Generate CV</button>
                <button type="reset" class="btn btn-outline">Reset Form</button>
            </div>
        </form>
    </div>
</body>
</html>
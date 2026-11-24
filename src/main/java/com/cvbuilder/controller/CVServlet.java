package com.cvbuilder.controller;

import com.cvbuilder.model.CVBean;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Controller managing form submissions (POST) and sample CV previews (GET).
 */
public class CVServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("sample".equalsIgnoreCase(action)) {
            CVBean sampleBean = new CVBean();

            // Pre-populate realistic sample candidate details
            sampleBean.setFullName("Ahmad Danial bin Zulkifli");
            sampleBean.setProfessionalTitle("Junior Java & Enterprise Software Engineer");
            sampleBean.setEmail("ahmad.danial@example.my");
            sampleBean.setPhoneNumber("+60 12-345 6789");
            sampleBean.setProfileUrl("https://github.com/ahmaddanial-dev");
            sampleBean.setProfileSummary(
                "Detail-oriented Computer Science graduate with hands-on experience in Java EE, "
                + "Servlet/JSP MVC web applications, and relational database systems. Proven ability "
                + "to deliver clean, maintainable backend solutions in collaborative agile environments."
            );

            // Education
            sampleBean.setHighestDegree("Bachelor of Computer Science (Hons.)");
            sampleBean.setInstitutionName("Universiti Teknologi MARA (UiTM)");
            sampleBean.setGraduationYear("2026");
            sampleBean.setMajorField("Software Engineering & Enterprise Systems");

            // Experience
            sampleBean.setRecentJobTitle("IT & Systems Support Intern");
            sampleBean.setCompanyName("Setia Utama Technology Sdn Bhd");
            sampleBean.setDuration("Sept 2025 – Feb 2026");
            sampleBean.setResponsibilities(
                "Developed an internal IT asset tracking web portal using MVC architecture; "
                + "configured enterprise workstations, network infrastructure, and technical documentation."
            );

            // Skills
            sampleBean.setTechnicalSkills("Java, Servlets, JSP, JSTL, HTML5, CSS3, MySQL, Git");
            sampleBean.setSoftSkills("Problem Solving, Technical Communication, Team Collaboration, Time Management");

            request.setAttribute("cvData", sampleBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            // Default GET behavior: redirect back to the input form
            response.sendRedirect("cvForm.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // Instantiate and populate CVBean from HTTP POST parameters
        CVBean cvBean = new CVBean();
        cvBean.setFullName(request.getParameter("fullName"));
        cvBean.setProfessionalTitle(request.getParameter("professionalTitle"));
        cvBean.setEmail(request.getParameter("email"));
        cvBean.setPhoneNumber(request.getParameter("phoneNumber"));
        cvBean.setProfileUrl(request.getParameter("profileUrl"));
        cvBean.setProfileSummary(request.getParameter("profileSummary"));

        cvBean.setHighestDegree(request.getParameter("highestDegree"));
        cvBean.setInstitutionName(request.getParameter("institutionName"));
        cvBean.setGraduationYear(request.getParameter("graduationYear"));
        cvBean.setMajorField(request.getParameter("majorField"));

        cvBean.setRecentJobTitle(request.getParameter("recentJobTitle"));
        cvBean.setCompanyName(request.getParameter("companyName"));
        cvBean.setDuration(request.getParameter("duration"));
        cvBean.setResponsibilities(request.getParameter("responsibilities"));

        cvBean.setTechnicalSkills(request.getParameter("technicalSkills"));
        cvBean.setSoftSkills(request.getParameter("softSkills"));

        // Validate through the Model Bean
        if (cvBean.validate()) {
            request.setAttribute("cvData", cvBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("errorList", cvBean.getValidationErrors());
            request.setAttribute("submittedData", cvBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("cvError.jsp");
            dispatcher.forward(request, response);
        }
    }
}
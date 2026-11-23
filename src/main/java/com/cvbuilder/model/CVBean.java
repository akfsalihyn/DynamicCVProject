package com.cvbuilder.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Model JavaBean representing candidate CV details and validation rules.
 */
public class CVBean implements Serializable {

    // Personal Info
    private String fullName;
    private String professionalTitle;
    private String email;
    private String phoneNumber;
    private String profileUrl;
    private String profileSummary;

    // Education
    private String highestDegree;
    private String institutionName;
    private String graduationYear;
    private String majorField;

    // Experience
    private String recentJobTitle;
    private String companyName;
    private String duration;
    private String responsibilities;

    // Skills
    private String technicalSkills;
    private String softSkills;

    // Zero-argument constructor required by JavaBean specification
    public CVBean() {
    }

    // --- Personal Info Getters & Setters ---
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }

    // --- Education Getters & Setters ---
    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    // --- Experience Getters & Setters ---
    public String getRecentJobTitle() {
        return recentJobTitle;
    }

    public void setRecentJobTitle(String recentJobTitle) {
        this.recentJobTitle = recentJobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    // --- Skills Getters & Setters ---
    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    // --- Validation Logic ---
    public boolean validate() {
        return getValidationErrors().isEmpty();
    }

    /**
     * Checks mandatory fields: Full Name, Email, Highest Degree, and at least one Skill.
     */
    public List<String> getValidationErrors() {
        List<String> errors = new ArrayList<>();

        if (isNullOrEmpty(fullName)) {
            errors.add("Full Name is required.");
        }

        if (isNullOrEmpty(email)) {
            errors.add("Email address is required.");
        } else if (!email.trim().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            errors.add("Email address format is invalid (e.g., name@example.com).");
        }

        if (isNullOrEmpty(highestDegree)) {
            errors.add("Highest Degree is required.");
        }

        boolean hasTechSkill = !isNullOrEmpty(technicalSkills);
        boolean hasSoftSkill = !isNullOrEmpty(softSkills);
        if (!hasTechSkill && !hasSoftSkill) {
            errors.add("At least one Technical or Soft Skill is required.");
        }

        return errors;
    }

    private boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
}
package com.javatechie.courseservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.Date;

public class Course {
    @Getter
    private int courseId;
    @Getter
    private String name;
    @Getter
    private String trainerName;
    @Getter
    private String duration; // days
    @Getter
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    @Getter
    private String courseType; // Live or Recording
    @Getter
    private double fees;
    private boolean isCertificateAvailable;
    private String description;

    public Course(int courseId, String name, String trainerName,
                  String duration, Date startDate, String courseType,
                  double fees, boolean isCertificateAvailable, String description) {
        this.courseId = courseId;
        this.name = name;
        this.trainerName = trainerName;
        this.duration = duration;
        this.startDate = startDate;
        this.courseType = courseType;
        this.fees = fees;
        this.isCertificateAvailable = isCertificateAvailable;
        this.description = description;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public boolean isCertificateAvailable() {
        return isCertificateAvailable;
    }

    public void setCertificateAvailable(boolean certificateAvailable) {
        isCertificateAvailable = certificateAvailable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

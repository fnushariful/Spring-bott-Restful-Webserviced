package com.javatechie.courseservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CourseResponseDTO {
    private int courseId;
    private String name;
    private String trainerName;
    private String duration; // days
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date startDate;
    private String courseType; // Live or Recording
    private double fees;
    private boolean isCertificateAvailable;
    private String description;
    private String courseUniqueCode;
}

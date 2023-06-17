package com.android.AndroidServer.VO;

import lombok.Data;

@Data
public class ExerciseDTO {

    private Long exerciseId;
    private String uid;
    private String fileName;
    private String filePath;
    private String exerciseTime;
    private String distance;
    private String calorie;
    private String dayNum;
}
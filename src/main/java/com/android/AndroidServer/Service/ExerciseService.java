package com.android.AndroidServer.Service;

import java.util.List;

import com.android.AndroidServer.VO.ExerciseDTO;

public interface ExerciseService {
	
    public List<ExerciseDTO> findAllDesc(String email);
    
    public List<ExerciseDTO> findDateDesc(ExerciseDTO walk);
}

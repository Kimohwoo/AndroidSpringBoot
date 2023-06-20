package com.android.AndroidServer.Service;


import com.android.AndroidServer.VO.ExerciseDTO;

public interface ExerciseService {

	public ExerciseDTO GetData(String uid);
	
	public void Insert(ExerciseDTO exercise);
}

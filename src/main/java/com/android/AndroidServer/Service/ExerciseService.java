package com.android.AndroidServer.Service;


import com.android.AndroidServer.VO.ExerciseDTO;

import java.util.List;

public interface ExerciseService {

	public ExerciseDTO GetData(String uid);
	
	public void Insert(ExerciseDTO exercise);

	public List<ExerciseDTO> findAllDesc(String email);

	public List<ExerciseDTO> findDateDesc(ExerciseDTO walk);
}

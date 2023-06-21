package com.android.AndroidServer.Mapper;

import com.android.AndroidServer.VO.ExerciseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ExerciseMapper {
    public ExerciseDTO GetData(String uid);
	public void Insert(ExerciseDTO exercise);

    public List<ExerciseDTO> findAllDesc(String email);

	public List<ExerciseDTO> findDateDesc(ExerciseDTO walk);
}

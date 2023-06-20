package com.android.AndroidServer.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.android.andriodproject.DTO.ExerciseDTO;


@Repository
@Mapper
public interface ExerciseMapper {
    public ExerciseDTO GetData(String uid);
	public void Insert(ExerciseDTO exercise);

}

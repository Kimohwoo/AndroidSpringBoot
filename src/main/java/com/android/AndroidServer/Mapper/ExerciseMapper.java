package com.android.AndroidServer.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.android.AndroidServer.VO.ExerciseDTO;

@Mapper
public interface ExerciseMapper {

	public List<ExerciseDTO> findAllDesc(String email);
	public List<ExerciseDTO> findDateDesc(ExerciseDTO walk);
}

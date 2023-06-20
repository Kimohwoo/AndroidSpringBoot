package com.android.AndroidServer.Mapper;

import com.android.AndroidServer.VO.ExerciseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface ExerciseMapper {
    public ExerciseDTO GetData(String uid);
	public void Insert(ExerciseDTO exercise);

}

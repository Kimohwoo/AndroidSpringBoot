package com.android.AndroidServer.Service;

import com.android.AndroidServer.Mapper.ExerciseMapper;
import com.android.AndroidServer.VO.ExerciseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    ExerciseMapper exerciseMapper ;

    @Override
    public ExerciseDTO GetData(String uid) {
        return exerciseMapper.GetData(uid);
    }

	@Override
	public void Insert(ExerciseDTO exercise) {
		exerciseMapper.Insert(exercise);
	}

}

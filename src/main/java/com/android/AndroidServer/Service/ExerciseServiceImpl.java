package com.android.AndroidServer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.android.andriodproject.DTO.ExerciseDTO;
import com.android.andriodproject.DTO.UserDTO;
import com.android.andriodproject.mapper.ExerciseMapper;
import com.android.andriodproject.mapper.UserMapper;

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

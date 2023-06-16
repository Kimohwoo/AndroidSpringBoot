package com.android.AndroidServer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.android.AndroidServer.VO.ExerciseDTO;
import com.android.AndroidServer.Mapper.ExerciseMapper;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
    ExerciseMapper mapper;

    @Transactional(readOnly = true)
    public List<ExerciseDTO> findAllDesc(String email) {
        System.out.println("유저 email:"+email+"로 조회");
    	return mapper.findAllDesc(email);
    }

    @Transactional(readOnly = true)
    public List<ExerciseDTO> findDateDesc(ExerciseDTO walk) {
    	System.out.println("유저 email:"+walk.getUid()+"조회날짜"+walk.getDayNum()+"로 조회");
        return mapper.findDateDesc(walk.getUid(), walk.getDayNum());
    }
}

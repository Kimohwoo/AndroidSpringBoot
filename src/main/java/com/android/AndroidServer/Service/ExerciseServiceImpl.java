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
        String uid=walk.getUid();
        String dayNum=walk.getDayNum();
        System.out.println("유저 uid:"+uid+"조회날짜"+dayNum+"로 조회");
        List<ExerciseDTO> exerciseList=mapper.findDateDesc(walk);
        System.out.println(exerciseList);
        return exerciseList;
    }
}

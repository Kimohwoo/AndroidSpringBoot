package com.android.AndroidServer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.AndroidServer.VO.ExerciseDTO;
import com.android.AndroidServer.Service.ExerciseService;

@RestController
@RequestMapping("/api/exercise/")
public class ExerciseController {
	@Autowired
	ExerciseService walkService;
	
	@GetMapping("findAll/{uid}")
	public List<ExerciseDTO> findAll(@PathVariable("uid") String uid){
		System.out.println("findAll=====findAllDesc==============="+uid);
		return walkService.findAllDesc(uid);
	}
	
	@GetMapping("findByDate")
	public List<ExerciseDTO> findByDate(@RequestBody ExerciseDTO walk){
		System.out.println("findDate=====findAllDesc==============="+walk.getDayNum());
		return walkService.findDateDesc(walk);
	}
}

package com.android.AndroidServer.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.android.AndroidServer.VO.ExerciseDTO;
import com.android.AndroidServer.Service.ExerciseService;

@RestController
@RequestMapping("/api/exercise/")
public class CalendarController {
	@Autowired
	ExerciseService walkService;
	
	@GetMapping("findAll")
	public List<ExerciseDTO> findAll(@RequestParam("uid") String uid){
		System.out.println("findAll=====findAllDesc==============="+uid);
		List<ExerciseDTO> list=walkService.findAllDesc(uid);
//		Map<String, Object> walkList = new HashMap<String, Object>();
//		walkList.put("items", list);
		return list;
	}
	@GetMapping("findByDate")
	public List<ExerciseDTO> findByDate(@RequestBody ExerciseDTO walk){
		System.out.println("findDate=====findAllDesc==============="+walk.getDayNum());
		return walkService.findDateDesc(walk);
	}
}

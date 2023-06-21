package com.android.AndroidServer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
   public List<ExerciseDTO> findByDate(@RequestParam("uid") String uid,@RequestParam("dayNum") String dayNum, ExerciseDTO exerciseDTO){
      exerciseDTO.setUid(uid);
      exerciseDTO.setDayNum(dayNum);
      System.out.println("findDate=====findDateDesc==============="+exerciseDTO);
      return walkService.findDateDesc(exerciseDTO);
   }
}

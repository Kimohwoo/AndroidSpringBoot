package com.android.AndroidServer.Controller;

import com.android.AndroidServer.Service.ExerciseService;
import com.android.AndroidServer.VO.ExerciseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/walkingdog/uid/")
public class ExerciseController {
	
	
	@Autowired
	ExerciseService exerciseService;
	
	@RequestMapping("hello")
	public String hello() {
		return "Hello Rest!";
	}
	
	
	@PostMapping("mapData")
	    public ResponseEntity<ExerciseDTO> handleExerciseData(@RequestBody ExerciseDTO exerciseDTO) {
			
			StringBuilder responseMessage = new StringBuilder();
	        // 전송된 데이터 처리 로직을 구현합니다.
	        // exerciseData 객체로부터 필요한 데이터를 추출하여 비즈니스 로직에 활용합니다.
	    	System.out.println("distance: " + exerciseDTO.getTotalDistance());

	    	String totalDistance = exerciseDTO.getTotalDistance();
	        responseMessage.append("Total Distance: ").append(totalDistance).append("\n");
	        
			exerciseService.Insert(exerciseDTO);
	        // 데이터 처리 후 필요한 응답을 반환합니다.
	        // 예시: 처리 결과를 담은 ExerciseDTO 객체를 응답으로 반환
	        return ResponseEntity.ok(exerciseDTO);
	    }
}
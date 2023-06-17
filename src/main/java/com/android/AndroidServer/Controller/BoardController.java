package com.android.AndroidServer.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.android.AndroidServer.Service.BoardService;
import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

@RestController
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	@GetMapping("list")
	public Map<String, Object> RequestList(@RequestParam("pageNo") int pageNo, @RequestParam("numOfRows") int numOfRows) {
		Criteria cri = new Criteria(pageNo, numOfRows);

		List<BoardDTO> list = boardService.getListPaging(cri);
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("item", list);

		return mapList;
	}

	@PostMapping("detail")
	public String RegBoard(@RequestBody BoardDTO board){
		if(board != null) {
			System.out.println("저자 확인 : " + board.getAuthor());
			boardService.regist(board);
			return "1";
		}
		return "0";
	}

}

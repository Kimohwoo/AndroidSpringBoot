package com.android.AndroidServer.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.android.AndroidServer.Service.BoardService;
import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

@RestController
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService boardService;

	@GetMapping("list-1")
	public String test() {
		return "Test";
	}

	@GetMapping("list")
	public Map<String, Object> RequestList() {
		Criteria cri = new Criteria();

		List<BoardDTO> list = boardService.getListPaging(cri);
		Map<String, Object> boardList = new HashMap<String, Object>();
		boardList.put("item", list);

		return boardList;
	}

}

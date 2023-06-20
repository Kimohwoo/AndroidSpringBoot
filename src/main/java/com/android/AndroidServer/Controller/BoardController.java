package com.android.AndroidServer.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.android.AndroidServer.Service.UserService;
import com.android.AndroidServer.VO.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.android.AndroidServer.Service.BoardService;
import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

@RestController
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	BoardService boardService;
	UserService userService;
	@GetMapping("mylist")
	public Map<String, Object> myList(@RequestParam("uid") String uid){
		System.out.println("author 값 확인 : " + uid);
		UserDTO user = userService.login(uid);

		List<BoardDTO> myBoard = boardService.getMyList(user.getNickName());
		Map<String, Object> mapList = new HashMap<String, Object>();
		mapList.put("item", myBoard);
		System.out.println(myBoard.toString());
		return mapList;
	}

	@GetMapping("list")
	public Map<String, Object> RequestList(@RequestParam("pageNo") int pageNo, @RequestParam("numOfRows") int numOfRows) {

		Criteria cri = new Criteria(pageNo, numOfRows);

		List<BoardDTO> list = boardService.getListPaging(cri);
		if(list != null) {
			Map<String, Object> mapList = new HashMap<String, Object>();
			mapList.put("item", list);
			return mapList;
		} else {
			return null;
		}
	}

	@PostMapping("detail")
	public String RegBoard(@RequestBody BoardDTO board){
		if(board != null) {
			boardService.regist(board);
			return "1";
		}
		return "0";
	}

	@PutMapping("detail")
	public long updateBoard(@RequestParam("no") long no, @RequestBody BoardDTO board){

		if(boardService.update(board)){
			return no;
		} else {
			return -1;
		}
	}

	@DeleteMapping("detail")
	public long deleteBoard(@RequestParam("no") long no){

		if(boardService.delete(no)){
			return 1;
		} else {
			return 0;
		}
	}

}

package com.android.AndroidServer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.android.AndroidServer.Mapper.BoardMapper;
import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper mapper;

	@Override
	public void regist(BoardDTO board) {
		// TODO Auto-generated method stub
		mapper.regist(board);
	}

	@Override
	public BoardDTO read(long no) {
		// TODO Auto-generated method stub
		return mapper.read(no);
	}

	@Override
	public boolean update(BoardDTO board) {
		// TODO Auto-generated method stub
		return mapper.update(board) == 1;
	}

	@Override
	public boolean delete(long no) {
		// TODO Auto-generated method stub
		return mapper.delete(no) == 1;
	}

	@Override
	public int hit(BoardDTO board) {
		// TODO Auto-generated method stub
		return mapper.hit(board);
	}

	@Override
	public List<BoardDTO> getListPaging(Criteria cri) {
		// TODO Auto-generated method stub
		return mapper.getListPaging(cri);
	}

	@Override
	public List<BoardDTO> getMyList(String author) {

		return mapper.getMyList(author);
	}
}

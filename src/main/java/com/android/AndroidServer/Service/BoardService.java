package com.android.AndroidServer.Service;

import java.util.List;

import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

public interface BoardService {

	public void regist(BoardDTO board);

	public BoardDTO read(long no);

	public boolean update(BoardDTO board);

	public boolean delete(BoardDTO board);

	public int hit(BoardDTO board);

	public List<BoardDTO> getListPaging(Criteria cri);

}

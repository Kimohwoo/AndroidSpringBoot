package com.android.AndroidServer.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.android.AndroidServer.VO.BoardDTO;
import com.android.AndroidServer.VO.Criteria;

@Mapper
public interface BoardMapper {

	public void regist(BoardDTO board);

	public BoardDTO read(long no);

	public int update(BoardDTO board);

	public int delete(long no);

	public int hit(BoardDTO board);

	public List<BoardDTO> getListPaging(Criteria cri);

	public List<BoardDTO> getMyList(String uId);

}

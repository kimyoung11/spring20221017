package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.BoardDto;

public interface BoardMapper {
	public int insert(BoardDto board);

	public List<BoardDto> list(int offset, int records);

	public int countAll();
	
	public BoardDto select(int id);

	public int update(BoardDto board);

	public int remove(int id);
}

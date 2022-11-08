package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.BoardDto;

public interface BoardMapper {

	
	int insert(BoardDto board); //데이터 주입하는 메소드

	List<BoardDto> list(int offset, int records,String type, String keyword);
	//BoardDto 형식의 데이터 싹 가져오는 메소드
	
	BoardDto select(int id); //한줄 가져오는 메소드

	int update(BoardDto board); //데이터 업데이트 하는 메소드

	int delete(int id); //데이터 삭제하는 메소드

	int countAll(String type,String keyword);// 데이터 갯수 세는 메소드

}

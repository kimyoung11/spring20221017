package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDto;

public interface MemberMapper {

	public int insert(MemberDto member);

	public List<MemberDto> selectAll();

	public MemberDto selectById(String id);

}

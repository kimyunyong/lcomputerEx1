package com.lcomputer.ex1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lcomputer.ex1.domain.Board;

@Mapper
public interface BoardMapper {
	public List<Board> selectBoardList();
}

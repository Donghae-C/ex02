package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0")
	public abstract List<BoardVO> getList();
	public abstract void insert(BoardVO board);
	public abstract void insertSelectKey(BoardVO vo);
	public abstract BoardVO read(Long bno);
	public abstract int delete(Long bno);
	public abstract int update(BoardVO board);
}

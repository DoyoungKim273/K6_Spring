package edu.pnu.board.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.pnu.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

	@Query("SELECT b FROM Board b")
	Page<Board> getBoardList(Pageable pageable);
}

package myweb.secondboard.repository;

import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import myweb.secondboard.domain.Board;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryInterface {

  private final EntityManager em;

  public Board findOne(Long boardId) {
    return em.find(Board.class, boardId);
  }

  public void updateView(Long boardId) {
    Board board = findOne(boardId);
    board.updateView(board);
  }
}

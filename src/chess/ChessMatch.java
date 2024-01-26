package chess;

import boardgame.Board;

public class ChessMatch {

  private Board board;

  public ChessMatch() {
    board = new Board(8, 8);    
  }

  public ChessPiece[][] getPieces() {
    ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
    for (int i=0; i<board.getRows(); i++){
      for (int u=0; u<board.getColumns();u++){
        matrix[i][u]= (ChessPiece)board.piece(i, u);
      }
    }
    return matrix;
  }
}

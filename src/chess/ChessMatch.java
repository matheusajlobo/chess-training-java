package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

  private Board board;

  public ChessMatch() {
    board = new Board(8, 8);
    initialSetup();    
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

  private void initialSetup(){
    board.placePiece(new Rook(board, Color.WHITE),new Position(2,1));
    board.placePiece(new King( board, Color.WHITE), new Position(7,4));
  }
}
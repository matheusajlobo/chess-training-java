package boardgame;

public class Board {
    
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        if (rows < 8 || columns < 8) {
            throw new BoardException("Error: there must be at least eight rows an columns to create a board!");            
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getColumns(){
        return columns;
    }
    public int getRows(){
        return rows;
    }
    public Piece piece(int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Position out of the boundars");
        }
        return pieces [row][column];
    }
    public Piece piece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position out of the boundars");
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)) {
            throw new BoardException("Position" + position + "already ocupied");            
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
    
    public boolean positionExists(Position position){
    return positionExists(position.getRow(),position.getColumn());    
    }
    
    private boolean positionExists(int row, int column){
    return row >= 0 && row < rows && column >=0 && column <= columns;
    }

    public boolean thereIsAPiece(Position position){
        if(!thereIsAPiece(position)){
            throw new BoardException("Position out of the boundars")
        }
        return piece(position) != null;
    }
}
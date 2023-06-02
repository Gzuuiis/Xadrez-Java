package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        
        // NOROESTE
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setValues(p.getRow() -1 , p.getColumn() - 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // NORDESTE
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setValues(p.getRow() - 1 , p.getColumn() + 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // SUDESTE
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setValues(p.getRow() + 1 , p.getColumn() + 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // SUDOESTE
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setValues(p.getRow() + 1 , p.getColumn() - 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
		return mat;
		

	}
	
	@Override
	public String toString() {
		return "B";
	}
	

}

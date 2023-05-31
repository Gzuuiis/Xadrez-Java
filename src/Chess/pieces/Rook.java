package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Rook extends ChessPiece{
	
	

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        
        // VERIFICAÇÃO ACIMA
        p.setValues(position.getRow() - 1, position.getColumn());
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setRow(p.getRow() - 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // VERIFICAÇÃO ESQUERDA
        p.setValues(position.getRow(), position.getColumn() -1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setColumn(p.getColumn() - 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // VERIFICAÇÃO DIREITA
        p.setValues(position.getRow(), position.getColumn() + 1);
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setColumn(p.getColumn() + 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
        // VERIFICAÇÃO PARA BAIXO
        p.setValues(position.getRow() + 1, position.getColumn());
        
        //ENQUANTO A POSIÇÃO P EXISTIR E NÃO TIVER PEÇA, ELA É MARCADA COMO UMA POSIÇÃO VALIDA
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	p.setRow(p.getRow() + 1);
        	
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)) {
        	
        	mat[p.getRow()][p.getColumn()] = true;
        	
        }
        
		return mat;
	}
	
	
}

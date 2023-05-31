package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

// DEFININDO UM TIPO DE PEÇA

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	
	}

	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
		
	}

	@Override
	public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        // VERIFICAR ACIMA
        p.setValues(position.getRow() - 1, position.getColumn());
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        
        // VERIFICAR ABAIXO
        p.setValues(position.getRow() + 1, position.getColumn());
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        
        // VERIFICAR DIREITA
        p.setValues(position.getRow(), position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        // VERIFICAR ESQUERDA
        p.setValues(position.getRow(), position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        
        // VERIFICAR DIAGONAL CIMA/DIREITA
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        // VERIFICAR DIAGONAL CIMA/ESQUERDA
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        // VERIFICAR DIAGONAL BAIXO/DIREITA
        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        // VERIFICAR DIAGONAL BAIXO/ESQUERDA
        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        if(getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
		return mat;
	}
	
}

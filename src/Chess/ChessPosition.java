package Chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			
			throw new ChessException("Error instantiating ChessPosition. Valid avalues are from a1 to h8");
			
		}else {
			this.column = column;
			this.row = row;
		}
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//TRANSFORMANDO A POSIÇÃO DO XADREZ NA POSIÇÃO DA MATRIZ
    protected Position toPosition() {
    	
    	return new Position(8 - row, column - 'a');
    	
	}

	//TRANSFORMANDO A POSIÇÃO DA MATRIZ NA POSIÇÃO DO XADREZ
    protected static ChessPosition fromPosition(Position position) {
    	return new ChessPosition((char)('a' + position.getColumn()), (8 - position.getRow()));
    }
    
    @Override
    public String toString() {
    	
    	return "" + column + row;
    	
    }
}


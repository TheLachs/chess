package chess;

public class King implements Figure{
	private int color;
	private final int VALUE = Integer.MAX_VALUE;
	private Position pos;
	private boolean captured;
	private Figure[][] board;
	
	
	King (int color, Position pos){
		if (!(color == -1 || color == 1)){
			throw new IllegalArgumentException();
		}
		if (!inBoard(pos)) {
			throw new IllegalArgumentException();
		}
		this.color = color;
		this.pos = pos;
		this.captured = false;
	
	}
	
	@Override
	public Position getPos() {
		// TODO Auto-generated method stub
		return pos;
	}

	@Override
	public void setPos(Position pos) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getValue() {
		return VALUE;
	}

	@Override
	public int getColor() {
		return color;
	}

	@Override
	public boolean isValidMove(Position pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCaptured() {
		return captured;
	}

	@Override
	public boolean isKing(int color) {
		return color == this.color;
	}

	@Override
	public boolean isInCheck() throws InvalidFigureException {
		
		// Idea: Go through every Piece on the board of other color and check if pos of king is a legal move.
		// maybe also change method return number of checks, i explicit to check double checks for legal moves of player (can only move King) so
		// for every piece except King return false for every move.
		// new mwthod with a Position as Input to check if after a move the King ist still in check?
		// what if piece that was checking would be captured, how do we accapt it as a leag move ? maybe if return value is one of this method and 
		//the piece to capture returns true for isChecking method?
		return false;
	}

	@Override
	public boolean isChecking() {
		return false; // should never be possible and happen so can be false by default
	}

	@Override
	public void setBoard(Figure[][] board) {
		this.board = board;
	}

	@Override
	public boolean inBoard(Position pos) {
		if (pos.getX() <8 && pos.getX()>=0 && pos.getY()<8 && pos.getY()>= 0) {
			return true;
		}
		return false;
	}

}

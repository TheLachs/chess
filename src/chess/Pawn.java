package chess;

public class Pawn implements Figure {
	private int color;
	private final int VALUE = 1;
	private Position pos;
	private boolean captured;
	private Figure[][] board;
	
	Pawn(int color, Position pos){
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
		return pos;
	}

	@Override
	public void setPos(Position pos) {
		this.pos = pos;
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
	public boolean isValidMove(Position goTo) {
		if (inBoard(goTo)) {
			if (goTo.getY() == pos.getY() + 1*color) {
				if (goTo.getX() == pos.getX()) {
					if (board[goTo.getX()][goTo.getY()] == null) return true;
				}else {
					if (board[goTo.getX()][goTo.getY()] != null && board[goTo.getX()][goTo.getY()].getColor() != color) return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isCaptured() {
		return captured;
	}

	@Override
	public boolean isKing(int color) {
		return false;
	}

	@Override
	public boolean isInCheck() throws InvalidFigureException {
		throw new InvalidFigureException();
	}

	@Override
	public boolean isChecking() {
		if (color == 1) {
			if (pos.getX() >0) {
				if (board[pos.getX() - 1][pos.getY() - 1].isKing(-1)) {
					return true;
				}
			}else if (pos.getX() < 7) {
				if (board[pos.getX() + 1][pos.getY() + 1].isKing(-1)) {
					return true;
				}
			}
		}else {
			if (pos.getX() >0) {
				if (board[pos.getX() - 1][pos.getY() - 1].isKing(1)) {
					return true;
				}
			}else if (pos.getX() < 7) {
				if (board[pos.getX() + 1][pos.getY() - 1].isKing(1)) {
					return true;
				}
			}
		}
		return false;
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

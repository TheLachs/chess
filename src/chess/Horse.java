package chess;

public class Horse implements Figure{
	private int color;
	private final int VALUE = 3;
	private Position pos;
	private boolean captured;
	private Figure[][] board;
	
	public Horse(int color, Position pos) {
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
	public boolean isValidMove(Position pos) {
		if (inBoard(pos)) {
			if ((Math.abs(this.pos.getX()-pos.getX()) == 1 && Math.abs(this.pos.getY()-pos.getY()) == 2 )|| (Math.abs(this.pos.getX()-pos.getX()) == 2 && Math.abs(this.pos.getY()-pos.getY()) == 1 )) {
				if (board[pos.getX()][pos.getY()] == null || board[pos.getX()][pos.getY()].getColor() != color) return true;
			}
		}return false;
	}

	@Override
	public boolean isCaptured() {
		return captured;
	}

	@Override
	public boolean isKing(int color) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int isInCheck() throws InvalidFigureException {
		throw new InvalidFigureException();
	}

	@Override
	public boolean isChecking() {
		for (Figure[] boardrow : board) {
			for (Figure boardpos: boardrow) {
				if (boardpos != null && boardpos.isKing(color*-1) && isValidMove(boardpos.getPos())) return true;
			}
			
		}return false;
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

	@Override
	public boolean willBeInCheck(Position pos) throws InvalidFigureException {
		throw new InvalidFigureException();
	}

}

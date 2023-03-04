package chess;

public class Horse implements Figure{

	@Override
	public Position getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPos(Position pos) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isValidMove(Position pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCaptured() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isKing(int color) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInCheck() throws InvalidFigureException {
		throw new InvalidFigureException();
	}

	@Override
	public boolean isChecking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setBoard(Figure[][] board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inBoard(Position pos) {
		// TODO Auto-generated method stub
		return false;
	}

}

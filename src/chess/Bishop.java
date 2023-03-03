package chess;

public class Bishop implements Figure{

	@Override
	public Position getPos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setPos(Position pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
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
	public boolean isKing() {
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

}

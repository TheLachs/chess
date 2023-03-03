package chess;

public class Pawn implements Figure {
	private String color;
	private final int VALUE = 1;
	private Position pos;
	private boolean captured;
	
	Pawn(String color, Position pos){
		if (!(color.equals("white") || color.equals("black"))){
			throw new IllegalArgumentException();
		}
		this.color = color;
		this.pos = pos;
	}
	
	@Override
	public Position getPos() {
		return pos;
	}

	@Override
	public boolean setPos(Position pos) {
		this.pos = pos;
		return false;
	}

	@Override
	public int getValue() {
		return VALUE;
	}

	@Override
	public String getColor() {
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
	public boolean isKing() {
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

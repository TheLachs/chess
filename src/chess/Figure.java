package chess;

public interface Figure {
	public Position getPos();
	public boolean setPos(Position pos);
	public int getValue();
	public String getColor();
	public boolean isValidMove(Position pos);
	public boolean isCaptured();
	public boolean isKing();
	public boolean isInCheck() throws InvalidFigureException;
	public boolean isChecking();
	
}

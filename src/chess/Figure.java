package chess;

public interface Figure {
	public Position getPos();
	public void setPos(Position pos);
	public int getValue();
	public int getColor(); //-1 black, 1 white
	public boolean isValidMove(Position pos);
	public boolean isCaptured();
	public boolean isKing(int color);
	public int isInCheck() throws InvalidFigureException;
	public boolean willBeInCheck(Position pos) throws InvalidFigureException;
	public boolean isChecking();
	public void setBoard(Figure[][] board);
	boolean inBoard(Position pos);
	
}

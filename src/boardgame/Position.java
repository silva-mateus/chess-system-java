package boardgame;

public class Position {

	private int row;
	private int column;

	public Position(int linha, int coluna) {
		this.row = linha;
		this.column = coluna;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int linha) {
		this.row = linha;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int coluna) {
		this.column = coluna;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}

}

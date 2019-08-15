package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int linhas, int colunas) {
		super();
		this.rows = linhas;
		this.columns = colunas;
		pieces = new Piece[linhas][colunas];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int linhas) {
		this.rows = linhas;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int colunas) {
		this.columns = colunas;
	}

	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}

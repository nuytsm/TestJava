package constructors3;

public class Sudoku {
	int[][] matrix = {{1,2,5},{5,2,5},{5,2,5}};
	
	public static void main(String[] args) {
		Sudoku s = new Sudoku();
		for (int i = 0; i < s.matrix.length; i++) {
			boolean rowinorde = s.controleerRow(s.matrix[i]);
			System.out.println("Row " + i +" in orde? " + rowinorde);
		}
		
		int[] firstColumn = s.getFirstColumn(s.matrix);
		System.out.println("Eerste kolom ok? " + s.controleerRow(firstColumn));
		
	}

	private int[] getFirstColumn(int[][] matrix) {
		int[] column = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			column[i] = matrix[i][0];
		}
		return column;
	}

	private boolean controleerRow(int[] row) {
		for (int i = 0; i < row.length; i++) {
			int a = row[i];
			for (int j = 0; j < row.length; j++) {
				if (j == i) {
					continue;
				}
				if (a == row[j]) {
					//error
					return false;
				}
			}
		}
		return true;
	}

}

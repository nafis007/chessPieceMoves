/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAFIS
 */
public class Rook extends ChessPiece{

    public Rook(int row, int column) {
        super(row, column);
    }
    
    @Override
    boolean validMove(int toRow, int toColumn) {
        boolean isValid = true;
        
        if ( (toRow == this.row && toColumn == this.column) ||
             (toRow != this.row && toColumn != this.column) ||
             ( toRow < 1 || toRow > 8 || toColumn < 1 || toColumn > 8) ){
            
            isValid = false;
            
        }      
        return isValid;
    }
    
    public String toString() {
		// changing in rook in first-branch
        String stringToPrint = "Rook at (" + this.row + "," + this.column + ")";
        return stringToPrint;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAFIS
 */
public class Bishop extends ChessPiece{

    public Bishop(int row, int column) {
        super(row, column);
    }
    
    @Override
    boolean validMove(int toRow, int toColumn) {
        boolean isValid = true;
        
        if ( (toRow == this.row && toColumn == this.column) ||
             (Math.abs(toRow - this.row) != Math.abs(toColumn - this.column)) ||
             ( toRow < 1 || toRow > 8 || toColumn < 1 || toColumn > 8) ){
            
            isValid = false;
            
        }      
        return isValid;
    }
    
    public String toString() {
        String stringToPrint = "Bishop at (" + this.row + "," + this.column + ")";
        return stringToPrint;
    }
}

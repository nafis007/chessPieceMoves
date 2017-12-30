/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAFIS
 */
public abstract class ChessPiece {
    int row;
    int column;    
    
    ChessPiece(int row, int column) {
        if (row >= 1 && row <=8 && column >= 1 && column <=8) {
            this.row = row;
            this.column = column;
        }
    }
    
    abstract boolean validMove(int toRow, int toColumn);
    
    public static void main(String args[]) {
        ChessPiece piece = new Knight(6,1);
        System.out.println(piece);
        System.out.println(piece.validMove(8,2));
    }
}

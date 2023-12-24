
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int number = 1;
        int row = 0; // first row first
        int col = size/2;
        square.placeValue(col, row, number);
        
        while (number < square.getHeight() * square.getWidth()) {     
            number++;
            
            int oldRow = row;
            int oldCol = col;
            
            row = (row - 1 + size) % size;
            col = (col + 1) % size;
            
            if (square.readValue(col, row) != 0) {
                row = (oldRow + 1) % size;
                col = oldCol;
            }
            
            square.placeValue(col, row, number);
        }
        
        return square;
    }

}


public class Finder {

    public boolean findWord(char matrix[][], String word) throws Exception {
        if (matrix == null || word == null) {
            throw new Exception();
        }
        int wordLength = word.length();
        int xLength = matrix[0].length;
        int yLength = matrix.length;
        boolean result;
        char first = word.charAt(0);
        int xLoc, yLoc;
        xLoc = 0;
        yLoc = 0;
        for (char[] row: matrix ) {
            for (char letter: row) {
                if (letter == first) {
                    try {
                        if (checkForWord(word, matrix, xLoc, yLoc)) {
                            System.out.println("Matched Word at: "+ xLoc + " , " + yLoc);
                            return true;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Whoops lol, tried to access to out of bounds array " + e.toString());
                    }
                }
                xLoc++;
            }
            yLoc++;
        }
        return false;
    }

    private boolean checkForWord(String word, char matrix[][], int xLoc, int yLoc) {
        //Can throw array out of bounds

        System.out.println("Matched F With F");
        int count = 0;
        char wordArray[] = word.toCharArray();
        for (char letter: wordArray) {
            if (count == 0) {
                //Skip the first letter.
                count++;
            } else {
                //Shouldn't try to access array elements that may not be in bounds
                if (wordArray[count] == matrix[xLoc+count][yLoc]) {
                    System.out.println("Matched " +wordArray[count] + " With " + matrix[xLoc+count][yLoc]);
                } else if (wordArray[count] == matrix[xLoc][yLoc+count]) {
                    System.out.println("Matched " +wordArray[count] + " With " + matrix[xLoc][yLoc+count]);
                } else {
                    return false;
                }
                count++;
            }
            
        }
        return true;
    }
}

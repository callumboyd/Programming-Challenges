public class WordFinder {
    public static void main(String args[]) {
        char[][] matrix = { {'F','A','C','I'},
                {'O','Z','D','A'},
                {'A','H','G','F'},
                {'M','U','R','P'} };
        String word = "FOAM";
        Finder finder = new Finder();
        try {
            boolean result =  finder.findWord(matrix, word);
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Invalid Arguments");
        }
    }
}

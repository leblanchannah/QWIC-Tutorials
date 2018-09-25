public class QWICTutorial {

    static String strManipulation(String sentence) {
        //Replace all ‘f’ characters with ‘d’ characters in a given string. Print the length of the string. Return the string in all lowercase.

        sentence = sentence.replaceAll("f","d");
        System.out.println(sentence.length());
        sentence = sentence.toLowerCase();
        return sentence;
    }

    // explain how to write header comments. 
    static double divider(int numA, int numB) {
        double result = 0.0;
        if (numB == 0) {
            //runtime error. 
            // also int / double 0.0 will give inf
            System.out.println("You can't divide by zero ... returning 0.0");
        } else {
            result = (double) numA /  numB;
        }
        return result;
    }

    static void reverseChaChaSlide(int[] numbers) {
        for ( int i=0; i<numbers.length/2; i++) {
            int temp = numbers[i];
            // take number from end and put it on front
            // store number in front in temp var
            numbers[i] = numbers[numbers.length - i - 1];
            // put temp number on end. 
            numbers[numbers.length - i - 1] = temp;
        }
        // printing arrays
        // if you just say numbers, then you will print the object
        for (int var : numbers) {
            System.out.println(var);
        }

    }
    //https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
    // rotate a square matrix counterclockwise by 90 degrees without using extra space
    // dim is height and width
    static int[][] rotateBy90(int[][] mat, int N) {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group of 4 in 
            // current square
            for (int y = x; y < N-x-1; y++) {
                // store current cell in temp variable
                int temp = mat[x][y];

                // move values from right to top
                mat[x][y] = mat[y][N-1-x];

                // move values from bottom to right
                mat[y][N-1-x] = mat[N-1-x][N-1-y];

                // move values from left to bottom
                mat[N-1-x][N-1-y] = mat[N-1-y][x];

                // assign temp to left
                mat[N-1-y][x] = temp;
            }
        }
        return mat;
    }
    

    static void displayMatrix(int N, int mat[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + mat[i][j]);
      
            System.out.print("\n");
        }
        System.out.print("\n");
    }



    public static void main(String [] args) {
        // question 1
        System.out.println(divider(10, 2));
        System.out.println(divider(10, 0));
        System.out.println(divider(1, 2));

        // question 2
        System.out.println(strManipulation(""));
        System.out.println(strManipulation("When you left crying at Klutch, Ron was holding hands and dancing with a female and took down her number. Multiple people in the house know, therefore you should know the truth."));
        System.out.println(strManipulation("FFFFFFFFFDDDDDDD"));

        // question 3
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        reverseChaChaSlide(numbers);

        // question 4 
        int a[][] = { {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16} };
        a = rotateBy90(a,4);
        displayMatrix(4,a);


       
    }


}
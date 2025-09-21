package Project3;

public class PascalTriangle {

    public static void isPascal ( int numRows){

        if ( numRows<=0){
            System.out.println("Enter a number bigger than 0");
        }
        for (int i = 0; i < numRows; i++) {

            int first=1;
            for (int j = 0; j <= i; j++) {
                System.out.print(first + " ");
                first = first * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        isPascal(5);
    }
}

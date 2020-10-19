package Homework2;

public class HW4 {
    public static void main(String[] args) {
        int counter=1;
        int box[][] = new int[3][3];
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                box[0+j][0+j]=1;
                System.out.print(box[i][j]+" ");
//
            }
            System.out.println();
        }
    }
}

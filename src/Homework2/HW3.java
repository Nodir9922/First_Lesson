package Homework2;

public class HW3 {
    public static void main(String[] args) {
        int box[]={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0;i<box.length;i++){
            if (box[i]<6){
                box[i]=box[i]*2;
            }
            System.out.print(box[i]+" ");
        }
    }
}

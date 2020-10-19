package Homework2;

public class HW5 {
    public static void main(String[] args) {
        int max[] = new int[1];
        int box[] = {5,65,2,7,9,26,15};
        for (int i = 0;i<box.length;i++){
            if (box[i]>max[0]){
                max[0]=box[i];
            }
        }
        System.out.println("Max = "+max[0]);


    }
}

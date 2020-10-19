package Homework2;

public class HW1 {
    public static void main(String[] args) {

        int box[] ={1,1,0,0,1,0,1,1,0,0};
        for(int i = 0; i<=box.length-1;i++ ){
            if(box[i]==0){
                box[i]=1;
            }else {
                box[i]=0;
            }
            System.out.print(box[i]+" ");
        }
    }
}

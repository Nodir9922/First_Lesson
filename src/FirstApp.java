public class FirstApp {
    public static void main(String[] args) {

        byte byteVal = 127;
        short shortVal = 32767;
        int intVal = 2147483647;
        long longVal = 9223372036854775807L;
        float floatVal = 18.8f;
        double doubleVal = 984462.515;
        char charVal = 'N';
        boolean booleanVal = true;


    }

    public static double thirdTask(double a, double b, double c, double d){
        return a * (b + (c / d));
    }

    public static boolean fourTask(double a, double b){
        if ((a+b) >= 10 && (a+b) <= 20) {
            return  true;
        }else{
            return  false;
        }
    }

    public static void fiveTask(int a){
        if(a >= 0){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательно");
        }
    }

    public static boolean sixTask(int a){
        if(a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void sevenTask(String a){
        System.out.println("Привет, "+a);
    }

    public static void eightTask(int a){
        if((a%4)==0 || (a%100)==0 || (a%400)==0){
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }
    }

}

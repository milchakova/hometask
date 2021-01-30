package task_1.hometask;

public class Main {


    public static void main(String[] args) {
        System.out.println(doT3(2.5f, 3.8f, 55.7f, 0.3f));
        System.out.println(doT4(8, 25));
        doT5(-1);
        System.out.println(doT6(-1));
        doT7();

        byte a = 1;
        short b = 12448;
        int c = 1144154847;
        long d = 1489414155155L;
        float e = 5.4f;
        double f = 5.4;
        char g = '$';
        boolean h = true; //только true/false
    }

    public static float doT3(float a, float b, float c, float d) {
//      return a * (b + (c / d)); *изменения после урока № 2
        float sum = a * (b + (c / d));
        return sum;
    }

    public static boolean doT4(int a, int b){
//       int sum = a + b; *изменения после урока № 2
//       return a + b >= 10 && sum <=20); *изменения после урока № 2
        int sum = a + b;
        if (sum >= 10 && sum <=20){
            return true;
        } else {
            return false;
        }
    }

    public static void doT5(int a){
        if (a >= 0){
            System.out.println("Число является положительным.");
        }else {
            System.out.println("Число является отрицательным.");
        }

    }

    public static boolean doT6(int a){
        if (a < 0){
            return true;
        }
        return false;
        }

    public static void doT7() {
        System.out.println("Привет, Макс! Спасибо за урок!");

    }




}







public class Main {
    public static void main(String[] args) {
        System.out.println("Повторение из видео");

        for(int i = 0; i <= 10; i++){
            System.out.println("итерация цикла  " + i);
        }


        //Задание 1
        System.out.println("Задание 1 :");
        for (int a = 1; a <=10; a++){
            System.out.println("Число " + a);

        }
        //Задание 2
        System.out.println("Задание 2 :");
        for (int b = 10; b >= 1; b--){
            System.out.println("Число " + b);

        }
        //Задание 3
        System.out.println("Задание 3 :");
        for ( int c = 1; c <= 17 ; c++){
            if (c % 2 ==0 ) {
                System.out.println("Число " + c);
            }
        }



    }
}

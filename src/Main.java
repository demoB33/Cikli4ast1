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
        //Задание 4
        System.out.println("Задание 4");
        for (int d = 10; d >= -10; d--){
            System.out.println("Число " + d);
        }
        //ДЗ-2
        //Задача 2.1
        System.out.println("Задача 2.1 :");
        for (int g = 1904; g <= 2096; g = g + 4){
            System.out.println(g + " год являеттся високосным " );
        }
        //задача 2.2
        System.out.println("Задача 2.2 :");
        for (int e = 7; e <=98; e = e + 7){
            System.out.println("Число " + e);
        }
        //Задание 2.3
        System.out.println("Задание 2.3");
        for (int f = 1; f <= 512; f = f * 2){
            System.out.println("Число " + f);
        }




    }
}

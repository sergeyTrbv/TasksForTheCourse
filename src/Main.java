public class Main {
    public static void main(String[] args) {

//        - Задача на лайв-кодинг
//
//        Напишите программу, которая переворачивает массив.
//
//        - Задача на лайв-кодинг
//
//        Напишите Java-программу для удаления всех пробелов из строки с помощью replace().

        int[] massive = {2,4,6,8,10};
        for (int i : massive) {
            System.out.print(i+" ");
        }

        System.out.println();

//        for (int i = massive.length-1; i >=0 ; i--) {
//            System.out.print(massive[i]+ " ");
//        }
        System.out.println();

        for (int i = 0; i < massive.length/2; i++) {
            int a = massive[i];
            massive[i]=massive[massive.length-i-1];
            massive[massive.length-i-1]=a;
        }
        for (int i : massive) {
            System.out.print(i+" ");
        }
    }


}
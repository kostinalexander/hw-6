public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();
    }
    public static void Task1(){
        System.out.println("Задача1");
        for (int i =1; i <=10; i =i +1){
            System.out.println("Итерация цикла "+ i);
        }
    }
    public static void Task2() {
        System.out.println("Задача2");
        for (int i=10; i>0; i= i-1){
            System.out.println("Итерация цикла " +i);
        }
    }
    public static void Task3() {
        System.out.println("Задача3");
        for (int i= 0; i<17; i= i+2) {
            System.out.println("Итерация цикла " +i);
        }
    }
    public static void Task4() {
        System.out.println("Задача 4");
        for (int i =10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " +i);
        }
    }

    public static void Task5() {
        System.out.println("Задача5");
        for (int i = 1904; i<= 2096; i = i +4) {
            System.out.println("Год является високосным "+ i);
        }
    }
    public static void Task6() {
        System.out.println("Задача6");
        for (int i = 7; i <=98; i= i +7) {
            System.out.println("Итерация цикла " +i);
        }
    }
    public static void Task7() {
        System.out.println("Задача7");
        for (int i = 1; i<=512; i = i*2) {
            System.out.println("Итерация цикла " +i);
        }
    }
    public static void Task8() {
        System.out.println("Задача8");
        int nakoplenya = 29000;
        int total = 0;
        for (int i =0; i <=12; i = i +1) {
            total = total + nakoplenya;
            System.out.println("Месяц "+ i+ " сумма накоплений равна "+  total);}

    }
    public static void Task9() {
        System.out.println("Задача9");
        int nakoplenya = 29000;
        int total = 0;
        for (int i=0; i <=12; i= i+1) {
            total = total +  total/100;
            total = total + nakoplenya;
            System.out.println("Месяц "+ i+ " итого= "+ total);}

    }
    public static void Task10() {
        System.out.println("Задача10");
        int x = 0;
        int total = -1;
       for (int i = 0; i <=20; i = i+1*2 ) {
           total = total +1;
           System.out.println("2*"+ total+ "="+ i);

       }
    }
}
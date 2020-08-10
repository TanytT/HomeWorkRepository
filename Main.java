import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
    // Task 1

        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputNumber = new Scanner(System.in);
        int num = inputNumber.nextInt();
        //--------------------------------------------------------------------------
        // Use If
        if (num==1)
            System.out.println("Вы ввели число: "+num);
        else if (num==2)
                System.out.println("Вы ввели число: "+num);
        else if (num==3) System.out.println("Вы ввели число: "+num);
        else System.out.println("Вы ввели неверное число!");
        //--------------------------------------------------------------------------
        //Use Switch
        switch (num){
            case 1: num=1;
                System.out.println("Вы ввели число: "+num);
                break;
            case 2: num=2;
                System.out.println("Вы ввели число: "+num);
                break;
            case 3: num=3;
                System.out.println("Вы ввели число: "+num);
                break;
            default: System.out.println("Вы ввели неверное число!");
        }

       //Task 2
       //------------------------------------------------------------------------------------
        String str="";
        for (int i=5; i>0; i--){
            str = str + i+" ";
        }
        System.out.println(str);

        // Task 3
        //------------------------------------------------------------------------------------
        System.out.println("Таблица умножения на 3: ");
        for (int j=1; j<=10; j++) {
            System.out.println("3*"+j+"="+(3*j));
        }

        //Task 4
        //---------------------------------------------------------------------------------------
        int sum = 0;
        for (int a = 1; a<=100; a++){
            sum += a;
        }
        System.out.println("Среднее значение суммы чисел от 1 до 100 = " + sum/100.0);

    }
}

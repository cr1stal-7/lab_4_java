import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt = 0, i = 0;
        swim[] set = new swim[20];
        while(opt != 4){
            System.out.println("Введите:");
            System.out.println("1 - Ввести комплект");
            System.out.println("2 - Вывести все комплекты");
            System.out.println("3 - Завершить работу программы");
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();
            func sum = new func();
            switch (opt) {
                case 1:
                    glasses _glasses = new glasses();
                    cap _cap = new cap();
                    shorts _shorts = new shorts();
                    slippers _slippers = new slippers();
                    set[i] = new swim(_glasses, _cap, _shorts, _slippers);
                    set[i].input();
                    set[i].output();
                    set[i].res(sum);
                    set[i].color();
                    i++;
                    swim.counter++;
                    break;
                case (2):
                    for (int j = 0; j < swim.counter; j++) {
                        set[j].output();
                        set[j].res(sum);
                        System.out.println("\n");
                    }
                    break;
                case (3):
                    System.exit(0);
            }
        }
    }
}
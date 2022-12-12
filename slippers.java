import java.util.Scanner;

public class slippers {
    private String slippers_name;
    private int slippers_size;
    public float slippers_price;

    public slippers() {
        this.slippers_name = "name";
        this.slippers_size = 0;
        this.slippers_price = 0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!slippers_name.equalsIgnoreCase("tyr") && !slippers_name.equalsIgnoreCase("speedo") && !slippers_name.equalsIgnoreCase("mp")) {
            System.out.println("Введите название сланцев(tyr/speedo/mp):");
            slippers_name = in.nextLine();
        }
        System.out.println("Введите размер сланцев:");
        slippers_size = in.nextInt();
        System.out.println("Введите стоимость сланцев:");
        slippers_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название сланцев:" + slippers_name + " Размер сланцев:" + slippers_size + " Стоимость сланцев:" + slippers_price);
    }
}

import java.util.Scanner;

public class cap {
    private String cap_name;
    public String cap_color;
    public float cap_price;

    public cap() {
        this.cap_name = "name";
        this.cap_color = "color";
        this.cap_price = 0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!cap_name.equalsIgnoreCase("arena") && !cap_name.equalsIgnoreCase("tyr") && !cap_name.equalsIgnoreCase("speedo")) {
            System.out.println("Введите название шапочки(arena/tyr/speedo):");
            cap_name = in.nextLine();
        }
        while (!cap_color.equalsIgnoreCase("red") && !cap_color.equalsIgnoreCase("black") && !cap_color.equalsIgnoreCase("silver") && !cap_color.equalsIgnoreCase("blue")) {
            System.out.println("Введите цвет шапочки(red/blue/black/silver):");
            cap_color = in.nextLine();
        }
        System.out.println("Введите стоимость шапочки:");
        cap_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название шапочки:" + cap_name + " Цвет шапочки:" + cap_color + " Стоимость шапочки:" + cap_price);
    }
}

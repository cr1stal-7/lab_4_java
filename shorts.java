import java.util.Scanner;

public class shorts {
    private String shorts_name;
    public String shorts_color;
    public float shorts_price;

    public shorts() {
        this.shorts_name = "name";
        this.shorts_color = "color";
        this.shorts_price = 0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!shorts_name.equalsIgnoreCase("tyr") && !shorts_name.equalsIgnoreCase("arena") && !shorts_name.equalsIgnoreCase("mp")) {
            System.out.println("Введите название шорт(arena/tyr/mp):");
            shorts_name = in.nextLine();
        }
        while (!shorts_color.equalsIgnoreCase("red") && !shorts_color.equalsIgnoreCase("black") && !shorts_color.equalsIgnoreCase("silver") && !shorts_color.equalsIgnoreCase("blue")) {
            System.out.println("Введите цвет шорт(red/blue/black/silver):");
            shorts_color = in.nextLine();
        }
        System.out.println("Введите стоимость шорт:");
        shorts_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название шорт:" + shorts_name + " Цвет шорт:" + shorts_color + " Стоимость шорт:" + shorts_price);
    }
}

import java.util.Scanner;

public class glasses {
    private String glasses_name;
    public String glasses_color;
    float glasses_price;

    public glasses() {
        this.glasses_name = "name";
        this.glasses_color = "color";
        this.glasses_price = 0;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        while (!glasses_name.equalsIgnoreCase("arena") && !glasses_name.equalsIgnoreCase("tyr") && !glasses_name.equalsIgnoreCase("mp")) {
            System.out.println("Введите название очков(arena/tyr/mp):");
            glasses_name = in.nextLine();
        }
        while (!glasses_color.equalsIgnoreCase("red") && !glasses_color.equalsIgnoreCase("black") && !glasses_color.equalsIgnoreCase("silver") && !glasses_color.equalsIgnoreCase("blue")) {
            System.out.println("Введите цвет очков(red/blue/black/silver):");
            glasses_color = in.nextLine();
        }
        System.out.println("Введите стоимость очков:");
        glasses_price = in.nextFloat();
    }

    public void output() {
        System.out.println("Название очков:" + glasses_name + " Цвет очков:" + glasses_color + " Стоимость очков:" + glasses_price);
    }
}

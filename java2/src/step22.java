public class step22 {
    int radius;
    String name;


    public double getArea() {
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) {
        step22 pizza;
        pizza = new step22();
        pizza.radius = 10;
        pizza.name = "피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        step22 donut = new step22();
        donut.radius = 2;
        donut.name = "도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

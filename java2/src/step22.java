public class step22 {
    int radius;// 원의 반지름 필드
    String name; //원의 이름필드


    public double getArea() { //멤버 메소드
        return 3.14 * radius * radius;
    }


    public static void main(String[] args) {
        step22 pizza;
        pizza = new step22(); //챡칟 객체 생성
        pizza.radius = 10; //피자의 반지름을 10으로 설정
        pizza.name = "피자"; //피자의 이름을 "피자"로 설정
        double area = pizza.getArea(); //피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        step22 donut = new step22();//circle 객체 생성
        donut.radius = 2;//도넛의 반지름을 2로 설정
        donut.name = "도넛";//도넛의 이름을 "도넛"으로 설정
        area = donut.getArea();//도넛의 면적 알아내기
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

class Sample{
    public int a;
    private int b;
    int c;
}

public class step28 {
    
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10; // public 필드이므로 접근 가능
        //aClass.b = 10; // private 필드이므로 접근 불가능,
        aClass.c = 10; // default 필드이므로 같은 패키지 내에서 접근 가능
    }
}

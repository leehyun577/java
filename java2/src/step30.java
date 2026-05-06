public class step30 {
    public static void main(String[] args) {
        step30 instance = new step30();
        Point p = instance.new Point();
        p.set(1, 2);
        p.showpoint();
        
        ColorPoint cp = instance.new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }

    class Point {
        protected int x;
        protected int y;
        
        public void set(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void showpoint(){
            System.out.println("("+ x +","+ y +")");
        }
    }
    class ColorPoint extends Point {
        private String color;

        public void setColor(String color){
            this.color = color;
        }

        public void showColorPoint(){
            System.out.print(color);
            showpoint();
        }
    }
}
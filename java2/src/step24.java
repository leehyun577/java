public class step24 {
    String title;
    String author;

    public step24(String t){
        title = t; author = "작자미상";
    }
    public step24(String t, String a){
        title = t; author = a;
    }

    
    public static void main(String[] args) {
        step24 littlePrince = new step24("어린왕자", "생텍쥐페리");
        step24 loveStory = new step24("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);

    }
}

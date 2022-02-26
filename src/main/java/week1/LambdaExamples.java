package week1;

interface letsTalk{
    String talk(String message);
}
// 25 Jan22
public class LambdaExamples {
    public static void main(String[] args){
    letsTalk  smallTalk = (message) ->{
        String s2 = "Today's topic of small talk is "+message;
        return s2;
    };
    System.out.println(smallTalk.talk("World peace"));
    }



}

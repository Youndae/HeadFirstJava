package Study;

/**
 * Page 54.
 * $ java shuffle1
 * a-b c-d
 * 를 출력하도록 코드를 배치.
 */
public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0){
            if(x > 2){
                System.out.print("a");
            }

            if(x == 2){
                System.out.print("b c");
            }
            x = x-1;
            System.out.print("-");

            if(x == 1){
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}

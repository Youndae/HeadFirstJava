package DotCom;

public class SimpleDotComTest {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleGameHelper helper = new SimpleGameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true){
            String guess = helper.getuserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println(numOfGuesses + " Guesses");
            }
        }
    }
}

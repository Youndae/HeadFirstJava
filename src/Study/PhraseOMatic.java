package Study;

public class PhraseOMatic {
    public static void main(String[] args){
        //세종류의 단어 목록.
        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win",
                                "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "valued-added", "oriented", "centric", "distributed", "clustered", "branded",
                                "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"precess", "tipping-point", "solution", "architecture", "core competency", "strategy",
                                    "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //각 단어 목록에 단어가 몇개씩 들어있는지 확인
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //난수를 세개 발생
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //구문 작성
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //구문 출력
        System.out.println("What we need is a "+phrase);
    }
}

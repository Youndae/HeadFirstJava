package Study;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("영화를 상영합니다.");
    }
}

class MovieTestDrive{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "주식과 함께 사라지다";
        one.genre = "비극";
        one.rating = -2;
        Movie two = new Movie();
        one.title = "로스트 인 큐비클 스페이스";
        one.genre = "코미디";
        one.rating = 5;
        Movie three = new Movie();
        one.title = "바이트 클럽";
        one.genre = "기분이 좋아지는 비극";
        one.rating = 127;
    }
}

import java.io.File;

public class HelloServlet {
    public static void main(String[] args) {
        String filePath = "image/profileImg/";
        String saveName = "cocomozzi.jpg";
        String dest = saveName.substring(saveName.lastIndexOf("."));

        System.out.println(dest);

    }
}

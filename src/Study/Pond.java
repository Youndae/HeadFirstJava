package Study;

import java.io.*;

public class Pond implements Serializable{
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();

        try{
            FileOutputStream fs = new FileOutputStream("pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
//Duck클래스에서는 Serializable을 구현하지 않는다.
//그래서 Pond에 있는 Duck 인스턴스 변수가 저장될 수 없다.
class Duck{

}

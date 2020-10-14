package Study;

public class Dog2 {
    int size;
    String name;

    void bark(){
        if(size > 60){
            System.out.println("Wooof! wooof!");
        }else if(size > 14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}

class DogTestDrive2{
    public static void main(String[] args) {
        Dog2 one = new Dog2();
        one.size = 70;
        Dog2 two = new Dog2();
        two.size = 8;
        Dog2 three = new Dog2();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
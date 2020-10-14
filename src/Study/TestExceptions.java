package Study;

public class TestExceptions {
    public static void main(String[] args) {
        String test = "No";
        try{
            System.out.println("try Block Start");  //1
            doRisky(test);
            System.out.println("try Block End");    //2
        }catch(Exception se){
            System.out.println("Exception");        //3
        }finally{
            System.out.println("finally Block");    //4
        }
        System.out.println("main End");             //5
    }

    static void doRisky(String test) throws Exception{
        System.out.println("ScaryException Start"); //6
        if("yes".equals(test)){
            throw new Exception();
        }
        System.out.println("ScaryException End");   //7
        return;
    }
}

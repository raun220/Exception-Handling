public class ThrowDemo {
    static void throwDemo() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println("Inside throwDemo method");
            //throw e;
        }
    }
    public static void main(String args[]){
        try {
            throwDemo();
        }catch (NullPointerException e) {
            System.out.println("Recaught:"+e);
        }//catch (IllegalAccessException e) {
          //  System.out.println("Illegal :"+e);
        //}
    }
}

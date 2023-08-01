public class ThrowsDemo {
    static void throwsMethod() throws IllegalAccessException {
        System.out.println("insude throwsMethod");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]){
        try {
            throwsMethod();
        }catch (IllegalAccessException e) {
            System.out.println("caught :"+e);
        }
    }
}

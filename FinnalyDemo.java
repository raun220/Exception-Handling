public class FinnalyDemo {
    static void A() {
        try {
            System.out.println("in A()");
            throw new RuntimeException("demo");
            //return;;
        } finally {
            System.out.println("A checked");
        }
    }
    static void B() {
        try {
            System.out.println("In B()");
            return;
            //throw new RuntimeException("Demo B");
            //return;
        }finally {
            System.out.println("B is checked");
        }
    }
    public static void main(String args[]) {
        try {
            A();
        }catch (Exception e) {
            System.out.println("Ex caught : "+e);
        }
        B();
    }
}

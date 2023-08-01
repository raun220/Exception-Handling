public class NestedTryDemo {
    public static void main(String args[]) {
        int a = 29, b = 0, c = 0;
        try {
            int x = a / 7;
            System.out.println("not execute");
            try{
                int y = a/c;
                System.out.println("Me too not exe");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner e:"+e);
            }

        } //catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("outer e:"+e);
        //}
        catch(ArithmeticException e) {
            System.out.println("Outer e:"+e);
        }
    }
}


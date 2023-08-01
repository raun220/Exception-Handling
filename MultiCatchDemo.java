public class MultiCatchDemo {
    public static void main (String args[]){
        int a, d;
        try{
            d = 0;
            a = 56/d;
            System.out.println("this will not execute beacuse of exception in line 6");
        } catch (Exception e) {
            System.out.println("super class"+e);
        } /* catch (ArithmeticException e) {
            System.out.println("/ by zero:"+ e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out "+e);
        } */
    }
}

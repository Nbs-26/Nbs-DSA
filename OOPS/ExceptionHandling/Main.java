package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            // divide(a, b);
            // throw new Exception("Just for fun");
            String name="Sai";
            if(name.equals("Sai")){
                throw new MyException("My name is Sai");
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        catch (MyException me) {
            System.out.println(me.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("this will always execute");
        } 
    } 
   static int divide(int a,int b) throws ArithmeticException{
    if(b==0){//Custom Exception
        throw new ArithmeticException("Please do not divide by zero");
    }
    return a/b;
   } 
}
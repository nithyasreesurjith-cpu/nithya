
public class day9 {
    static void main(){
        String name = null;
        try {
            System.out.println(name.charAt(0));
            System.out.println(45 / 0);
        }
        catch(ArithmeticException e){
            System.out.print("Arithmetic exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bonous Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally{
            System.out.println("This will always execute");
            name="";
        }System.out.println("still running");
        System.out.println("name:"+name);
    }
}

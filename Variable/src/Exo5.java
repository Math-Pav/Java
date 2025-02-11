
public class Exo5 {
    public static void main(String[] args) throws Exception {

        Integer myVar = null;
        Integer myResult = (myVar != null) ? myVar : 42;

        System.out.println("Valeur de myResult : " + myResult);
    }
}

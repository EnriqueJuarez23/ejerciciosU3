import java.util.Queue;
import java.util.LinkedList;
class Name{

    public static void main(String[] args) {
        Queue <Character> numbre = new LinkedList <> ();
        String nombre = "mauricio";
        for(int i=0;i<nombre.length();i++){
            char a = nombre.charAt(i);
            numbre.add(a);
            
        }
        System.out.println(numbre);
        
    }
}
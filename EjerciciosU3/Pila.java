import java.util.Stack;
class Pila{
public static void main(String[] args) {
Stack <Character> pila = new Stack <Character>();
System.out.println(pila.empty());
pila.push('j');
pila.push('o');
pila.push('s');
pila.push('e');
System.out.println(pila.peek());

System.out.println("");
pila.push (' ');
pila.push ('m');
pila.push ('a');
pila.push ('u');
pila.push ('r');
pila.push ('i');
pila.push ('c');
pila.push ('i');
pila.push ('o');
System.out.println(pila.search('a'));

System.out.println(" ");
pila.push ('h');
pila.push ('e');
pila.push ('r');
pila.push ('n');
pila.push ('a');
pila.push ('n');
pila.push ('d');
pila.push ('e');
pila.push ('z');
pila.pop();
pila.pop();
System.out.println(pila);

System.out.println("   ");
pila.push ('r');
pila.push ('a');
pila.push ('m');
pila.push ('i');
pila.push ('r');
pila.push ('e');
pila.push ('z');
for (Character pilita: pila){
    System.out.println(pilita);
}
}
}
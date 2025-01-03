package ArrayListGeneric;
  
import java.util.ArrayList;
public class ArrayListGeneric {
public static void main(String[] args) {
	ArrayList<String> aGeneric = new ArrayList<>();
	aGeneric.add("hello");
	aGeneric.add("world");
	aGeneric.add("sing");
	System.out.println("added generic  : "+aGeneric);
	aGeneric.add(1,"space");
	aGeneric.add(null);
	aGeneric.add(null);
	aGeneric.add(null);
System.out.println("Inbetween : "+ aGeneric);
try {
	aGeneric.remove(2);
} catch (Exception g) {
	System.out.println("Index not Found");
}
System.out.println(aGeneric);

}
}

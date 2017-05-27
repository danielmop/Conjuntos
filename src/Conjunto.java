import java.util.TreeSet;

public class Conjunto {

	TreeSet<String> conjunto;
	
	Conjunto(){
		conjunto = new TreeSet<String>();
	}
	
	public void add(String string){
		conjunto.add(string);
	}
}

import java.util.TreeSet;

public class Operações {

	public TreeSet<String> uniao(TreeSet<String> A1, TreeSet<String> A2){
		TreeSet<String> aux = new TreeSet<String>();
		aux.addAll(A1);
		aux.addAll(A2);
		return aux;
	}
	
	public TreeSet<String> intersecao(TreeSet<String> A1, TreeSet<String> A2){
		TreeSet<String> aux = new TreeSet<String>();
		aux = (TreeSet<String>) A1.clone();
		aux.retainAll(A2);
		return aux;
	}
	
	public TreeSet<String> diferenca(TreeSet<String> A1, TreeSet<String> A2){
		TreeSet<String> aux = new TreeSet<String>();
		aux = (TreeSet<String>) A1.clone();
		aux.removeAll(A2);
		return aux;
	}
	
	public static void main(String[] args) {

	}

}

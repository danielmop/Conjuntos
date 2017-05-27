import java.util.Arrays;
import java.util.TreeSet;

public class Aplicação {

	public static void main(String[] args) {
		Conjunto teste = new Conjunto();
		Conjunto teste2 = new Conjunto();
		Operações calcula = new Operações();
		teste.conjunto.add("1");
		teste.conjunto.add("2");
		teste.conjunto.add("3");
		teste2.conjunto.add("1");
		teste2.conjunto.add("2");
		teste2.conjunto.add("3");
		teste2.conjunto.add("4");
		TreeSet<String> fim = new TreeSet<String>();
		fim = calcula.uniao(teste.conjunto, teste2.conjunto);
		System.out.println("União: " + Arrays.toString(fim.toArray()));
		fim = calcula.intersecao(teste.conjunto, teste2.conjunto);
		System.out.println("Interseção: " + Arrays.toString(fim.toArray()));
		fim = calcula.diferenca(teste2.conjunto, teste.conjunto);
		System.out.println("Diferença: " + Arrays.toString(fim.toArray()));
	}

}

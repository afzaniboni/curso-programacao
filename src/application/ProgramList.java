package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		System.out.println("Tamanho da lista:" + list.size());

		System.out.println("-----LISTA-----------");
		System.out.println("---------------------");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----LISTA-----------");
		System.out.println("---SOMANDO 2-MARCO---");
		list.add(2, "Marco");		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----LISTA--LAMBDA---");
		System.out.println("-REMOVENDO COMECA M -");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("-----LISTA--LAMBDA---");
		System.out.println("-SOMENTE Q COMECA A -");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----LISTA--LAMBDA-----");
		System.out.println("-SOMENTE O PRIMEIRO A -");
		String name = list.stream().filter(lanbda -> lanbda.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-----LISTA--LAMBDA-----");
		System.out.println("-SOMENTE O PRIMEIRO J -");
		String name1 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name1);
	}
}

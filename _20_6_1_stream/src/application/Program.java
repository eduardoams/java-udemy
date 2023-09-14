package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Multiplicando cada elemento da lista por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Stream.of permite criar os elementos na própria stream
		Stream<String> st2 = Stream.of("Eduardo", "Amanda", "Chloe");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//limit é a operação intermediária
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 5);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//Sequência de Fibonacci (o valor é a soma dos 2 anteriores.
		//Ex.: 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ...
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}

}

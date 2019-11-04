package exc03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List lst = new ArrayList();
		lst.add(new Integer(12).intValue());
		lst.add(new String("Opaa"));
		lst.add(new Boolean(true));
		//O erro começa a partir da linha 14 pois esou tentando ordenar tipos de dados diferentes na lista.
		Arrays.sort(lst.toArray());
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i).toString());
		}
	}

}
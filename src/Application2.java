import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingUse;

public class Application2 {

	public static void main(String[] args) {
		List<Personne> list = Arrays.asList(
				new Personne("Youssou Ndiaye", "773221212",23),
				new Personne("Abdoul Hamid Diallo", "763221313",24),
				new Personne("Mohamed Dieye", "703221414",25),
				new Personne("Magatte War", "773221515",26),
				new Personne("Anta Niang", "773221616",27)
				);

		List<Personne> l77 = list.stream().filter(
				p->p.getTelephone().startsWith("77")).collect(Collectors.toList());

		l77.forEach(System.out::println);

		List<String> lnom = list.stream().map(p->p.getNom()).collect(Collectors.toList());

		lnom.forEach(System.out::println);
	}

}

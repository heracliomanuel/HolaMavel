package dad.maven.hola;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String greeting = StringUtils.reverse("Hola Maven!");
		
		System.out.println(greeting);
	}
}

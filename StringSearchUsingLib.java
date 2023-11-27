package main;

import java.util.Scanner;

public class StringSearchUsingLib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Informe a string principal: ");
        String text = sc.nextLine();
        System.out.println("Informe a string a ser encontrada: ");
        String pattern = sc.nextLine();
        for (int i = 0; i <= (text.length() - pattern.length()); i++)
        {
            if (text.substring(i, (i + pattern.length())).equalsIgnoreCase(
                    pattern))
            {
                System.out.println(pattern
                        + " é substring da string principal, encontrada a partir da posição: "
                        + ++i);
            }
        }
        sc.close();

	}

}

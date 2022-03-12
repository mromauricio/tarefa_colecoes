package application;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os nomes desejados separando-os por vírgula:");
        String namesInput = sc.nextLine();
        List<String> names = Arrays.asList(namesInput.split(","));
        names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Informe o nome traço sexo separado por vírgula. Ex: Maria-f,Pedro-m");
        String namesGenderInput = sc.nextLine();
        List<String> namesGender = Arrays.asList(namesGenderInput.split(","));
        List<String> female = namesGender.stream().filter(el -> el.split("-")[1].equals("f")).collect(Collectors.toList());
        List<String> male = namesGender.stream().filter(el -> el.split("-")[1].equals("m")).collect(Collectors.toList());
        System.out.println("Lista das mulheres:");
        female.forEach(el -> System.out.println(el.substring(0, el.length()-2)));
        System.out.println("Lista dos homens:");
        male.forEach(el -> System.out.println(el.substring(0, el.length()-2)));

        sc.close();
    }
}

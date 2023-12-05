package application;


import entities.JuridicalPerson;
import entities.NormalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        System.out.println("Enter the number of tax players: ");
        int numberOfPlayers = sc.nextInt();

        for(int i = 1; i <= numberOfPlayers; i++) {
            System.out.printf("Tax palyer #%d data: %n ", i);

            System.out.println("Individual or company (i/c)? ");
            char individualOrCompany = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Anual income: ");
            double income = sc.nextDouble();

            if(individualOrCompany == 'i') {
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                personList.add(new NormalPerson(name, income, healthExpenditures));
            }
            else  {
                System.out.println("Number or employees: ");
                int numberOfEmployees = sc.nextInt();

                personList.add(new JuridicalPerson(name, income, numberOfEmployees));
            }
        }


        System.out.println("TAXES PAID:");

        for(Person person : personList) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.totalTax()));
        }

        System.out.println("TOAL TAXES: ");
        double sum = 0.0;
        for(Person person : personList) {
           sum += person.totalTax();
        }
        System.out.println(sum);

        sc.close();
    }
}

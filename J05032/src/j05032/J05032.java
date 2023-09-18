/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05032;

/**
 *
 * @author vanquan
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}

public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Person youngestPerson = null;
        Person oldestPerson = null;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            Date birthDate = sdf.parse(parts[1]);
            Person currentPerson = new Person(name, birthDate);

            if (youngestPerson == null || currentPerson.getBirthDate().after(youngestPerson.getBirthDate())) {
                youngestPerson = currentPerson;
            }
            if (oldestPerson == null || currentPerson.getBirthDate().before(oldestPerson.getBirthDate())) {
                oldestPerson = currentPerson;
            }
        }

        System.out.println(youngestPerson.getName());
        System.out.println(oldestPerson.getName());
    }
}

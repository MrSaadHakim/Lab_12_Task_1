import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Number of employees: " + employees.size());

        System.out.println("\nStandard for loop:");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("\nFor-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nIterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
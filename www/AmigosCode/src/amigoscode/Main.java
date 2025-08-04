package amigoscode;

public class Main {
    public static void main(String[] args) {

        // Loop through Array
        String[] names = {
          "Jesus",
          "Leopoldo",
          "Lucina",
          "Pedro"
        };

        System.out.println("For loop");
        for (int i = 0; i < names.length; i++) {
            String current = names[i];
            String next = names[i+1];
            System.out.println(current);
        }

        System.out.println("Enhanced Loop");
        for (String name : names) {
            System.out.println(name);

        }
    }
}
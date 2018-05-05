public class Main {
    public static void main(String[] args) {
        String name = "Michał";
        int age = 15;

        System.out.println(name);
        System.out.println(age);

        System.out.println(age == 18);

        String secondName = new String("Michał");

        System.out.println(name == secondName);
        System.out.println(name.equals("Michał"));
    }
}

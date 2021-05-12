package mont;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Case";

        // add name here
        name[1] = "Jadyn";
        name[2] = "Jonathan";

        for (String s : name)
            if (s != null)
                System.out.println("Hello, I'm " + s);
    }
}

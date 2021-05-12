package mont;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Case";

        // add name here


        for (int i=0; i < name.length; i++)
            if (name[i] != null)
                System.out.println("Hello, I'm " + name[i]);
    }
}

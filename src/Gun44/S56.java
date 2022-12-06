package Gun44;

public class S56 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter", "Joseph"};
        String pwd[]= new String[3];
        int idx = 0;

        try {
            for (String n : names)
                pwd[idx] = n.substring(2, 6);
            System.out.println(pwd[idx]);
            idx++;
        } finally {

        }

            System.out.println("Invalid Name");
        }
    }


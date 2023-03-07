public class Student {
    public static void main(String[] args) {
        String name = args[0];
        String roll = args[1];
        int totalFees = Integer.parseInt(args[2]) + Integer.parseInt(args[3]);


        System.out.println("Name: " + name);
        System.out.println("Reg. No. : " + roll);
        System.out.println("total fees for 2 years: " + totalFees);
    }
   
}
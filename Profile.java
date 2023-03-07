class Profile{
    public static void main(String args[]){
        String name;
        int roll;
        double first;
        double second;
        name = args[0];
        roll = Integer.parseInt(args[1]);
        first = Double.parseDouble(args[2]);
        second = Double.parseDouble(args[3]);
        System.out.println(first+second);
       
    }

}
public class TypeConversion {
    public static void main(String[] args) {
        // implicit type conversion i.e. automatic
        // 1 . Possible
        int marks1 = 90;
        double marks2 = marks1 + 99;
        System.out.println(marks2);

        // 2. not possible
        double age1 = 22.1;
        // int age2 = age1 + 19;

        // explicit type conversion i.e. manually we need to do it
        double age10 = 22.1;
        int age11 = (int) age10 + 19; // but here data loss will be there

    }
}

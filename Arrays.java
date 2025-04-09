public class Arrays {
    public static void main(String[] args) {
        int[] marks = { 99, 98, 77 };

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int[] ages = new int[3];
        ages[0] = 19;
        ages[1] = 18;
        ages[2] = 28;

        int[] roll = new int[3];
        System.out.println(roll[2]); // since we havent initlaised it, it auto says 0

        int[][] phoneNumbers = { { 99 }, { 80 } };
        for (int i = 0; i < phoneNumbers.length; i++) {
            for (int j = 0; j < phoneNumbers[0].length; j++) {
                System.out.println(phoneNumbers[i][j]);
            }
        }
    }
}

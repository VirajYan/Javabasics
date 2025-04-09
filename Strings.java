public class Strings {
    public static void main(String[] args) {
        String a = "Viraj";
        String b = "yanpure";

        System.out.println(a + b);

        System.out.println(a.charAt(0));

        System.out.println(a.length());

        // in java og string is never changed, so hence storing in different string
        String c = a.replace('a', 'j');
        System.out.println(c);

        System.out.println(a.substring(0, 3));

    }
}
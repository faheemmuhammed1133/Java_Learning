public class CompareToExample {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3="meklo";
        String s4="hemlo";
        String s5="flag";
        String s6="hello";
        String s7="";
        String s8="me";
        String s9="Book";
        String s10="book";
        String s11="look";
        String s12="abc";
        String s13="BEEN";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); // -5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4)); // -1 because "l" is 1 times lower than "m"
        System.out.println(s1.compareTo(s5)); // 2 because "h" is 2 times greater than "f"
        System.out.println(s6.compareTo(s7)); // 5 because s2 is empty
        System.out.println(s7.compareTo(s8)); // -2 because s3 is empty
        System.out.println(s9.compareToIgnoreCase(s10)); // -2 because "B" is 2
        System.out.println(s9.compareToIgnoreCase(s11));
        System.out.println(s9.compareToIgnoreCase(s12));
        System.out.println(s9.compareToIgnoreCase(s13));

    }
}
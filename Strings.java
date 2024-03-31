public class Strings {
    public static void main(String[] args) {
        // Given strings
        String s1 = " Welcome ";
        String s2 = " welcome ";

        // a. Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.
        boolean isEqual = s1.equals(s2);

        // b. Compare s1 with s2, ignoring case, and assign the result to an int variable x.
        int x = s1.compareToIgnoreCase(s2);

        // c. Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.
        boolean b = s1.startsWith("AAA");

        // d. Assign the length of s1 to an int variable x.
        int lengthOfS1 = s1.length();

        // e. Assign the first character of s1 to a char variable x.
        char firstCharOfS1 = s1.charAt(0);

        // f. Create a new string s3 that combines s1 with s2.
        String s3 = s1.concat(s2);

        // Displaying the results
        System.out.println("Is s1 equal to s2? " + isEqual);
        System.out.println("Comparison result ignoring case: " + x);
        System.out.println("Does s1 have the prefix AAA? " + b);
        System.out.println("Length of s1: " + lengthOfS1);
        System.out.println("First character of s1: " + firstCharOfS1);
        System.out.println("Concatenated string s3: " + s3);
    }
}

package Introduction;
// Escape Character
/*
 *   \n - new line character.
 *   \t - create tab space
 */
public class OuCo {
    public static void main(String[] args) {
        System.out.println("Ramu said, \"She is my girlfriend's friend.\"" );
        /*
         * What if we want to print a string that also contains quote characters?
         * System.out.println("Ramu said, "She is my girlfriend's friend."") : This makes an error.
         * One possible solution to this is to use a backslash \, aka the escape character, before each quote character inside the string.
         */
        // Alternative Way:
        System.out.println("They said, 'Hello World!'" );
        // Note:: In java, Strings are enclosed by doouble quotes ""
    }
}

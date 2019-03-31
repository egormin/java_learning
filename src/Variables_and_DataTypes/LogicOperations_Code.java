public class Code {
    public static void main(String[] args) {
        short code = 0b010110;
        char character = 'A';

        System.out.println("Source symbol " + character + " in char table: " + (byte)character);

        character = (char)(character ^ code);
        System.out.println("Encrypted character: " + character);

        character = (char)(character ^ code);
        System.out.println("Decrypted character: " + character);

//        Source symbol A in char table: 65
//        Encrypted character: W
//        Decrypted character: A

    }
}

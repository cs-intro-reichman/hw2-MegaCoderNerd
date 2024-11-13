// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // the letters for which we add "an"
                String specialLetters = "AEFHILMNORSX";
                String message = args[0];
                int timesToRepeat = Integer.parseInt(args[1]);

                String cheerSpecial = "Give me an ";
                String cheerRegular = "Give me a  ";

                // the loop for the cheer
                // checks for the special characters and upper cases every letter
                for (int i = 0; i < message.length(); i++) {
                        char letter = Character.toUpperCase(message.charAt(i));
                        if (specialLetters.indexOf(letter) != -1) {
                                System.out.println(cheerSpecial + letter + ": " +
                                                letter + "!");
                        } else {
                                System.out.println(cheerRegular + letter + ": " +
                                                letter + "!");
                        }
                }

                System.out.println("What does that spell?");

                // the repeating loop at the end
                for (int i = 0; i < timesToRepeat; i++) {
                        System.out.println(message.toUpperCase() + "!!!");
                }
        }
}

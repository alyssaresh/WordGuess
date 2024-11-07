package com.github.zipcodewilmington;

import java.util.Random;


public class Wordguess {

    public Wordguess() {

    }

    public static void main(String[] args) {
    }


    public static void runGame() {
        announce_game();
        initialize_game_state();
        while (!is_word_guessed()) {
            print_current_state(guesses);
        }
    }
    //
    //
        public static String announce_game() {
            return "Welcome to word guess!";
        }

    public static void initialize_game_state() {
        String[] words = {"cat", "dog", "bog", "cut"};
        Random random = new Random();
        int random_Num = random.nextInt(words.length);
        String secret_Word = words[random_Num];
        char[] secret = secret_Word.toCharArray();
        char[] guesses = {'_', '_', '_'};
    }

        public static boolean is_word_guessed() {
        return true;
        }

            public static void print_current_state() {
                return guesses;
        }


        public String game_over() {
            return "Game over!";
        }


}

//        ask for a guess (a single letter)
//
//        check the letter against the word
//        using the two character arrays discussed above
//        increment the number of guesses
//
//        if the word is guessed
//        player won, congrats
//
//        if too many guesses
//        player lost, too bad, quit game
//
//    ask if player wants to play again
//
//display game over
//

//
//    public char get_next_guess() {
//        //returns a char from player input
//    }
//

//
//        public boolean ask_to_play_again () {
//            System.out.print("Play again? yes/no");
//            Scanner playAgain = new Scanner(System.in);
//            String input = playAgain.nextLine();
//            if (input == "yes")
//                runGame();
//            else if (input == "no")
//                System.out.print("Goodbye!");
//        }
//

////
//        public void process () {
//            //loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
//        }
////
//        public void player_won () {
//            System.out.print("Hooray! You rock :)");
//        }
////
//        public void player_lost () {
//            System.out.print(":(:(:(");
//            System.out.print("Try again");
//        }
//



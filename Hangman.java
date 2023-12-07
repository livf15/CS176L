package CS176L;
import java.util.Scanner;

public class Hangman {
	   private static final String[] WORDS = {"Cat", "Dolphin", "Elephant", 
			   "Bird", "Tiger"};
	    private static final int MAX_TRIES = 6;

	    private String chosenWord;
	    private char[] guessedWord;
	    private int incorrectAttempts;

	    public Hangman() {
	        chosenWord = WORDS[(int) (Math.random() * WORDS.length)].toUpperCase();
	        guessedWord = new char[chosenWord.length()];
	        for (int i = 0; i < guessedWord.length; i++) {
	            guessedWord[i] = '_';
	        }
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);

	        while (incorrectAttempts < MAX_TRIES && !isWordGuessed()) {
	            displayGuessedWord();

	            System.out.println("Enter a letter: ");
	            char guess = scanner.next().toUpperCase().charAt(0);

	            if (updateGuessedWord(guess)) {
	                System.out.println("Correct!");
	            } else {
	                System.out.println("Incorrect!");
	                incorrectAttempts++;
	            }
	        }

	        displayResult();
	        scanner.close();
	    }

	    private void displayGuessedWord() {
	        System.out.print("Current word: ");
	        for (char letter : guessedWord) {
	            System.out.print(letter + " ");
	        }
	        System.out.println();
	    }

	    private boolean updateGuessedWord(char letter) {
	        boolean correctGuess = false;
	        for (int i = 0; i < chosenWord.length(); i++) {
	            if (chosenWord.charAt(i) == letter && guessedWord[i] == '_') {
	                guessedWord[i] = letter;
	                correctGuess = true;
	            }
	        }
	        return correctGuess;
	    }

	    private boolean isWordGuessed() {
	        for (char letter : guessedWord) {
	            if (letter == '_') {
	                return false;
	            }
	        }
	        return true;
	    }

	    private void displayResult() {
	        System.out.println(incorrectAttempts == MAX_TRIES
	                ? "Sorry, you ran out of attempts. The word was: " + chosenWord
	                : "Congratulations! You guessed the word!");
	    }

	    public static void main(String[] args) {
	        Hangman hangmanGame = new Hangman();
	        hangmanGame.play();
	    }
	}
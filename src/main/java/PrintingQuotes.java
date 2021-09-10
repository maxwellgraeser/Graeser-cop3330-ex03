/*
 *  UCF COP3330 Fall 2021 Exercise 3 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
public class PrintingQuotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        System.out.print("Who said it? ");
        String author = input.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}

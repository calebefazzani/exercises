package org.example.chapter2;


import java.util.Scanner;

public class PrintingQuotes {
    public String generateQuote(Quote quote, Author author) {
        return author + " says, \""+quote+"\"";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = sc.nextLine();
        System.out.print("Who said it? ");
        String author = sc.nextLine();
        System.out.println(new PrintingQuotes().generateQuote(new Quote(quote), new Author(author)));
    }

    private static class Quote {
        private String value;
        Quote(String value) {
            if(value == null) {
                this.value = "";
            }

            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private static class Author {
        private String value;
        Author(String value) {
            if(value == null) {
                this.value = "";
            }

            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}

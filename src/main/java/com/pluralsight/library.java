package com.pluralsight;
import java.util.Scanner;
import java.util.Arrays;

public class library {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in); 
        String [] books = {
                "Diary of a Wimpy Kid CABIN FEVER", "No, David!", "Wonder", "surrounded by idiots",
                "American Psycho", "The God of Small Things", "To kill a mockingbird",
                "The Diary of a Young Girl", "Pride and Prejudice", "Beloved", "The Book Thief",
                "Brave New World", "The Underground Railroad", "All the Light We Cannot See",
                "Catch-22", "The Call of the Wild", "Fahrenheit 451", "Love in the Time of Cholera",
                "The Lovely Bones", "The Alchemist",

        };
        Arrays.sort(books);
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);

        }

    }
}

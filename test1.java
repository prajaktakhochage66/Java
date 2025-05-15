package Exp5_Test;

import Exp5.Book;
import Exp5.Member;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input for Book
            System.out.println("Enter Book Title:");
            String title = sc.nextLine();
            System.out.println("Enter Book Author:");
            String author = sc.nextLine();
            System.out.println("Enter Book ISBN:");
            String isbn = sc.nextLine();
            Book book = new Book(title, author, isbn);

            // Input for Member
            System.out.println("Enter Member Name:");
            String name = sc.nextLine();
            System.out.println("Enter Member ID:");
            int memberId = Integer.parseInt(sc.nextLine()); // Fix: convert String to int
            Member member = new Member(name, memberId);

            // Display details
            System.out.println("----- Book Details -----");
            book.displayBookDetails(); // Fix: corrected method name
            System.out.println("----- Member Details -----");
            member.displayMemberDetails(); // Fix: corrected method name
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

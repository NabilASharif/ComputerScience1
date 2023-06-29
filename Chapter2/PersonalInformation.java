/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - PersonalInformation.java
Description: 

Write a program that displays the following *
** information, each needs to be on a separate line: 

• Your name
• Your address, with city, state, and ZIP
• Your telephone number
• Your college major

Although these items should be displayed *
** on separate output lines, use only a single *
**println statement in your program. 
*/

public class PersonalInformation {
	
    public static void main(String[] args) {
        String name = "John";
        String address = "1128 Random Street, NY, 10019";
        String telephoneNumber = "646-646-646";
        String collegeMajor = "Computer Science";

        System.out.println(name + "\n" + address + "\n" + telephoneNumber + "\n" + collegeMajor);
    }
}

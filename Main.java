import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Enter a word:");
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    System.out.println(word.length());
    
  }
}

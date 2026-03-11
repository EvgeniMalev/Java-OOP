import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleInfo = scanner.nextLine().split(", ");
        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];
        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            String action = command[0];
            String parameter = command[1];

            switch (action) {
                case "Edit":
                    article.edit(parameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(parameter);
                    break;
                case "Rename":
                    article.rename(parameter);
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }


        System.out.println(article);

        scanner.close();
    }
}

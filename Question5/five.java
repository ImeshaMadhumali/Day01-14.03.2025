import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = (n / 2); i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i =n /2 + 1 ; i <= n ; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}

// Output
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025 (main) $ cd Question5
// @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question5 (main) $ java five
// Enter a number: 9
// 4 3 2 1 5 6 7 8 9 @ImeshaMadhumali ➜ /workspaces/Day01-14.03.2025/Question5 (main) $ java five
// Enter a number: 13
// 6 5 4 3 2 1 7 8 9 10 11 12 13 
import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        int secFor100m = Integer.parseInt(scanner.nextLine());

        double minInSec = minutes * 60 +seconds;
        double timeLow = metres / 120;
        double timeLowTotal = timeLow * 2.5;
        double time = (metres / 100) * secFor100m - timeLowTotal;

        if (time <= minInSec) {
            System.out.printf("Marin Bangiev won an Olympic quota!%nHis time is %.3f.", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", time - minInSec);
        }
    }
}

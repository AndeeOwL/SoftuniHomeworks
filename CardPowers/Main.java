package RankPowers.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        int a = RankPowers.valueOf(cardRank).getValue();
        int b = SuitPowers.valueOf(cardSuit).getValue();

        int power = Card.calculatePower(a,b);
        System.out.printf("Card name: %s of %s; Card power: %d",cardRank,cardSuit,power);
    }
}

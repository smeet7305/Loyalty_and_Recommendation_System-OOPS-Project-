public class TestApp {

    public static void main(String[] args) {

        System.out.println("----- Loyalty & Rewards System Test -----\n");

        // Create users
        User smeet = new SilverUser("U001", "Smeet Sorte", "smeet@mail.com");
        User kush = new GoldUser("U002", "Kush Tokarawat", "kush@mail.com");

        System.out.println("Users created:");
        System.out.println(smeet);
        System.out.println(kush + "\n");

        // Create order for Smeet
        Order order1 = new Order("O100");
        order1.addItem("Pizza", 300);
        order1.addItem("Pasta", 200);

        System.out.println("\nPlacing order for " + smeet.name);
        order1.placeOrder(smeet);

        System.out.println("Updated Points:");
        System.out.println(smeet);

        // Redeem reward
        Reward reward = new Reward("R50", smeet, 30);
        System.out.println("\nTrying to redeem reward for Smeet...");
        reward.redeemReward();

        System.out.println("\nAfter Redemption:");
        System.out.println(smeet);

        // Comparisons (Comparable interface)
        System.out.println("\nComparing Users by points:");
        int comparison = smeet.compareTo(kush);

        if (comparison > 0) {
            System.out.println(smeet.name + " has more points than " + kush.name);
        } else if (comparison < 0) {
            System.out.println(kush.name + " has more points than " + smeet.name);
        } else {
            System.out.println("Both users have equal points.");
        }

        System.out.println("\n----- Test Complete -----");
    }
}

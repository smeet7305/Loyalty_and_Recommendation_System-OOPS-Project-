public class GoldUser extends User {
    private double bonusRate = 1.10; // 10% extra

    public GoldUser(String id, String name, String email) {
        super(id, name, email, "Gold");
    }

    public void accessGoldOffers() {
        System.out.println(name + " accesses Gold benefits.");
    }

    @Override
    public void upgradeTier() {
        if (loyaltyPoints >= 1500) {
            System.out.println("Upgrading " + name + " to Platinum!");
        }
    }
}

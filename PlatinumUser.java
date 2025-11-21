public class PlatinumUser extends User {
    private double bonusRate = 1.20; // 20% bonus

    public PlatinumUser(String id, String name, String email) {
        super(id, name, email, "Platinum");
    }

    public void accessPlatinumOffers() {
        System.out.println(name + " accesses Platinum benefits.");
    }

    @Override
    public void upgradeTier() {
        System.out.println(name + " is already at the highest tier.");
    }
}

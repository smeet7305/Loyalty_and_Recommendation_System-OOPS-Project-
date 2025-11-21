public class SilverUser extends User {
    private double bonusRate = 1.05; // 5% extra points

    public SilverUser(String id, String name, String email) {
        super(id, name, email, "Silver");
    }

    public void accessBasicOffers() {
        System.out.println(name + " accesses Silver benefits.");
    }

    @Override
    public void upgradeTier() {
        if (loyaltyPoints >= 500) {
            System.out.println("Upgrading " + name + " to Gold!");
        }
    }
}

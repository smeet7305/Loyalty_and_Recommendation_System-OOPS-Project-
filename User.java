// User.java
public abstract class User implements Comparable<User> {
    protected String userId;
    protected String name;
    protected String email;
    protected int loyaltyPoints;
    protected String loyaltyTier;

    public User(String userId, String name, String email, String tier) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.loyaltyTier = tier;
        this.loyaltyPoints = 0;
    }

    public void addPoints(int amount) {
        this.loyaltyPoints += amount;
    }

    public boolean redeemPoints(int points) {
        if (points > loyaltyPoints)
            return false;
        loyaltyPoints -= points;
        return true;
    }

    public int getPoints() {
        return loyaltyPoints;
    }

    public abstract void upgradeTier();

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.loyaltyPoints, other.loyaltyPoints);
    }

    @Override
    public String toString() {
        return name + " (" + loyaltyTier + ") - Points: " + loyaltyPoints;
    }
}

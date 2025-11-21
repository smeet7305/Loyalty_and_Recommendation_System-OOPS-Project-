public class Reward {
    private String rewardId;
    private User user;
    private int pointsRequired;

    public Reward(String rewardId, User user, int pointsRequired) {
        this.rewardId = rewardId;
        this.user = user;
        this.pointsRequired = pointsRequired;
    }

    public boolean redeemReward() {
        if (user.redeemPoints(pointsRequired)) {
            System.out.println(user.name + " redeemed reward " + rewardId);
            return true;
        } else {
            System.out.println("Not enough points to redeem reward.");
            return false;
        }
    }
}

public class U1 extends Rocket {
    private long u1Cost = 100000000;
    private final int totalU1Weight = 18000;
    private int u1Weight = 10000;
    private int cargoWeightU1;

    public int getU1Weight() {
        return u1Weight;
    }

    @Override
    public String toString() {
        return "U1{" +
                "Total Weight of the ship=" + totalU1Weight +
                ", U1 Weight=" + u1Weight
                ;
    }

    public void setU1Weight(int u1Weight) {
        this.u1Weight = u1Weight;
    }


    public boolean canCarry(Item item) {
        return u1Weight + item.getWeight() <= totalU1Weight;
    }

    @Override
    public int carry(Item item) {
        return u1Weight += item.getWeight();
    }

    public long getU1Cost() {
        return u1Cost;
    }

    public void setU1CostCost(long cost) {
        this.u1Cost = cost;
    }


    public int getTotalU1Weight() {
        return totalU1Weight;
    }

    public int getCargoWeight() {
        return totalU1Weight - u1Weight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeightU1 = cargoWeight;
    }

    @Override
    public boolean launch() {
        double u1LaunchExplostion = 0.05;
        double chanceOfLaunchExplosionU1 = 0.05 * (double) ((getCargoWeight() / (getTotalU1Weight() - getU1Weight())));
        //Chance of launch explosion = 5% * (cargo carried / cargo limit)
        if (chanceOfLaunchExplosionU1 >= u1LaunchExplostion) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean land() {
        double U1LandExplosion = 0.01;
        //Chance of landing crash = 1% * (cargo carried / cargo limit)
        double chanceOfLandExplosionU1 = 0.01 * (double) ((getCargoWeight() / (getTotalU1Weight() - getU1Weight())));
        if (chanceOfLandExplosionU1 >= U1LandExplosion) {
            return true;
        } else {
            return false;
        }
    }

}

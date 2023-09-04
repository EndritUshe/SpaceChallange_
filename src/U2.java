public class U2 extends Rocket {

    private long u2Cost = 120000000;
    private final int totalU2weight = 29000;
    private int u2Weight = 18000;

    public int getCargoWeightU2() {
        return cargoWeightU2;
    }

    public void setCargoWeightU2(int cargoWeightU2) {
        this.cargoWeightU2 = cargoWeightU2;
    }

    private int cargoWeightU2 = 11000;

    @Override
    public String toString() {
        return "U2{" +
                "Total U2 Weight=" + totalU2weight +
                ", U2 Weight=" + u2Weight +
                '}';
    }

    public long getU2Cost() {
        return u2Cost;
    }

    @Override
    public boolean canCarry(Item item) {
        return u2Weight + item.getWeight() <= totalU2weight;
    }

    @Override
    public int carry(Item item) {
        return u2Weight += item.getWeight();
    }

    public void setU2Cost(long u2Cost) {
        this.u2Cost = u2Cost;
    }

    public int getTotalU2weight() {
        return totalU2weight;
    }

    public int getU2Weight() {
        return u2Weight;
    }

    public void setU2Weight(int u2Weight) {
        this.u2Weight = u2Weight;
    }

    @Override
    public boolean launch() {
        double chanceOfLaunchExplosionU2 = 0.04 * (double) ((getCargoWeightU2() / (getTotalU2weight() - getU2Weight())));

        return true;
    }

    @Override

    public boolean land() {

        double chanceOfLaunchExplosionU2 = 0.08 * (double) ((getCargoWeightU2() / (getTotalU2weight() - getU2Weight())));
        return true;
    }
}

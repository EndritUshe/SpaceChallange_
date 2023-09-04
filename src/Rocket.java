public class Rocket implements SpaceShip {

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }
    //canCarry and carry should be implemented in this class

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public int carry(Item item) {

        return 0;
    }
}

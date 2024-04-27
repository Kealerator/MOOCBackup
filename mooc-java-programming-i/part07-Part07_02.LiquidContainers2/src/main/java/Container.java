public class Container {

    private int liquidContained;

    public Container() {
        this.liquidContained = 0;

    }

    public int contains() {
        return this.liquidContained;
    }

    public void setLiquidContained(int liquidContained) {
        this.liquidContained = liquidContained;
    }

    public void add(int input) {
        if (input >= 0) {
            this.liquidContained += input;
            if (this.liquidContained > 100) {
                this.liquidContained = 100;
            }
        }
    }

    public void remove(int input) {
        if (input >= 0) {
            this.liquidContained -= input;

            if (this.liquidContained < 0) {
                this.liquidContained = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.liquidContained + "/100";
    }

}

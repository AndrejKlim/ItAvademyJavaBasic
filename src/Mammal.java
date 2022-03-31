public class Mammal extends Animal{
    private int boobCount;

    public int getBoobCount() {
        return boobCount;
    }

    public void setBoobCount(final int boobCount) {
        this.boobCount = boobCount;
    }

    public void fillObject(final int boobCount, final int leg){
        this.boobCount = boobCount;
        super.setLeg(leg);
    }
}

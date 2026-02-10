public class Lingkaran extends BidangDuaDimensi {
    private double diameter;
    
    Lingkaran(double diameter) {
        super("Lingkaran");
        setDiameter(diameter);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void luas() {
        System.out.println("Luas lingkaran: " + Math.PI * Math.pow(diameter / 2, 2));
    }

}

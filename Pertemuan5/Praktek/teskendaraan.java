public class teskendaraan {
    public static void main(String[] args) throws Exception {
        venicle kendaraan1 = new venicle();
        bicycle sepeda = new bicycle();
        motorvenicle motor = new motorvenicle(5, "H 123 RR");

        sepeda.ringbell();
        kendaraan1.goStraight();
        kendaraan1.turnleft();
        motor.getLicencePlate();
        motor.getSizeofEngine();
        
    }
}

public class teskendaraan {
    public static void kendaraanmelaju(venicle venicle){
        venicle.goStraight();
    }
    public static void main(String[] args) throws Exception {
        venicle kendaraan1 = new venicle();
        bicycle sepeda = new bicycle();
        motorvenicle motor = new motorvenicle(5, "H 123 RR");
        car toyota = new car();
        motorcycle honda = new motorcycle();

        sepeda.ringbell();
        kendaraan1.goStraight();
        kendaraan1.turnleft();
        motor.getLicencePlate();
        motor.getSizeofEngine();
        toyota.goStraight();
        toyota.setSeatbelt(1);
        System.out.println("setbealt = "+toyota.getseatbelt());
        honda.goStraight();
        honda.setgearfoot(5);
        System.out.println("numgear = "+honda.getgearfoot());
        
    }
}

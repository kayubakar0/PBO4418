import transportasi.car;
import transportasi.bicycle;

public class ujikendaraan {
    public static void main(String[] args) throws Exception {
        car mobil = new car();
        bicycle sepeda = new bicycle();

        sepeda.ringbell();
        mobil.setbealt(3);
        System.out.println("setbealt = "+mobil.getseatbelt());
    }
    
}

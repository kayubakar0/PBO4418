public class motorvenicle {
    int sizeofEng = 1;
    String licencePlate = "H 1 IDN";
    
    public motorvenicle(){
        
    }
    public motorvenicle(int sizeEng, String lcPlate){
        this.sizeofEng = sizeEng;
        this.licencePlate = lcPlate;
    }
    public int getSizeofEngine(){
        return sizeofEng;
    }
    public String getLicencePlate(){
        return licencePlate;
    }
    
}

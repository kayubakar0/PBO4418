package transportasi;

public  class venicle {
    public double speed = 0;
    public String color = "orange";
    
    public venicle(){
        
    }
    public void goStraight(){
        System.out.println("Maju..");
    }
    public void turnleft(){
        System.out.println("Belok Kiri");
    }
    public void turnright(){
        System.out.println("Belok Kanan");
    }
}

public class car extends motorvenicle {
    Boolean seatbelt = false;

    car(){

    }

    public void setSeatbelt(int seatbelt) {
        if (seatbelt == 1) {
            this.seatbelt = true;
        }

    }
    Boolean getseatbelt(){
        return seatbelt;
    }
    
}

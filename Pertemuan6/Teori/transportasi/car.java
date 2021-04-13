package transportasi;

public class car extends venicle {
    Boolean seatbelt = false;

    public car(){

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

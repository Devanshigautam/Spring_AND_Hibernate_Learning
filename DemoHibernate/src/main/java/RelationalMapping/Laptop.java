package RelationalMapping;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    private int lapTopId;

    private String laptopName;


    public int getLapTopId() {
        return lapTopId;
    }

    public void setLapTopId(int lapTopId) {
        this.lapTopId = lapTopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

}

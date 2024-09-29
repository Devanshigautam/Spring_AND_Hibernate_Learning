package RelationalMapping;

import com.hib.DemoHibernate.AlienName;

import javax.persistence.*;

@Entity // To let hibernate know that the data for this table can be stored in data base
@Table(name = "student_table")
public class Student {//POJO

        @Id //Every table should have a primary key. So this annotation lets the hibernate know that following field will be primary key.
        private int id;
        private String name;
        @Column(name = "student_color")
        private String colour;

        @OneToOne
        private Laptop laptop;
        public int getId() {
            return id;
        }

        public void setId(int aid) {
            this.id = aid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}

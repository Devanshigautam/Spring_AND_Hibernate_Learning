package com.hib.DemoHibernate;

import javax.persistence.*;

@Entity // To let hibernate know that the data for this table can be stored in data base
@Table(name = "alien_table")
public class Alien {//POJO

        @Id //Every table should have a primary key. So this annotation lets the hibernate know that following field will be primary key.
        private int aid;

//        @Transient// THis data will not be stored.
        private String name;
        //What if we want to use an Different class or object as name
//    private AlienName name;

        @Column(name = "alien_color")
        private String colour;
        public int getAid() {
            return aid;
        }

        public void setAid(int aid) {
            this.aid = aid;
        }

        public String getName() {
            return name;
        }

        public void setAlienme(String name) {
            this.name = name;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

}

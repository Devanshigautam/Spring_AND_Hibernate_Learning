package com.hib.DemoHibernate;


import javax.persistence.Embeddable;

@Embeddable // This annotation will helps us to create columns in the same table Alien . No separate table will be created. To create separate table @Entity should be used.
public class AlienName {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
    private String middleName;

    private String lastName;


}

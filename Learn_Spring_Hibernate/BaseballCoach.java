package Learn_Spring_Hibernate;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 minutes on batting practice.";
    }
}

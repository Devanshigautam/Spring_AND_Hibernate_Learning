package Learn_Spring_Hibernate;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Run hard 5k";
    }
}

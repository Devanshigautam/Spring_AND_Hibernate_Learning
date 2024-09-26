package Learn_Spring_Hibernate;

public class CricketCoach  implements Coach{
    private FortuneService fortuneService;

    public CricketCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut(){
        return "Run hard 5K";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public String getFortuneService() {
        return this.fortuneService.getFortune();
    }
}

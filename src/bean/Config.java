package bean;

public class Config {
    private static Config config = null;
    private Competitor[] competitors = new Competitor[0];

    public Competitor[] getCompetitors() {
        return competitors;
    }
    
    public void appendCompetitor(Competitor s ){
        Competitor[] newCompetitors = new Competitor[competitors.length+1];
        for (int i = 0; i < competitors.length; i++) {
            newCompetitors[i]= competitors[i];    
        }
        newCompetitors[newCompetitors.length-1] = s;
        
        competitors = newCompetitors;
    }
    
    public static Config instance(){
       if(config == null){
           config = new Config();
       }
       return config;
    }
    
    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }
}

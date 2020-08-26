package bean;

public class Config {
    
    private Competitors[] competitors = new Competitors[0];

    public Competitors[] getCompetitors() {
        return competitors;
    }
    
    public void appendStudent(Competitors s ){
        Competitors[] newCompetitors = new Competitors[competitors.length+1];
        for (int i = 0; i < competitors.length; i++) {
            newCompetitors[i]= competitors[i];    
        }
        newCompetitors[newCompetitors.length-1] = s;
        
        competitors = newCompetitors;
    }
    
    public void setCompetitors(Competitors[] competitors) {
        this.competitors = competitors;
    }
}

public class Activity {
    public String name;
    public double score;
    public double overall;

    public Activity(String x,double b,double c){
        overall = c;
        name = x;
        score = b;
    }

    public double getOverall() {
        return overall;
    }

    public void setOverall(double overall) {
        this.overall = overall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        
        return score;
    }

    public void setScore(double score) {
        
        this.score = score;
    }

    @Override
    public String toString() {
        
        return super.toString();
    }

}

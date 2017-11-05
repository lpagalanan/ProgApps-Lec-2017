public class Activity {
    public String type;
    public double score;

    public Activity(String a,double b){
        type = a;
        score = b;
    }

    public double getScore() {
        return score;
    }

    public String getType() {
        return type;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

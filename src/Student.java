import java.util.ArrayList;

public class Student {
    public String Id, first, last, course;
    public double grade;
    public int year;
    public ArrayList<Activity> activities = new ArrayList();

    public Student(String Id,String first,String last,double grade,String course,int year){
        this.Id = Id;
        this.first = first;
        this.last = last;
        this.grade = grade;
        this.course = course;
        this.year = year;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivity(int a,Activity b) {
        activities.add(a,b);
    }

    public String getFirst(){
        return first;
    }

    public String getId(){
        return Id;
    }

    public String getLast(){
        return last;
    }

    public double getGrade(){
        return grade;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

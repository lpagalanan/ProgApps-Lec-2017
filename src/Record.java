import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Record {
    ArrayList<Student> studs= new ArrayList();
    public Record(){
    }

    public void run() throws Exception{
        studs = Init();

    }

    public ArrayList<Student> Init()throws IOException{
        ArrayList<Student> b= new ArrayList();
        FileReader fileReader = new FileReader("Data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for(int x = 0; bufferedReader.ready() == false; x++){
            String data = bufferedReader.readLine();
            String[] data2 = data.split(",");
            String i = data2[0];
            String f = data2[1];
            String l = data2[2];
            double g = Double.parseDouble(data2[3]);
            String c = data2[4];
            int y = Integer.parseInt(data2[5]);
            Student a = new Student(i,f,l,g,c,y);
            b.add(a);
        }
        return b;
    }
    
    public void showStudent() {
        for (int x=0; x<studs.size(); x++) {
            System.out.println(studs.get(x));
        }
    }

    public static void main(String[] args)throws Exception{
        Record a = new Record();
        a.run();
    }


}

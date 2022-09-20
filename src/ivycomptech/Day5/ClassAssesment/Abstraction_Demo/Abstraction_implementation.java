package ivycomptech.Day5.ClassAssesment.Abstraction_Demo;

public class Abstraction_implementation {


    public static void main(String[] args) {
        AudioFile audioReport=new AudioFile();
        ImageFile imageReport=new ImageFile();
        TextFile textReport=new TextFile();
        audioReport.produceReport();
        imageReport.produceReport();
        textReport.produceReport();

    }
}

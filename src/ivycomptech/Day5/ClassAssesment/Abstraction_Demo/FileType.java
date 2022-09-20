package ivycomptech.Day5.ClassAssesment.Abstraction_Demo;

public abstract class FileType {
    public void openFile()
    {
        System.out.println("this is file open method");
    }

    public void readFile()
    {
        System.out.println("this is read file method");
    }

    public void sendLink()
    {
        System.out.println("link has been send to your email");
    }

    public abstract void produceReport();

}

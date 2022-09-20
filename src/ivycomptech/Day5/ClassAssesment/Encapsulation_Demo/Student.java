package ivycomptech.Day5.ClassAssesment.Encapsulation_Demo;

public class Student {
    private String name;
    private int age;
    private int Standard;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStandard(int standard,int age) {
        if(age==10)
        {
            Standard = standard;
            System.out.println("student admitted to class 4");
        }
        else
        {
            System.out.println("student cannot be admitted to class 4");
        }


    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public int getStandard() {
        return Standard;
    }

    public int getId() {
        return id;
    }
}

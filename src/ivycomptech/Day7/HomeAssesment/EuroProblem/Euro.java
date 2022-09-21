package ivycomptech.Day7.HomeAssesment.EuroProblem;

public class Euro {
    public int val;

    public Euro(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return this.val== ((Euro) obj). val;
    }
    int sum=0;
    public Euro add(Euro fiveEuro,Euro twoEuro)
    {
       sum=fiveEuro.val+twoEuro.val;
       Euro sevenEuro=new Euro(sum);
       return sevenEuro;
    }
}

public class Sutobo extends  Neighbor
{
    public void professionPM_deprecated()
    {
        System.out.println("My name is " + name + " and I will be a PM!");
    }

    @Override
    public void profession()
    {
        System.out.println("My name is " + name + " and I will be a PM, because I am a Sutobo!");
    }

    @Override
    public void showBasicData()
    {
        System.out.println("Name: " + name + ".");
        System.out.println("Age: " + age + ".");
        System.out.println("Street: " + street + ".");
        System.out.println("I am a buckling' proud Sutobo! Yeah!");
    }
}

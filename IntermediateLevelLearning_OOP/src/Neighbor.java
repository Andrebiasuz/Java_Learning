public class Neighbor
{
    // dont use pvsm

    // what do we need to build this mold?
        // name , age, street

    String name ;
    int age;
    String street;

    // Create a public method (everybody can access)
    // Creating a void method, it will not return anything.
    public void hadAFit()
    {
        System.out.println("I had enough with this neighborhood, I am going mad. I will break something");
    }
    // Why parenthesis at the end? So Java knows this is a method.

    // Creating same method but as void and return

    public void briefIntroduction_Void()
    {
        System.out.println("Hello! My name is " + name + ". I live at " + street + ", and my age is " + age + ".");
    }

    public String briefIntroduction_String()
    {
        return ("Hello! My name is " + name + ". I live at " + street + ", and my age is " + age + ".");
    }

    public int yearsToBeNeighborBS(int minimalAgeToAchieveBigShot) {
        return minimalAgeToAchieveBigShot - age;
    }

}

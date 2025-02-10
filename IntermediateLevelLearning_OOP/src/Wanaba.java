public class Wanaba extends Neighbor {

    public void professionEngineer_deprecated()
    {
        System.out.println("I am " + name +  " and I will study engineering and nothing else!");
    }

    // using polymorphism to write profession method

    @Override
    public void profession()
    {
        System.out.println("I am " + name +  " and I will study engineering and nothing else!, because I am a Wanaba");
    }
}

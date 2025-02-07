public class Main {
    public static void main(String[] args) {

        // create Neighbor
        String neighbor_name = "Andre";
        int neighbor_age = 36;
        String neighbor_street = "Alameda das Lamentações";

        // How to create another neighbor?
        // We would have to do it all again.
        // We do not want that

        // So we use objects

        // How objects are made?

        // Everything in life comes from molds, or standards.
        // Bottles comes from bottles molds, etc


        // Molds in programming are called classes

        // So lets build a class for neighbor, a mold for neighbor
        // This will be another class so watch for the folder

        // with the class created, add another neighbor

        // when we initialize an object, we need to call the class that the object will be based upon
        Neighbor Alexandra = new Neighbor();

        // now that we initialized it, we can access the attributes we put on the class (name, age, street)

        Alexandra.name = "Alexandra";
        Alexandra.age = 35;
        Alexandra.street = "São Paulo";

        // So lets make create Andre but using the same mold, the same class.

        Neighbor Andre  = new Neighbor();

        Andre.name = "Andre";
        Andre.age = 36 ;
        Andre.street = "Alameda das Lamentações";

        // Now we can create unlimited objects , with the same molds.

        // METHODS AND PARAMETERS

        // Methods are basically actions that we can do with the objects and its parameters
        // Ex: We can get Andre.name and add a method called toUpper to capitalize the name.
        // It would be Andre.name.toUpper()
        // Lets add a method in the class

        // we create a method so people can express themselves :)
        System.out.println("Andre is pissed and it is expressing himself with a void method:");
        Andre.hadAFit();

        System.out.println();
        // Let's create a method that actually returns something, this is better practice
        // At the same time, we create a method that acts the same but does not return anything
        System.out.println("Using return method");
        String modelOfGoodCitizenIntroduction = Andre.briefIntroduction_String();
        System.out.println(modelOfGoodCitizenIntroduction);

        System.out.println("Using void method");
        Andre.briefIntroduction_Void();

        // Ok, introduction made. But Andre is ambitious, Andre wants to know how many year he has left
        // to be Neighbor Big Shot, or of course Neighbor BS (pun intended), a distinction amongst neighbors.

        // For that we need parameters, basically it is value that will be passed to the class from the object.
        // We will create this in the Neighbor class.
        // We are assuming that the neighbor is a young gun, and it is not fit for Neighbor BS just yet
        System.out.println();
        System.out.println("Using parameters:");
        System.out.println("Andre wants to know how many years until Neighbor BS, but we have to decide ");
        System.out.println("the minimal age for it");

        int andreYearsRemainingForBS = Andre.yearsToBeNeighborBS(50);
        System.out.println("Poor Andre still has to live " + andreYearsRemainingForBS + " years to achieve BS level");






    }
}

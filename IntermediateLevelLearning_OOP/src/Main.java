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


        // PILLARS OF OBJECT ORIENTED PROGRAMMING

        // INHERITANCE
        // Using characteristics of a mother class in a child class to save code and make it agile
        // Ex:  mother class Animal will serve as model (class) for Classes cat, dog, beaver, Monkey, etc.
        // It will INHERIT the mold and its objects, like walking, eating, etc. Things that are COMMON to all
        // animals, or common to all instances of that mother class.

        // POLYMORPHISM

        // To create a unique function that can be utilized by different classes with different characteristics,
        // basically the reducer of IFs statements, according to Dedé
        // https://www.youtube.com/watch?v=Lf3ZV0UsnEo
        // Yeah, I didn't understand and neither did you so, lets put some code into it.

       /*
        public class StreetPlaza {
            public static void main(String[] args) {
                Neighbor Andre = new MaleNeighbor("Andre");
                Neighbor Alexandra = new FemaleNeighbor("Alexandra");

                converse(Andre);  // Output: Andre talks like a man, low pitch voice.
                converse(Alexandra); // Output: Alexandra talks with a slightly high pitch voice.
            }

            public static void converse(Neighbor neighbor) {
                neighbor.talk(); // talk method is called in a polymorphic way
            }
        }*/

        // ENCAPSULATION

        // Basically prevents that any unwanted interaction between the object and the outside world is done.
        // In this way, the object can be encapsulated and used many times without interfering with other code
        // Think about a bottle of beer that doesn't spill on your table. It is not affecting anything, just
        // doing its job. The drink is encapsulated inside the bottle.

        // DEEP DIVE IN INHERITANCE

        // let's create a method in the Neighbor class that says that Andre wants to study engineering.
        // Its deprecated because, well, you will understand later.
        System.out.println();
        System.out.println("Andre showing his crazy intent for engineering but without inheritance");
        Andre.needToStudyEngineeringDeprecated();

        // but wait. In this way, everybody can study engineering.
        // Because this method is in the Neighbor superclass or mother class.
        // There is something I have not told you. We live in an alternative universe
        // People are divided into tribes.
        // Andre is from the Wanaba tribe
        // Alexandra is from the Sutobo tribe
        // Wanabas have an aptitude for engineering. Actually only they can study engineering.
        // Sutobos can not be engineers, but they can be PMs
        // so using this action above (this method) in Alexandra is completely useless. She wants to be a PM.

        // So in this case it makes way more sense to create Wanaba and Sutobo classes.
        // But these people are still neighbors, they'll still have name, age and street. So why write these properties
        // twice if we can use inheritance and create a super class Neighbor? Actually we already have it, how great.
        // we will create 2 more class files.
        // we created male  Wanaba and Sutobo classes., they INHERIT traits from Neighbor.

        // we will create another Andre and Alexandra using these dystopian classes.
        // so the D is for dystopian.

        System.out.println();
        System.out.println("Using inheritance the right way");

        Wanaba AndreD = new Wanaba();
        Sutobo AlexandraD = new Sutobo();

        AndreD.name = "Andre";
        AndreD.age = 36;
        AndreD.street = "Alameda das Lamentações";

        AlexandraD.name = "Alexandra";
        AlexandraD.age = 35;
        AlexandraD.street = "São Paulo";

        AndreD.professionEngineer_deprecated();
        AlexandraD.professionPM_deprecated();

        // to make the infos better documented, lets create a method to show each Neighbor basic infos.
        // Sutobos like to boast. So in the Sutobo subclass write in capitals that people in that class are sutobos
        System.out.println();
        System.out.println("Wanaba quietly showing data");
        AndreD.showBasicData();

        System.out.println();

        System.out.println("Sutobo loudly showing data");
        AlexandraD.showBasicData();


        // INTERFACES

        // Okay, but what about if Andre and Alexandra have a baby?
        // There is nothing preventing that in our universe. The kid can be an engineer and also a PM, right?
        // How to do that in OOP? We use interfaces.

        // If classes are molds, interfaces are windows to methods of different classes.
        // We will create an interface for this kid.
        // The Kid name is Juliana, and she is cute
        // She has the power to be an engineer from her dad, and she has mixed her mothers PM duty with her fathers engineering prowess to become a PO.

        WanabaSutobo Juliana = new WanabaSutobo();

        Juliana.name = "Juliana";
        Juliana.age = 17;
        Juliana.street = "Alameda das Lamentações";

        System.out.println();
        System.out.println("Juliana has grown strong and want to give her personal details and her profession as PO");
        Juliana.showBasicData();
        Juliana.professionPO_deprecated();

        // Also lets highlight that Alexandra has moved to Alameda with her family

        AlexandraD.street = AndreD.street;

        System.out.println();
        AlexandraD.showBasicData();

        // POLYMORPHISM

        // Methods and classes can morph and assume different behaviours.
        // An example, in our universe, every different tribe has its own profession.
        // Wanaba is Engineer, Sutobo is PM, and so on.
        // RN, we are creating every single profession method inside each tribe class
        // Sutobo has professionPM_deprecated(), Wanaba has professionEngineer_deprecated()
        // This is too much code, bc then every different trible we create will have a method like this.
        // we can use polymorphism for that, by creating a method called profession in the Neighbor SuperClass.

        // Showing profession statements using polymorphism

        System.out.println();
        AndreD.profession(); // prints engineer

        System.out.println();
        AlexandraD.profession(); // Prints PM

        System.out.println();
        Juliana.profession(); // prints PO


        // CONSTRUCTORS

        // WAIT, ANDRE wants to be NeighborBS, but there was already 7 people who were that. Maybe we can learn
        // Constructors by creating a class to them. They are also tribe people so we believe they will inhrerit from
        // Neighbor super class.

    }
}


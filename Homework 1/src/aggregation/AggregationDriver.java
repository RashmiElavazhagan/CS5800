package aggregation;

public class AggregationDriver {

    public static void main(String[] args) {
        Instructor nimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor daveJohannsen = new Instructor("Dave", "Johannsen", "8-49");

        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Textbook computerSystems = new Textbook("Computer Systems A Programmer's Perspective", "Bryant", "O'Hallaron");

        Course advancedSwe = new Course("Advanced Software Engineering");
        advancedSwe.addInstructor(nimaDavarpanah);
        advancedSwe.addTextbook(cleanCode);

        Course advancedSweCompArc = new Course("Advanced Computer Architecture");
        advancedSweCompArc.addInstructor(nimaDavarpanah);
        advancedSweCompArc.addInstructor(daveJohannsen);
        advancedSweCompArc.addTextbook(cleanCode);
        advancedSweCompArc.addTextbook(computerSystems);

        advancedSwe.print();
        System.out.println("\n");
        advancedSweCompArc.print();

    }

}

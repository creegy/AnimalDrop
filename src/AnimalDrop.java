public class AnimalDrop {
    String[][] NumberOfCards;
    int drawNumber;
    int upperBound = 20;
    int lowerBound = 10;
    int range = (upperBound + lowerBound) + 1;
    int rand = (int)(Math.random() * range);

    String s = Integer.toString(rand);

}

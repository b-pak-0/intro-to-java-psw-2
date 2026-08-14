
public class parametersClass {
    public int x = 3; // attributes
    public int y = 5;

    public int getX() { // identifier, return type, name, parameters
        return x;
    }

    public int getY() {
        return y;
    }

    public void printInfo(String name, int age, double favoriteDecimal) {
        System.out.println("User's name is " + name + " .");
        System.out.println("They are " + age + " years old.");
        System.out.println("Their favorite decimal number is " + favoriteDecimal);
    }

    public void testStats(String subject, int testScore1, int testScore2, int testScore3) {
        double average = (testScore1 + testScore2 + testScore3) / 3;
        System.out.println("In " + subject + ", you scored an average of " + average);
    }
}

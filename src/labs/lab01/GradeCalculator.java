package labs.lab01;

public class GradeCalculator {

    public static double average(int[] scores) {
        // TODO
        int sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
//        for(int score : scores){
//            sum += score;
//        }
        return (double) sum / scores.length;
    }

    public static int highest(int[] scores) {
        // TODO
        int highestScore = 0;
        for(int score : scores) {
            if (score >= highestScore){
                highestScore = score;
            }
        }
        return highestScore;
    }

    public static int lowest(int[] scores) {
        // TODO
        int lowestScore = scores[0];
        for(int score : scores) {
            if (score <= lowestScore){
                lowestScore = score;
            }
        }
        return lowestScore;
    }

    public static void main(String[] args) {
        int[] scores = {85, 90, 72, 96, 88};

        if (scores == null || scores.length == 0) {
            throw new IllegalArgumentException("Scores cannot be empty");
        }

        System.out.println("Average: " + average(scores));
        System.out.println("Highest: " + highest(scores));
        System.out.println("Lowest: " + lowest(scores));
    }
}
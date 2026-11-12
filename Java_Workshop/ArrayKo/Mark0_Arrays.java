package ArrayKo;

import java.util.ArrayList;

public class Mark0_Arrays {
    void CalculateGrade(ArrayList<Integer> Scores){
        int total = 0;
        int count = 1;

        System.out.println("Scores: ");
        for(int score : Scores ) {
            System.out.println("Quiz " + count + ": " + score);
            total += score;
            count ++;
        }

        System.out.print("\n- Total: " + total);
        System.out.print("\n- Average: " + (total/ Scores.size()));

    }


    void main(String[] args){
    ArrayList<Integer> TubalScores = new ArrayList<>();
    TubalScores.add(90);
        TubalScores.add(78);
        TubalScores.add(85);
        TubalScores.add(93);

    CalculateGrade(TubalScores);

    }

}

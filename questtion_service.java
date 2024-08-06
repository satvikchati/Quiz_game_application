package java_project_1;
import java.util.Arrays;
import java.util.Scanner;


public class questtion_service<questions> {

    questiona[] questions = new questiona[5];
    String selection []= new String[5];

    /* insted of creating the arrays for individual values of
    varables , we just create this kind of object that can stores
    multiple arrays like [5]
    or we can say this is just the array of refrences not the
    real object
    */

    public questtion_service(){


        questions[0] = new questiona(1, "what is the size of INT", "2", "6", "4", "8", "4");
        questions[1] = new questiona(2, "what is the size of DOUBLE", "2", "6", "4", "8", "8");
        questions[2] = new questiona(3, "what is the size of CHAR", "2", "6", "4", "8", "2");
        questions[3] = new questiona(4, "what is the size of  LONG", "2", "6", "4", "8", "8");
        questions[4] = new questiona(5, "what is the size of BOOLEAN ", "1", "2", "4", "8", "1");


    }

    public void Display_and_play_quiz() {

        int i = 0;


        for (questiona que : questions) {

            System.out.println("Question no :" + que.getId());
            System.out.println(que.getQuestion());
            System.out.println(que.getOption_1());
            System.out.println(que.getOption_2());
            System.out.println(que.getOption_3());
            System.out.println(que.getOption_4());
            //System.out.println(que.getAnswer()); dont display the answer

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore()
    {
        int score = 0;

        for ( int i = 0 ;  i < questions.length ; i++){

            questiona QUE = questions [i];
            String actualAnswer = QUE.getAnswer();
            String userAnswer = selection[i];

            if ( actualAnswer . equals(userAnswer)){ // to compair string we use equals method
                score ++;
            }

        }
        System.out.println("your score is :" + score);


        {





        }


    }
}













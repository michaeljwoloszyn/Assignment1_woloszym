package sheridan.assignment1_woloszym.domain;

public class User implements java.io.Serializable {

    private String CompChoice = "";
    private String choiceString = "";
    private String win = "";
    private double random;
    private double choice;

    public User() {
    }

    public double getChoice() {
        return choice;
    }

    public void setChoice(double choice) {
        this.choice = choice;
    }

    public void setRandom(int random) {
        this.random = Math.floor(Math.random() * 3) + 1;
    }

    public void setChoiceString(String choiceString) {
        if(this.choice==1)
            this.choiceString="Rock";
        if(this.choice==2)
            this.choiceString="Paper";
        if(this.choice==3)
            this.choiceString="Scissors";
    }

    public String getChoiceString() {
        return choiceString;
    }


    public String getCompChoice() {
        if(this.random==1)
            return "Rock";
        if(this.random==2)
            return "Paper";
        if(this.random==3)
            return "Scissors";
        return null;
    }

    public String getWin() {
        if(this.choice==this.random)
            return "Tie";
        if(this.choice==1 && this.random==3 || this.choice==2 && this.random==1 || this.choice==3 && this.random==2)
            return "Win";
        if(this.choice==1 && this.random==2 || this.choice==2 && this.random==3 || this.choice==3 && this.random==1)
            return "Lose";
        return null;
    }

    public void setWin(String win) {
        this.win = win;
    }
}
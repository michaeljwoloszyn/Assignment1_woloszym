package sheridan.assignment1_woloszym.domain;

public class User implements java.io.Serializable {

    private String compChoice = "";
    private String choiceString = "";
    private String win = "";
    private double random;
    private double choice;

    public User() {
    }

    public double getChoice() {
        return choice;
    }

    public void setRandom() {
        this.random = Math.floor(Math.random() * 3) + 1;
        if(this.random==1)
            this.compChoice= "Rock";
        if(this.random==2)
            this.compChoice= "Paper";
        if(this.random==3)
            this.compChoice= "Scissors";
    }

    public String getChoiceString() {
        return choiceString;
    }

    public void setChoiceString() {
        if(this.choice==1)
            this.choiceString="Rock";
        if(this.choice==2)
            this.choiceString="Paper";
        if(this.choice==3)
            this.choiceString="Scissors";
    }


    public String getCompChoice() {
        return this.compChoice;
    }


    public String getWin() {
        return this.win;
    }

    public void setWin() {
        if(this.choice==this.random)
            this.win= "It was a tie";
        if(this.choice==1 && this.random==3 || this.choice==2 && this.random==1 || this.choice==3 && this.random==2)
            this.win= "You win";
        if(this.choice==1 && this.random==2 || this.choice==2 && this.random==3 || this.choice==3 && this.random==1)
            this.win= "You lose";
    }
}
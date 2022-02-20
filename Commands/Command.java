package MainPackages.Commands;

public abstract class Command {

    protected String keyword;
    public abstract void run (String[] args);
    public boolean isCorrect(String userInput){
        return userInput.equals(this.keyword);
}
}

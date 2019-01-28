package in.moneyview;

public class Editor {
    SpellCheck spellCheck;

    public void setSpellCheck(SpellCheck spellCheck){
        this.spellCheck=spellCheck;
        System.out.println("Setting SpellCheck");
    }

    public void getSpellCheck(){
        System.out.println("In getter method");
    }

    public void spellCheck(){
        spellCheck.spellChecking();
    }
}

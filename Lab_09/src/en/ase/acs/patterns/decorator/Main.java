package en.ase.acs.patterns.decorator;

public class Main {
    public static void main(String[] args) {

        TextEditor t = new TextEditor("Test", 13);
        t.showText();

        ITextEditor fontT  = new FontDecorator(t,"Arial");
        fontT.showText();
        ITextEditor boldAndFontT = new BoldDecorator(fontT, true);
        boldAndFontT.showText();
    }
}

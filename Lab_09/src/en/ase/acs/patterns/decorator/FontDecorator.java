package en.ase.acs.patterns.decorator;

public class FontDecorator extends ADecorator {
    String font = "Time new Roman";

    public FontDecorator(ITextEditor reference, String font) {
        super(reference);
        this.font = font;
    }

    @Override
    public void showText() {
        System.out.println("Font: " + font);
        this.reference.showText();
    }
}

package en.ase.acs.patterns.decorator;

public class BoldDecorator extends ADecorator{
    boolean isBold = false;

    public BoldDecorator(ITextEditor reference, boolean isBold) {
        super(reference);
        this.isBold = isBold;
    }

    @Override
    public void showText() {
        System.out.println(isBold ? "BOLD" : "NOT BOLD");
        this.reference.showText();
    }
}

package en.ase.acs.patterns.decorator;

public abstract class ADecorator implements ITextEditor {
    ITextEditor reference;

    public ADecorator(ITextEditor reference) {
        this.reference = reference;
    }

}

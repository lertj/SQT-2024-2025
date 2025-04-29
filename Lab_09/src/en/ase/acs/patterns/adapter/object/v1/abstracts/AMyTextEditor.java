package en.ase.acs.patterns.adapter.object.v1.abstracts;

public abstract class AMyTextEditor {
    public String text;
    public int size;

    public AMyTextEditor(){

    }

    public AMyTextEditor(String text, int size) {
        this.text = text;
        this.size = size;
    }

    public abstract void showText();
}

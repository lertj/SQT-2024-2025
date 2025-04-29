package en.ase.acs.patterns.decorator;

public class TextEditor implements ITextEditor{
    public String text;
    public int size;

    public TextEditor(){

    }
    public TextEditor(String text, int size) {
        this.text = text;
        this.size = size;
    }

    public void showText(){
        System.out.println("Text " + text);
        System.out.println("size " + size);
    }
}

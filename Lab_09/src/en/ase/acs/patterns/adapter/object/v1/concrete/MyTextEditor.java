package en.ase.acs.patterns.adapter.object.v1.concrete;

import en.ase.acs.patterns.adapter.object.v1.abstracts.AMyTextEditor;

public class MyTextEditor extends AMyTextEditor {

    public MyTextEditor(String text, int size) {
        super(text, size);
    }

    @Override
    public void showText() {
        System.out.println("Text: " + this.text + "\n Size: "+ this.size);
    }
}

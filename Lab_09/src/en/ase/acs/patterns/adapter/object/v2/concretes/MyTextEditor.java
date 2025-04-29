package en.ase.acs.patterns.adapter.object.v2.concretes;

import en.ase.acs.patterns.adapter.object.v2.abstracts.IMyTextEditor;

public class MyTextEditor implements IMyTextEditor {
    String text;
    int size;

    public MyTextEditor(String text, int size) {
        this.text = text;
        this.size = size;
    }

    @Override
    public void showText() {
        System.out.println("Text: " + this.text + "\n Size: "+ this.size);
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}

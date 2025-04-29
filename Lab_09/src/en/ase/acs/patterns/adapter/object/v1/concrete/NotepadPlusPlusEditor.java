package en.ase.acs.patterns.adapter.object.v1.concrete;

import en.ase.acs.patterns.adapter.object.v1.abstracts.INotepadPlusPlusEditor;

import java.util.Arrays;

public class NotepadPlusPlusEditor implements INotepadPlusPlusEditor {
    String[] text;

    public NotepadPlusPlusEditor(){

    }

    public NotepadPlusPlusEditor(String[] text) {
        this.text = new String[text.length];
        for(int i=0; i<text.length;i++){
            this.text[i] = text[i];
        }
//        this.text = Arrays.copyOf(text, text.length);
    }

    @Override
    public void displayText() {
        Arrays.stream(text).filter(x -> x!=null).forEach(System.out::println);
    }

    @Override
    public String[] getText() {
        return Arrays.copyOf(this.text, this.text.length);
    }

    @Override
    public void setText(String[] text) {
        this.text = Arrays.copyOf(text, text.length);
    }
}

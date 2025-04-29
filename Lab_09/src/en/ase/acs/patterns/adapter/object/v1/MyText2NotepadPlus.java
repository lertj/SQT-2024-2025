package en.ase.acs.patterns.adapter.object.v1;

import en.ase.acs.patterns.adapter.object.v1.abstracts.AMyTextEditor;
import en.ase.acs.patterns.adapter.object.v1.abstracts.INotepadPlusPlusEditor;

public class MyText2NotepadPlus implements INotepadPlusPlusEditor {
    AMyTextEditor editor; //source

    public MyText2NotepadPlus(AMyTextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void displayText() {
        System.out.println("This is the adapter!");
        editor.showText();
    }

    @Override
    public String[] getText() {
        return editor.text.split(" ");
    }

    @Override
    public void setText(String[] text) {
        editor.text = String.join(",", text);
    }
}

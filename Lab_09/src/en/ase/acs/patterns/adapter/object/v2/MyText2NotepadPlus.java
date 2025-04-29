package en.ase.acs.patterns.adapter.object.v2;

import en.ase.acs.patterns.adapter.object.v2.abstracts.IMyTextEditor;
import en.ase.acs.patterns.adapter.object.v2.abstracts.INotepadPlusPlusEditor;

import java.util.Arrays;

public class MyText2NotepadPlus implements INotepadPlusPlusEditor {
    IMyTextEditor editor; //source

    public MyText2NotepadPlus(IMyTextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void displayText() {
        System.out.println("This is the adapter!");
        Arrays.stream(editor.getText().split(" ")).filter(x -> x!=null).forEach(System.out::println);
    }

    @Override
    public String[] getText() {
        return editor.getText().split(" ");
    }

    @Override
    public void setText(String[] text) {
        editor.setText(String.join(",", text));
    }
}

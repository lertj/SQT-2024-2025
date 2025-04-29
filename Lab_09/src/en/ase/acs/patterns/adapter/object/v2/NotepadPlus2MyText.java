package en.ase.acs.patterns.adapter.object.v2;

import en.ase.acs.patterns.adapter.object.v2.abstracts.IMyTextEditor;
import en.ase.acs.patterns.adapter.object.v2.abstracts.INotepadPlusPlusEditor;

public class NotepadPlus2MyText implements IMyTextEditor {
    INotepadPlusPlusEditor reference;

    public NotepadPlus2MyText(INotepadPlusPlusEditor reference) {
        this.reference = reference;
    }

    @Override
    public void showText() {
        System.out.println("This is another adapter!");
        System.out.println(String.join(" ",reference.getText()));
    }

    @Override
    public String getText() {
        return String.join(" ",reference.getText());
    }

    @Override
    public void setText(String text) {
        reference.setText(text.split(" "));
    }
}

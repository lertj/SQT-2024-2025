package en.ase.acs.patterns.adapter.object.v1;

import en.ase.acs.patterns.adapter.object.v1.abstracts.AMyTextEditor;
import en.ase.acs.patterns.adapter.object.v1.abstracts.INotepadPlusPlusEditor;

public class NotepadPlus2MyText extends AMyTextEditor {
    INotepadPlusPlusEditor reference;

    public NotepadPlus2MyText(INotepadPlusPlusEditor reference) {
        this.reference = reference;
    }

    @Override
    public void showText() {
        System.out.println("This is another adapter!");
        reference.displayText();
    }
}

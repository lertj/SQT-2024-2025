package en.ase.acs.patterns.adapter.object.v1;

import en.ase.acs.patterns.adapter.object.v1.abstracts.INotepadPlusPlusEditor;
import en.ase.acs.patterns.adapter.object.v1.concrete.MyTextEditor;
import en.ase.acs.patterns.adapter.object.v1.concrete.NotepadPlusPlusEditor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyTextEditor editor = new MyTextEditor("This is My Editor", 13);
        String[] textArr = new String[20];
        NotepadPlusPlusEditor plusEditor = new NotepadPlusPlusEditor(Arrays.asList("This", "is", "Notepad", "Plus", "Plus").toArray(textArr));

        System.out.println("MyEditor***************");
        editor.showText();
        System.out.println("MyEditor***************\n");

        System.out.println("Notepad++***************");
        plusEditor.displayText();
        System.out.println("Notepad++***************\n");


        List<INotepadPlusPlusEditor> listEditors = new ArrayList<>();
        listEditors.add(plusEditor);
        //listEditors.add(editor); // not possible

        System.out.println("MyText2NotepadAdapter***************");
        MyText2NotepadPlus adapter = new MyText2NotepadPlus(editor);
        adapter.displayText();

        System.out.println("MyText2NotepadAdapter***************\n");

        listEditors.add(adapter); // solution

//        for(INotepadPlusPlusEditor e: listEditors){
//            e.displayText();
//        }

        System.out.println("Notepad2MyTextAdapter***************");
        NotepadPlus2MyText adapter2 = new NotepadPlus2MyText(plusEditor);
        adapter2.showText();
        System.out.println("Notepad2MytextAdapter***************\n");



    }
}

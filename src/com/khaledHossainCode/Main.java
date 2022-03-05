package com.khaledHossainCode;

import com.khaledHossainCode.memento.Editor;
import com.khaledHossainCode.memento.EditorHistory;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new EditorHistory();

        editor.setContent("a");//typing something
        history.push(editor.createState()); // saving it

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop()); //undo
        editor.restore(history.pop()); //undo
        System.out.println(editor.getContent()); // a

    }

}
package org.irsn.javax.swing;

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.Utilities;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class TokenLinkHandler implements MouseMotionListener {
    JTextComponent component = null;
    @Override
    public void mouseMoved(MouseEvent e) {
        //System.out.println("mouse moooved");
        if(e.isControlDown()){
            int offset = component.viewToModel(new Point(e.getX(),e.getY()));
            try {
                component.setSelectionStart(CodeEditorPane.getWordStart(component, offset));
                component.setSelectionEnd(CodeEditorPane.getWordEnd(component, offset));
            }catch (Exception ble){
            }
        }


    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    public TokenLinkHandler(JTextComponent component){
        this.component = component;
    }
}

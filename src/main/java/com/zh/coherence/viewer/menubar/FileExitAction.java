package com.zh.coherence.viewer.menubar;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import com.zh.coherence.viewer.utils.icons.IconLoader;

/**
 * Created by IntelliJ IDEA.
 * User: Живко
 * Date: 06.03.12
 * Time: 0:42
 */
public class FileExitAction extends AbstractAction{
    public FileExitAction() {
        putValue(Action.NAME, "Exit");
        putValue(Action.SMALL_ICON, new IconLoader("icons/exit.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
// =============================================================================
//
//   ChangeAttributeValueAction.java
//
//   Copyright (c) 2001-2006 Gravisto Team, University of Passau
//
// =============================================================================
// $Id: ChangeAttributeValueAction.java 5768 2010-05-07 18:42:39Z gleissner $

/* Generated by Together */

package org.graffiti.editor.actions;

import java.awt.event.ActionEvent;

import org.graffiti.editor.MainFrame;
import org.graffiti.help.HelpContext;
import org.graffiti.plugin.actions.SelectionAction;
import org.graffiti.selection.SelectionEvent;

/**
 * DOCUMENT ME!
 * 
 * @author $Author: gleissner $
 * @version $Revision: 5768 $ $Date: 2006-01-03 17:20:07 +0100 (Di, 03 Jan 2006)
 *          $
 */
public class ChangeAttributeValueAction extends SelectionAction {

    /**
     * 
     */
    private static final long serialVersionUID = 5974809702652784925L;

    /**
     * Creates a new ChangeAttributeValueAction object.
     * 
     * @param mainFrame
     *            DOCUMENT ME!
     */
    public ChangeAttributeValueAction(MainFrame mainFrame) {
        super("action.change.attribute.value", mainFrame);
    }

    /**
     * Returns the help context for the action.
     * 
     * @return HelpContext, the help context for the action
     */
    @Override
    public HelpContext getHelpContext() {
        return null; // TODO
    }

    /**
     * Returns the name represented by a String.
     * 
     * @return String, the name
     */
    @Override
    public String getName() {
        return null; // TODO
    }

    /**
     * DOCUMENT ME!
     * 
     * @param e
     *            DOCUMENT ME!
     */
    public void actionPerformed(ActionEvent e) {
        // TODO
    }

    /**
     * DOCUMENT ME!
     * 
     * @param e
     *            DOCUMENT ME!
     */
    public void selectionChanged(SelectionEvent e) {
        // TODO
    }

    /**
     * Returns <code>true</code>, if this action should survive a focus change.
     * 
     * @return <code>true</code>, if this action should survive a focus change.
     */
    @Override
    public boolean surviveFocusChange() {
        return false;
    }
}

// -----------------------------------------------------------------------------
// end of file
// -----------------------------------------------------------------------------
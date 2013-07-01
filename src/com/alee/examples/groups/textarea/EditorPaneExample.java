/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.examples.groups.textarea;

import com.alee.examples.WebLookAndFeelDemo;
import com.alee.examples.content.DefaultExample;
import com.alee.extended.panel.GroupPanel;
import com.alee.laf.scroll.WebScrollPane;
import com.alee.laf.text.WebEditorPane;

import java.awt.*;

/**
 * User: mgarin Date: 14.02.12 Time: 14:04
 */

public class EditorPaneExample extends DefaultExample
{
    public String getTitle ()
    {
        return "Editor pane";
    }

    public String getDescription ()
    {
        return "Web-styled editor pane";
    }

    public Component getPreview ( WebLookAndFeelDemo owner )
    {
        WebEditorPane editorPane = new WebEditorPane ( "text/html", "<html><b>Some HTML content</b><br>" + "<i>next line</i><br>" +
                "<font color=red>and one more</font><br>" + "and some plain text</html>" );

        WebScrollPane editorPaneScroll = new WebScrollPane ( editorPane );
        editorPaneScroll.setPreferredSize ( new Dimension ( 200, 150 ) );

        return new GroupPanel ( editorPaneScroll );
    }
}
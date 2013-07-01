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

package com.alee.laf;

import com.alee.utils.SystemUtils;

import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * This class returns base fonts for all component types on various OS.
 * This is some kind of workaround since there is no good way to retrieve native component fonts from OS itself.
 * Usually it is native L&F who setup system fonts but inside it simply has hardcoded fonts, which is not really different from my way.
 *
 * @author Mikle Garin
 * @since 1.4
 */

public class WebFonts
{
    /**
     * Control components font (buttons, sliders and such).
     */
    private static final String CONTROL = "control";

    /**
     * Alert dialogs font (usually used for option pane only).
     */
    private static final String ALERT = "alert";

    /**
     * Menu components font.
     */
    private static final String MENU = "menu";

    /**
     * Accelerator text font.
     */
    private static final String ACCELERATOR = "accelerator";

    /**
     * Custom window and internal frame titles font.
     */
    private static final String TITLE = "title";

    /**
     * Text editor components font.
     */
    private static final String TEXT = "text";

    /**
     * Tooltips font.
     */
    private static final String TOOLTIP = "tooltip";

    /**
     * Current system fonts map.
     */
    private static final Map<String, FontUIResource> fonts = new HashMap<String, FontUIResource> ();

    /**
     * Initializing system fonts.
     */
    static
    {
        if ( SystemUtils.isWindows () )
        {
            // Win8
            fonts.put ( CONTROL, new FontUIResource ( "Tahoma", Font.PLAIN, 12 ) );
            fonts.put ( ALERT, new FontUIResource ( "Segoe UI", Font.PLAIN, 13 ) );
            fonts.put ( MENU, new FontUIResource ( "Segoe UI", Font.PLAIN, 12 ) );
            fonts.put ( ACCELERATOR, new FontUIResource ( "Segoe UI", Font.PLAIN, 12 ) );
            fonts.put ( TITLE, new FontUIResource ( "Segoe UI", Font.PLAIN, 14 ) );
            fonts.put ( TEXT, new FontUIResource ( "Tahoma", Font.PLAIN, 12 ) );
            fonts.put ( TOOLTIP, new FontUIResource ( "Segoe UI", Font.PLAIN, 12 ) );

            // Win7
            // todo

            // Older
            // todo
        }
        else if ( SystemUtils.isMac () )
        {
            // Mac OS X
            fonts.put ( CONTROL, new FontUIResource ( "Lucida Grande", Font.PLAIN, 13 ) );
            fonts.put ( ALERT, new FontUIResource ( "Lucida Grande", Font.PLAIN, 11 ) );
            fonts.put ( MENU, new FontUIResource ( "Lucida Grande", Font.PLAIN, 14 ) );
            fonts.put ( ACCELERATOR, new FontUIResource ( "Lucida Grande", Font.PLAIN, 13 ) );
            fonts.put ( TITLE, new FontUIResource ( "Lucida Grande", Font.BOLD, 14 ) );
            fonts.put ( TEXT, new FontUIResource ( "Lucida Grande", Font.PLAIN, 13 ) );
            fonts.put ( TOOLTIP, new FontUIResource ( "Lucida Grande", Font.PLAIN, 11 ) );
        }
        //        else if ( SystemUtils.isUnix () )
        //        {
        //            // todo
        //        }
        //        else if ( SystemUtils.isSolaris () )
        //        {
        //            // todo
        //        }
        else
        {
            // Default font for other OS
            fonts.put ( CONTROL, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
            fonts.put ( ALERT, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
            fonts.put ( MENU, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
            fonts.put ( ACCELERATOR, new FontUIResource ( Font.DIALOG, Font.BOLD, 11 ) );
            fonts.put ( TITLE, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
            fonts.put ( TEXT, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
            fonts.put ( TOOLTIP, new FontUIResource ( Font.DIALOG, Font.BOLD, 12 ) );
        }
    }

    /**
     * Returns system controls font.
     *
     * @return system controls font
     */
    public static FontUIResource getSystemControlFont ()
    {
        return fonts.get ( CONTROL );
    }

    /**
     * Returns system alert dialog font.
     *
     * @return system alert dialog font
     */
    public static FontUIResource getSystemAlertFont ()
    {
        return fonts.get ( ALERT );
    }

    /**
     * Returns system menu font.
     *
     * @return system menu font
     */
    public static FontUIResource getSystemMenuFont ()
    {
        return fonts.get ( MENU );
    }

    /**
     * Returns system accelerator font.
     *
     * @return system accelerator font
     */
    public static FontUIResource getSystemAcceleratorFont ()
    {
        return fonts.get ( ACCELERATOR );
    }

    /**
     * Returns system title font.
     *
     * @return system title font
     */
    public static FontUIResource getSystemTitleFont ()
    {
        return fonts.get ( TITLE );
    }

    /**
     * Returns system text font.
     *
     * @return system text font
     */
    public static FontUIResource getSystemTextFont ()
    {
        return fonts.get ( TEXT );
    }

    /**
     * Returns system tooltip font.
     *
     * @return system tooltip font
     */
    public static FontUIResource getSystemTooltipFont ()
    {
        return fonts.get ( TOOLTIP );
    }
}
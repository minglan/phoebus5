/*
 * Copyright (C) 2020 European Spallation Source ERIC.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package org.phoebus.applications.saveandrestore.ui.search;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import org.phoebus.applications.saveandrestore.Messages;
import org.phoebus.applications.saveandrestore.SaveAndRestoreApplication;
import org.phoebus.applications.saveandrestore.ui.SaveAndRestoreController;
import org.phoebus.applications.saveandrestore.ui.SaveAndRestoreService;
import org.phoebus.applications.saveandrestore.ui.SaveAndRestoreTab;
import org.phoebus.framework.nls.NLS;
import org.phoebus.ui.javafx.ImageCache;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchAndFilterTab extends SaveAndRestoreTab {
    public static final String SEARCH_AND_FILTER_TAB_ID = "SearchAndFilterTab";

    public SearchAndFilterTab(SaveAndRestoreController saveAndRestoreController) {

        setId(SEARCH_AND_FILTER_TAB_ID);
        final ResourceBundle bundle = NLS.getMessages(SaveAndRestoreApplication.class);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(SearchAndFilterTab.class.getResource("SearchAndFilterView.fxml"));
        loader.setResources(bundle);
        loader.setControllerFactory(clazz -> {
            try {
                if (clazz.isAssignableFrom(SearchAndFilterViewController.class)) {
                    return clazz.getConstructor(SaveAndRestoreController.class)
                            .newInstance(saveAndRestoreController);
                } else if (clazz.isAssignableFrom(SearchResultTableViewController.class)) {
                    return clazz.getConstructor()
                            .newInstance();
                }
            } catch (Exception e) {
                Logger.getLogger(SearchAndFilterTab.class.getName()).log(Level.SEVERE, "Failed to instantiate SearchAndFilterViewController", e);
            }
            return null;
        });

        try {
            Node node = loader.load();
            controller = loader.getController();
            setContent(node);
            setOnCloseRequest(event -> ((SearchAndFilterViewController)controller).handleSaveAndFilterTabClosed());
        } catch (IOException e) {
            Logger.getLogger(SearchAndFilterTab.class.getName())
                    .log(Level.SEVERE, "Unable to load search tab content fxml", e);
            return;
        }

        setText(Messages.search);
        setGraphic(new ImageView(ImageCache.getImage(ImageCache.class, "/icons/sar-search_18x18.png")));
    }

    public void filterActivated(String filterName){
        ((SearchAndFilterViewController)controller).filterActivated(filterName);
    }

    public void filterDeactivated(String filterName){
        ((SearchAndFilterViewController)controller).filterDeactivated(filterName);
    }
}

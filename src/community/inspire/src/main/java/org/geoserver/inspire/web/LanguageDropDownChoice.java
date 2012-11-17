/* Copyright (c) 2012 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.inspire.web;

import java.util.List;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.IModel;

public class LanguageDropDownChoice extends DropDownChoice<String> {
    
    private static final long serialVersionUID = 3722333014915584293L;

    public LanguageDropDownChoice(final String id, final IModel<String> model) {
        this(id, model, new AllLanguagesModel());
    }

    public LanguageDropDownChoice(String id, IModel<String> model, IModel<List<String>> choices) {
        super(id, model, choices);
    }
}

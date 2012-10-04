package net.tanoshi.example.client.root;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.ImplementedBy;

@ImplementedBy(RootWidget.class)
public interface RootView extends IsWidget, AcceptsOneWidget {

}

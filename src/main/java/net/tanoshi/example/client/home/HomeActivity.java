package net.tanoshi.example.client.home;

import javax.inject.Inject;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;


public class HomeActivity extends AbstractActivity {

    private HomeView view;

    @Inject
    public HomeActivity(HomeView view) {
        this.view = view;
    }
    
    public Activity init(HomePlace testPlace) {
        return this;
    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        panel.setWidget(view);
    }

}

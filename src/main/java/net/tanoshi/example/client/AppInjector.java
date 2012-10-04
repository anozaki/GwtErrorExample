package net.tanoshi.example.client;

import net.tanoshi.example.client.root.AppConductor;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules({ AppModule.class })
public interface AppInjector extends Ginjector {

    AppConductor getConductor();

}

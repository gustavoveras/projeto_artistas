package br.com.projeto.projetolistaartistas;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by Gustavo Veras
 */

public class PessoaApp  extends Application {

    EventBus eventBus;

    @Override
    public void onCreate() {
        super.onCreate();

        eventBus = new EventBus();
    }

    public org.greenrobot.eventbus.EventBus getEventBus() {
        return eventBus;
    }
}

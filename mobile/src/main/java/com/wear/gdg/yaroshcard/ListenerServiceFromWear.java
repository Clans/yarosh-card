package com.wear.gdg.yaroshcard;

import android.content.Intent;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

public class ListenerServiceFromWear extends WearableListenerService {

    public static final String START_ACTIVITY_PATH = "/com/wear/gdg/yaroshcard/MyPhoneActivity";

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {

        /*
         * Receive the message from wear
         */
        if (messageEvent.getPath().equals(START_ACTIVITY_PATH)) {

            Intent startIntent = new Intent(this, MyPhoneActivity.class);
            startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(startIntent);
        }

    }
}

package com.example.lenovo.android171;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by lenovo on 8/24/2017.
 */

public class MyService extends Service {

    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.barrish);//creating media player
        mediaPlayer.setLooping(true); // Set looping
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();//starting media player
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();//stoping media player
    }

}

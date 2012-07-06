package com.example.mvid;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

    private VideoView videoView;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String httpLiveUrl = "http://devimages.apple.com/iphone/samples/bipbop/gear1/prog_index.m3u8";
        videoView = (VideoView) findViewById(R.id.videoView1);
        videoView.setVideoURI(Uri.parse(httpLiveUrl));
        videoView.setMediaController((MediaController) findViewById(R.id.mediaController1));
        videoView.requestFocus();
        videoView.start();
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}

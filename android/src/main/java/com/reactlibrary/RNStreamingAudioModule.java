
package com.reactlibrary;

import android.media.AudioManager;
import android.media.MediaPlayer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.io.IOException;

public class RNStreamingAudioModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  MediaPlayer mediaPlayer = new MediaPlayer();

  public RNStreamingAudioModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "AudioPlayer";
  }

  @ReactMethod
  public void start(String url, Callback cb) throws IOException {
      String myUri = url;
      mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
      try {
          mediaPlayer.setDataSource(myUri);
      } catch (IOException e) {
          e.printStackTrace();
      }
      try {
          mediaPlayer.prepare();
      } catch (IOException e) {
          e.printStackTrace();
      }

      mediaPlayer.start();
  }

  @ReactMethod
  public void stop() {
      mediaPlayer.stop();
  }
}

package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNStreamingAudioModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNStreamingAudioModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "AudioPlayer";
  }

  @ReactMethod
  public void getDeviceName(Callback cb) {
    try{
      cb.invoke(null, android.os.Build.MODEL);
    }catch (Exception e){
      cb.invoke(e.toString(), null);
    }
  }
}
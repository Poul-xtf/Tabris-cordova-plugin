package org.apache.cordova.my;

import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

public class myPlugins extends CordovaPlugin {
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

//    @Override
//    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
//        return super.execute(action, rawArgs, callbackContext);
//    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        //showToast 是你在JS中调用的方法名；
        Toast.makeText(cordova.getActivity(), "234", Toast.LENGTH_SHORT).show();
        if (action.equals("showToast")){
            //这里可以实现一些你的原生逻辑功能
            Toast.makeText(cordova.getActivity(), args.getString(0), Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
//
//    @Override
//    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws JSONException {
//        return super.execute(action, args, callbackContext);
//    }
}

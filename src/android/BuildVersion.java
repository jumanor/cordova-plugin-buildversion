package cordova.plugin.buildversion;

import android.os.Build;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class BuildVersion extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getVersionSdkInt")) {

            cordova.getThreadPool().execute(new Runnable() {
                public void run() {
                    callbackContext.success(Build.VERSION.SDK_INT);
                }
            });


            return true;
        }
        return false;
    }

}

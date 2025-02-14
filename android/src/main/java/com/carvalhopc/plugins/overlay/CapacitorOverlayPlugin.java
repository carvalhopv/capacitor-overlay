package com.carvalhopv.plugins.overlay;

import android.os.Build;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorOverlay")
public class CapacitorOverlayPlugin extends Plugin {

    public static final String ERROR_MESSAGE_POWER_MANAGER_UNAVAILABLE = "The power manager is not available on this device.";
    public static final String ERROR_CODE_UNAVAILABLE = "unavailable";

    private CapacitorOverlay implementation;

    @Override
    public void load() {
        implementation = new CapacitorOverlay(this);
    }

    @PluginMethod
    public void checkPermission(PluginCall call) {
        try {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                call.reject(ERROR_MESSAGE_POWER_MANAGER_UNAVAILABLE, ERROR_CODE_UNAVAILABLE);
                return;
            }

            boolean hasPermission = false;
            hasPermission = implementation.checkPermission();

            JSObject result = new JSObject();
            result.put("granted", hasPermission);
            call.resolve(result);
        } catch (Exception exception) {
            call.reject(exception.getMessage());
        }
    }

    @PluginMethod
    public void openOverlaySettings(PluginCall call) {
        try {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
                call.reject(ERROR_MESSAGE_POWER_MANAGER_UNAVAILABLE, ERROR_CODE_UNAVAILABLE);
                return;
            }
            implementation.openOverlaySettings();
            call.resolve();
        } catch (Exception exception) {
            call.reject(exception.getMessage());
        }
    }
}

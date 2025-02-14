package com.carvalhopv.plugins.overlay;

import android.provider.Settings;
import android.content.Intent;
import android.net.Uri;

public class CapacitorOverlay {

    private final CapacitorOverlayPlugin plugin;

    public CapacitorOverlay(CapacitorOverlayPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean checkPermission() {

        return  Settings.canDrawOverlays(plugin.getContext());
    }

    public void openOverlaySettings() {

        if (!Settings.canDrawOverlays(plugin.getContext())) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + plugin.getContext().getPackageName()));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            plugin.getContext().startActivity(intent);
        }
    }
}

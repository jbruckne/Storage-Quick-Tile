package com.joebruckner.storagequicktile;

import android.content.Intent;
import android.provider.Settings;
import android.service.quicksettings.TileService;

public class StorageTileService extends TileService {

    public StorageTileService() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onTileAdded() {
        super.onTileAdded();
    }

    @Override
    public void onTileRemoved() {
        super.onTileRemoved();
    }

    @Override
    public void onStartListening() {
        super.onStartListening();
    }

    @Override
    public void onStopListening() {
        super.onStopListening();
    }

    @Override
    public void onClick() {
        super.onClick();

        unlockAndRun(new Runnable() {
            @Override
            public void run() {
                startActivityAndCollapse(new Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS));
            }
        });
    }
}

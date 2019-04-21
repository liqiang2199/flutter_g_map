package io.flutter.plugins;

import android.content.Context;
import android.view.View;

import com.amap.api.maps.MapView;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class GMapViewFactory extends PlatformViewFactory {

    private MapView mapView;

    public GMapViewFactory(MessageCodec<Object> createArgsCodec,MapView mapView) {
        super(createArgsCodec);
        this.mapView = mapView;
    }

    public GMapViewFactory(BinaryMessenger messenger, MapView mapView) {
        super(StandardMessageCodec.INSTANCE);
        this.mapView = mapView;
    }

    @Override
    public PlatformView create(Context context, int i, Object o) {
        return new PlatformView() {
            @Override
            public View getView() {
                return mapView;
            }

            @Override
            public void dispose() {

            }
        };
    }
}

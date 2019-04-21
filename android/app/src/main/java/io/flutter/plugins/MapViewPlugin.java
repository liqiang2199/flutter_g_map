package io.flutter.plugins;

import com.amap.api.maps.MapView;

import io.flutter.plugin.common.PluginRegistry;

public class MapViewPlugin {

    public static void registerWith(PluginRegistry registry, MapView mapView) {
        final String key = MapViewPlugin.class.getCanonicalName();

        if (registry.hasPlugin(key)) return;

        PluginRegistry.Registrar registrar = registry.registrarFor(key);
        registrar.platformViewRegistry().registerViewFactory("mapView"
                , new GMapViewFactory(registrar.messenger(),mapView));
    }
}

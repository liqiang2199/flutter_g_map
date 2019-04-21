package com.empty.flutter_g_map

import android.os.Bundle
import com.amap.api.maps.MapView

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugins.MapViewPlugin

class MainActivity: FlutterActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    val mapview = MapView(this)
    mapview.onCreate(savedInstanceState)
    MapViewPlugin.registerWith(this, mapview)
  }
}

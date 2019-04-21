import 'package:flutter/material.dart';

class HomePageMap extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return new Scaffold(
      appBar: new AppBar(
        title: new Text("测试地图"),
      ),
      body: new AndroidView(viewType: 'mapView'),
    );
  }

}
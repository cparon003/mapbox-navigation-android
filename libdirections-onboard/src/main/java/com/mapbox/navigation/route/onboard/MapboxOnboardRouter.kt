package com.mapbox.navigation.route.onboard

import com.mapbox.geojson.Point
import com.mapbox.navigation.base.route.Router
import com.mapbox.navigation.navigator.MapboxNativeNavigator

class MapboxOnboardRouter(private val navigator: MapboxNativeNavigator) : Router {

    override fun getRoute(
        origin: Point,
        waypoints: List<Point>?,
        destination: Point,
        listener: Router.RouteListener
    ) {
        TODO("not implemented") // To change body of created functions use File | Settings | File Templates.
    }

    override fun cancel() {
        TODO("not implemented")
    }

    class Config {
        fun compile(): String = TODO("not implemented")
    }
}
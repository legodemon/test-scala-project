package test

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import chandu0101.scalajs.facades.leaflet._
import scala.math.BigDecimal
import scala.scalajs.js.annotation.JSExport

object TestScala extends JSApp {

  object settings {
    var lat = 55.7517
    var lng = 37.6170
    var zoom = 12.0
  }

  def tstFn(e: LMouseEvent): Unit = {

  }

  def main(): Unit = {

    val infoVal = jQuery("#infoVal")

    val map = LMap("map")
      .setView(LLatLng(settings.lat, settings.lng), settings.zoom)
      .invalidateSize(true)

    LTileLayer("http://tile.digimap.ru/rumap/{z}/{x}/{y}.png").addTo(map)

    infoVal.html("lat:&nbsp" + settings.lat + "&nbsp;lng:&nbsp;" + settings.lng)

    map.on("mousemove", (e: LMouseEvent) => {

      val lat = BigDecimal(e.latlng.lat).setScale(4, BigDecimal.RoundingMode.HALF_UP).toString()

      val lng = BigDecimal(e.latlng.lng).setScale(4, BigDecimal.RoundingMode.HALF_UP).toString()

      infoVal.html("lat:&nbsp;" + lat + "&nbsp;lng:&nbsp;" + lng)

    })

    map.on("mousemove", tstFn)

  }

}

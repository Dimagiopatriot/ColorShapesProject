package data.shapes

import data.shapes.features.RedColor
import data.shapes.features.YellowColor

interface Shape {
    fun transformShape(color: RedColor): Shape
    fun transformShape(color: YellowColor): Shape
}
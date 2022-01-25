package model.shapes

import model.colors.RedColor
import model.colors.YellowColor

interface Shape {
    fun transformShape(color: RedColor): Shape
    fun transformShape(color: YellowColor): Shape
}
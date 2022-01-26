package data.shapes.frames

import data.shapes.features.Color
import data.shapes.features.RedColor
import data.shapes.features.YellowColor
import data.shapes.Shape
import data.enums.ShapeName.RECTANGLE
import data.shapes.CommonShape

data class Rectangle(override val color: Color) : CommonShape(color) {

    override val shapeName = RECTANGLE

    override fun transformShape(color: RedColor): Shape = this

    override fun transformShape(color: YellowColor): Shape = this
}
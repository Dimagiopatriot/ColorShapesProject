package data.shapes.frames

import data.shapes.features.Color
import data.shapes.features.RedColor
import data.shapes.features.YellowColor
import data.shapes.Shape
import data.enums.ShapeName.CIRCLE
import data.shapes.CommonShape

data class Circle(override val color: Color) : CommonShape(color) {

    override val shapeName = CIRCLE

    override fun transformShape(color: RedColor): Shape = Square(
        YellowColor()
    )

    override fun transformShape(color: YellowColor): Shape = Triangle(
        YellowColor()
    )
}
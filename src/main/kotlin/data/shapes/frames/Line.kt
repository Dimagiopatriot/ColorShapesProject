package data.shapes.frames

import data.shapes.features.Color
import data.shapes.features.RedColor
import data.shapes.features.YellowColor
import data.shapes.Shape
import data.enums.ShapeName.LINE
import data.shapes.CommonShape

data class Line(override val color: Color) : CommonShape(color) {

    override val shapeName = LINE

    override fun transformShape(color: RedColor): Shape = Square(
        YellowColor()
    )

    override fun transformShape(color: YellowColor): Shape = Circle(
        YellowColor()
    )
}
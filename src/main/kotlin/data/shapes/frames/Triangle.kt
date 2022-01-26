package data.shapes.frames

import data.enums.ShapeName.TRIANGLE
import data.shapes.CommonShape
import data.shapes.Shape
import data.shapes.features.Color
import data.shapes.features.RedColor
import data.shapes.features.YellowColor

data class Triangle(override val color: Color): CommonShape(color) {

    override val shapeName = TRIANGLE

    override fun transformShape(color: RedColor): Shape = Rectangle(
        YellowColor()
    )

    override fun transformShape(color: YellowColor): Shape = Line(
        YellowColor()
    )
}
package data.shapes.frames

import data.enums.ShapeName.SQUARE
import data.shapes.CommonShape
import data.shapes.Shape
import data.shapes.features.Color
import data.shapes.features.RedColor
import data.shapes.features.UndefinedColor
import data.shapes.features.YellowColor

data class Square(override val color: Color) : CommonShape(color) {

    override val shapeName = SQUARE

    override fun transformShape(color: RedColor): Shape = Circle(
        UndefinedColor()
    )

    override fun transformShape(color: YellowColor): Shape = Rectangle(
        YellowColor()
    )
}
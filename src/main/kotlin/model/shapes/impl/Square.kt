package model.shapes.impl

import model.colors.Color
import model.colors.RedColor
import model.colors.UndefinedColor
import model.colors.YellowColor
import model.shapes.Shape
import model.shapes.utils.ShapeName.SQUARE

data class Square(override val color: Color) : CommonShape(color) {

    override val shapeName = SQUARE

    override fun transformShape(color: RedColor): Shape = Circle(UndefinedColor())

    override fun transformShape(color: YellowColor): Shape = Rectangle(YellowColor())
}
package model.shapes.impl

import model.colors.Color
import model.colors.RedColor
import model.colors.YellowColor
import model.shapes.Shape
import model.shapes.utils.ShapeName.LINE

data class Line(override val color: Color) : CommonShape(color) {

    override val shapeName = LINE

    override fun transformShape(color: RedColor): Shape = Square(YellowColor())

    override fun transformShape(color: YellowColor): Shape = Circle(YellowColor())
}
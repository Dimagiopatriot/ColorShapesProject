package model.shapes.impl

import model.colors.Color
import model.colors.RedColor
import model.colors.YellowColor
import model.shapes.Shape
import model.shapes.utils.ShapeName.TRIANGLE

data class Triangle(override val color: Color): CommonShape(color) {

    override val shapeName = TRIANGLE

    override fun transformShape(color: RedColor): Shape = Rectangle(YellowColor())

    override fun transformShape(color: YellowColor): Shape = Line(YellowColor())
}
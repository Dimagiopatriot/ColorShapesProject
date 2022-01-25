package model.shapes.impl

import model.colors.Color
import model.colors.RedColor
import model.colors.YellowColor
import model.shapes.Shape
import model.shapes.utils.ShapeName.RECTANGLE

data class Rectangle(override val color: Color) : CommonShape(color) {

    override val shapeName = RECTANGLE

    override fun transformShape(color: RedColor): Shape = this

    override fun transformShape(color: YellowColor): Shape = this
}
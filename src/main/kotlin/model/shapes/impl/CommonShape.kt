package model.shapes.impl

import model.colors.Color
import model.shapes.Shape
import model.shapes.utils.ShapeName

abstract class CommonShape(open val color: Color) : Shape {
    abstract val shapeName: ShapeName
}
package data.shapes

import data.enums.ShapeName
import data.shapes.features.Color

abstract class CommonShape(open val color: Color) : Shape {
    abstract val shapeName: ShapeName
}
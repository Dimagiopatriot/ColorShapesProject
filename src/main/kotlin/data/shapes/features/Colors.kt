package data.shapes.features
import data.enums.ColorName
import data.enums.ColorName.*

open class Color(val colorName: ColorName)

class RedColor: Color(RED)

class YellowColor: Color(YELLOW)

class UndefinedColor: Color(UNDEFINED)
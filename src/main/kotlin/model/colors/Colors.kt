package model.colors
import model.colors.ColorName.*

open class Color(val colorName: ColorName)

class RedColor: Color(RED)

class YellowColor: Color(YELLOW)

class UndefinedColor: Color(UNDEFINED)
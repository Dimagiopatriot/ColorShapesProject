package model.shapes

import model.colors.ColorName
import model.colors.RedColor
import model.colors.UndefinedColor
import model.colors.YellowColor
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import model.colors.ColorName.*
import model.shapes.impl.*
import model.shapes.utils.ShapeName.*
import model.shapes.utils.ShapeName

class ShapeTest {

    private lateinit var subject: Shape

    @Test
    fun `whenYellowDroppedOnSquare thenSubjectIsEqualRectangle thenSubjectColorIsEqualYellow`() {
        whenYellowDroppedOnSquare()
        thenSubjectIsEqual(RECTANGLE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenYellowDroppedOnCircle thenSubjectIsEqualTriangle thenSubjectColorIsEqualYellow`() {
        whenYellowDroppedOnCircle()
        thenSubjectIsEqual(TRIANGLE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenYellowDroppedOnTriangle thenSubjectIsEqualLine thenSubjectColorIsEqualYellow`() {
        whenYellowDroppedOnTriangle()
        thenSubjectIsEqual(LINE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenYellowDroppedOnLine thenSubjectIsEqualCircle thenSubjectColorIsEqualYellow`() {
        whenYellowDroppedOnLine()
        thenSubjectIsEqual(CIRCLE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenRedDroppedOnSquare thenSubjectIsEqualCircle thenSubjectColorIsEqualUndefined`() {
        whenRedDroppedOnSquare()
        thenSubjectIsEqual(CIRCLE)
        thenSubjectColorIsEqual(UNDEFINED)
    }

    @Test
    fun `whenRedDroppedOnCircle thenSubjectIsEqualSquare thenSubjectColorIsEqualYellow`() {
        whenRedDroppedOnCircle()
        thenSubjectIsEqual(SQUARE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenRedDroppedOnTriangle thenSubjectIsEqualRectangle thenSubjectColorIsEqualYellow`() {
        whenRedDroppedOnTriangle()
        thenSubjectIsEqual(RECTANGLE)
        thenSubjectColorIsEqual(YELLOW)
    }

    @Test
    fun `whenRedDroppedOnLine thenSubjectIsEqualSquare thenSubjectColorIsEqualYellow`() {
        whenRedDroppedOnLine()
        thenSubjectIsEqual(SQUARE)
        thenSubjectColorIsEqual(YELLOW)
    }

    /**
     * WHEN
     * */

    private fun whenYellowDroppedOnSquare() {
        subject = Square(UndefinedColor()).transformShape(YellowColor())
    }

    private fun whenYellowDroppedOnCircle() {
        subject = Circle(UndefinedColor()).transformShape(YellowColor())
    }

    private fun whenYellowDroppedOnTriangle() {
        subject = Triangle(UndefinedColor()).transformShape(YellowColor())
    }

    private fun whenYellowDroppedOnLine() {
        subject = Line(UndefinedColor()).transformShape(YellowColor())
    }

    private fun whenRedDroppedOnSquare() {
        subject = Square(UndefinedColor()).transformShape(RedColor())
    }

    private fun whenRedDroppedOnCircle() {
        subject = Circle(UndefinedColor()).transformShape(RedColor())
    }

    private fun whenRedDroppedOnTriangle() {
        subject = Triangle(UndefinedColor()).transformShape(RedColor())
    }

    private fun whenRedDroppedOnLine() {
        subject = Line(UndefinedColor()).transformShape(RedColor())
    }

    /**
     * THEN
     * */

    private fun thenSubjectIsEqual(subjectName: ShapeName) {
        val subjectShape = subject as CommonShape
        assertThat(subjectShape.shapeName, `is`(subjectName))
    }

    private fun thenSubjectColorIsEqual(subjectColorName: ColorName) {
        val subjectShape = subject as CommonShape
        assertThat(subjectShape.color.colorName, `is`(subjectColorName))
    }
}
package model

import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses = mutableListOf<Course?>()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        courses.add(course)

    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.id] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        if (approvedCourses.containsKey(courseCode)) {
        return true}

        else return false
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        return approvedCourses.containsKey(courseCode)
    }

    override fun getApprovedCourses(): List<Course>? {
        val listapproved = mutableListOf<Course>()
        approvedCourses.values.forEach{ course ->
            if (course != null){
                listapproved.add(course)
            }
        }
        return listapproved
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
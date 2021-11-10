package model

class Course(val id: String, val name: String, val credits: Int, val module: Module) {
    override fun toString(): String {
        return ("Course{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", credits=" + credits + ", module="
                + module + '}')
    }
}
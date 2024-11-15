package race

class Car(private var position: PositiveNumber) {
    val movedPosition: PositiveNumber
        get() = position

    companion object {
        private const val MOVE_POSITION = 1
    }

    fun move() {
        position += PositiveNumber(MOVE_POSITION)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        return position == other.position
    }

    override fun hashCode(): Int {
        return position.hashCode()
    }
}

package core

interface Transformation {
    fun transform(input: Entity): Entity
}
package core.a

import core.API.Input1
import core.Entity
import core.Transformation

class I12A() : Transformation {
    override fun transform(input: Entity): Entity {
        val a : Input1 = input as Input1
        val output = EntityA(a.key,a.attr+"A")
        return output
    }
}
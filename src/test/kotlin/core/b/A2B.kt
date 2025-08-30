package core.b

import core.Entity
import core.a.EntityA
import core.Transformation

class A2B() : Transformation {
    override fun transform(input: Entity): Entity {
        val a : EntityA = input as EntityA
        val output = EntityB(a.key,a.attr+"B")
        return output
    }
}
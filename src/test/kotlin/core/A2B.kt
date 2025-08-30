package core

class A2B() : Transformation {
    override fun transform(input: Entity): Entity {
        val a : EntityA = input as EntityA
        val output = EntityB(a.key,a.attr+"End")
        return output
    }
}
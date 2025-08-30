package core

class Test {
    val system = System()
    val nodeA = Node(system, "A")
    val nodeB = NodeB(system)
    fun setup() {
        system.register(nodeB,"A",0)
    }
    fun success() {
        val entity = EntityA("key","Start")

        system.send("A",entity);
    }
}
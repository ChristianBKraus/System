package core

import core.API.*
import core.a.NodeA
import core.b.NodeB
import core.bw.BW


fun main() {
    val system = System()
    val api = API(system)
    val nodeA = NodeA(system)
    val nodeB = NodeB(system)
    val bw = BW(system)

        system.register(nodeA,"1",0)
        system.register(nodeB,"A",0)
        system.register(bw,"A",0)
        system.register(bw,"B",0)

        val input1 = Input1("key","Start")

        api.api1(input1)
        val result = bw.db
}
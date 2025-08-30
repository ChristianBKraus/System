package core.a

import core.Node
import core.System

class NodeA(system: System) : Node(system,"A") {
    init {
        transformations.put("1", I12A())
    }
}
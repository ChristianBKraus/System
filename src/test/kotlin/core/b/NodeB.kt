package core.b

import core.Node
import core.System

class NodeB(system: System) : Node(system,"B") {
    init {
        transformations.put("A", A2B())
    }
}
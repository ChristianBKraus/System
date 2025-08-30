package core

class NodeB(system: System) : Node(system,"B") {
    init {
        transformations.put("A",A2B())
    }
}
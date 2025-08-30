package core

class System {
    val nodes = HashMap<String, ArrayList<Node>>()
    fun register(node: Node, channel: String, priority : Int) {
        // consider priority
        if (! nodes.containsKey(channel)) {
            nodes[channel] = ArrayList()
        }
        nodes[channel]?.add(node)
    }
    fun send(channel: String, entity: Entity) {
        println("SYSTEM " + channel + ":" + entity.key)
        // consider priority
        nodes[channel]?.forEach { node -> node.receive(channel,entity) }
    }
}
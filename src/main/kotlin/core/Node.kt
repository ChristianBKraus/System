package core

open class Node(val system: System, val id: String) {
    protected val transformations = HashMap<String,Transformation>()
    fun receive(channel : String, input: Entity) {
        if (transformations.containsKey(channel)) {
            val output = transformations[channel]!!.transform(input)
            system.send(id, output)
        }
    }
}
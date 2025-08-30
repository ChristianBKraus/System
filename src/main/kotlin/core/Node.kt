package core

open class Node(val system: System, val id: String) {
    protected val transformations = HashMap<String,Transformation>()
    open fun receive(channel : String, input: Entity) {
        println("NODE " + id + "  " + channel + ":" + input.key )
        if (transformations.containsKey(channel)) {
            val output = transformations[channel]!!.transform(input)
            println("TRANSFORM " + input.key + ": " + input.toString() + " -> " + output.toString())
            system.send(id, output)
        }
    }
}
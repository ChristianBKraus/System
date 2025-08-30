package core.bw

import core.*

class BW(system : System) : Node(system,"BW") {
    val db = HashMap<String,ArrayList<Entity>>()
    override fun receive(channel: String, entity: Entity) {
        if (! db.containsKey(channel)) {
            db[channel] = ArrayList<Entity>()
        }
        db[channel]!!.add(entity)
    }
}
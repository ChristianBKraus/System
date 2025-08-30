package core.API

import core.System

class API(val system: System) {
    fun api1(input: Input1) {
        system.send("1",input)
    }
}
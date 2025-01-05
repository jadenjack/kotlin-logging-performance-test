package org.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.system.measureTimeMillis

fun main() {
    val logger: Logger = LoggerFactory.getLogger(Foo::class.java)
    val menu = Foo()
    val varList = VarList((1..10).map { Var() })
    val result = measureTimeMillis {
        for (i in 1..100_000) {
            logger.debug("menu: $menu, var: $varList")
        }
    }
    println("${result}ms")
}

class Foo(
    val foo1: String = "foo1",
    val foo2: String = "foo2",
    val foo3: String = "foo3",
    val foo4: String = "foo4",
    val foo5: String = "foo5",
    val foo6: String = "foo6",
    val foo8: String = "foo8",
    val foo9: String = "foo9",
    val foo10: String = "foo10",
)

data class VarList(
    val list: List<Var>
)

class Var(
    val var1: String = "var1",
    val var2: String = "var2",
    val var3: String = "var3",
    val var4: String = "var4",
    val var5: String = "var5",
    val var6: String = "var6",
    val var7: String = "var7",
    val var8: String = "var8",
    val var9: String = "var9",
    val var10: String = "var10",
)
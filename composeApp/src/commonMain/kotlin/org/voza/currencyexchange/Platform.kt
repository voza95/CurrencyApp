package org.voza.currencyexchange

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
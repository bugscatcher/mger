package com.github.bugscatcher.mger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MgerApplication

fun main(args: Array<String>) {
	runApplication<MgerApplication>(*args)
}

package com.example.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicesApplication

fun main(args: Array<String>) {
	runApplication<MicroservicesApplication>(*args)
}

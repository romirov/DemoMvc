package com.example.demomvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoMvcApplication

fun main(args: Array<String>) {
  runApplication<DemoMvcApplication>(*args)
}

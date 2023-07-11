package com.example.cicd_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiCdTestApplication

fun main(args: Array<String>) {
    runApplication<CiCdTestApplication>(*args)
}

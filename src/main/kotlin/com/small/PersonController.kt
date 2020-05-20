package com.small

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/")
class PersonController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): Flux<Person> {
        return Flux.just(Person("John", "Doe", 12), Person("Amanda", "Doe", 14))
    }
}

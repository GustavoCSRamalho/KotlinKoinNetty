package service

import org.koin.standalone.KoinComponent
import repository.HelloRepository

interface HelloService {
    fun sayHelloWorld(): String
}

class HelloServiceImpl(private val helloRepository: HelloRepository) : HelloService, KoinComponent {
    override fun sayHelloWorld(): String {
        return "Hello ${helloRepository.getHello()}"
    }

}
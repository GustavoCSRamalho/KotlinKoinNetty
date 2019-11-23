package di

import org.koin.dsl.module.module
import repository.HelloRepository
import service.HelloService
import service.HelloServiceImpl

val myModule = module {
    single { HelloServiceImpl(get()) as HelloService }
    single { HelloRepository() }
}
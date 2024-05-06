# Android Shopping 

## Funcionamento e explicação 
O Shop A seria o funcionamento do aplicativo principal servindo como SuperApp da loja A. 

Caso exista o Shop B, ele teria que fazer as configurações do Shop Commons devidas, e implementando as interfaces commons no SuperApp B.

Isso garante que as regras e contratos entre aplicativos serão iguais. 

Para adequação de uso da mesma infraestrutura o recomendado é que cada SuperApp envie um header no Backend e ele tome a devida decisão. 

Caso haja necessidade de cada App implementar features novas e diferentes, se for utilizando as interfaces de Shop-Commons ele será escalável para todas os SuperApps futuros. 



## Instalação e build

Faça o clone do projeto com o seguinte comando:
```bash
git clone git@--SEU_PROJETO--.git

Necessário rodar todos os projetos a task: publishReleasePublicationToMavenLocal
em todos os projetos abaixo
```
## Projetos commons e features

- [shop-commons](https://github.com/gustinoco/shop-commons)
- [shop-cart](https://github.com/gustinoco/shop-cart)
- [shop-login](https://github.com/gustinoco/shop-login)
- [shop-home](https://github.com/gustinoco/shop-home)
- [shop-shopping](https://github.com/gustinoco/shop-shopping)



> Aplicação construida com Clean + MVVM architecture e arquitetura multi-módulo entre features.

## SDK Utilizadas.
- [MVVM Architecture](https://developer.android.com/topic/architecture) - Arquitetura promovendo um desenvolvimento clean.
- [Modularização](https://developer.android.com/topic/modularization) - Sobre modularização de aplicativos escaláveis
- [StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow) - Gerenciamento de estado do kotlin
- [Coroutines](https://developer.android.com/kotlin/coroutines) - Para programação assinncrona
- [Unit Testing](https://developer.android.com/training/testing/unit-testing) - Testes unitários
- [Kotlin](https://kotlinlang.org/) - Linguagem de programação.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Ciclo de vida e classes oberservãveis.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Gerenciar eventos de View.
- [Flow](https://developer.android.com/kotlin/flow) - Para chamadas assincronas em aplicações android.
- [Retrofit](https://square.github.io/retrofit/) - SDK Para chamadas de rede.
- [SplashScreen](https://developer.android.com/develop/ui/views/launch/splash-screen/) - Nova splash



## Architecture
![Architecture](https://github.com/gustinoco/shopA/blob/main/arch_diagram_shop.png)


## Maintainers

Este projeto é mantido por:
* [Tinoco](http://github.com/gustinoco)


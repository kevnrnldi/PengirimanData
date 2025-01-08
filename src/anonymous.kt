fun main (){
    fun hello (name: String, transform : (String) -> String):String{
        val name = transform(name)
        return "Hello $name"
    }


    val upper = fun(value: String): String{
        if(value.isBlank()){
            return "harus diisi"
        }else{
            return value.toUpperCase()
        }
    }
    println(hello("kevin", upper))
    println(hello("", upper))
    println(hello("KeVin", fun(value: String): String{
        return value.toLowerCase()
    }))

    //closure

        var counter: Int = 0
        val lambdaIncrement:() -> Unit = {
            println("lambda increment")
            counter++
        }

    val anonymousIncrement = fun(){
        println("anonuymous increment")
        counter++
    }

    fun functionIncrement(){
        println("function increment")
        counter++
    }

        lambdaIncrement()
        anonymousIncrement()
        functionIncrement()
    println(counter)



}


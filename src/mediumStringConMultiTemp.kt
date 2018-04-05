/**
 * Created by Reptilko on 4/5/2018.
 */
fun main(args: Array<String>) {
    var firstName="Kotlyn"
    var lastName="Fanboi"
    var kotlyn="Kotlin"
    var kotlinMultiLine="""
        | Kotlin
        | Otlin
        | Tlin
        | Lin
        | In
        | N
        """.trimMargin()
    /**
     * multi line string starts with """ and finishes with """.trimMargin(), also
     we use "|" with .trimMargin() that allows us to format code
    **/
    var fullName= firstName+' '+lastName //concatenation of 2 strings and empty space
    println(fullName)

    var stringTemplateExample= "My name is $fullName, and I'm $kotlyn fan!" //string template; we can change value of $fullname and $kotlyn
    println(stringTemplateExample)

    //example of multi line string
    println(kotlinMultiLine)
}
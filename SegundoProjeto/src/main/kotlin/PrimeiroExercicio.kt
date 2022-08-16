import java.time.LocalDate
fun main(){
    var anoatual = LocalDate.now().year

    print(" digite sua idade: ")
    val idade = readln().toInt()

    print(" ja fez aniversário esse ano? s/n : ")
    val resp = readln()

    var nasc: Int
    if (resp == "s"){
        nasc = anoatual - idade
    } else {
        nasc = anoatual - (idade + 1)
    }
    print("O seu ano de nascimento é $nasc")
}
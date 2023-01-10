/*
* Entrada, Processamento e Saída
* Funções com e sem parametros, com e sem retorno
* IF, else
* When (Switch)
*/

//CRIANDO A FUNÇÃO para reutilizar códigos
fun somaTresNumeros(N1: Int, N2: Int, N3: Int): Int{ //ENTRADA
  var soma = N1 + N2 + N3 //PROCESSAMENTO
  return soma  //SAIDA
}

fun somaNumeros(){
  //APRESENTAÇÃO
  println("Soma números")
  //ENTRADA
  println("Digite o 1o número: ")
  val n1 = readLine()!!
  println("Digite o 2o número: ")
  val n2 = readLine()!!
  println("Digite o 3o número: ")
  val n3 = readLine()!!.toInt()
  //PROCESSAMENTO
  
  var soma = somaTresNumeros(n1.toInt(),Integer.parseInt(n2), n3)
  //var soma = n1.toInt() + Integer.parseInt(n2) + n3
  //SAIDA
  println("A soma é $soma")
}

fun imc(){
  //APRESENTAÇÃO
  println("IMC")
  //ENTRADA
  println("Digite a altura (m): ")
  val a = readLine()!!.toFloat()
  println("Digite o peso (kg): ")
  val peso = readLine()!!.toFloat()
  //PROCESSAMENTO
  var imc = peso / (a*a)

  /*var situacao = ""
  if (imc < 17) {
    situacao = "Muito abaixo do peso"
  }else if(imc >= 17 && imc < 18.5){
    situacao = "Abaixo do peso"
  }else if(imc < 25){
    situacao = "Peso normal"
  }else if(imc < 30){
    situacao = "Acima do peso"
  }else if(imc < 35){
    situacao = "Obesidade I"
  }else if(imc < 40){
    situacao = "Obesidade II"
  }else{
    situacao = "Obesidade III"
  }*/
  var situacao =  if (imc < 17) {"Muito abaixo do peso"}
              else if(imc >= 17 && imc < 18.5) {"Abaixo do peso"}
              else if(imc < 25) "Peso normal"
              else if(imc < 30) "Acima do peso"
              else if(imc < 35)"Obesidade I"
              else if(imc < 40) "Obesidade II"
              else "Obesidade III"
  
  //SAIDA
  println("O imc é $imc")
  println("$situacao")
}

/*
fun mediaTurma(){
  println("Digite a quantidade de alunos:")
  val quantAlunos = readLine()!!.toInt()

  //ENTRADA
  var notas = []
  for(var i = 0; i < quantAlunos; i++){
    
  }
  
}
*/

fun main() {
  println("ESCOLHA UMA OPÇÃO")
  println("1 - SOMA NÚMEROS")
  println("2 - IMC")
  println("3 - MEDIA DA TURMA")
  print(">>> ")
  var opc = readLine()!!.toInt()

  /*if (opc == 1){
    somaNumeros()
  } else if(opc == 2){
    imc()
  }*/
  when (opc) {
    1 -> somaNumeros() //arrow function
    2 -> {
      println("\nExecutando IMC...\n")
      imc()
      println("\nFim da execução do IMC...\n")
    } 
    //3 -> mediaTurma() 
    else -> print("Opção inválida")
  }
  print("\n\n")
  main()
}
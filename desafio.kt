enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Aluno(val nome : String, val idade : Int)

data class ConteudoEducacional(val nome: String, val duracaoMin: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()
    
    fun matricular(alunos: List<Aluno>) {
        for(aluno in alunos){
            inscritos.add(aluno)
        }   
    }
    
    fun listarAlunos(){
        for(aluno in inscritos){
        	println("Nome: ${aluno.nome}; Idade: ${aluno.idade}")
    	}
    }
}

fun main() {
    //Criando novos alunos
    
    val aluno1 : Aluno = Aluno("Anthony", 19)
    val aluno2 : Aluno = Aluno("Maria", 29)
    val aluno3 : Aluno = Aluno("Pedro", 47)
    
    //criando Conteudos Educacionais
    
    val conteudo1 : ConteudoEducacional = ConteudoEducacional("conhecendo o Kotlin e Sua Documentação Oficial", 120, Nivel.BASICO)
    val conteudo2 : ConteudoEducacional = ConteudoEducacional("Tratamento de Exceções em Kotlin", 120, Nivel.INTERMEDIARIO)
    val conteudo3 : ConteudoEducacional = ConteudoEducacional("O Poder das Funções em Kotlin", 120, Nivel.BASICO) 
    
    //criando Formacoes
    
    val formacao1 : Formacao = Formacao("Santander Bootcamp 2023 -  Mobile Android com Kotlin", listOf(conteudo1, conteudo2, conteudo3))
    
    //matriculando alunos
    
    formacao1.matricular(listOf(aluno1, aluno2, aluno3))
    
    
    //Listando alunos
    
    formacao1.listarAlunos()
    
    
}
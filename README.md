# Java

### 24. Saída de dados em Java

### 25. Processamento de dados em Java, Casting

<variável> = <expressão><br>
<br>
REGRA:<br>
1) A expressão é calculada;<br>
2) O resultado da expressão é armazenado na variável;<br>
<br>
Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).<br>
Para double use: .0<br>
Para float use: f<br>
<br>
Casting<br>
É a conversão explícita de um tipo para outro.<br>
É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.<br>

### 27. Entrada de dados em Java

Para ler uma palavra: x = sc.next();<br>
<br>
Para ler um número inteiro: x = sc.nextInt();<br>
<br>
Para ler um número com ponto flutuante: x = sc.nextDouble();<br>
<br>
Para ler um caractere: x = sc.next().charAt(0);<br>
<br>
Para ler vários dados na mesma linha:<br>
x = sc.next() -> Lê somente uma palavra.<br>
y = sc.nextInt();<br>
z = sc.nextDouble();<br>
<br>
Para ler um texto ATÉ A QUEBRA DE LINHA:<br>
sc.nextLine() -> Lê a linha inteira<br>
<br>
ATENÇÃO: quebra de linha pendente

Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.

Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().

Solução:
Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.

### 28. Funções matemáticas em Java

### 30. Exercícios

### 33. Expressões comparativas

### 34. Expressões lógicas

### 35. Estrutura condicional (if-else)

### 37. Exercícios

### 38. Sintaxe opcional - operadores de atribuição cumulativa

### 39. Sintaxe opcional - switch-case

Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

### 40. Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

### 41. Escopo e inicialização

• Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
• Uma variável não pode ser usada se não for iniciada.

### 45. Estrutura repetitiva enquanto (while)

É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.

Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

### 46. Teste de mesa com estrutura repetitiva (while)

### 49. Exercícios (while)

### 50. Estrutura repetitiva (for)

### 51. Teste de mesa com estrutura repetitiva for

### 52. Exercícios de testes de mesa com for

### 54. Exercícios (for)

### 55. Estrutura repetitiva (do-while)

Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

### 57. Restrições e convenções para nomes

• Não pode começar com dígito: use uma letra ou _
• Não usar acentos ou til
• Não pode ter espaço em branco
• Sugestão: use nomes que tenham um significado

Convenções
• Camel Case: lastName
• pacotes
• atributos
• métodos
• variáveis e parâmetros
• Pascal Case: ProductService
• classes

### 58. Operadores bitwise

### 59. Funções interessantes para String

• Formatar: toLowerCase(), toUpperCase(), trim()
• Recortar: substring(inicio), substring(inicio, fim)
• Substituir: Replace(char, char), Replace(string, string)
• Buscar: IndexOf, LastIndexOf
• str.Split(" ")

### 60. Comentários em Java (básico)

### 61. Funções (sintaxe)
• Representam um processamento que possui um significado
  • Math.sqrt(double)
  • System.out.println(string)

• Principais vantagens: modularização, delegação e reaproveitamento

• Dados de entrada e saída
  • Funções podem receber dados de entrada (parâmetros ou argumentos)
  • Funções podem ou não retornar uma saída

• Em orientação a objetos, funções em classes recebem o nome de "métodos"

### 64. Resolvendo um problema sem orientação a objetos

### 65. Criando uma classe com três atributos para representar melhor o triângulo

Classe
  • É um tipo estruturado que pode conter (membros):
  • Atributos (dados / campos)
  • Métodos (funções / operações)
  
  • A classe também pode prover muitos outros recursos, tais como:
    • Construtores
    • Sobrecarga
    • Encapsulamento
    • Herança
    • Polimorfismo
  
  • Exemplos:
    • Entidades: Produto, Cliente, Triangulo
    • Serviços: ProdutoService, ClienteService, EmailService, StorageService
    • Controladores: ProdutoController, ClienteController
    • Utilitários: Calculadora, Compactador
    • Outros (views, repositórios, gerenciadores, etc.)

### 66. Criando um método para obtermos os benefícios de reaproveitamento e delegação

Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle?

1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.

2) Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo
da área não deve estar em outro lugar.

### 67. Começando a resolver um segundo problema exemplo

Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
  • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)<br>
  • Realizar uma entrada no estoque e mostrar novamente os dados do produto<br>
  • Realizar uma saída no estoque e mostrar novamente os dados do produto<br>

### 68. Object e toString

Toda classe em Java é uma subclasse da classe Object

Object possui os seguintes métodos:
  getClass- retorna o tipo do objeto
  equals - compara se o objeto é igual a outro
  hashCode - retorna um código hash do objeto
  toString - converte o objeto para string(exercício 67)

  Lembrar:
  String.format("%.2f", price)

### 69. Finalizando o programa

### 70. Exercicio de Fixacao

Rectangle, Employee, Student

### 71. Membros estáticos 

São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do
próprio nome da classe.

Ao criar a classe Calculator, caso não crie os métodos estáticos, será necessário instanciar a classe no programa principal;

Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

### 73. Exercício conversão dolar

### 76. Construtores

• É uma operação especial da classe, que executa no momento da instanciação do objeto;

• Usos comuns:
  • Iniciar valores dos atributos;
  • Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência);

• Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão: Product p = new Product();

• É possível especificar mais de um construtor na mesma classe (_09_construtores_this_sobrecarga_encapsulamento._78_sobrecarga);

### 77. Palavra this

• É uma referência para o próprio objeto;

• Usos comuns:
  • Diferenciar atributos de variáveis locais;
  • Passar o próprio objeto como argumento na chamada de um método ou construtor;

### 78. Sobrecarga

• É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes _10_memoria_arrays_lista._95_listas de parâmetros.

### 79. Encapsulamento

• É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

Regra geral básica
• Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
• Os atributos devem ser acessados por meio de métodos get e _19_generics_set_map._210_set
• Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans

### 81. Modificadores de acesso

• https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html<br>
• private: o membro só pode ser acessado na própria classe;<br>
• (nada): o membro só pode ser acessado nas classes do mesmo pacote;<br>
• protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes;<br>
• public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está);<br>

### 82. Exercício Account

### 087. Tipos referência vs. tipos valor

Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim ponteiros para caixas.

Tipos referência aceitam o valor "null", que indica que a variável aponta pra ninguém.

Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.

Valores padrão
Quando instanciamos uma classe(Product p = new Product()) ou array, são atribuídos valores padrão aos seus elementos:
  números: 0<br>
  boolean: false<br>
  char: caractere código 0<br>
  objeto: null<br>

### 89. Vetores

• Em programação, "vetor" é o nome dado a arranjos unidimensionais<br>

• Arranjo (array) é uma estrutura de dados:<br>
  • Homogênea (dados do mesmo tipo)<br>
  • Ordenada (elementos acessados por meio de posições)<br>
  • Alocada de uma vez só, em um bloco contíguo de memória<br>

• Vantagens:<br>
  • Acesso imediato aos elementos pela sua posição<br>

• Desvantagens:<br>
  • Tamanho fixo<br>
  • Dificuldade para se realizar inserções e deleções<br>

### 91. Exercício de fixação (Rent)

### 92. Boxing, unboxing e wrapper classes

Boxing
  • É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível

Unboxing
  • É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível

Wrapper classes
• São classes equivalentes aos tipos primitivos

• Boxing e unboxing é natural na linguagem

• Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
  • Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO

### 93. Laço for each

### 94. Listas - Parte 1

• Lista é uma estrutura de dados:<br>
  • Homogênea (dados do mesmo tipo)<br>
  • Ordenada (elementos acessados por meio de posições)<br>
  • Inicia vazia, e seus elementos são alocados sob demanda<br>
  • Cada elemento ocupa um "nó" (ou nodo) da lista<br>
<br>
• Tipo (interface): List<br>
• Classes que implementam: ArrayList, LinkedList, etc.<br>
<br>
• Vantagens:<br>
  • Tamanho variável<br>
  • Facilidade para se realizar inserções e deleções<br>
<br>
• Desvantagens:<br>
  • Acesso sequencial aos elementos *<br>

### 95. Listas - Parte 2

• Tamanho da lista: size()<br>
• Obter o elemento de uma posição: get(position)<br>
• Inserir elemento na lista: add(obj), add(int, obj)<br>
• Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)<br>
• Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)<br>
• Filtrar lista com base em predicado:<br>
    List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());<br>
• Encontrar primeira ocorrência com base em predicado:<br>
    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);<br>

### 96. Exercício proposto

Employee

### 98. Matrizes

• Em programação, "matriz" é o nome dado a arranjos bidimensionais
  • Atenção: "vetor de _10_memoria_arrays_lista._89_vetores"

• Arranjo (array) é uma estrutura de dados:
  • Homogênea (dados do mesmo tipo)
  • Ordenada (elementos acessados por meio de posições)
  • Alocada de uma vez só, em um bloco contíguo de memória

• Vantagens:
  • Acesso imediato aos elementos pela sua posição

• Desvantagens:
  • Tamanho fixo
  • Dificuldade para se realizar inserções e deleções

### 99. Matrizes - Exercício resolvido

### 100. Exercício proposto

### 102. Trabalhando com datas - Date

Date<br>

Representa um INSTANTE<br>

Pacote java.util<br>

https://docs.oracle.com/javase/10/docs/api/java/util/Date.html<br>

Um objeto Date internamente armazena:<br>
  • O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)<br>
  • GMT: Greenwich Mean Time (time zone)<br>
  • UTC: Coordinated Universal Time (time standard)<br>

SimpleDateFormat<br>
  • https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html<br>
  • Define formatos para conversão entre Date e String<br>
  • dd/MM/yyyy -> 23/07/2018<br>
  • dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07<br>

Padrão ISO 8601 e classe Instant<br>
  • Formato: yyyy-MM-ddTHH:mm:ssZ<br>
  • Exemplo: "2018-06-25T15:42:07Z"<br>
  • Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));<br>

### 103. Manipulando um Date com Calendar

Somando uma unidade de tempo<br>
Obtendo uma unidade de tempo<br>

### 115. Enumerações

• É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas<br>
• Palavra chave em Java: enum<br>
• Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador<br>
• Referência: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html<br>

Conversão de String para enum

OrderStatus os1 = OrderStatus.DELIVERED;<br>
OrderStatus os2 = OrderStatus.valueOf("DELIVERED");<br>

### 117. Composição

Composição<br>
• É um tipo de associação que permite que um objeto contenha outro<br>
<br>
• Relação "tem-um" ou "tem-vários"<br>

• Vantagens<br>
  • Organização: divisão de responsabilidades<br>
  • Coesão<br>
  • Flexibilidade<br>
  • Reuso<br>

• Nota: embora o símbolo UML para composição (todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e "tem-vários".

### 118. Exercício resolvido Worker

### 120. Exercício resolvido StringBuilder

### 121. Exercício de fixação Order

### 125. Herança

• É um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra<br>
<br>
• Definições importantes<br>
<br>
• Vantagens<br>
  • Reuso<br>
  • Polimorfismo<br>
<br>
• Sintaxe<br>
  • class A extends B<br>
<br>
  • Relação "é-um"<br>
  • Generalização/especialização<br>
  • Superclasse(classe base) / subclasse(classe derivada)<br>
  • Herança / extensão<br>
  • Herança é uma associação entre classes (e não entre objetos)<br>

### 126. Upcasting e downcasting
  
• Upcasting<br>
  • Casting da subclasse para superclasse<br>
  • Uso comum: _14_heranca_polimorfismo._129_polimorfismo<br>
<br>
• Downcasting<br>
  • Casting da superclasse para subclasse<br>
  • Palavra instanceof<br>
  • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)<br>

### 127. Sobreposição, palavra super, anotação @Override

• É a implementação de um método de uma superclasse na subclasse<br>

• É fortemente recomendável usar a anotação @Override em um método sobrescrito<br>
  • Facilita a leitura e compreensão do código<br>
  • Avisamos ao compilador (boa prática)<br>

Palavra super<br>
É possível chamar a implementação da superclasse usando a palavra super.<br>

Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse, e descontar mais 2.0.<br>

@Override<br>
public void withdraw(double amount) {<br>
super.withdraw(amount);<br>
balance -= 2.0;<br>
}<br>

### 128. Classes e métodos final

• Palavra chave: final<br>

• Classe: evita que a classe seja herdada<br>
  
  public final class SavingsAccount {<br>

• Método: evita que o método sob seja sobreposto<br>

Pra quê?<br>

• Segurança: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.<br>
  • Geralmente convém acrescentar final em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências<br>
<br>
• Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.<br>
  • Exemplo clássico: String<br>

### 129. Introdução ao _14_heranca_polimorfismo._129_polimorfismo

Pilares da OOP<br>
  <br>
  • Encapsulamento<br>
  • Herança<br>
  • Polimorfismo<br>
  
Polimorfismo<br>
Em Programação Orientada a Objetos, _14_heranca_polimorfismo._129_polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.
<br>
Account x = new Account(1020, "Alex", 1000.0);<br>
Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);<br>
<br>
x.withdraw(50.0);<br>
y.withdraw(50.0);<br>

Importante entender<br>
• A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).<br>
• O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account)<br>

### 130. Exercício resolvido - Employee

### 131. Exercício de fixação - Product

### 132. Classes abstratas

• São classes que não podem ser instanciadas<br>

• É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata<br>

Exemplo<br>
Suponha que em um negócio relacionado a banco, apenas contas poupança e contas para empresas são permitidas.<br>
Não existe conta comum.<br>
<br>
Para garantir que contas comuns não possam ser instanciadas, basta acrescentarmos a palavra "abstract" na declaração da classe.<br>
<br>
public abstract class Account {<br>
(...)<br>
<br>
Notação UML: itálico<br>

### 133. Métodos abstratos

• São métodos que não possuem implementação.<br>
<br>
• Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação.<br>
<br>
• Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.<br>
<br>
• Notação UML: itálico

### 134. Exercício de fixação - TaxPayer

### 138. Discussão inicial sobre exceções

Exceções<br>
• Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução<br>
<br>
• Em Java, uma exceção é um objeto herdado da classe:<br>
  • java.lang.Exception - o compilador obriga a tratar ou propagar<br>
  • java.lang.RuntimeException - o compilador não obriga a tratar ou propagar<br>
<br>
• Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o
programa seja encerrado<br>
<br>
Por que exceções?<br>
<br>
• O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas<br>
<br>
• Vantagens:<br>
• Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro<br>
<br>
• Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes<br>
<br>
• A exceção pode carregar dados quaisquer<br>

### 139. Estrutura try-catch

• Bloco try<br>
  • Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção<br>
<br>
• Bloco catch<br>
  • Contém o código a ser executado caso uma exceção ocorra<br>
  • Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)<br>

### 140. Pilha de chamadas de métodos (stack trace)

### 141. Bloco finally

• É um bloco que contém código a ser executado independentemente de ter ocorrido ou não uma exceção.<br>
<br>
• Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento.<br>

### 142. Criando exceções personalizadas

### 143. Primeira solução - muito ruim

• Solução 1 (muito ruim): lógica de validação no programa principal<br>
  • Lógica de validação não delegada à reserva<br>

### 144. Segunda solução - ruim

• Solução 2 (ruim): método retornando string<br>
  • A semântica da operação é prejudicada<br>
      Retornar string não tem nada a ver com atualização de reserva<br>
      E se a operação tivesse que retornar um string?<br>
• Ainda não é possível tratar exceções em _09_construtores_this_sobrecarga_encapsulamento._76_construtores<br>
• Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve erro<br>
• A lógica fica estruturada em condicionais aninhadas<br>

### 145. Terceira solução - boa

• Cláusula throws: propaga a exceção ao invés de trata-la<br>
• Cláusula throw: lança a exceção / "corta" o método<br>
• Exception: compilador obriga a tratar ou propagar<br>
• RuntimeException: compilador não obriga<br>
• O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas<br>
• Vantagens:<br>
    Lógica delegada<br>
    Construtores podem ter tratamento de exceções<br>
    Possibilidade de auxílio do compilador (Exception)<br>
    Código mais simples. Não há aninhamento de condicionais: a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch correspondente.<br>
• É possível capturar inclusive outras exceções de sistema<br>

### 146. Exercício de fixação - Account

### 183. Lendo arquivo texto com classes File e Scanner

• File - Representação abstrata de um arquivo e seu caminho<br>
  https://docs.oracle.com/javase/10/docs/api/java/io/File.html<br>
<br>
• Scanner - Leitor de texto<br>
  https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html<br>
<br>
• IOException (Exception)<br>
  https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html<br>

### 184. FileReader e BufferedReader

• FileReader (stream de leitura de caracteres a partir de arquivos)<br>
  https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html<br>
<br>
• BufferedReader (mais rápido)<br>
  https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html<br>
  https://stackoverflow.com/questions/9648811/specific-difference-between-bufferedreader-and-filereader<br>

### 185. Bloco try-with-resources

• É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco<br>
<br>
• Disponível no Java 7 em diante<br>
<br>
• https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html<br>

### 186. FileWriter e BufferedWriter

• FileWriter (stream de escrita de caracteres em de arquivos)<br>
• https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html<br>
<br>
• Cria/recria o arquivo: new FileWriter(path)<br>
• Acrescenta ao arquivo existente: new FileWriter(path, true)<br>
<br>
• BufferedWriter (mais rápido)<br>
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html<br>

### 187. Manipulando pastas com File

### 188. Informações do caminho do arquivo

### 189. Exercício proposto

### 192. Interfaces

A partir do Java 8, _18_interfaces._192_interfaces podem ter "default methods" ou "defender methods"<br>
<br>
Interface é um tipo que define um conjunto de operações que uma classe deve implementar.<br>
<br>
A interface estabelece um contrato que a classe deve cumprir.<br>
<br>
Pra quê _18_interfaces._192_interfaces?<br>
• Para criar sistemas com baixo acoplamento e flexíveis.<br>

### 196. Inversão de controle e injeção de dependência

• Inversão de controle<br>
Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.<br>
<br>
• Injeção de dependência<br>
É uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai". Pode ser
implementada de várias formas:
• Construtor<br>
• Classe de instanciação (builder / factory)<br>
• Container / framework<br>

### 197. Exercício de fixação - Contract

### 199. Herdar vs. cumprir contrato

Aspectos em comum entre herança e _18_interfaces._192_interfaces<br>
• Relação é-um<br>
• Generalização/especialização<br>
• Polimorfismo<br>
<br>
Diferença fundamental<br>
• Herança => reuso<br>
• Interface => contrato a ser cumprido<br>
<br>
E se eu precisar implementar Shape como interface, porém também quiser
definir uma estrutura comum reutilizável para todas figuras?

### 200. Herança múltipla e o problema do diamante

A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.
<br>
Herança múltipla não é permitida na maioria das linguagens!
<br>
Porém, uma classe pode implementar mais de uma interface
<br>
ATENÇÃO:<br>
Isso NÃO é herança múltipla, pois NÃO HÁ REUSO na relação entre ComboDevice e as _18_interfaces._192_interfaces Scanner e Printer.<br>
ComboDevide não herda, mas sim implementa as _18_interfaces._192_interfaces (cumpre o contrato).<br>

### 201. Interface Comparable

https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html<br>
<br>
https://docs.oracle.com/javase/10/docs/api/java/util/Collections.html
<br>
public interface Comparable<T> {<br>
int compareTo (T o);<br>
}<br>
<br>
Method compareTo:<br>
Parameters:<br>
o - the object to be compared.<br>
Returns:<br>
a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.<br>

### 202. Default methods - Implementação inicial

• A partir do Java 8, _18_interfaces._192_interfaces podem conter métodos concretos.<br>

• A intenção básica é prover implementação padrão para métodos, de modo a evitar:<br>
    1) repetição de implementação em toda classe que implemente a interface<br>
    2) a necessidade de se criar classes abstratas para prover reuso da implementação<br>
<br>
• Outras vantagens:<br>
  Manter a retrocompatibilidade com sistemas existentes<br>
  Permitir que "_18_interfaces._192_interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis
<br>
  Considerações importantes<br>
• Sim: agora as _18_interfaces._192_interfaces podem prover reuso<br>
<br>
• Sim: agora temos uma forma de herança múltipla<br>
    Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescreve-lo<br>
<br>
• Interfaces ainda são bem diferentes de classes abstratas.<br>
  Interfaces não possuem recursos tais como _09_construtores_this_sobrecarga_encapsulamento._76_construtores e atributos.<br>

### 205. Introdução aos Generics

• Generics permitem que classes, _18_interfaces._192_interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:<br>
• Reuso<br>
• Type safety<br>
• Performance<br>
• Uso comum: coleções<br>

### 206. Genéricos delimitados - Teste simples com Integer

### 207. Tipos curinga

List<Object> não é o supertipo de qualquer tipo de lista:<br>
List<Object> myObjs = new ArrayList<Object>();<br>
List<Integer> myNumbers = new ArrayList<Integer>();<br>
myObjs = myNumbers; // erro de compilação<br>
<br>
O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:<br>
List<?> myObjs = new ArrayList<Object>();<br>
List<Integer> myNumbers = new ArrayList<Integer>();<br>
myObjs = myNumbers;<br>
<br>
Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":
<br>
Porém não é possível adicionar dados a uma coleção de tipo curinga

### 208. Curingas delimitados

### 209. HashCode e Equals

• São operações da classe Object utilizadas para comparar se um objeto é igual a outro<br>
<br>
• equals: lento, resposta 100%<br>
• hashCode: rápido, porém resposta positiva não é 100%<br>
<br>
• Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. Classes personalizadas precisam sobrepô-las.<br>
<br>
Equals: Método que compara se o objeto é igual a outro, retornando true ou false.<br>
<br>
HashCode: Método que retorna um número inteiro representando um código gerado a partir das informações do objeto<br>
<br>
Regra de ouro do HashCode<br>
<br>
• Se o hashCode de dois objetos for diferente, então os dois objetos são diferentes<br>
<br>
• Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão)<br>

### 210. Set

Set<T><br>
• Representa um conjunto de elementos (similar ao da Álgebra)<br>
• Não admite repetições<br>
• Elementos não possuem posição<br>
• Acesso, inserção e remoção de elementos são rápidos<br>
• Oferece operações eficientes de conjunto: interseção, união, diferença.<br>
<br>
• Principais implementações:<br>
  HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado<br>
  TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)<br>
  LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados<br>
<br>
• https://docs.oracle.com/javase/10/docs/api/java/util/Set.html<br>
<br>
Alguns métodos importantes<br>
<br>
• add(obj), remove(obj), contains(obj)<br>
  Baseado em equals e hashCode<br>
  Se equals e hashCode não existir, é usada comparação de ponteiros<br>
<br>
• clear()<br>
• size()<br>
• removeIf(predicate)<br>
<br>
• addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição<br>
• retainAll(other) - interseção: remove do conjunto os elementos não contitos em other<br>
• removeAll(other) - diferença: remove do conjunto os elementos contidos em other<br>

### 211. Como Set testa igualdade

• Se hashCode e equals estiverem implementados:<br>
  Primeiro hashCode. Se der igual, usa equals para confirmar.<br>
  Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode
<br>
• Se hashCode e equals NÃO estiverem implementados:
  Compara as referências (ponteiros) dos objetos.
<br>

### 212. Como TreeSet compara os elementos

### 213. Exercício resolvido (Set)

### 214. Exercício de fixação (Set)

### 215. Map

• https://docs.oracle.com/javase/10/docs/api/java/util/Map.html<br>
<br>
• É uma coleção de pares chave / valor<br>
  Não admite repetições do objeto chave<br>
  Os elementos são indexados pelo objeto chave (não possuem posição)<br>
  Acesso, inserção e remoção de elementos são rápidos<br>
<br>
• Uso comum: cookies, local storage, qualquer modelo chave-valor<br>
<br>
• Principais implementações:<br>
  HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado<br>
  TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)<br>
  LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados<br>
<br>
Alguns métodos importantes
<br>
• put(key, value), remove(key), containsKey(key), get(key)<br>
  Baseado em equals e hashCode<br>
  Se equals e hashCode não existir, é usada comparação de ponteiros<br>
<br>
• clear()<br>
• size()<br>
<br>
• keySet() - retorna um Set<K><br>
• values() - retorna um Collection<V><br>

### 216. Exercício de fixação (Map)

### 219. Uma experiência com Comparator

Problema<br>
• Suponha uma classe Product com os atributos name e price.<br>
<br>
• Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product><br>
<br>
• Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar, precisaremos alterar a classe Product.
<br>
• Podemos então usar o default method "sort" da interface List:<br>
  default void sort(Comparator<? super E> c)<br>
<br>
Comparator<br>
<br>
https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html<br>
<br>
Veja o método sort na interface List:<br>
https://docs.oracle.com/javase/10/docs/api/java/util/List.html<br>

### 220. Programação funcional e cálculo lambda

Transparência referencial<br>
<br>
Uma função possui transparência referencial se seu resultado for sempre o mesmo para os mesmos dados de entrada.<br>
Benefícios: simplicidade e previsibilidade.<br>
<br>
Funções são objetos de primeira ordem (ou primeira classe)<br>
<br>
Isso significa que funções podem, por exemplo, serem passadas como parâmetros de métodos, bem como retornadas como resultado de métodos.<br>
<br>
No demo2:<br>
Utilizamos aqui<br>
"method references"<br>
Operador ::<br>
Sintaxe:<br>
Classe::método<br>
<br>
O que são "expressões lambda"?<br>
<br>
Em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe.<br>

### 221. Interface funcional
<br>
É uma interface que possui um único método abstrato. Suas implementações serão tratadas como expressões lambda.<br>
<br>
Algumas outras interfaces funcionais comuns<br>
• Predicate<br>
https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
<br>
• Function<br>
https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
<br>
• Consumer<br>
https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
<br>
• Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é esperado ele possa gerar efeitos colaterais



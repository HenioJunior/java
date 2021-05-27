# Java

### 24. Saída de dados em Java

### 25. Processamento de dados em Java, Casting

<variável> = <expressão>

REGRA:
1) A expressão é calculada;
2) O resultado da expressão é armazenado na variável;

Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
Para double use: .0
Para float use: f

Casting
É a conversão explícita de um tipo para outro.
É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.

### 27. Entrada de dados em Java

Para ler uma palavra: x = sc.next();

Para ler um número inteiro: x = sc.nextInt();

Para ler um número com ponto flutuante: x = sc.nextDouble();

Para ler um caractere: x = sc.next().charAt(0);

Para ler vários dados na mesma linha:
x = sc.next() -> Lê somente uma palavra.
y = sc.nextInt();
z = sc.nextDouble();

Para ler um texto ATÉ A QUEBRA DE LINHA:
sc.nextLine() -> Lê a linha inteira


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

• É possível especificar mais de um construtor na mesma classe (sobrecarga);

### 77. Palavra this

• É uma referência para o próprio objeto;

• Usos comuns:
  • Diferenciar atributos de variáveis locais;
  • Passar o próprio objeto como argumento na chamada de um método ou construtor;

### 78. Sobrecarga

• É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

### 79. Encapsulamento

• É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

Regra geral básica
• Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
• Os atributos devem ser acessados por meio de métodos get e set
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
  • Atenção: "vetor de vetores"

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


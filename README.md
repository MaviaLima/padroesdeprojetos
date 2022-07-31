# Padroesdeprojetos
Projeto para montagem de modelos de padrões de projetos GoF

# Packages

# Padrões de criação

  **Singleton** - Garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto grobal de acesso para a mesma.
  
  **Factory Method** - Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. Uma fábrica para cada tipo de objeto. Utilizado quando você não tem a família de produtos bem definida, e desejará expandir a família no futuro. Tem uma maior flexibilidade para expansão de produtos.
  Cria uma instância de várias classes derivadas. Permite a criação de objetos sem saber os detalhes das implementações.
  
  Classes:
    Produto (Abstrato) - Passagem <br>
    Produto Concreto que herda do Produto (especialização da passagem)<br>
    Fábrica (Abstrata)- Criador concreto com um método que retorna um produto concreto (Empresa)<br>
    Fábrica - Criador - que utiliza o metodo criador<br>
    
  **Abstract Factory** - Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Uma fábrica com vários métodos de criação, um método para cada tipo de produto. Utilizado para família de produtos bem definidas. 
  
  **Builder** - Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações. Possui intensão de incapsular processos complexos de montagem de objetos.
  
  **Prototype** - Especificar os tipos de objetos a serem criados usando uma instância protótipo e criar novos objetos pela cópia deste protótipo.
  Instância inicilizada a ser copiada ou clonada. Fazer clones de objetos.
  
  Iremos implementar diversas notas musicais que serão clonadas numa partitura
  
  


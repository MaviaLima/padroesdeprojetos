# Padroesdeprojetos
Projeto para montagem de modelos de padr�es de projetos GoF

# Packages

# Padr�es de cria��o

  **Singleton** - Garantir que uma determinada classe tenha uma, e somente uma inst�ncia, mantendo um ponto grobal de acesso para a mesma.
  
  **Factory Method** - Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. Uma f�brica para cada tipo de objeto. Utilizado quando voc� n�o tem a fam�lia de produtos bem definida, e desejar� expandir a fam�lia no futuro. Tem uma maior flexibilidade para expans�o de produtos.
  Cria uma inst�ncia de v�rias classes derivadas. Permite a cria��o de objetos sem saber os detalhes das implementa��es.
  
  Classes:
    Produto (Abstrato) - Passagem <br>
    Produto Concreto que herda do Produto (especializa��o da passagem)<br>
    F�brica (Abstrata)- Criador concreto com um m�todo que retorna um produto concreto (Empresa)<br>
    F�brica - Criador - que utiliza o metodo criador<br>
    
  **Abstract Factory** - Fornecer uma interface para cria��o de fam�lias de objetos relacionados ou dependentes sem especificar suas classes concretas. Uma f�brica com v�rios m�todos de cria��o, um m�todo para cada tipo de produto. Utilizado para fam�lia de produtos bem definidas. 
  
  **Builder** - Separar a constru��o de um objeto complexo da sua representa��o de modo que o mesmo processo de constru��o possa criar diferentes representa��es. Possui intens�o de incapsular processos complexos de montagem de objetos.
  
  **Prototype** - Especificar os tipos de objetos a serem criados usando uma inst�ncia prot�tipo e criar novos objetos pela c�pia deste prot�tipo.
  Inst�ncia inicilizada a ser copiada ou clonada. Fazer clones de objetos.
  
  Iremos implementar diversas notas musicais que ser�o clonadas numa partitura
  
  


# Padroesdeprojetos
Projeto para montagem de modelos de padr�es de projetos GoF

# Packages

# Padr�es de cria��o

  *Singleton* - Garantir que uma determinada classe tenha uma, e somente uma inst�ncia, mantendo um ponto grobal de acesso para a mesma.
  
  *Factory Method* - Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. Uma f�brica para cada tipo de objeto.
  Cria uma inst�ncia de v�rias classes derivadas. Permite a cria��o de objetos sem saber os detalhes das implementa��es
  
  Classes:
    Produto (Abstrato) - Passagem
    Produto Concreto que herda do Produto (especializa��o da passagem)
    F�brica (Abstrata)- Criador concreto com um m�todo que retorna um produto concreto (Empresa)
    F�brica - Criador - que utiliza o metodo criador


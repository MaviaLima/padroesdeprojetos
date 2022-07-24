# Padroesdeprojetos
Projeto para montagem de modelos de padrões de projetos GoF

# Packages

# Padrões de criação

  *Singleton* - Garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto grobal de acesso para a mesma.
  
  *Factory Method* - Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. Uma fábrica para cada tipo de objeto.
  Cria uma instância de várias classes derivadas. Permite a criação de objetos sem saber os detalhes das implementações
  
  Classes:
    Produto (Abstrato) - Passagem
    Produto Concreto que herda do Produto (especialização da passagem)
    Fábrica (Abstrata)- Criador concreto com um método que retorna um produto concreto (Empresa)
    Fábrica - Criador - que utiliza o metodo criador


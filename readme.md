     Template Method
                          Padrões Comportamentais
O padrão Template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do mesmo.
Motivação (Por que utilizar?)
O padrão Template Method auxilia na definição de um algoritmo que contém algumas de suas partes definidas por métodos abstratos. 
Subclasses são responsáveis por implementar as partes abstratas deste algoritmo. 
Tais partes poderão ser implementadas de formas distintas, ou seja, cada subclasse irá implementar conforme sua necessidade. 
Deste modo a superclasse posterga algumas implementações para que sejam feitas por suas subclasses.
Aplicabilidade (Onde utilizar?)
O padrão Template Method é utilizado quando:
•	Um algoritmo deve ser dividido em etapas, 
porém algumas destas etapas podem ser implementadas de formas diferentes.
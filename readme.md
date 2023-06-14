     Template Observer
       Padrões Comportamentais
   O Observer é um padrão de projeto de software que define uma dependência um-para-muitos entre objetos, 
de modo que quando um objeto muda seu estado, 
   todos seus dependentes são notificados e atualizados automaticamente.
Exemplo de implementação de uma Newsletter onde clientes, 
   funcionários, parceiros e fornecedores podem se inscrever para receber emails de notícias 
   sobre a determinada empresa.

    O padrão Observer é muito utilizado em sistemas de janelas gráficas,
    onde um componente gráfico pode se inscrever para receber notificações de eventos de mouse ou teclado,
    por exemplo, e então executar uma ação específica quando este evento ocorrer.
    O padrão Observer é também a base para o padrão MVC (Model-View-Controller),
    onde a View (visão) representa os observadores e o Model (modelo) representa o observado.
    O padrão Observer é também conhecido como Publisher-Subscriber (publicador-assinante).
    O padrão Observer é implementado em diversas bibliotecas e sistemas, como por exemplo:
    java.util.Observer, java.util.EventListener, javax.servlet.http.HttpSessionBindingListener,
    javax.servlet.http.HttpSessionAttributeListener, entre outros.
    O padrão Observer é um padrão comportamental, ou seja, ele é usado para definir a comunicação entre objetos
    de uma forma mais flexível e desacoplada.
    O padrão Observer define uma dependência um-para-muitos entre objetos,
    de modo que quando um objeto muda seu estado, todos seus dependentes são notificados e atualizados automaticamente.


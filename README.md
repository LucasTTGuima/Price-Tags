# Price Tags 💸

Este programa foi desenvolvido com base no curso de Java do professor Nelio Alves, na plataforma UDEMY.

Programa feito em JAVA, simula o funcionamento de uma loja que trabalha com produtos de 3 tipos: Normais, Usados e Importados.
A ideia é desenvolver conhecimento em Herança e Polimorfismo. 

### Herança: 
- Na criação das classes, a classe Product atua como a classe principal, tendo suas subclasses: ImportedProduct e UsedProduct.
- A classe ImportedProduct possui uma taxa de importação "customsFee" e um método diferente "totalPrice" que retorna uma soma do preço com a taxa de importação.
- A classe UsedProduct possui uma data de fabricação "manufactureDate".

### Polimorfismo: 
- Está presente nos métodos "priceTag", utilizando o @Override.
- Em Product ele imprime somente o nome e o preço do produto.
- Em ImportedProduct ele imprime o nome e o preço, já com a taxa de importação embutida, e também o valor dessa taxa a parte.
- Em UsedProduct ele imprime o nome e o preço, além da data de manufatura e uma tag que indica que o produto é usado.

### Funcionamento: 
1) O programa pergunta quantos produtos serão cadastrados.
2) Inicia o cadastro de produtos, perguntando o tipo (normal, usado ou importado), nome e preço.
3) Dependendo do tipo ele pergunta: data de fabricação (Usado) ou taxa de importação (Importado).
4) Após preencher todos os produtos, o programa apresenta as etiquetas, de acordo com cada tipo.
5) O programa encerra.

### Tecnologias usadas: 
- Java
- Eclipse/SpringBoot

### Autor
Lucas Guimarães 

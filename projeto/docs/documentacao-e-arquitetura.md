# 





</div>

# Introdução e Objetivos

Uma lanchonete precisa de um software para automatizar o processo de criação de seus produtos, dentre eles, diferentes tipos de sanduíches e acompanhamentos, como batatas fritas, ovos fritos, molhos, bacon e refrigerantes. 
</br>Um problema enfrentado pela lanchonete consiste na personalização, pois há dias específicos em que ocorrem promoções e são vendidos combos especiais, que incluem sanduíches e acompanhamentos. 
</br> O software também deve registrar as vendas do dia. 

## Visão geral dos requerimentos

<div class="formalpara-title">

**Conteúdo**

</div>

Software deve permitir acessar a lista de pedidos do dia ou total (feature "Arrecadamento") e fazer novos pedidos de acordo com o desejo do cliente (feature "Novo Pedido"). 
A feature "Novo Pedido" registra os elementos do pedido do cliente, bem como o valor do pedido.

Elementos do Pedido

| Nome   |  Descrição       
|-------------|----------------|
| Sanduíche | Refeição principal |
| Acompanhamento| Refeição extra ou ingrediente adicional ao sanduíche |
| Bebida | Acompanhamento líquido |

Opções de Sanduíches

| Nome   |  Descrição   | 
|-------------|----------------|
| Classic Burger | 1 hambúrger de carne bovina 150g, queijo cheddar, alface, tomate, cebola caramelizada, maionese, mostarda, pão de hambúrguer |
| Frango BBQ| Peito de frango grelhado 100g, Bacon, Queijo suíço, Alface, Tomate, Molho barbecue, Maionese, Pão integral |
| Veggie Burger| Hambúrguer vegetariano de grãos 150g, Queijo feta, Abacate, Rúcula, Tomate, Cebola roxa, Maionese de alho, Pão de trigo integral |
| Peixe Bliss| Filé de peixe empanado 100g, Repolho roxo ralado, Molho tártaro, Tomate, Picles, Pão de centeio |

Opções de Acompanhamentos

| Nome   |  Sanduíches aplicáveis       
|-------------|----------------|
| Batatas Fritas Tradicionais | Classic Burger, Frango BBQ, Veggie Burger, Peixe Bliss |
| Batatas Fritas com Bacon| Classic Burger, Frango BBQ, Peixe Bliss |
| Milkshake de Baunilha | Classic Burger, Frango BBQ |
| Milkshake de Chocolate | Classic Burger, Frango BBQ |
| Onion Rings | Classic Burger, Frango BBQ, Peixe Bliss |
| Salada de Frutas Frescas | Veggie Burger |
| Smoothie Verde | Veggie Burger |
| Salada de Couve com Molho de Limão | Veggie Burger |
| Chips de Batata-Doce Assados | Classic Burger, Frango BBQ, Peixe Bliss |

Opções de Bebidas

| Nome   |  Descrição       
|-------------|----------------|
| Coca-Cola Lata 250 mL | Refrigerante |
| Coca-Cola 600 mL| Refrigerante |
| Coca-Cola 2L | Refrigerante |
| Limonada com Hortelã 250 mL| Suco |
| Suco de Maçã com Canela 250 mL| Suco |
| Limonada com Morango 250 mL| Suco |
| Suco de Abacaxi com Hortelã 250 mL| Suco |
| Água com Gás e Limão 250 mL| Água |
| Água de Coco Natural 250 mL| Água |
| Suco de Maracujá com Gengibre 250 mL| Suco |

Opções de Combos

| Nome   |  Descrição       
|-------------|----------------|
| Burger Bliss Combo | Classic Burger, Batatas Fritas Tradicionais, Onion Rings, Coca-Cola Lata 250mL |
| BBQ Combo| Frango BBQ, Batatas Fritas com Bacon, Onion Rings, Limonada com Morango 250mL |
| Green Combo | Veggie Burger, Saladas de Frutas Frescas, Smoothie Verde, Limonada com Hortelã 250mL |
| Oceanic Combo | Peixe Bliss, Chips de Batata-Doce Assados, Salada de Couve com Molho de Limão, Milkshake de Baunilha |

Tabela de Preços

| Acompanhamento   |  Preço R$     
|-------------|----------------|
| Batatas Fritas Tradicionais | 8,00 |
| Batatas Fritas com Bacon| 10,00 |
| Milkshake de Baunilha | 15,00 |
| Milkshake de Chocolate | 15,00 |
| Onion Rings | 10,00 |
| Salada de Frutas Frescas | 11,00 |
| Smoothie Verde | 12,00 |
| Salada de Couve com Molho de Limão | 11,00 |
| Chips de Batata-Doce Assados | 10,00 |

| Bebida   |  Preço R$     
|-------------|----------------|
| Coca-Cola Lata 250 mL | 5,00 |
| Coca-Cola 600 mL| 8,00 |
| Coca-Cola 2L | 12,00 |
| Limonada com Hortelã 250 mL | 6,00 |
| Suco de Maçã com Canela 250 mL | 6,00 |
| Limonada com Morango 250 mL | 6,00 |
| Suco de Abacaxi com Hortelã | 6,00 |
| Água com Gás e Limão 250 mL | 4,00 |
| Água de Coco Natural 250 mL | 4,00 |
| Suco de Maracujá com Gengibre 250 mL | 6,00 |

| Sanduíche   |  Preço R$     
|-------------|----------------|
| Classic Burger | 32,00 |
| Frango BBQ| 30,00 |
| Veggie Burger | 28,00 |
| Peixe Bliss | 30,00 |

| Combo  |  Preço R$     
|-------------|----------------|
| Burger Bliss Combo | 50,00 |
| BBQ Combo| 50,00 |
| Green Combo | 50,00 |
| Oceanic Combo | 50,00 |





Processo - Novo Pedido


![Design BPMN - Pagina 1](https://github.com/LuisaoBR/ds-2023-02/assets/109095266/6c64a1ed-8bcd-4747-b0e0-ff343976a5bc)





Diagrama UML de Classes


![Design - UML](https://github.com/LuisaoBR/ds-2023-02/assets/109095266/26faf5ac-8d15-4dc1-92a4-900d124d9544)


<div class="formalpara-title">

**Motivação**

</div>

Facilitar o armazenamento dos pedidos feito para referência do negócio e o funcionamento do caixa, que pode facilmente pedir um combo ou um pedido com várias modificações.

## Objetivos de qualidade

<div class="formalpara-title">

**Conteúdos**

</div>



<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



## Stakeholders


| Nome   |  Expectativas       
|-------------|----------------|
| Gerente da lanchonete | Consegue acessar e entender a função arrecadamento |
| Operador de caixa | Consegue acessar e entender a função "novo pedido" |
| Cliente | Consegue solicitar ao Operador de caixa o uso da função "novo pedido" |

Mapeamento de Personas

Gerente:

![Persona_ Gerente](https://github.com/LuisaoBR/ds-2023-02/assets/109095266/763a530f-bec1-49ca-85f4-61b862036283)


Operador de Caixa:



![Persona_ Operador de Caixa](https://github.com/LuisaoBR/ds-2023-02/assets/109095266/63b89065-f951-4c49-869e-e7862477305f)


Cliente:



![Persona_ Cliente](https://github.com/LuisaoBR/ds-2023-02/assets/109095266/57b37a50-b047-4c92-b06e-eb2f5b009cc6)


# Architecture Constraints

<div class="formalpara-title">

**Contents**

</div>



<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



See [Architecture Constraints](https://docs.arc42.org/section-2/) in the
arc42 documentation.

# Escopo de Sistema e Contexto

<div class="formalpara-title">

**Conteúdo**

</div>

Sistema Windows 10 que roda localmente em um computador pessoal e armazena dados localmente, sem contato via internet com outro sistemas.
<div class="formalpara-title">

**Motivação**

</div>

Como o sistema só atende um único negócio, não é necessário a comunicação com outros sistemas.

<div class="formalpara-title">



## Technical Context

<div class="formalpara-title">

**Contents**

</div>



<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



**\<Diagram or Table>**

**\<optionally: Explanation of technical interfaces>**

**\<Mapping Input/Output to Channels>**

# Solution Strategy

<div class="formalpara-title">

**Contents**

</div>


<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



# Building Block View

<div class="formalpara-title">

**Content**

</div>


<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



## Whitebox Overall System



***\<Overview Diagram>***



### \<Name black box 1>



*\<Purpose/Responsibility>*

*\<Interface(s)>*

*\<(Optional) Quality/Performance Characteristics>*

*\<(Optional) Directory/File Location>*

*\<(Optional) Fulfilled Requirements>*

*\<(optional) Open Issues/Problems/Risks>*

### \<Name black box 2>

*\<black box template>*

### \<Name black box n>

*\<black box template>*

### \<Name interface 1>

…

### \<Name interface m>

## Level 2



### White Box *\<building block 1>*



*\<white box template>*

### White Box *\<building block 2>*

*\<white box template>*

…

### White Box *\<building block m>*

*\<white box template>*

## Level 3



### White Box \<\_building block x.1\_\>



*\<white box template>*

### White Box \<\_building block x.2\_\>



### White Box \<\_building block y.1\_\>


# Runtime View

<div class="formalpara-title">

**Contents**

</div>



<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



## \<Runtime Scenario 1>

-   *\<insert runtime diagram or textual description of the scenario>*

-   *\<insert description of the notable aspects of the interactions
    between the building block instances depicted in this diagram.>*

## \<Runtime Scenario 2>

## …

## \<Runtime Scenario n>

# Deployment View

<div class="formalpara-title">

**Content**

</div>


<div class="formalpara-title">

**Motivation**

</div>



## Infrastructure Level 1



***\<Overview Diagram>***

Motivation  
*\<explanation in text form>*

Quality and/or Performance Features  
*\<explanation in text form>*

Mapping of Building Blocks to Infrastructure  
*\<description of the mapping>*

## Infrastructure Level 2




### *\<Infrastructure Element 1>*

*\<diagram + explanation>*

### *\<Infrastructure Element 2>*

*\<diagram + explanation>*

…

### *\<Infrastructure Element n>*

*\<diagram + explanation>*

# Cross-cutting Concepts

<div class="formalpara-title">

**Content**

</div>



<div class="formalpara-title">

**Motivation**

</div>


<div class="formalpara-title">

**Form**

</div>



<div class="formalpara-title">

**Structure**

</div>



## *\<Concept 1>*

*\<explanation>*

## *\<Concept 2>*

*\<explanation>*

…

## *\<Concept n>*

*\<explanation>*

# Architecture Decisions

<div class="formalpara-title">

**Contents**

</div>


<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



# Quality Requirements

<div class="formalpara-title">

**Content**

</div>



<div class="formalpara-title">

**Motivation**

</div>



## Quality Tree

<div class="formalpara-title">

**Content**

</div>


<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



## Quality Scenarios

<div class="formalpara-title">

**Contents**

</div>



<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>

Tabular or free form text.

# Risks and Technical Debts

<div class="formalpara-title">

**Contents**

</div>


<div class="formalpara-title">

**Motivation**

</div>



<div class="formalpara-title">

**Form**

</div>



# Glossário

<div class="formalpara-title">

**Conteúdos**

- Bebida: "bebida" é um item do menu que os clientes podem selecionar para incluir em seus pedidos, representado como uma entidade com atributos como nome, descrição e preço, tal qual produto, e também tipo, como chá, refrigerante, água ou suco.

</div>



<div class="formalpara-title">

**Motivation**

</div>



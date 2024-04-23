<img src="./imgs/gif v1.gif" min-width="400px" max-width="400px" width="400px" align="right" alt="Computador iuriCode">
<p>
  <div align="right"> 
<a href="./README.md"> <img src="./imgs/LogoUK.png" alt="Logo UK" width="30"/></a><a href="./leiame.md"> <img src="./imgs/logoBrazil.png" alt="Logo Brasil" width="30"/> </a>
</div>
  <H1><b>Election Control System - SORRAB </b> </H1>

<p align="left">  
 System created for Java AI Powered DIO.
<br>
</p>

<p>
  🦄 <b>Main Technologies</b><br>
</p>

<ul>
<li>

**Java 17**: We will use the latest LTS version of Java to take advantage of the latest innovations that this robust and widely used language offers;
</li>
<li>

**Quarkus**: A **Java framework** native to **Kubernetes**, optimized for **container**, **cloud**, and **serverless** environments. Developed by **Red Hat**, Quarkus combines **imperative** and **reactive** code paradigms. It specifically tailors Java for containers, making it an effective platform for serverless, cloud, and Kubernetes environments. 🚀
</li>
<li>

**Spring Boot 3**: We will work with the newest version of Spring Boot, which maximizes developer productivity through its powerful self-configuration premise;
</li>
<li>

**Spring Data JPA**: We will explore how this tool can simplify our data access layer, facilitating integration with SQL databases;
</li>
<li>

**OpenAPI (Swagger)**: We will create effective and easy-to-understand API documentation using OpenAPI (Swagger), perfectly aligned with the high productivity that Spring Boot offers;
</li>
<li>

**Railway**: facilitates the deployment and monitoring of our solutions in the cloud, in addition to offering several databases as a service and CI/CD pipelines.
</li>
</ul>

<b>Class Diagram</b><br>
```mermaid
classDiagram
    class User {
        -String name
        -Account Account
        -Feature[] features
        -Loan loan
        -News[] news
    }
    class Account {
        -String AccountNumber
        -String AccountAgency
        -Float AccountBalance
        -Float AccountLimit
        -Integer NumberOfInstallments
    }
    class Feature {
        -String icon
        -String description
    }
    class Loan {
        -String number
        -Float limit
    }
    class News {
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "N" Loan
    User "1" *-- "N" News
```


<p align="left">
  💌 For more information contact us: ⤵️
</p>

<p align="left">
  <a href="mailto:vicssb@gmail.com" alt="Gmail" target = "_blank">
  <img src="https://img.shields.io/badge/-Gmail-FF0000?style=flat-square&labelColor=FF0000&logo=gmail&logoColor=white&link=mailto:vicssb@gmail.com" /></a>

  <a href="https://www.linkedin.com/in/victor-sergio-silva-barros/" alt="Linkedin" target = "_blank">
  <img src="https://img.shields.io/badge/-Linkedin-0e76a8?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/victor-sergio-silva-barros/" /></a>

  <a href="https://wa.me/+5512987085327" alt="WhatsApp" target = "_blank">
  <img src="https://img.shields.io/badge/-WhatsApp-25d366?style=flat-square&labelColor=25d366&logo=whatsapp&logoColor=white&link=https://wa.me/+5512987085327"/></a>

  </p>  

<p>Please follow github and join us!
Thanks for visiting and happy coding!</p>




# mapeamento @ManyToOne - JPA:

A Ideia desta POC é demonstrar por meio de um exemplo prático o comportamento do @ManyToOne e @OneToMany com função secundária e desta forma ser um material de consulta.

Para o exemplo em questão uma pessoa pode ter várias experiências profissionais.

Abaixo o mapeamento da tabela Pessoa:


![image](https://github.com/conradocjo/pocmanytoone/assets/29169349/b9d67acb-55a2-4694-bc4f-e440aa86cde0)


Abaixo o mapeamento da tabela de experiência profissional:


![image](https://github.com/conradocjo/pocmanytoone/assets/29169349/a590a95c-dc3b-4095-a892-755d24636825)



O Código gerado apartir do JPA, reproduzido por meio de um diagrama de banco de dados:

![image](https://github.com/conradocjo/pocmanytoone/assets/29169349/b24d3caf-0fa5-43fc-bf30-47de196ebdc2)


É possível perceber que é gerado uma nova tabela que interligará as duas tabelas, curso e pessoa.

![image](https://github.com/conradocjo/pocmanytoone/assets/29169349/67757946-3f16-40ef-b7a5-dc43762177b9)

![image](https://github.com/conradocjo/pocmanytoone/assets/29169349/cda98398-85fe-4c49-ad67-1de39c0918d8)





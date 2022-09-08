/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carro;

/**
 *
 * @author luciano
 */
public class Carro {
    //atributos
       private String marca;
       private String cor;
       private String combustivel;
       private String nome;

    public String getMarca(){
           return marca;
    }
        public void setMarca(String marca){
            this.marca = marca; 
        }
    public String getCor(){
           return cor;
    }
        public void setCor(String cor){
            this.cor = cor; 
        }
    public String getCombustivel(){
           return combustivel;
    }
        public void setCombustivel(String combustivel){
            this.combustivel = combustivel; 
        }
    public String getNome(){
           return nome;
    }
        public void setNome(String nome){
            this.nome = nome; 
        }
    //métodos de classe 
    public void ligar(double ligou){
        System.out.println("O carro "+ nome + ligou);
    }
    public void andou(double KM){
        System.out.println("O carro "+ nome + "andou"+ KM);
    }
    
    public void frear(double freiou ){
        System.out.println("O carro "+ nome + freiou );
    }
  public static void main(String[] args) {
        Carro c1=new Carro();
        c1.setNome("golf ");
        c1.setMarca("volkswagen");
        c1.setCor("Preto");
        c1.setCombustivel("etanol");
        System.out.println(c1.getNome()+""+c1.getCor()+""+c1.getMarca()+""+c1.getCombustivel());
        
    }
}

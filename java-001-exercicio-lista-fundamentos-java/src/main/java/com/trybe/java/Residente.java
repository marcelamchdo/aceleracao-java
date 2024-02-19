package com.trybe.java;

/**
 * Classe.
 **/
public class Residente {

  public String nome;
  public int idade;
  public double peso;
  public double altura;

  /**.
  * Constructor
  */
  public Residente(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public double calculaImc() {
    return this.peso / (this.altura * this.altura);
  }
}


package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nickname;
        String nicknameBD="bolivardim17";
        String contrasena;
        String contrasenaBD="1234567890";
        Integer nivelDeVida=70;
        Integer contadorSkills=0;
        Integer contadorDeDisparos=0;
        Integer precioSkillDeVida=100000;
        Integer danoDisparos=-5;
        boolean estaMuerto=false;

        String juegoUno="FreeFire";
        String juegoDos="Fifa 24";
        String juegoSeleccionado;

        Scanner lea = new Scanner(System.in);

        //proceso

        System.out.println("************");
        System.out.println("Bienvenido a FreeFire el mejor juego de disparos");
        System.out.println("************");
        System.out.print("Ingrese por favor su nickname: ");
        nickname=lea.nextLine();
        System.out.print("Digita tu contraseña: ");
        contrasena=lea.nextLine();

        // rutina para verificar el perdil

        if (nickname.equals(nickname) && contrasena.equals(contrasenaBD)){
            System.out.printf("Estas listo para jugar "+ nickname);
            System.out.printf("Selecciones un juego: ");
            juegoSeleccionado=lea.nextLine();
            if (juegoSeleccionado.equals(juegoUno)){
                //juego seleccionado

                do {
                    Random random=new Random();
                    int disparo=random.nextInt((2));


                    if (disparo==1){
                        System.out.println("Te dieron un disparo");
                        contadorDeDisparos++;
                        nivelDeVida=nivelDeVida+danoDisparos;
                        System.out.println("te dispararon y tu vida quedo en: "+nivelDeVida);
                        if (nivelDeVida==0){
                            estaMuerto=true;
                        }
                    }else{
                        System.out.println("No te han disparado");
                        contadorDeDisparos=0;
                    }
                }while(estaMuerto==false);

                System.out.printf("Estas muerto");



            }
            else {
                System.out.printf("Servidor no encontrado");
            }
        }else {
            System.out.printf("Usuario no encontrado...");
        }
// ruitna para iniciar el juego



    }
}
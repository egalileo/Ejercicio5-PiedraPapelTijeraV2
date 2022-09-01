package com.mycompany.piedrapapelotijerasv2;
import javax.swing.JOptionPane;

/*
    Elaborar un juego de piedra, papel o tijera. Deberá considerar lo siguiente

   * Hay dos jugadores (No es contra la pc).
   * Preguntar si quieren jugar a 3 turnos o a 5 turnos.
   * Se ejecutara una jugada a la vez.
   * Mostrar el ganador de cada ronda despues de cada turno, controlando los empates.
   
 */
public class App {

    public static void main(String[] args) {
        boolean salir = false, ganador = false;
        int opcion, jugador = 1, jugada1, jugada2, ganadas1 = 0, ganadas2 = 0;
        
        while(!salir){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("*** Bienvenido a Piedra, Papel o Tijeras ***"
                    + "\n1. Jugar al mejor de 3\n2. Jugar al mejor de 5\nCualquier otro para salir"));
            if( opcion == 1){ // Juegue al mejor 3
                while(!ganador){
                    jugador = 1;
                    do{
                        jugada1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador
                            + " Ingrese la opcion que desea\n1. Piedra\n2. Papel\n3. Tijeras"));
                        if(jugada1 < 1 || jugada1 > 3){
                            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un valor valido");
                        }
                    }while(jugada1 < 1 || jugada1 > 3);
                    jugador = 2;
                    do{
                        jugada2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador
                            + " Ingrese la opcion que desea\n1. Piedra\n2. Papel\n3. Tijeras"));
                        if(jugada2 < 1 || jugada2 > 3){
                            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un valor valido");
                        }
                    }while(jugada2 < 1 || jugada2 > 3);
                    
                    if(jugada1 == jugada2){ //Empate
                        JOptionPane.showMessageDialog(null, "*** EMPATE ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }else if((jugada1==1 && jugada2==3) || (jugada1==2 && jugada2==1) || (jugada1==3 && jugada2==2)){ //Gana J1
                        ganadas1++;
                        JOptionPane.showMessageDialog(null, "*** GANA JUGADOR 1 ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }else if((jugada2==1 && jugada1==3) || (jugada2==2 && jugada1==1) || (jugada2==3 && jugada1==2)){ // Gana J2
                        ganadas2++;
                        JOptionPane.showMessageDialog(null, "*** GANA JUGADOR 2 ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }
                    
                    if(ganadas1 == 2){ //GANO JUGADOR 1
                        JOptionPane.showMessageDialog(null,"*** FELICIDADES. EL JUGADOR 1 HA GANADO ***");
                        break;
                    }else if(ganadas2 == 2){ //GANO JUGADOR 2    
                        JOptionPane.showMessageDialog(null,"*** FELICIDADES. EL JUGADOR 2 HA GANADO ***");
                        break;
                    }
                }
            }else if( opcion == 2 ){ //Juegue al mejor de 5
                while(!ganador){
                    jugador = 1;
                    do{
                        jugada1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador
                            + " Ingrese la opcion que desea\n1. Piedra\n2. Papel\n3. Tijeras"));
                        if(jugada1 < 1 || jugada1 > 3){
                            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un valor valido");
                        }
                    }while(jugada1 < 1 || jugada1 > 3);
                    jugador = 2;
                    do{
                        jugada2 = Integer.parseInt(JOptionPane.showInputDialog("Jugador #"+jugador
                            + " Ingrese la opcion que desea\n1. Piedra\n2. Papel\n3. Tijeras"));
                        if(jugada2 < 1 || jugada2 > 3){
                            JOptionPane.showMessageDialog(null, "Error. Debe ingresar un valor valido");
                        }
                    }while(jugada2 < 1 || jugada2 > 3);
                    
                    if(jugada1 == jugada2){ //Empate
                        JOptionPane.showMessageDialog(null, "*** EMPATE ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }else if((jugada1==1 && jugada2==3) || (jugada1==2 && jugada2==1) || (jugada1==3 && jugada2==2)){ //Gana J1
                        ganadas1++;
                        JOptionPane.showMessageDialog(null, "*** GANA JUGADOR 1 ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }else if((jugada2==1 && jugada1==3) || (jugada2==2 && jugada1==1) || (jugada2==3 && jugada1==2)){ // Gana J2
                        ganadas2++;
                        JOptionPane.showMessageDialog(null, "*** GANA JUGADOR 2 ***\nJugador 1 ["+ganadas1+" - "+ganadas2+"] Jugador2");
                    }
                    
                    if(ganadas1 == 3){ //GANO JUGADOR 1
                        JOptionPane.showMessageDialog(null,"*** FELICIDADES. EL JUGADOR 1 HA GANADO ***");
                        break;
                    }else if(ganadas2 == 3){ //GANO JUGADOR 2    
                        JOptionPane.showMessageDialog(null,"*** FELICIDADES. EL JUGADOR 2 HA GANADO ***");
                        break;
                    }
                }
            }else{
                break;
            }
        }
    }
}

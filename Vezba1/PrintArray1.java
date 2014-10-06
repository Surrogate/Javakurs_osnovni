import java.util.Random;

public class PrintArray1 {

	public static void main(String[] args) {
            System.out.println("Prvi zadatak: ");
            System.out.println("[ Napisati program kojim se štampaju brojevi od 1 do 10 i njihovi kvadrati. ]");
            // Deklarisi tip podatka za brojac.
            int i;
            // Uslov za loop, kreni od 0 idi do 10.
            for (i = 0; i < 10; i++){
            	 // Printaj string + broj
                 System.out.println("Broj: "+i);
            } // Kraj loopa.
             System.out.println("Prvo zadatak kraj.\n");

             System.out.println("Drugi zadatak: \n");

             System.out.println("Napisati program kojim se štampaju brojevi od 1 do 10, i pored svakog označava da li je paran ili neparan:\n");
             // Loop, pocni od nula idi do 9
             for( i = 0; i < 10; i++){
                // Proveri da li je broj deljiv sa 2
          			 if ( i % 2 == 0 ) {
                    // Ako jeste onda je paran
                    System.out.println("Paran: "+i);
          		    	} else {
                    // Ako nije onda je neparan
                    System.out.println("Neparan"+i);
          			 }
            }
             System.out.println("Drugi zadatak kraj \n");
             System.out.println("Treci zadatak: \n");
             System.out.println("Napisati program koji ispituje svaki clan niza i proverava da li je pozitivan, negativan ili jednak nuli. \n");
              // Instanciraj random klasu
              Random random = new Random();
              // Definisi array, dakle 15 brojeva, tip podatka integer.
              int arrayrandombrojeva[] = new int [15];
              // Pocni loop od 0 idi do 15.
              for(i = 0; i < 15; i++){
              // integer randomInteger , random klasa, metod nextInt, generisi i negativne.
              int randomInteger = random.nextInt(15) - 7;
              // Ubaci izgenerisani integer u array.
              arrayrandombrojeva[i] = randomInteger;
              }
              // Drugi loop u kome proveravamo brojeve u nizu.
              // Pocni od 0, zavrsi na kraju niza.
              for (i = 0; i < arrayrandombrojeva.length; i++) {
                  // Koristimo math signum on vraca ako je nula 0.0 , ako je negativan -1.0, ako je pozitivan 1.0
                  float poznegilinula = Math.signum(arrayrandombrojeva[i]);
                  // Ako je jednak nuli
                  if(poznegilinula == 0.0){
                    System.out.println("broj je jednak nuli "+"["+arrayrandombrojeva[i]+"]");
                  // Ako je negativan
                  } else if(poznegilinula == -1.0){
                    System.out.println("broj je negativan "+"["+arrayrandombrojeva[i]+"]");
                  // Ako je pozitivan
                  } else {
                    System.out.println("broj je pozitivan "+"["+arrayrandombrojeva[i]+"]");
                  }
              }
              System.out.println("Traci zadatak kraj \n");
              System.out.println("Cetvrti zadatak \n");
              System.out.println("Napisati program koji sumira elemente niza koristeći i FOR i WHILE petlju.\n");
              // Definisi niz brojeva
              int nizbrojeva[] = new int [5];
              for(i = 0; i < 5; i++){
              // integer randomInteger , random klasa, metod nextInt, generisi i negativne.
              int randomInteger = random.nextInt(10);
              // Ubaci izgenerisani integer u array.
              nizbrojeva[i] = randomInteger;
              System.out.println(nizbrojeva[i]);
              }
              int ukupno = 0;
              // Varijanta sa for petljom
              for(i = 0; i < nizbrojeva.length; i++){
                  ukupno += nizbrojeva[i];
              }
              System.out.println("Zbir svih brojeva u nizu je: " + ukupno+"\n");
              // Varijanta sa while petljom 
              int brojac = 0;
              int ukupnowhile = 0;
              while (brojac < nizbrojeva.length) {
               ukupnowhile += nizbrojeva[brojac];
               brojac++;
              }
              System.out.println("Zbir svih brojeva u nizu je: " + ukupnowhile);
    	}

}
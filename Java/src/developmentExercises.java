
public class developmentExercises {
  public static void main(String[] args) {
	  // aqui debo incrementar valores de la variable desde el 1 al 10 con el ciclo if-else y do While
		int i = 1;
		do {
		  System.out.println("the value with  do-while is: " + i);
			i += 1; 
		} while (i <= 10);
    for (int j = 1; j < 10; j++) {
      if (j < 10) {
        System.out.print(j + ", ");
      } else {
        System.out.println(j);
      } 
    } 
  }
}

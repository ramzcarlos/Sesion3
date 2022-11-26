package proyecto_junit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaOrden pizza = new PizzaOrden();
		pizza.desplegarMensajeInicio();
		pizza.desplegarMensajeDefault();
		
		
		
		pizza.preguntarPizzaVegetariana();
		pizza.desplegarIngredientes();
		pizza.guardarIngredientes();
		pizza.desplegarResumenOrden();
	}

}

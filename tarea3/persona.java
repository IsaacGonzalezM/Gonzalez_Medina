public class persona{
	private int edad;
	private String nombre;
	private String sexo;
		void persona(int e, String n, String se){
			this.edad=e;
			this.nombre=n;
			this.sexo=se;
		}
		void caminar(){
		
		}
		void respirar(){

		}
		void hablar(){
			System.out.println("estoy hablando xd");
		}
		void correr(){
			
		}
		public static void main(String[]args){
		persona Persona1=new persona();
		new persona().hablar();
		}
}


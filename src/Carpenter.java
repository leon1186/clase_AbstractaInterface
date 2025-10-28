public class  Carpenter  extends  Persona implements IEmployee{
    @Override
    public void work() {
        System.out.println(this.getFullname() + " reliza las tareas de carpinteria");
    }

    @Override
    public double pay(int hoursNumbers) {
        return   hoursNumbers>50  ? 200000 : 10000000;// aqui estamos haciendo un operador ternario
    }

    // NO GENERO METODO CONSTRUCTOR VACIO PORQUE PERSONA YA LO TIENE....
    // VISUAL ESTUDIO NO ES UN IDE,, ES UN EDITOR DE TEXTO
    // puedo instanciar la clases persona porque no es abstracta

}

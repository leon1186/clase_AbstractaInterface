 public class Plumber extends Persona implements IEmployee,ISeller {
    @Override
    public void work() {
        System.out.println(this.getFullname() + " reliza las tareas de plomeria");
    }

    @Override
    public double pay(int hoursNumbers) {
        return   hoursNumbers>100 ? 200000 : 50000;// aqui estamos haciendo un operador ternario
    }

    @Override
    public double commision(double sale) {
        return sale>2000000 ? sale*0.1 : sale*.01;
    }


}

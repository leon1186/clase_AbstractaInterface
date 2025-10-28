import javax.smartcardio.CardPermission;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carpenter cp1=new Carpenter();// no puedo instanciar una clase abstrracta en este caso es diferente
        cp1.setFullname("Felipe la Hermosa");
        System.out.println(cp1.getFullname());
        cp1.work();
        System.out.println(cp1.pay(40));
        Plumber pl=new Plumber();
        pl.setFullname("pepe perez");
        pl.work();
        System.out.println(pl.pay(150));
        System.out.println(pl.commision(350000));

        // LEER Y HACER TAREAS Y ESQUEMAS DE SEMANA 9...
        //POLIMORFISMO, METODO ABSTRACTO , ENCAPSULAR...






        }
    }

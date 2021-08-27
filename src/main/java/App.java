import learn.java.cleber.lecheta.oop.Computer;
import learn.java.cleber.lecheta.oop.DesktopOptiPlexMicro3080;
import learn.java.cleber.lecheta.oop.NotebookInspiron14;
import learn.java.cleber.lecheta.oop.NotebookXps13;

/**
 * Hello (Dell Computer) world!
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public class App 
{
    public static void main( String[] args )
    {
        Computer inspironNotebook = new NotebookInspiron14();
        Computer xpsNotebook = new NotebookXps13();
        Computer optiPlexDesktop = new DesktopOptiPlexMicro3080();

        System.out.println(inspironNotebook);
        System.out.println(xpsNotebook);
        System.out.println(optiPlexDesktop);
    }
}

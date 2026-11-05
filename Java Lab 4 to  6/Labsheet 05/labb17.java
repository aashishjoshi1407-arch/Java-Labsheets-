interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    void setName(String n) { machineName = n; }
    void setId(int i) { machineId = i; }
    String getName() { return machineName; }
    int getId() { return machineId; }

    public void print() { System.out.println("Printing"); }
    public void scan() { System.out.println("Scanning"); }
}
public class Main {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.setName("HP"); m.setId(101);
        System.out.println(m.getName() + " " + m.getId());
        m.print(); m.scan();
    }
}
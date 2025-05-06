package punto2;

public class prueba {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Agustina Banegas");

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500000);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        System.out.println("Cantidad de depósitos: " + cuenta.getCantidadDepositos());
        
        boolean pudoExtraer = cuenta.extraer(1000);
        System.out.println("¿Pudo extraer $1000? " + pudoExtraer);
        System.out.println("Saldo después de extracción: $" + cuenta.getSaldo());
        System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());

        boolean pudoExtraer2 = cuenta.extraer(1000000);
        System.out.println("¿Pudo extraer $1000000? " + pudoExtraer2);
        System.out.println("Saldo después de extracción: $" + cuenta.getSaldo());
        System.out.println("Cantidad de extracciones: " + cuenta.getCantidadExtracciones());

    }
}

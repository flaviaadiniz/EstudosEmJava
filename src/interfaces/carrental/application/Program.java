package interfaces.carrental.application;

import interfaces.carrental.model.entities.CarRental;
import interfaces.carrental.model.entities.Vehicle;
import interfaces.carrental.model.services.BrazilTaxService;
import interfaces.carrental.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("ENTRE COM OS DADOS DO ALUGUEL: ");
        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), formatter);
        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), formatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Preço por hora: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Preço por dia: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: R$" + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: R$" + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: R$" + carRental.getInvoice().getTotalPayment());

        scanner.close();

    }
}

package ExeInterface;

import ExeInterface.Entities.Contract;
import ExeInterface.Entities.Installment;
import ExeInterface.Service.ContractService;
import ExeInterface.Service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter contract Data:");
        System.out.printf("Number: ");
        Integer number = sc.nextInt();
        System.out.printf("Date (dd/MM/yyyy)");
        Date date = sdf.parse(sc.next());
        System.out.printf("Contract Value: ");
        Double totalValue = sc.nextDouble();
        System.out.printf("Enter number of installments: ");
        int n = sc.nextInt();


        Contract contract = new Contract(number, date, totalValue);

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract, n);

        System.out.println("Instalments");
        for (Installment it : contract.getInstallments()){
            System.out.println(it);
        }
    }


}

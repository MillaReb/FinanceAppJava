package se.amila.finance.app;

import java.util.ArrayList;

// den här klassen är motorn som håller alla transkationer i en lista och räknar ut saldo/summeringar
public class FinanceService {

    //här sparar vi alla transaktioner som användaren lägger till
    ArrayList<Transaction> transactions = new ArrayList<>();

    //metod för att lägga till en transaktion i listan
    public void addTransaction(Transaction t){

        transactions.add(t);
    }

    //metod för att ta bort en transaktion med ett visst id
    public void removeTransaction(String id){
        //vi går igenom lista rad för rad
        for(int i = 0; i < transactions.size(); i++){
            if (transactions.get(i).getId().equals(id)){
                transactions.remove(i);
                break;
            }
        }
    }
    //metod för att räkna ut nuvarande saldo
    public double getBalance(){
        double sum = 0;
        //vi går igenom alla transaktioner i listan och jag använder föreach eftersom vi ska gå igenom alla
        //transaktioner vi behöver inte indexet
        for (Transaction t : transactions) {
            sum += t.signedAmount();   //signed amount finns i Transaction
        }
        return sum;
    }

    //metod som ska skriva ut alla transaktioner på skärm
    public void showAll (){
        for (Transaction t : transactions){
            System.out.println(t.getDate()+ " "
            + t.getDescription() + " "
            + t.getAmount() + " "
            +t.getType());
        }
    }


}

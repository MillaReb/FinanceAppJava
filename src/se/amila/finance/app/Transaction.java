package se.amila.finance.app;

public class Transaction {

    private String id;  //allt detta är egenskaper eller fält
    private java.time.LocalDate date;
    private String description;
    private double amount;
    private String type;
    private String category;

    //skapar en kontruktor som är en metod som körs när man skapar ett nytt objekt
    public Transaction(java.time.LocalDate date, String description, double amount, String type, String category) {

        this.id = java.util.UUID.randomUUID().toString(); //skapar unikt id
        this.date = date;
        this.description = description;   //``this``     refereras till kontruktor
        this.amount = amount;
        this.type = type;
        this.category = category;
        //när man anropar new Transacton() kommer id skappas direkt
        //new transaction är objekt i mainklassen

    }
        //hjälpfunktion där vi räknar ut beloppet med plus/minus beroende på om det är inkomst eller utgift
        public double signedAmount(){
            if(type.equalsIgnoreCase("INCOME")){
                return amount; //positivt

            }else {
                return -amount; //negativt
            }  //funktionen som gör att vi sliper tänka om vi ska lägga till eller dra bort beloppet

        }
        //getters så vi kan hämta värden
    public String getId(){ return id; }
    public java.time.LocalDate getDate() { return date; }
    public String getDescription() {return description;}
    public double getAmount() {return amount;}
    public String getType(){return type;}
    public String getCategory() {return category;}



    }

//Varje transaktion är ett objekt med egenskaper (fält) och beteenden (metoder).-->detta gäller geters
//Dessa ger oss möjlighet att läsa ut datan.
//Vi kommer använda dem i andra klasser (t.ex. när vi vill skriva ut listan med transaktioner i App).
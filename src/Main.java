public class Main {
    public static void main(String[] args) {
        Phone Redmi = new Phone("Redmi Note 10 pro", 15000, 82);
        Printer TSC  = new Printer("TSC TE200", 16000,82);
        Book Детектив = new Book("Великий из бродячих псов", 2500,98);

        Customer Mel = new Customer("Mel258", "Qwertyuiop");
        Admin Kostya = new Admin("Kostya7121", "Qazwsxedc7");
        Moderator Iliya = new Moderator("Iliya565", "Asdfghjkl5632");

        Pokupatel Pok = new Pokupatel("Redmi Note 11 pro", 21,87,"Mel258","Qwertyuiop");
        Pok.Pokupka();
}}
interface tovar{
    String tovarName();
    Integer tovarCost();
    Integer tovarRaiting();
}
class Book implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Book(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
class Phone implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Phone(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
class Printer implements tovar{
    String Name;
    Integer Cost;
    Integer Raiting;
    Printer(String Name,Integer Cost, Integer Raiting){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
    }
    @Override
    public String tovarName(){
        return Name;
    }
    @Override
    public Integer tovarCost(){
        return Cost;
    }
    @Override
    public Integer tovarRaiting(){
        return Raiting;
    }
}
interface User{
    String UserLogin();
    String UserPassword();}

class Customer implements User{
    String Login;
    String Password;
    Customer(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Moderator implements User{
    String Login;
    String Password;
    Moderator(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Admin implements User{
    String Login;
    String Password;
    Admin(String Login,String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public String UserLogin() {
        return Login;
    }
    @Override
    public String UserPassword() {
        return Password;
    }
}
class Pokupatel implements tovar,User{
    String Name;
    Integer Cost;
    Integer Raiting;
    String Login;
    String Password;

    Pokupatel(String Name,Integer Cost, Integer Raiting,String Login,String Password){
        this.Name = Name;
        this.Cost = Cost;
        this.Raiting = Raiting;
        this.Login = Login;
        this.Password = Password;}
        @Override
        public String tovarName(){
            return Name;
        }
        @Override
        public Integer tovarCost(){
            return Cost;
        }
        @Override
        public Integer tovarRaiting() {
            return Raiting;
        }
        @Override
        public String UserLogin() {
            return Login;
        }
        @Override
        public String UserPassword() {
            return Password;
        }
        public void Pokupka() {
        System.out.println(Login + " Купил " + Name + " За " + Cost + " рублей");
    }

}


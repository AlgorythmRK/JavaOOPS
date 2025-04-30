import java.util.*;
class Book
{
    String title;
    String author;
    double price;
    String genere;

    Book(String title, String author,double price, String genere)
    {
        this.author=author;
        this.genere=genere;
        this.price=price;
        this.title=title;
    }
}

class Bookwallet
{
    int walletid;
    double balance;

    Bookwallet(int walletid,double balance)
    {
        this.balance=balance;
        this.walletid=walletid;
    }
}

class Reader
{
    int readerid;
    String readername;
    Book[] book;
    Bookwallet Bookwallet;

    Reader(int readerid,String readername,Book[] Book, Bookwallet Bookwallet)
    {
        this.readername=readername;
        this.readerid=readerid;
        this.book=book;
        this.Bookwallet=Bookwallet;
    }

    double ComputeTotalcost()
    {
        double total_cost=0;
        for(Book b:book)
        {
            total_cost+=b.price;
        }
        return total_cost;
    }

    int Deduct(double amt)
    {
        if(amt<Bookwallet.balance)
        {
            Bookwallet.balance-=amt;
        }
        return 1;
    }

    void payforbooks()
    {
        double totalcost=ComputeTotalcost();
        if(Deduct(totalcost)==1)
        {
           System.out.println("The total cost paid for books is :"+totalcost);
        }
        else
        {
            System.out.println("Not enough balance in the wallet.");

        }
    }

    void printDetails() {
        System.out.println("Reader ID: " + readerid + ", Name: " + readername);
        System.out.println("Book Details:");
        for (Book b : book) {
            System.out.println(b.title + " " + b.author + " " + b.price + " " + b.genere);
        }
        System.out.println("Wallet Balance: " +Bookwallet.balance);
    }
}
public class Aggregation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the reader details:");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter reader id: ");
        int readerid = sc.nextInt();

        System.out.print("Enter wallet id: ");
        int walletid = sc.nextInt();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book details:");

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            System.out.print("Enter genre: ");
            String genre = sc.nextLine();

            books[i] = new Book(title, author, price, genre);
        }

        Bookwallet wallet = new Bookwallet(walletid, balance);
        Reader reader = new Reader(readerid, name, books, wallet);

        reader.payforbooks();
        reader.printDetails();
  
        sc.close();

    }
}
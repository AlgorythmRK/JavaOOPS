import java.util.*;

class Event {
    int eventID;
    String eventTitle;
    String eventType;
    double eventCharge;
    String eventPlan;

    public Event(int eventID, String eventTitle, String eventType, double eventCharge, String eventPlan) {
        this.eventID = eventID;
        this.eventTitle = eventTitle;
        this.eventType = eventType;
        this.eventCharge = eventCharge;
        this.eventPlan = eventPlan;
    }

    public double getCharge() {
        return eventCharge;
    }

    public void displayEvent() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Title: " + eventTitle);
        System.out.println("Type: " + eventType);
        System.out.println("Charge: " + eventCharge);
        System.out.println("Plan: " + eventPlan);
    }
}

class TEDxEvent {
    String title;
    ArrayList<Event> events;
    double totalEventCharge;

    public TEDxEvent(String title) {
        this.title = title;
        this.events = new ArrayList<>();
        this.totalEventCharge = 0;
    }

    public void addEvent(Event e) {
        events.add(e);
        computeTotalEvent(e.getCharge());
    }

    public void computeTotalEvent(double charge) {
        totalEventCharge += charge;
    }

    public void printMaxChargeEvent() {
        if (events.isEmpty()) {
            System.out.println("No events available.");
            return;
        }

        Event maxEvent = events.get(0);
        for (Event e : events) {
            if (e.getCharge() > maxEvent.getCharge()) {
                maxEvent = e;
            }
        }

        System.out.println("\nEvent with Max Charge:");
        maxEvent.displayEvent();
    }

    public void printTEDx() {
        System.out.println("\nTEDx Event Title: " + title);
        System.out.println("Total Charge: " + totalEventCharge);
        System.out.println("Events Conducted:");
        for (Event e : events) {
            System.out.println("--------------------");
            e.displayEvent();
        }
    }
}

public class EventManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter TEDx Event Title: ");
        String tedxTitle = sc.nextLine();

        TEDxEvent tedx = new TEDxEvent(tedxTitle);

        System.out.print("Enter number of events to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Event " + (i + 1));
            System.out.print("Event ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Event Title: ");
            String title = sc.nextLine();
            System.out.print("Event Type (e.g. Expert Speech): ");
            String type = sc.nextLine();
            System.out.print("Event Charge: ");
            double charge = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Event Plan: ");
            String plan = sc.nextLine();

            Event e = new Event(id, title, type, charge, plan);
            tedx.addEvent(e);
        }

        tedx.printTEDx();
        tedx.printMaxChargeEvent();
    }
}
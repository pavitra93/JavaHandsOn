package basics;

import encapsulation.Learn_6_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Learn_5_Inheritance extends Learn_6_Encapsulation {

    public static void main(String[] args) {
        InformationTechnology it = new InformationTechnology("Zymr Inc", "IT", 2010);
        it.getBasicOrganizationInfo();
        it.addITService("Full Stack Development");
        it.listITservices();

        /*
         Encapsulated package
         You can access class and its members because they are public.
        */
        Learn_6_Encapsulation encapsulation = new Learn_6_Encapsulation();
        encapsulation.doWork();

        /*
         Accessing parent protected members from different package
         can only be accessed by child's object not parents object.
        */
        Learn_5_Inheritance inheritance = new Learn_5_Inheritance();
        inheritance.doEat();
    }
}

class Organization {
    String name, type;
    int originYear;

    // Constructor
    public Organization(String name, String type, int originYear) {
        this.name = name;
        this.type = type;
        this.originYear = originYear;
    }

    // getBasicOrganizationInfo
    public void getBasicOrganizationInfo() {
        System.out.println("Welcome to " + name + ". This is a "
                + type + " organtization & serving since " + originYear);
    }
}

// InformationTechnology class extends Organization
class InformationTechnology extends Organization {

    List<String> services = new ArrayList<>();

    // Child constructor
    public InformationTechnology(String orgName, String orgType, int orgOrigin) {
        super(orgName,orgType, orgOrigin);
        setBasicITServices();
    }

    // Set ITServices
    public void setBasicITServices() {
        services.add("Domain");
        services.add("Web Development");
        services.add("Android Development");
        services.add("Customer Services");
    }
    // List ITServices
    public void listITservices() {
        System.out.println("Services of " + name);
        for (String service:
             services) {
            System.out.println(service);
        }
    }

    // Add IT Service
    public void addITService(String service) {
        services.add(service);
    }
}

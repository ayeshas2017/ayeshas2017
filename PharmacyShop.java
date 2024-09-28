import java.util.ArrayList;

public class PharmacyShop {
    private Person owner;
    private Address address;
    private ArrayList<Medicine> medicines;

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;
        this.medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void displayMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayInformation();
            System.out.println("----------------------------");
        }
    }

    public Medicine searchMedicineById(String id) {
        for (Medicine medicine : medicines) {
            if (medicine.getMedicineid().equals(id)) {
                return medicine;
            }
        }
        return null; // Not found
    }

    
    public void displayOwnerInfo() {
        owner.display();
        address.displayAddress();
    }
}

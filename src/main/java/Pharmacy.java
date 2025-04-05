public class Pharmacy {
    private int pharmacyId;
    private int supplierId;
    private String medicineName;
    private String category;
    private int stockQuantity;
    private double pricePerUnit;

    // Constructor with all fields
    public Pharmacy(int pharmacyId, int supplierId, String medicineName, String category, int stockQuantity, double pricePerUnit) {
        this.pharmacyId = pharmacyId;
        this.supplierId = supplierId;
        this.medicineName = medicineName;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters and Setters
    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "pharmacyId=" + pharmacyId +
                ", supplierId=" + supplierId +
                ", medicineName='" + medicineName + '\'' +
                ", category='" + category + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}



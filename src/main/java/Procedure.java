public class Procedure {
    private int procedureId;
    private String procedureName;
    private String description;
    private double cost;
    private int durationInMinutes;

    // Default constructor
    public Procedure() {
    }

    // All-args constructor
    public Procedure(int procedureId, String procedureName, String description, double cost, int durationInMinutes) {
        this.procedureId = procedureId;
        this.procedureName = procedureName;
        this.description = description;
        this.cost = cost;
        this.durationInMinutes = durationInMinutes;
    }

    // Getters and Setters
    public int getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "procedureId=" + procedureId +
                ", procedureName='" + procedureName + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }
}


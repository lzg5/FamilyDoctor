package bean;

public class Doctor {
    private int id;
    private String name;
    private String level;
    private String department;
    private int price;
    private String hospital;
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", price=" + price +
                ", hospital='" + hospital + '\'' +
                '}';
    }

    public Doctor() {
    }

    public Doctor(String name, String level, String department, int price, String hospital) {
        this.name = name;
        this.level = level;
        this.department = department;
        this.price = price;
        this.hospital = hospital;
    }
}

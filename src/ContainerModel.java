import java.sql.Timestamp;


public class ContainerModel { // ContainerModel Class to create container objects
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis()); //timestamp to create automatically id
    private Long id = timestamp.getTime();//assign id
    private String type = "";//container type
    private String sender = "";//sender name
    private String tare = "";//tare container
    private String security = "";//security attribute
    private int net_weight;//net weight attribute
    private int gross_weight;//gross weight attribute
    private String certificates = "";//certificate attribute


    //no parameter constructor
    public ContainerModel() {
    }

    //parametrized constructor
    public ContainerModel( Long id, String type, String sender, String tare, String security, int net_weight, int gross_weight, String certificates) {
        this.id = id;
        this.type = type;
        this.sender = sender;
        this.tare = tare;
        this.security = security;
        this.net_weight = net_weight;
        this.gross_weight = gross_weight;
        this.certificates = certificates;
    }

//    Getters and Setters
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTare() {
        return tare;
    }

    public void setTare(String tare) {
        this.tare = tare;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getNet_weight() {
        return net_weight;
    }

    public void setNet_weight(int net_weight) {
        this.net_weight = net_weight;
    }

    public int getGross_weight() {
        return gross_weight;
    }

    public void setGross_weight(int gross_weight) {
        this.gross_weight = gross_weight;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }
}

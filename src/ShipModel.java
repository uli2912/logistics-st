import java.sql.Timestamp;
import java.util.List;


public class ShipModel { //Ship Model For Creating Ship Objects


    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());//get automatically ship id by using timestamp
    private Long shipId = timestamp.getTime();//adding timestamp to id
    private String name = "";//name attribute
    private String port = "";//port attribute
    private String origin = "";//origin attribute
    private String destination = "";//destination attribute
    private int container_capacity ;//capacity attribute
    private  int weight_capacity;//weight attribute
    private List<ContainerModel> containerModelList;//container list attribute


//    No Parameter Constructor
    public ShipModel() {
    }

//    Getters and Setters

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Long getShipId() {
        return shipId;
    }

    public void setShipId(Long shipId) {
        this.shipId = shipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getContainer_capacity() {
        return container_capacity;
    }

    public void setContainer_capacity(int container_capacity) {
        this.container_capacity = container_capacity;
    }

    public int getWeight_capacity() {
        return weight_capacity;
    }

    public void setWeight_capacity(int weight_capacity) {
        this.weight_capacity = weight_capacity;
    }

    public List<ContainerModel> getContainerModelList() {
        return containerModelList;
    }


//    adding container to list
    public void setContainerModelList(ContainerModel containerModel) {
        this.containerModelList.add(containerModel);
    }

//    Parametrized Constructor
    public ShipModel(Timestamp timestamp, Long shipId, String name, String port, String origin, String destination, int container_capacity, int weight_capacity, List<ContainerModel> containerModelList) {
        this.timestamp = timestamp;
        this.shipId = shipId;
        this.name = name;
        this.port = port;
        this.origin = origin;
        this.destination = destination;
        this.container_capacity = container_capacity;
        this.weight_capacity = weight_capacity;
        this.containerModelList = containerModelList;
    }
}

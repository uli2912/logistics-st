import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        //          create list ShipModel to store all the ships
        List<ShipModel> shipModelList = new ArrayList<>();
//        create list to get record of transfer containers
        List<HashMap<String,String>> transferContainer = new ArrayList<>();
        while (true){
            //        calling options method to show menu to user and get choice
            int choice = options();
//        create scanner object to get input
            Scanner sc = new Scanner(System.in);

//        switch case to working according user choice
            switch (choice) {
                case 1:
//                getting ship data from user
                    System.out.println("Ship name");
                    String name = sc.next();
                    System.out.println("Ship home port");
                    String port = sc.next();
                    System.out.println("Ship origin");
                    String origin = sc.next();
                    System.out.println("Ship destination");
                    String destination = sc.next();
                    System.out.println("Ship Container Capacity");
                    int container_capacity = sc.nextInt();
                    System.out.println("Ship weight Capacity");
                    int weight = sc.nextInt();

//                create new object and add data in it
                    ShipModel shipModel = new ShipModel();
                    shipModel.setName(name);
                    shipModel.setPort(port);
                    shipModel.setOrigin(origin);
                    shipModel.setDestination(destination);
                    shipModel.setContainer_capacity(container_capacity);
                    shipModel.setWeight_capacity(weight);

//                print all the user entered data on screen
                    System.out.println();
                    System.out.println();
                    System.out.println("--------Ship Added---------");
                    System.out.println("Ship Id: " + shipModel.getShipId());
                    System.out.println("Ship Name: " + shipModel.getName());
                    System.out.println("Ship Home Port: " + shipModel.getPort());
                    System.out.println("Ship Origin: " + shipModel.getOrigin());
                    System.out.println("Ship Destination: " + shipModel.getDestination());
                    System.out.println("Ship Container Capacity: " + shipModel.getContainer_capacity());
                    System.out.println("Ship Weight Capacity: " + shipModel.getWeight_capacity());

//                adding object in list
                    shipModelList.add(shipModel);
//                calling option method to show menu
                    break;
                case 2:
//                search ship record block
                    System.out.println("--------Search Ship Record--------");
                    System.out.println("Enter Ship id:");
//                get ship id to search
                    Long id = sc.nextLong();
//                searching ship id in list
                    for (ShipModel ship : shipModelList) {
                        if (Objects.equals(ship.getShipId(), id)) {
//                        printing all the ship data on screen
                            System.out.println("--------Ship Record Founded--------");
                            System.out.println("Ship Id: " + ship.getShipId());
                            System.out.println("Ship Name: " + ship.getName());
                            System.out.println("Ship Home Port: " + ship.getPort());
                            System.out.println("Ship Origin: " + ship.getOrigin());
                            System.out.println("Ship Destination: " + ship.getDestination());
                            System.out.println("Ship Container Capacity: " + ship.getContainer_capacity());
                            System.out.println("Ship Weight Capacity: " + ship.getWeight_capacity());
                        }
                    }
                    System.out.println();
                    //                calling option method to show menu

                    break;
                case 3:
//                print all ships data on screen
                    System.out.println("---------All Ships---------");
//                iterate list to print objects one by one
                    for (ShipModel ship : shipModelList) {
                        System.out.println("Ship Id: " + ship.getShipId());
                        System.out.println("Ship Name: " + ship.getName());
                        System.out.println("Ship Home Port: " + ship.getPort());
                        System.out.println("Ship Origin: " + ship.getOrigin());
                        System.out.println("Ship Destination: " + ship.getDestination());
                        System.out.println("Ship Container Capacity: " + ship.getContainer_capacity());
                        System.out.println("Ship Weight Capacity: " + ship.getWeight_capacity());
                        System.out.println();
                        System.out.println();
                    }
                    //                calling option method to show menu

                    break;
                case 4:
//                Adding Container in the ship
                    System.out.println("---------Add Container In The Ship----------");
                    System.out.println("-----Choose in which ship you want to add----");
                    System.out.println("--------Enter Ship Id To Add Container-------");
//                printing all the ships
                    for (ShipModel ship : shipModelList) {
                        System.out.println();
                        System.out.println("Ship Id: " + ship.getShipId());
                        System.out.println("Ship Name: " + ship.getName());
                        System.out.println("Ship Home Port: " + ship.getPort());
                        System.out.println("Ship Origin: " + ship.getOrigin());
                        System.out.println("Ship Destination: " + ship.getDestination());
                        System.out.println("Ship Container Capacity: " + ship.getContainer_capacity());
                        System.out.println("Ship Weight Capacity: " + ship.getWeight_capacity());
                        System.out.println();
                        System.out.println();
                    }
//                getting ship id from user
                    Long shipId = sc.nextLong();
//              iterate and search the ship according enter id
                    for (ShipModel ship : shipModelList) {
//                    check the ship Id which user entered and match with actual ship
                        if (Objects.equals(ship.getShipId(), shipId)) {
                            System.out.println("--------Add Container In Ship "+shipId+"--------");
                            System.out.println("Enter Container Type");
                            String type = sc.next();
                            System.out.println("Enter Container Sender Name");
                            String senderName = sc.next();

                            System.out.println("Enter Container tare");
                            String tare = sc.next();

                            System.out.println("Enter Container security type");
                            String securityType = sc.next();

                            System.out.println("Enter Container Net Weight");
                            int net_weight = sc.nextInt();

                            System.out.println("Enter Container Gross Weight");
                            int gross_weight = sc.nextInt();

                            System.out.println("Enter Container Certificates");
                            String certificate = sc.next();
//                        Adding data to container Model and add this model ship list
                            ContainerModel c  = new ContainerModel();
                            c.setType(type);
                            c.setSender(senderName);
                            c.setTare(tare);
                            c.setSecurity(securityType);
                            c.setNet_weight(net_weight);
                            c.setGross_weight(gross_weight);
                            c.setCertificates(certificate);
                            ship.setContainerModelList(c);
                            System.out.println("------Container Added Successfully--------");

                        }
                    }
                    break;
                case 5:
//                Transfer Container TO Warehouse
                    System.out.println("-------To Transport Container-----");
                    System.out.println("-------Enter Ship Id-----");
                    Long shipId2 = sc.nextLong();
                    for (ShipModel ship : shipModelList) {
                        if (Objects.equals(ship.getShipId(), shipId2)) {
                            System.out.println("--------Add Container In Ship "+shipId2+"--------");
                            System.out.println("Enter Container Id");
                            long contId = sc.nextLong();
                            for (ContainerModel model :
                                    ship.getContainerModelList()) {

                                if (contId==model.getId()){
                                    System.out.println("-----Enter Where To Transfer------");
                                    String where  = sc.next();
                                    HashMap<String,String> map = new HashMap<>();
                                    map.put("container ",String.valueOf(contId));
                                    map.put("transfer_to ",where);
                                    transferContainer.add(map);
                                    System.out.println("container transfer");
                                }

                            }

                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }


//    Menu Function TO Show Menu and Get User Choice and return it to back
    public static int options() {
        System.out.println("------------Welcome-----------");
        System.out.println("1- New Ship");
        System.out.println("2- Single Ship Record");
        System.out.println("3- All Ships");
        System.out.println("4- Add Container");
        System.out.println("5- Transport to Warehouse");
        System.out.println("----------Choose Option--------");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}

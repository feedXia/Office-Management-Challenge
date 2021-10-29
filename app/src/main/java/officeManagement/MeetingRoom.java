package officeManagement;

import java.util.ArrayList;

class MeetingRoom {
  static ArrayList<String> roomList = new ArrayList<String>();

  private String name;

  // Constructor
  public MeetingRoom(String name) {
    this.name = name;
  }

  // Getter
  public String getRoomName() {
    return this.name;
  }

  public static void main(String[] args) {
    MeetingRoom room1 = new MeetingRoom("Shukaku");
    room1.addRoom();
    MeetingRoom room2 = new MeetingRoom("Matatabi");
    room2.addRoom();
    MeetingRoom room3 = new MeetingRoom("Kurama");
    room3.addRoom();
    MeetingRoom room4 = new MeetingRoom("Kurama");
    room4.addRoom();
    MeetingRoom.listRooms();
  }

  public String addRoom() {
    name = getRoomName();
    if (!roomList.contains(name)) {
      roomList.add(name);
      System.out.printf("You have added room: %s \n", name);
    } else {
      System.out.printf("A room with the name %s already exists! \n", name);
    }
    return name;
  }

  public static ArrayList<String> listRooms() {
    System.out.printf("List of all the meeting rooms in the office: %s \n", roomList);
    return roomList;
  }

}
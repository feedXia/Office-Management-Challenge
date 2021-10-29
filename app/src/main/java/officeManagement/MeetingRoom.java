package officeManagement;

import java.util.ArrayList;

class MeetingRoom {
  ArrayList<String> roomList = new ArrayList<String>();

  // private String name;

  // Constructor
  public MeetingRoom() {
    // String name;
  }

  public static void main(String[] args) {
    MeetingRoom room = new MeetingRoom();
    room.addRoom("Shukaku");
    room.addRoom("Matatabi");
    room.addRoom("Kurama");
    room.addRoom("Kurama");
    room.listRooms();
  }

  public String addRoom(String name) {
    if (!roomList.contains(name)) {
      roomList.add(name);
      System.out.printf("You have added room: %s \n", name);
    } else {
      System.out.printf("A room with the name %s already exists! \n", name);
    }
    return name;
  }

  public ArrayList<String> listRooms() {
    System.out.printf("List of all the meeting rooms in the office: %s \n", roomList);
    return roomList;
  }

}
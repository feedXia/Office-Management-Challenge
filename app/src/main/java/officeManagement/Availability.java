package officeManagement;

class Availability {

  public static String roomName;
  boolean available = true;

  public Availability(MeetingRoom name) {
    roomName = name.getRoomName();
  }

  public static void main(String[] args) {
    Availability room = new Availability(new MeetingRoom("Shukaku"));
    room.isAvailable(roomName);
    room.inUse(roomName);
    room.leaveRoom(roomName);
  }

  public boolean isAvailable(String roomName) {
    System.out.printf("Meeting room %s is available \n", roomName);
    return available;
  }

  public boolean inUse(String roomName) {
    available = false;
    System.out.printf("Meeting room %s is now unavailable: it's in use \n", roomName);
    return available;
  }

  public boolean leaveRoom(String roomName) {
    available = true;
    System.out.printf("Meeting room %s is now available: user has left \n", roomName);
    return available;
  }
}
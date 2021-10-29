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
  }

  public boolean isAvailable(String roomName) {
    System.out.printf("Meeting room %s is available \n", roomName);
    return available;
  }
}
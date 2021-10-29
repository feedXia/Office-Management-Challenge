package officeManagement;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;

// import static org.mockito.Mockito.*;

import org.junit.Test;

public class MeetingRoomTest {
  @Test
  public void testAddRoom() {
    MeetingRoom room = new MeetingRoom("Shukaku");
    assertEquals(room.addRoom(), "Shukaku");
  }

  @Test
  public void testRoomsHaveDistinctNames() {
    MeetingRoom room1 = new MeetingRoom("Shukaku");
    room1.addRoom();
    MeetingRoom room2 = new MeetingRoom("Shukaku");
    room2.addRoom();
    assertTrue(MeetingRoom.listRooms().size() == 1);
  }

  @Test
  public void testListRooms() {
    MeetingRoom room1 = new MeetingRoom("Shukaku");
    room1.addRoom();
    MeetingRoom room2 = new MeetingRoom("Matatabi");
    room2.addRoom();
    MeetingRoom room3 = new MeetingRoom("Isobu");
    room3.addRoom();
    assertTrue(MeetingRoom.listRooms().contains("Shukaku"));
    assertTrue(MeetingRoom.listRooms().contains("Matatabi"));
    assertTrue(MeetingRoom.listRooms().contains("Isobu"));
  }
}

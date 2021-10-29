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
    MeetingRoom room = new MeetingRoom();
    assertEquals(room.addRoom("Shukaku"), "Shukaku");
  }

  @Test
  public void testRoomsHaveDistinctNames() {
    MeetingRoom room = new MeetingRoom();
    room.addRoom("Shukaku");
    room.addRoom("Shukaku");
    assertTrue(room.listRooms().size() == 1);
  }

  @Test
  public void testListRooms() {
    MeetingRoom room = new MeetingRoom();
    room.addRoom("Shukaku");
    room.addRoom("Matatabi");
    room.addRoom("Isobu");
    assertTrue(room.listRooms().contains("Shukaku"));
    assertTrue(room.listRooms().contains("Matatabi"));
    assertTrue(room.listRooms().contains("Isobu"));
  }
}

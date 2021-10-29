package officeManagement;

import static org.junit.Assert.*;
// import static org.junit.Assert.assertEquals;

// import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;

// import static org.mockito.Mockito.*;

import org.junit.Test;

public class AvailabilityTest {
  @Test
  public void testIsAvailable() {
    Availability room = new Availability(new MeetingRoom("Shukaku"));
    assertTrue(room.isAvailable(Availability.roomName));
  }
}

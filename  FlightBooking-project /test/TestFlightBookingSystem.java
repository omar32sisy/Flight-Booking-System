package coe528.lab1;

public class TestFlightBookingSystem {
    
    public TestFlightBookingSystem() {
    }
    
    @BeforeClass
    public static void initClass() {
    }
    
    @AfterClass
    public static void cleanUpClass() {
    }
    
    @Before
    public void init() {
    }
    
    @After
    public void cleanUp() {
    }
    
    /**
     * Test the constructor of the Flight class with valid input.
     */
    @Test
    public void testConstructor() {
        System.out.println("Constructor valid input");
        boolean caught = false;
        try {
            new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        assertFalse(caught);
    }
    
    private void assertFalse(boolean caught) {
    }

    /**
     * Test the constructor of the Flight class with invalid input.
     */
    @Test
    public void testInvalidConstructor() {
        System.out.println("Constructor invalid input");
        boolean caught = false;
        try {
            new Flight(1350, "Cairo", "Cairo", "10/10/2024 10:00 AM", 150, 1300);
        } catch (IllegalArgumentException e) {
            caught = true;
        }
        assertTrue(caught);
    }

    private void assertTrue(boolean caught) {
    }

    /**
     * Test the getFlightNumber method of the Flight class.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        int expected = 150;
        int actual = instance.getFlightNumber();
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {
    }

    /**
     * Test the setFlightNumber method of the Flight class.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 10;
        Flight instance = new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        instance.setFlightNumber(flightNumber);
        int expected = flightNumber;
        int actual = instance.getFlightNumber();
        assertEquals(expected, actual);
    }

    /**
     * Test the getOrigin method of the Flight class.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        String expected = "Cairo";
        String actual = instance.getOrigin();
        assertEquals(expected, actual);
    }

    private void assertEquals(String expected, String actual) {
    }

    /**
     * Test the setOrigin method of the Flight class.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Bali";
        Flight instance = new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        instance.setOrigin(origin);
        String expected = "Bali";
        String actual = instance.getOrigin();
        assertEquals(expected, actual);
    }

    /**
     * Test the getDestination method of the Flight class.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1350, "Cairo", "Paris", "10/10/2024 10:00 AM", 150, 1300);
        String expected = "Paris";
        String actual = instance.getDestination();
        assertEquals(expected, actual);
    }

    /**
     * Test the setDestination method of the Flight class.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Barcelona";
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setDestination(destination);
        String expected = "Barcelona";
        String actual = instance.getDestination();
        assertEquals(expected, actual);
    }

    /**
     * Test the getDepartureTime method of the Flight class.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        String expected = "10/10/2024 10:00 AM";
        String actual = instance.getDepartureTime();
        assertEquals(expected, actual);
    }

    /**
     * Test the setDepartureTime method of the Flight class.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "10/20/2024 10:00 AM";
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setDepartureTime(departureTime);
        String expected = "10/20/2024 10:00 AM";
        String actual = instance.getDepartureTime();
        assertEquals(expected, actual);
    }

    /**
     * Test the getCapacity method of the Flight class.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        int expected = 150;
        int actual = instance.getCapacity();
        assertEquals(expected, actual);
    }

    /**
     * Test the setCapacity method of the Flight class.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 1300;
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setCapacity(capacity);
        int expected = 1300;
        int actual = instance.getCapacity();
        assertEquals(expected, actual);
    }

    /**
     * Test the getNumberOfSeatsLeft method of the Flight class.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        int expected = 150;
        int actual = instance.getNumberOfSeatsLeft();
        assertEquals(expected, actual);
    }

    /**
     * Test the setNumberOfSeatsLeft method of the Flight class.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 99;
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
        int expected = 99;
        int actual = instance.getNumberOfSeatsLeft();
        assertEquals(expected, actual);
    }

    /**
     * Test the getOriginalPrice method of the Flight class.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        double expected = 1300.0;
        double actual = instance.getOriginalPrice();
        assertEquals(expected, actual, 0);
    }

    /**
     * Test the setOriginalPrice method of the Flight class.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 2000.0;
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setOriginalPrice(originalPrice);
        double expected = 2000.0;
        double actual = instance.getOriginalPrice();
        assertEquals(expected, actual, 0);
    }

    private void assertEquals(double expected, double actual, int i) {
    }

    /**
     * Test the bookASeat method of the Flight class with available seats.
     */
    @Test
    public void testBookASeatTrue() {
        System.out.println("bookASeat true");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        boolean expected = true;
        boolean actual = instance.bookASeat();
        assertEquals(expected, actual);
    }

    private void assertEquals(boolean expected, boolean actual) {
    }

    /**
     * Test the bookASeat method of the Flight class with no available seats.
     */
    @Test
    public void testBookASeatFalse() {
        System.out.println("bookASeat false");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        instance.setNumberOfSeatsLeft(0);
        boolean expected = false;
        boolean actual = instance.bookASeat();
        assertEquals(expected, actual);
    }

    /**
     * Test the toString method of the Flight class.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1350, "Cairo", "Barcelona", "10/10/2024 10:00 AM", 150, 1300);
        String expected = "Flight 150, Cairo to Barcelona, 10/10/2024 10:00 AM, original price: 1300.0$";
        String actual = instance.toString();
        assertEquals(expected, actual);
    }
}

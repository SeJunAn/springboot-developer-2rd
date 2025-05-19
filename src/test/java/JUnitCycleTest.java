import  org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("@Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@Before Each");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
    }

    @Test
    public void test3() {
        System.out.println("test 3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@After All");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@After Each");
    }
}

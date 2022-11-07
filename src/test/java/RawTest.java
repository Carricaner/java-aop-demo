import org.example.SecuredMethod;
import org.junit.jupiter.api.Test;

class RawTest {

  @Test
  void test() {
    SecuredMethod securedMethod = new SecuredMethod();
    securedMethod.lockedMethod();
    securedMethod.unlockedMethod();
  }
}

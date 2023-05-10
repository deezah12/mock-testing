package semicolon.dummy;

import org.semicolon.dummy.EmailService;

public class DummyEmailService implements EmailService {
    @Override
    public void sendEmail(String message) {
        throw new AssertionError("method not implement !!!");
    }
}

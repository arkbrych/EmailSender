import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * @author Arkadiusz Brych
 * Spa.. Email Sender
 */
public class SendEmail {
    public static void main(String[] args) throws EmailException {
        for (int i = 1; i < 11; i++) {
            Email email = new SimpleEmail();
            // host maila wygoogluj sobie dla połączeń wychodzących
            email.setHostName("smtp.wp.pl");
            email.setAuthenticator(new DefaultAuthenticator("login", "haslo"));
            email.setSSLOnConnect(true);
            email.setFrom("email_nadawcy");
            email.setSubject("Test mail nr: " + i);
            email.setMsg("Spam");
            email.addTo("adres_adresata");
            System.out.println("Rozpoczęto wysyłanie maila nr " + i);
            email.send();
            System.out.println("Wysłano maila");
        }
    }
}

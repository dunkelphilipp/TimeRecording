package ch.fhnw.timerecordingbackend.dto.registration;

import ch.fhnw.timerecordingbackend.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

/**
 * DTO für Anfragen zum Registrieren eines Benutzers
 * @author PD
 * Code von anderen Teammitgliedern oder Quellen wird durch einzelne Kommentare deklariert
 * @version 1.0
 */
public class RegistrationRequest {

    @NotBlank(message = "Vorname darf nicht leer sein")
    @Size(min = 2, max = 50, message = "Vorname muss zwischen 2 und 50 Zeichen lang sein")
    private String firstName;

    @NotBlank(message = "Nachname darf nicht leer sein")
    @Size(min = 2, max = 50, message = "Nachname muss zwischen 2 und 50 Zeichen lang sein")
    private String lastName;

    @NotBlank(message = "E-Mail darf nicht leer sein")
    @Email(message = "E-Mail muss eine gültige Adresse haben")
    @Size(min = 5, max = 255, message = "E-Mail muss zwischen 5 und 255 Zeichen lang sein")
    private String email;

    @Size(max = 100, message = "Position darf maximal 100 Zeichen lang sein")
    private String position; // Optionales Feld

    private Long managerId; // Optionales Feld

    // Getter und Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", managerId=" + managerId +
                '}';
    }

}

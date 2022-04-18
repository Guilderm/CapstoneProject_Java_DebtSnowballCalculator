package dev.guilder.SnowballCalculator.UserManagement.Repository.EMail;

public interface EmailSender {
    void send(String to, String email);
}

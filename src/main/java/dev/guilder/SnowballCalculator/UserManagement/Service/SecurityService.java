package dev.guilder.SnowballCalculator.UserManagement.Service;

public interface SecurityService {
    boolean isAuthenticated();

    void autoLogin(String username, String password);
}

package mini_projects.shop.exceptions;

import java.time.LocalDate;

public class ExpireDateException extends Exception{
    private LocalDate expiredDate;

    public ExpireDateException() {
        expiredDate = LocalDate.now();
    }

    public ExpireDateException(String message) {
        super(message);
        expiredDate = LocalDate.now();
    }

    public ExpireDateException(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public ExpireDateException(String message, LocalDate expiredDate) {
        super(message);
        this.expiredDate = expiredDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }
}

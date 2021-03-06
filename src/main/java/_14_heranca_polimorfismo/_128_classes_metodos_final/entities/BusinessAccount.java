package _14_heranca_polimorfismo._128_classes_metodos_final.entities;

public class BusinessAccount extends Account {

    Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if(amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withDraw(Double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }
}

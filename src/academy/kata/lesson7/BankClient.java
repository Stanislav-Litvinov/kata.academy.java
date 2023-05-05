package academy.kata.lesson7;

// 3.2.4 Реализовать метод getCreditForClient

class BankClient {
    public static void main(String[] args) {
    }

    public boolean getCreditForClient(BankWorker worker, BankClient client) {
        try {
            if (!worker.checkClientForCredit(client)) {
                return false;
            }
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException e) {
            return false;
        }
        return true;
    }
}
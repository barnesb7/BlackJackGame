public class Wallet {

    private double cashMoney;
    private int chips;

    public Wallet(){
        this.cashMoney = 100.00;
        this.chips = 10;
    }

    public void addCashMoney(int chips){
       cashMoney += (chips * 10);
    }

    public void addWinningsChips(double winningsMoney){
       int addedChips = (int) (winningsMoney / 10);
        this.chips += addedChips;
    }

    public void payForChips(double money){
            chips += (money / 10);
            cashMoney -= money;

    }

    public void subtractChipsFromWalletAfterALoss(Double betValueInMoney){
        int amountOfChipsBet = (int) (betValueInMoney / 10);
        chips -= amountOfChipsBet;
    }

    public double getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(double cashMoney) {
        this.cashMoney = cashMoney;
    }

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
}

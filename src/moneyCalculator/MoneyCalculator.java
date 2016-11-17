package moneyCalculator;

import moneyCalculator.model.Currency;
import moneyCalculator.model.Money;

public class MoneyCalculator {

    public static void main(String[] args) {
        Currency dolar = new Currency("USD","Dolar","$");
        Money money = new Money(300, dolar);
        new MainFrame();
    }
}

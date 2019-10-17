# Ivelin-Dimitrov-employees
The pair of employees which are worked together on joint projects longest time

# Assignment Guide

This is a small object-oriented project - console application. Reading data from text file ```employees.txt```, which is placed in resource package ```TeamLongestPeriod/src/resources/```. Calculates longest overlap and printing the team (couple of employees), which has longest total overlap under joined projects.

## Getting Started
### Application is supposed to be run using an IDE

* Clone repository: using client for the Git version control system. [TortoiseGit](https://tortoisegit.org/)
* Import project
* Use [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)

#### Repository URL
```
https://github.com/ivelin1936/Ivelin-Dimitrov-employees.git
```

## Describe Functionality

The functionality of the software involves shopping in store system. The main logic cicling around the discount cards. As you see the cards are the main entities of the program. Every card has and initial discount rate, and keep information for it's owner's turnover for the previous month. On base of it's previous month turnover, the card discount rate change. With this information, pay-desk can calculate the discount of the current purchase and the total purchase value.
How it's work:
MarketStore class have main() method, with which we can run the console application. 
For every shopping tour, need to create a cart instance, in which we can collect all our wished stuffs for buying. 
Every stuff is an instance of the item's class. Item's class is just a date class, which keep the information about the items like a price and name.
To finish the purchase we need to have and discount card, for the demo, discount card accept from constructor a turnover value for the previous month.
In the end with pay desk we can finalize our purchase and get in back an invoice of the purchase when invoke pay() method. 
PayDesk has a private constructor (we can't instance it), because it work with a static method pay(), can be called without creating an object of class because it's associated to the class in which is reside not to the objects of that class.

### Demo
#### Shopping items with Gold Discount Card with Mock data: turnover $1500, purchase value $1300;
* Create an instace of golden card with turnover = 1300$
```
DiscountCard goldenCard = new GoldCard(1300);
```
   Input turnover will be validate, and if is incorrect will throw InvalidTurnoverException
   ```
   private void setTurnover(double turnover) {
       if (turnover < 0) {
           throw new InvalidTurnoverException(INCORRECT_TURNOVER_VALUE_EX_MSG);
       }
       this.turnover = turnover;
   }
   ```
* To can start shopping will need to create an instace of cart too
```
Cart shopCart = new StoreCart();
```
* Will buy three items for 350$, 700$ and 250$
```
Item video = new ItemImpl("Video", 350D);
Item fridge = new ItemImpl("Fridge", 700D);
Item picture = new ItemImpl("Picture", 250D);
```
Items validate the passed name and price, before to assigne them to his properties.
* Need to adding every choosen stuff to shopping cart
```
shopCart.addItem(video);
shopCart.addItem(fridge);
shopCart.addItem(picture);
```
* Now we are done with the shopping and need goint to the paydesk to finalize our purchase
```
String invoiceResult = PayDesk.pay(shopCart, goldenCard);
```
The card will calculate discount rate on base on the turnover from the previous month.
```
INITIAL_DISCOUNT = 2D; ONE_HUNDRED_DOLLARS = 100D; DISCOUNT_RATE_INCREMENT = 1D; MAX_DISCOUNT = 10D;

@Override
public double getDiscountRate() {
  double discount = INITIAL_DISCOUNT; 
  discount += (super.getPreviousMonthTurnover() / ONE_HUNDRED_DOLLARS) * DISCOUNT_RATE_INCREMENT;
  
  return discount > MAX_DISCOUNT ? MAX_DISCOUNT : discount;
}
```
The cart will calculate purchase total value and will return the totalAmount
```
@Override
public double getPurchaseValue() {
    return this.items.stream()
            .mapToDouble(Item::getPrice)
            .sum();
}
```
On base on the cardDiscountRate and totalPurchaseValue, will be calculate purchaseDiscount and totalAmount
```
private static double calculatePurchaseDiscount(double purchaseValue, double cardDiscountRate) {
    return purchaseValue * cardDiscountRate / ONE_HUNDRED;
}

private static double calculateTotalAmount(double purchaseValue, double discount) {
    return purchaseValue - discount;
}
```
Paydesk will build invoice and will return it. 
Print invoice on the console and see result.
```
writer.writeLine(invoiceResult);
```
RESULT:
```
Purchase value: $1300,00
Discount rate: 10,0%
Discount: $130,00
Total: $1170,00
```

## Structure
#### The structure of the software is concentrate over the shopping with discount cards

### [BaseCards](https://github.com/ivelin1936/Assignment-Backend/blob/master/src/main/java/entities/cards/BaseCard.java)
The cards are initialized with:
   * `- turnover: double`
   * `- setTurnover(double turnover)`
   * `+ double getPreviousMonthTurnover()`
   
   
   
   
   

## Technologies

* Java - [JDK11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)

## IDE 

* IntelliJ Idea Ultimate - [JetBrains](https://www.jetbrains.com/idea/)

## Version

1.0-SNAPSHOT

## Author

**Ivelin Dimitrov** 
* [GitHub](https://github.com/ivelin1936)
* [LinkedIn](https://www.linkedin.com/in/ivelin-dimitrov-42b13a151/)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

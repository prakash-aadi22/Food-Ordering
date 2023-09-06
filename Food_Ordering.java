import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Food_Zone {
    Scanner sc = new Scanner(System.in);
    FileWriter fw;

    {
        try {
            fw = new FileWriter("foodZone.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void list() {
        System.out.println("\n#################### MENU ####################");
        System.out.println("|----------------------------------------------------------------------|");
        System.out.println("|                                  (CODE)      Full Plate / Half Plate |");
        System.out.println("|----------------------------------------------------------------------|");
        System.out.println("| * Royal Mutton Biryani           (RM)     --    ₹225    /   ₹150     |");
        System.out.println("| * Royal Mutton Biryani Special   (RMS)    --    ₹325    /   ₹200     |");
        System.out.println("| * Royal Chicken Biryani          (RC)     --    ₹215    /   ₹125     |");
        System.out.println("| * Royal Chicken Biryani Special  (RCS)    --    ₹315    /   ₹175     |");
        System.out.println("| * Royal Veg Biryani              (RV)     --    ₹175    /   ₹100     |");
        System.out.println("|----------------------------------------------------------------------|");
        System.out.println("Extras ----->>> Cold Drinks");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|  ml     |  PRICE  |  Sprite  |  Fanta  |  Pepsi  |");
        System.out.println("|---------|---------|----------|---------|---------|");
        System.out.println("|         |         |   CODE   |  CODE   |   CODE  |");
        System.out.println("|---------|---------|----------|---------|---------|");
        System.out.println("| 250 ml  |   ₹50   |   S250   |  F250   |   P250  |");
        System.out.println("| 500 ml  |   ₹75   |   S500   |  F500   |   P500  |");
        System.out.println("| 1000 ml |   ₹125  |   S1000  |  F1000  |   P1000 |");
        System.out.println("|--------------------------------------------------|");
        System.out.println(" </ Free -- Raita and Pickles /> ");
        System.out.println("----------------------------------------------------------------------");
    }

    int order(int bill) {
        try {
            System.out.println("What would you like to oder Madam/Sir ?");
            System.out.print("How many dishes you want to order: ");
            int numberOfDishes = sc.nextInt();
            for (int i = 0; i < numberOfDishes; i++) {
                sc.nextLine();
                System.out.print("Enter the code of the dish: ");
                String dish = sc.nextLine();
                if (dish.equalsIgnoreCase("RM") || dish.equalsIgnoreCase("RMS") || dish.equalsIgnoreCase("RC") || dish.equalsIgnoreCase("RCS") || dish.equalsIgnoreCase("RV")) {
                    System.out.print("Enter the \"F\" for Full Plate and \"H\" for Half Plate: ");
                    String plate = sc.nextLine();
                    if (plate.equalsIgnoreCase("F")) {
                        System.out.print("Enter the number of Full Plates: ");
                        int numberOfPlates = sc.nextInt();
                        if (dish.equalsIgnoreCase("RM")) {
                            bill += (225 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RMS")) {
                            bill += (325 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani Special has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani Special has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RC")) {
                            bill += (215 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RCS")) {
                            bill += (315 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani Special has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani Special has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RV")) {
                            bill += (175 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Veg Biryani has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Veg Biryani has been taken.\n");
                        } else {
                            System.out.println("You have given a wrong input.");
                        }
                    } else if (plate.equalsIgnoreCase("H")) {
                        System.out.print("Enter the number of Half Plates: ");
                        int numberOfPlates = sc.nextInt();
                        if (dish.equalsIgnoreCase("RM")) {
                            bill += (150 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RMS")) {
                            bill += (200 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani Special has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Mutton Biryani Special has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RC")) {
                            bill += (125 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RCS")) {
                            bill += (175 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani Special has been taken.");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Chicken Biryani Special has been taken.\n");
                        } else if (dish.equalsIgnoreCase("RV")) {
                            bill += (100 * numberOfPlates);
                            System.out.println("Your order for " + numberOfPlates + " Full Plate of Royal Veg Biryani has been taken.\n");
                            fw.write("Your order for " + numberOfPlates + " Full Plate of Royal Veg Biryani has been taken.\n");
                        } else {
                            System.out.println("You have given a wrong input.");
                        }
                    } else {
                        System.out.println("You have given a wrong input.");
                    }
                } else {
                    System.out.println("You have given a wrong code.");
                }
            }
            sc.nextLine();
            System.out.print("Do you want to order any Cold Drink (Yes/No): ");
            String cd = sc.nextLine();
            if (cd.equalsIgnoreCase("Yes")) {
                System.out.print("Enter the number of types of Cold Drink you want to order: ");
                int numberOfTypes = sc.nextInt();
                for (int i = 0; i < numberOfTypes; i++) {
                    sc.nextLine();
                    System.out.print("Enter the code of the Cold Drink: ");
                    String cdCode = sc.nextLine();
                    if (cdCode.equalsIgnoreCase("S250") || cdCode.equalsIgnoreCase("S500") || cdCode.equalsIgnoreCase("S1000") || cdCode.equalsIgnoreCase("F250") || cdCode.equalsIgnoreCase("F500") || cdCode.equalsIgnoreCase("F1000") || cdCode.equalsIgnoreCase("P250") || cdCode.equalsIgnoreCase("P500") || cdCode.equalsIgnoreCase("P1000")) {
                        System.out.print("Enter the number of Bottle: ");
                        int numberOfBottle = sc.nextInt();
                        if (cdCode.equalsIgnoreCase("S250")) {
                            bill += (50 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Sprite of 250 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Sprite of 250 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("S500")) {
                            bill += (75 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Sprite of 500 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Sprite of 500 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("S1000")) {
                            bill += (125 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Sprite of 1000 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Sprite of 1000 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("F250")) {
                            bill += (50 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Fanta of 250 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Fanta of 250 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("F500")) {
                            bill += (75 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Fanta of 500 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Fanta of 500 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("F1000")) {
                            bill += (125 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Fanta of 1000 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Fanta of 1000 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("P250")) {
                            bill += (50 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Pepsi of 250 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Pepsi of 250 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("P500")) {
                            bill += (75 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Pepsi of 500 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Pepsi of 500 ml has been taken.\n");
                        } else if (cdCode.equalsIgnoreCase("P1000")) {
                            bill += (125 * numberOfBottle);
                            System.out.println("Your order of " + numberOfBottle + " bottle/s of Pepsi of 1000 ml has been taken.");
                            fw.write("Your order of " + numberOfBottle + " bottle/s of Pepsi of 1000 ml has been taken\n.");
                        } else {
                            System.out.println("You have given a wrong input.");
                        }
                    } else {
                        System.out.println("You have given a wrong code.");
                    }
                }
                System.out.println("Your order has been confirmed.");
            } else if (cd.equalsIgnoreCase("No")) {
                System.out.println("Your order has been confirmed.");
            } else {
                System.out.println("You have given a wrong input.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
        return bill;
    }

    void billing(int bill, long number) {
        try {
            System.out.printf("Bill: ₹%d ", bill);
            float newBill = bill + (bill * 0.18f);
            System.out.print("+ 18% of GST, so the total Bill: ");
            System.out.printf("₹%.2f\n", newBill);
            System.out.print("Enter the mode of payment - Online mode or Offline Mode (Online/Offline): ");
            String mode = sc.nextLine();
            fw.write("Payment Mode: " + mode.toUpperCase() + "\n");
            if (mode.equalsIgnoreCase("Online")) {
                System.out.println("We accept \"Debit Card(DC)\" / \"Credit Cards(CC)\" / \"UPI\" / \"GPay\" / \"Amazon Pay(AP)\" / \"BHIM\" / \"Paytm\"");
                System.out.print("Enter your mode of payment (DC/CC/UPI/GPay/AP/BHIM/Paytm): ");
                String onlineMode = sc.nextLine();
                if (onlineMode.equalsIgnoreCase("DC") || onlineMode.equalsIgnoreCase("CC")) {
                    System.out.println("Enter your card details --> ");
                    System.out.print("Enter the card owner name: ");
                    String cardOwner = sc.nextLine();
                    System.out.print("Enter the card number: ");
                    String cardNum = sc.nextLine();
                    System.out.print("Enter the card date: ");
                    String cardDate = sc.nextLine();
                    System.out.print("Enter the card CVV number: ");
                    String cardCVV = sc.nextLine();
                    System.out.println("Verifying -- " + "Owner Name - " + cardOwner + " & Card Number - " + cardNum + " & Card Date - " + cardDate + " & CVV Number - " + cardCVV);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Redirecting to payment mode of Food Zone.....");
                    TimeUnit.SECONDS.sleep(1);
                } else if (onlineMode.equalsIgnoreCase("UPI")) {
                    System.out.println("Enter you UPI id: ");
                    String upi = sc.nextLine();
                    System.out.println("Verifying -- " + upi);
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Redirecting to payment mode of Food Zone.....");
                    TimeUnit.SECONDS.sleep(1);
                } else if (onlineMode.equalsIgnoreCase("GPay") || onlineMode.equalsIgnoreCase("AP") || onlineMode.equalsIgnoreCase("BHIM") || onlineMode.equalsIgnoreCase("Paytm")) {
                    System.out.println("Link has been sent on your associated mode.");
                    System.out.println("Redirecting to payment mode of Food Zone.....");
                    TimeUnit.SECONDS.sleep(1);
                } else {
                    System.out.println("You have given a wrong input.");
                }
                System.out.print("Enter your Amount: ₹");
                float Amount = sc.nextFloat();
                System.out.print("Do you want to give us \"TIP\" (Yes or No): ");
                String s = sc.next();
                if (s.equalsIgnoreCase("Yes")) {
                    if (Amount < newBill) {
                        float pendingAmount = newBill - Amount;
                        System.out.printf("Your pending Amount: ₹%.2f\n", pendingAmount);
                        System.out.println("You can pay the pending Amount at the time of the delivery.");
                        System.out.print("How much \"TIP\" you want give: ₹");
                        float tip = sc.nextFloat();
                        System.out.println("Thank you so much for ₹" + tip + " \"TIP\"");
                        System.out.println("You can also give the \"TIP\" at the time of delivery.");
                        float totalPendingAmount = pendingAmount + tip;
                        System.out.printf("Pending Amount: ₹%.2f\n", totalPendingAmount);
                        System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", Amount);
                        fw.write("Total Amount Paid: ₹" + Amount + "\n");
                        fw.write("Thank you so much for ₹" + tip + " \"TIP\"\n");
                        fw.write("Pending Amount: ₹" + totalPendingAmount + "\n");
                    } else if (Amount > newBill) {
                        float change = Amount - newBill;
                        System.out.printf("Your change: ₹%.2f\n", change);
                        System.out.print("Do you want to give change as \"TIP\" (Yes or No): ");
                        String a1 = sc.next();
                        if (a1.equalsIgnoreCase("Yes")) {
                            System.out.printf("Thank you so much for ₹%.2f \"TIP\"\n", change);
                            float totalAmountPaid = newBill + change;
                            System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", totalAmountPaid);
                            fw.write("Total Amount Paid: ₹" + totalAmountPaid + "\n");
                            fw.write("Thank you so much for ₹" + change + " \"TIP\"\n");
                        } else if (a1.equalsIgnoreCase("No")) {
                            System.out.print("Then, how much \"TIP\" you want to give: ₹");
                            float tip = sc.nextFloat();
                            System.out.printf("Thank you so much for ₹%.2f \"TIP\"\n", tip);
                            float newChange = change - tip;
                            if (newChange >= 0) {
                                System.out.printf("Your new change is: ₹%.2f\n", newChange);
                                fw.write("New Change: ₹" + newChange + "\n");
                            } else {
                                System.out.printf("Your pending \"TIP\" is: ₹%.2f\n", -(newChange));
                                fw.write("Pending Amount: ₹" + (-(newChange)) + "\n");
                                System.out.println("You can give the pending \"TIP\" at the time of delivery.");
                            }
                            float totalAmountPaid = newBill + tip;
                            System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", totalAmountPaid);
                            fw.write("Total Amount Paid: ₹" + totalAmountPaid + "\n");
                            fw.write("Thank you so much for ₹" + tip + " \"TIP\"\n");
                        } else {
                            System.out.println("You have given a wrong input.");
                        }
                    } else {
                        System.out.print("How much \"TIP\" you want give: ₹");
                        float tip = sc.nextFloat();
                        System.out.printf("Thank you so much for ₹%.2f \"TIP\"\n", tip);
                        float totalAmountPaid = newBill + tip;
                        System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", totalAmountPaid);
                        fw.write("Total Amount Paid: ₹" + totalAmountPaid + "\n");
                        fw.write("Thank you so much for ₹" + tip + " \"TIP\"\n");
                    }
                } else if (s.equalsIgnoreCase("No")) {
                    if (Amount < newBill) {
                        float pendingAmount = newBill - Amount;
                        System.out.printf("Your pending Amount: ₹%.2f\n", pendingAmount);
                        System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", Amount);
                        fw.write("Total Amount Paid: ₹" + Amount + "\n");
                        fw.write("Pending Amount: ₹" + pendingAmount + "\n");
                        System.out.println("You can pay the pending Amount at the time of the delivery.");
                    } else if (Amount > newBill) {
                        float change = Amount - newBill;
                        System.out.printf("Your change: ₹%.2f\n", change);
                        System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", newBill);
                        fw.write("Total Amount Paid: ₹" + newBill + "\n");
                        fw.write("Change: ₹" + change + "\n");
                    } else {
                        System.out.printf("Total Amount Paid: ₹%.2f\nTHANK YOU\n", newBill);
                        fw.write("Total Amount Paid: ₹" + newBill + "\n");
                    }
                } else {
                    System.out.println("You have given a wrong input.");
                }
                int max1 = 999999;
                int min1 = 100000;
                int otp1 = min1 + (int) (Math.random() * ((max1 - min1) + 1));
                System.out.println("OTP has been sent on the mobile number - " + number + " for payment verification.");
                System.out.println("OTP generated: " + otp1);
                System.out.print("Enter the OTP: ");
                long OTP = sc.nextLong();
                System.out.println("Verifying the OTP: " + OTP + ".....");
                TimeUnit.SECONDS.sleep(1);
                if (OTP == otp1) {
                    if (onlineMode.equalsIgnoreCase("DC") || onlineMode.equalsIgnoreCase("CC")) {
                        System.out.println("Payment has been done successfully through through your Card.");
                        fw.write(mode.toUpperCase() + " Mode through --> Card\n");
                    } else if (onlineMode.equalsIgnoreCase("UPI")) {
                        System.out.println("Payment has been done successfully through through your UPI.");
                        fw.write(mode.toUpperCase() + " Mode through --> UPI\n");
                    } else if (onlineMode.equalsIgnoreCase("GPay")) {
                        System.out.println("Payment has been done successfully through through your GPay.");
                        fw.write(mode.toUpperCase() + " Mode through --> GPay\n");
                    } else if (onlineMode.equalsIgnoreCase("AP")) {
                        System.out.println("Payment has been done successfully through through your Amazon Pay.");
                        fw.write(mode.toUpperCase() + " Mode through --> Amazon Pay\n");
                    } else if (onlineMode.equalsIgnoreCase("BHIM")) {
                        System.out.println("Payment has been done successfully through through your BHIM.");
                        fw.write(mode.toUpperCase() + " Mode through --> BHIM\n");
                    } else if (onlineMode.equalsIgnoreCase("Paytm")) {
                        System.out.println("Payment has been done successfully through through your Paytm.");
                        fw.write(mode.toUpperCase() + " Mode through --> Paytm\n");
                    }
                } else {
                    System.out.println("Incorrect OTP");
                }
            } else if (mode.equalsIgnoreCase("Offline")) {
                System.out.printf("Pay ₹%.2f at the time of delivery.\n", newBill);
                fw.write("Bill: ₹" + newBill + "\n");
            } else {
                System.out.println("You have given a wrong input.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

    void address() {
        try {
            System.out.println("Press Allow to access your current location to get the address.");
            System.out.print("Enter \"A\" for allowing or enter \"M\" for manually uploading the address: ");
            String press = sc.next();
            sc.nextLine();
            int max = 45;
            int min = 15;
            int time = min + (int) (Math.random() * ((max - min) + 1));
            if (press.equalsIgnoreCase("A")) {
                System.out.print("Do you want to change your address (Yes/No): ");
                String ans = sc.next();
                sc.nextLine();
                if (ans.equalsIgnoreCase("Yes")) {
                    System.out.print("Enter your address here: ");
                    String address = sc.nextLine();
                    System.out.println("Order will be delivered on " + address + " within " + time + " minutes.");
                    fw.write("Order will be delivered on " + address + " within " + time + " minutes.\n");
                } else if (ans.equalsIgnoreCase("No")) {
                    System.out.println("Order will be delivered within " + time + " minutes.");
                    fw.write("Order will be delivered within " + time + " minutes.\n");
                } else {
                    System.out.println("You  have given a wrong input.");
                }
            } else if (press.equalsIgnoreCase("M")) {
                System.out.print("Enter your address here: ");
                String address = sc.nextLine();
                System.out.println("Order will be delivered on " + address + " within " + time + " minutes.");
                fw.write("Order will be delivered on " + address + " within " + time + " minutes.\n");
            } else {
                System.out.println("You  have given a wrong input.");
            }
            fw.close();
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        }
    }

}

public class Food_Ordering {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Food_Zone fz = new Food_Zone();
            System.out.println("********** Food Zone **********");
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            String[] words = name.split("\\s");
            StringBuilder capitalizeStr = new StringBuilder();
            for (String word : words) {
                String firstLetter = word.substring(0, 1);
                String remainingLetters = word.substring(1);
                capitalizeStr.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
            }
            String newName = capitalizeStr.toString();
            System.out.print("Enter your mobile number: ");
            long number = sc.nextLong();
            int max = 99;
            int min = 10;
            int otp1 = min + (int) (Math.random() * ((max - min) + 1));
            int otp2 = min + (int) (Math.random() * ((max - min) + 1));
            int otp3 = min + (int) (Math.random() * ((max - min) + 1));
            String otp = String.valueOf(otp1) + otp2 + otp3;
            System.out.println("OTP has been sent on the mobile number: " + number);
            System.out.println("OTP generated: " + otp);
            System.out.print("Enter the OTP: ");
            String OTP = sc.next();
            System.out.println("Verifying the OTP: " + OTP + ".....");
            Calendar cal = Calendar.getInstance();
            TimeUnit.SECONDS.sleep(1);
            if (OTP.equals(otp)) {
                System.out.println("Logged in --> " + cal.getTime() + " as " + newName);
                int bill = 0;
                fz.list();
                int newBillS = fz.order(bill);
                fz.billing(newBillS, number);
                fz.address();
                System.out.println("Order by: " + newName);
                System.out.println("Details has been sent on your mobile number: " + number);
                System.out.println("Details has been saved in foodZone.txt");
            } else {
                System.out.println("Incorrect OTP");
            }
        } catch (InputMismatchException ex) {
            System.out.println("You have given a wrong input.\nError --> " + ex);
        } catch (Exception e) {
            System.out.println("Error --> " + e);
        } finally {
            System.out.println("\n********** Please Rate Us on Play Store **********");
        }
    }
}

package All_Assigments;
import java.util.*;
public class EvcPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Geli Dial :
        System.out.println("Enter the Dial : ");
        String evc = input.next();

//      Numberka EVcPluskayga :
        int evc_number = 614178717;

//                Haraga LacagTa :

        int Haragaga = 102;
//        Hubinta Evcplus Number :

        if (evc.equals("777")) {
            System.out.println("Fadlan Geli pinkada ");
            int pin = input.nextInt();
//            PinKaaga-Hubintiisa
            if (pin == 2047) {
                System.out.println("1. itus Haragaga ");
                System.out.println("2. kaarka ku hadalka ");
                System.out.println("3. Bixi Biilka");
                System.out.println("4. u wareeji Evcplus");
                System.out.println("5. warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.Biil payment");
//              Hubinta Waxa u baahantahay inaa samayso :
                int check = input.nextInt();

                if (check == 1) {
                    System.out.println("Haragaga waa $" + Haragaga);
                }

                //         qeybta karka

                else if (check == 2) {

                    System.out.println("kaarka ku hadalka :");

                    System.out.println("1. ku shubo Airtime : ");
                    System.out.println("2. ugu shub Airtime :");
                    System.out.println("3. mifi packages :");
                    System.out.println("4. ku shubo internet ");
                    System.out.println("5. ugu shub qof kale (mmt) : ");

                    int karka_check = input.nextInt();

//                    QeybTa_Ku shubashada :

                    if (karka_check == 1) {
                        System.out.println(" Fadlan Geli lacagta ");
                        int lacagta = input.nextInt();
                        System.out.println(" ma hubtaa inaad $ " + lacagta + " ugu shubtid undefined ?");
                        System.out.println("1, Haa ");
                        System.out.println(" 2. maya");

                        int haa = input.nextInt();

                        if (haa == 1) {
                            System.out.println("waxa ku subatay $ " + lacagta + " mobile no:" + evc_number);
                            System.out.println("Haragaga waa " + (Haragaga - lacagta));
                        } else {
                            System.out.println("macsalamo lacag kushubo");
                        }
                    }

//                  Qeybta_Ugu shubid :

                    else if (karka_check == 2) {
                        System.out.println("Fadlan geli mobile ka");
                        int karka_lam = input.nextInt();
                        System.out.println("Fadlan geli lacagta");
                        int lacgta_karka = input.nextInt();
                        System.out.println("Ma hubtaa in ugu shubtay $" + karka_lam + " 252 " + lacgta_karka);
                        System.out.println("1.Haa");
                        System.out.println("2.MAYA");

                        int haa2 = input.nextInt();

                        switch (haa2) {
                            case 1:
                                System.out.println("waxa ugu shubtay $" + lacgta_karka + " 252" + karka_lam);
                                System.out.println("Haraaga waa $" + (Haragaga - lacgta_karka));
                                break;
                            case 2:
                                System.out.println("Macsalaamo");
                                break;
                        }

                    }

//                    Qeybta_Mifi :

                    else if (karka_check == 3) {
                        System.out.println("Evcplus \n 1: ku shubo data-da MIFI ");
                        int Mifi = input.nextInt();
                        switch (Mifi) {

                            case 1:
                                System.out.println("-Internet Bundle Recharge -");
                                System.out.println("1.isbuucle(Weakly) \n2.Malinle(Daily)\n3.Bille(MIFI)");

                                int date_Limited = input.nextInt();

                                switch (date_Limited) {
                                    case 1:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$5 = 10 GB");
                                        System.out.println("2.$10 = 25 GB");

                                        int Mifi_date = input.nextInt();


                                        //   qeybta internetka mifika

                                        if (Mifi_date == 1) {
                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $5 " + " 252 " + mifi_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa = input.nextInt();

                                            if (check_haa == 1) {

                                                System.out.println("waxaa ugu shubtayb 10Gb " + "252" + mifi_num);
                                            } else {

                                                System.out.println(" macsalamo");
                                            }
                                        }

                                        //    qeybta labad mifi

                                        else if (Mifi_date == 2) {

                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $10 " + " 252 " + mifi_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa = input.nextInt();

                                            if (check_haa == 1) {

                                                System.out.println("waxaa ugu shubtayb 25Gb " + "252" + mifi_num);
                                            } else {

                                                System.out.println(" macsalamo");
                                            }


                                        }

                                        break;


                                    case 2:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$1 = 2 GB");
                                        System.out.println("2.$2 = 5 GB");

                                        int mifi_data1 = input.nextInt();

                                        if (mifi_data1 == 1) {
                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi2_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $1 " + " 252 " + mifi2_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int haa_check = input.nextInt();

                                            if (haa_check == 1) {

                                                System.out.println(" waxa ugu shubtay 2Gb  " + "252" + mifi2_num);
                                            } else {

                                                System.out.println(" macsalaamo");
                                            }

                                        }


                                        //   qeybta 2aad

                                        else if (mifi_data1 == 2) {

                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi2_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $2 " + " 252 " + mifi2_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa1 = input.nextInt();

                                            if (check_haa1 == 1) {

                                                System.out.println(" waxa ugu shubtay 2Gb  " + "252" + mifi2_num);
                                            } else {

                                                System.out.println(" macsalamo ");
                                            }

                                        }
                                        break;
                                    case 3:
                                        System.out.println("Fadlan Dooro bunle Ka");
                                        System.out.println("1.$20 = 40 GB");
                                        System.out.println("2.$40 = 80 GB");
                                        System.out.println("3.$60 = 150 GB");
                                        System.out.println("4.$30 = Unlimited Month");

                                        int mifi1_data2 = input.nextInt();

                                        if (mifi1_data2 == 1) {
                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi3_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $20 " + " 252 " + mifi3_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int haa_check1 = input.nextInt();

                                            if (haa_check1 == 1) {

                                                System.out.println(" waxa ugu shubtay 40Gb  " + "252" + mifi3_num);
                                            } else {

                                                System.out.println(" macsalaamo");
                                            }


                                        } else if (mifi1_data2 == 2) {

                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi3_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $40 " + " 252 " + mifi3_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa2 = input.nextInt();

                                            if (check_haa2 == 1) {

                                                System.out.println(" waxa ugu shubtay 80Gb  " + "252" + mifi3_num);
                                            } else {

                                                System.out.println(" macsalamo ");
                                            }

                                        } else if (mifi1_data2 == 3) {

                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi4_num = input.nextInt();
                                            System.out.println("Ma hubtaa in u shubtay $60 " + " 252 " + mifi4_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa2 = input.nextInt();

                                            if (check_haa2 == 1) {

                                                System.out.println(" waxa ugu shubtay 150Gb  " + "252" + mifi4_num);
                                            } else {

                                                System.out.println(" macsalamo ");
                                            }

                                        } else if (mifi1_data2 == 4) {

                                            System.out.println(" Fadalan Geli MIFI User ");
                                            int mifi5_num = input.nextInt();
                                            System.out.println(" waxa heshay xirmo unlimited " + " 252 " + mifi5_num);

                                            System.out.println("1. Haa");
                                            System.out.println("2. Maya");

                                            int check_haa2 = input.nextInt();

                                            if (check_haa2 == 1) {

                                                System.out.println(" waxa ugu shubtay xirmad  unlimited  " + "252" + mifi5_num);
                                            } else {

                                                System.out.println(" macsalamo ");
                                            }

                                        }
                                        break;


                                }

                                //  switch last
                        }

//                        karka 4

                    }

                    else if (karka_check == 4) {
                        System.out.println(" ku shubo internet  ");
                        System.out.println("fadlan dooro Namber -ka ku shubaneyso ");
                        System.out.println("1. isbuucle (weekly)");
                        System.out.println("2. Time based packages ");
                        System.out.println("3.Data");
                        System.out.println("4. mainly (Daily) ");
                        System.out.println("5.Bile mifi");

                        int kusubo = input.nextInt();


                        if (kusubo == 1) {
                            System.out.println("Fadlan Geli lacagta ");
                            int kusubo1 = input.nextInt();
                            System.out.println("Ma hubtaa inaad ku shubatid $" + kusubo1 + " 252 " + evc_number);

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int haa_check1 = input.nextInt();

                            if (haa_check1 == 1) {
                                System.out.println(" waxa ku shubtay " + kusubo1 + "GB" + "252" + evc_number);
                            } else {

                                System.out.println(" macsalaamo");
                            }
                        }
                        else if (kusubo == 2) {

                            System.out.println("Fadlan Geli lacagta ");
                            int kusubo1 = input.nextInt();
                            System.out.println("Ma hubtaa inaad ku shubatid $" + kusubo1 + " 252 " + evc_number);

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int haa_check1 = input.nextInt();

                            if (haa_check1 == 1) {
                                System.out.println(" waxa ku shubtay " + kusubo1 + " GB " + "252" + evc_number);
                            } else {

                                System.out.println(" macsalaamo");
                            }

                        }

                        else if (kusubo == 3) {

                            System.out.println("Fadlan Geli lacagta ");
                            int kusubo1 = input.nextInt();
                            System.out.println("Ma hubtaa inaad ku shubatid $" + kusubo1 + " 252 " + evc_number);

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int haa_check1 = input.nextInt();

                            if (haa_check1 == 1) {
                                System.out.println(" waxa ku shubtay " + kusubo1 + " GB " + "252" + evc_number);
                            }
                            else {

                                System.out.println(" macsalaamo");
                            }

                        }

                        else if (kusubo == 4) {

                            System.out.println("Fadlan Geli lacagta ");
                            int kusubo1 = input.nextInt();
                            System.out.println("Ma hubtaa inaad ku shubatid $" + kusubo1 + " 252 " + evc_number);

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int haa_check1 = input.nextInt();

                            if (haa_check1 == 1) {
                                System.out.println(" waxa ku shubtay " + kusubo1 + " GB " + "252" + evc_number);
                            } else {

                                System.out.println(" macsalaamo");
                            }

                        }

                        else if (kusubo == 5 ) {

                            System.out.println("Fadlan Geli lacagta ");
                            int kusubo1 = input.nextInt();
                            System.out.println("Ma hubtaa inaad ku shubatid $" +  kusubo1 + " 252 " );

                            System.out.println("1. Haa");
                            System.out.println("2. Maya");

                            int haa_check1 = input.nextInt();

                            if (haa_check1 == 1) {
                                System.out.println(" waxa ku shubtay xirmo internet ah "  + "252" + kusubo1 );
                            } else {

                                System.out.println(" macsalaamo");
                            }

                        }


                    }





                    else if (check == 3) {
                        System.out.println("Bixi Biil  ");
                        System.out.println("1.Post Paid");
                        System.out.println("2.Ku iibso");

                        int Bixi_Bilka = input.nextInt();

                        if (Bixi_Bilka == 1) {

                            System.out.println("1.Ogow Biilka");
                            System.out.println("2.Bixi BIil");
                            System.out.println("3.ka Bixi Biil");

                            int Bixi1 = input.nextInt();

                            if (Bixi1 == 1) {

                                System.out.println("Error ocured please try Again later");
                            } else if (Bixi1 == 2) {

                                System.out.println("fadlan geli lacagta");
                                int bixi = input.nextInt();
                                System.out.println(" ma hubtaa inaad bixisay $" + bixi);
                                System.out.println("1.Haa");
                                System.out.println("2.maya");
                                int bixi_haa = input.nextInt();


                                if (bixi_haa == 1 && bixi >= Haragaga) {

                                    System.out.println("Haraagu kumo Filna ");

                                } else if (bixi_haa == 2) {
                                    System.out.println("Macsalama");
                                } else {
                                    System.out.println("waad Bixisay biil ay tahay  $" + bixi);
                                    System.out.println("Haraaga waa $" + (Haragaga - bixi));

                                }


                            } else if (Bixi1 == 3) {

                                System.out.println("fadlan geli lacagta");
                                int bixi = input.nextInt();
                                System.out.println(" ma hubtaa inaad bixisay bil lacagtisu u tahay $" + bixi);
                                System.out.println("1.Haa");
                                System.out.println("2.maya");

                                int bixi_haa = input.nextInt();


                                if (bixi_haa == 1) {
                                    System.out.println("waad Bixisay biil ay tahay  $" + bixi);
                                    System.out.println("Haraaga waa $" + (Haragaga - bixi));
                                } else {
                                    System.out.println("Macsalama");
                                }


                            }


                        }

                    }
                }

                //                Qeybta U warejinta

                else if (check == 4) {
                    System.out.print("Fadlan Geli Numberka :");
                    int Number = input.nextInt();
                    System.out.print("Fadlan Geli Lacagta : ");
                    int Amount = input.nextInt();
                    System.out.println("Ma hubtaa in u wareejinaysid $" + Amount + " 252 " + Number);
                    System.out.println("1. Haa");
                    System.out.println("2. Maye");


                    int Check_Evc = input.nextInt();

                    if (Check_Evc == 1) {
                        System.out.println("Waxa u wareejisay $" + Amount + " 252 " + Number);

                    } else {
                        System.out.println("Macsalaamo");
                    }
                    if (Amount > Haragaga) {
                        System.out.println("Haraaga kuma Filna 252 " + Number);
                    }
                }

                //                    Warbixin Kooban

                else if (check == 5){
                    System.out.println("Warbixin Kooban");
                    System.out.println("1.Last Action");
                    System.out.println("2.wareejintii udanbeysay");
                    System.out.println("3.iibsashadii u danbeysay");
                    System.out.println("4.Last 3 Action");
                    System.out.println("5.Email Me My Action");

                    String Last_1 = "[-EVcplus-] waxaad $10 ugu shubtay 252 610223282 , Haraagaagu waa $100";
                    String Last_2 = "[-EVcplus-] waxaad $130 ugu shubtay 252 614303282 , Haraagaagu waa $230";
                    String Last_3 = "[-EVcplus-] waxaad $20 ugu shubtay 252 619404282 , Haraagaagu waa $250";

                    String ugu_danbeysay = "[-EVcplus-] waxaad $10 ugu shubtay 252 61 7288282 , Haraagaagu waa $100";

                    String All_Last = Last_1 + "\n" + Last_2 + "\n" + Last_3;

                    int check_input = input.nextInt();
                    if (check_input == 1){
                        System.out.println(Last_1);
                    }
                    else if (check_input == 2){
                        System.out.println(Last_2);
                    }
                    else if (check_input == 3)
                    {
                        System.out.println(ugu_danbeysay);
                    }
                    else if (check_input == 4){
                        System.out.println(All_Last);
                    }

                    else if (check_input == 5){
                        System.out.println("Error Accurred in the syntex");
                    }
                }




                else if (check == 6){
                    System.out.println("salaam Bank");
                    System.out.println("1. Ka wareeji EVCPlus");
                    int check_Salaam = input.nextInt();

                    if (check_Salaam == 1){
                        System.out.println("Fadlan dooro xisaabta bangiga");
                        System.out.println("1.SALAAM SOMALI BANK");
                        System.out.println("2.Darasalaam Bank");
                        System.out.println("3.Bank Beeraha");
                        System.out.println("4.Salaam Sch");

                        int salaam = input.nextInt();
                        if (salaam == 1){
                            System.out.print("Fadlan Geli Account-ka : ");
                            int Account = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaad : ");
                            String Macluumad = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salaam = input.nextInt();

                            System.out.println("Ma hubtaa in aad u dirayso Account-ka "+Account + " $"+Amount_salaam);
                            System.out.println("1.Haa \n2.Maye");

                            int Check = input.nextInt();

                            if (Check == 1 && Amount_salaam >= Haragaga){
                                System.out.println("Haraagaagu xisaabtada kuma filno user Account-ta "+Account);
                            }
                            else if (check ==2 ){
                                System.out.println("Macsalaamo");
                            }
                            else {
                                System.out.println("waxa u warejisay Accoun-ta $"+Amount_salaam);
                                System.out.println("Haraaga xisaabtada waa $"+(Haragaga - Amount_salaam));
                            }
                        }
                        else if (salaam == 2){
                            System.out.print("Fadlan Geli Account-ka : ");
                            int Account = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaad : ");
                            String Macluumad = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salaam = input.nextInt();

                            System.out.println("Ma hubtaa in aad u dirayso Account-ka "+Account + " $"+Amount_salaam);
                            System.out.println("1.Haa \n2.Maye");

                            int Check = input.nextInt();

                            if (Check == 1 && Amount_salaam >= Haragaga){
                                System.out.println("Haraagaagu xisaabtada kuma filno user Account-ta "+Account);
                            }
                            else if (check ==2 ){
                                System.out.println("Macsalaamo");
                            }
                            else {
                                System.out.println("waxa u warejisay Accoun-ta $"+Amount_salaam);
                                System.out.println("Haraaga xisaabtada waa $"+(Haragaga - Amount_salaam));
                            }
                        }
                        else if (salaam == 3){
                            System.out.print("Fadlan Geli Account-ka : ");
                            int Account = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaad : ");
                            String Macluumad = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salaam = input.nextInt();

                            System.out.println("Ma hubtaa in aad u dirayso Account-ka "+Account + " $"+Amount_salaam);
                            System.out.println("1.Haa \n2.Maye");

                            int Check = input.nextInt();

                            if (Check == 1 && Amount_salaam >= Haragaga){
                                System.out.println("Haraagaagu xisaabtada kuma filno user Account-ta "+Account);
                            }
                            else if (check ==2 ){
                                System.out.println("Macsalaamo");
                            }
                            else {
                                System.out.println("waxa u warejisay Accoun-ta $"+Amount_salaam);
                                System.out.println("Haraaga xisaabtada waa $"+(Haragaga - Amount_salaam));
                            }
                        }
                        else if (salaam == 4){
                            System.out.print("Fadlan Geli Account-ka : ");
                            int Account = input.nextInt();
                            System.out.print("Fadlan Geli Macluumaad : ");
                            String Macluumad = input.next();
                            System.out.print("Fadlan Geli Lacagta :");
                            int Amount_salaam = input.nextInt();

                            System.out.println("Ma hubtaa in aad u dirayso Account-ka "+Account + " $"+Amount_salaam);
                            System.out.println("1.Haa \n2.Maye");

                            int Check = input.nextInt();

                            if (Check == 1 && Amount_salaam >= Haragaga){
                                System.out.println("Haraagaagu xisaabtada kuma filno user Account-ta "+Account);
                            }
                            else if (check ==2 ){
                                System.out.println("Macsalaamo");
                            }
                            else {
                                System.out.println("waxa u warejisay Accoun-ta $"+Amount_salaam);
                                System.out.println("Haraaga xisaabtada waa $"+(Haragaga - Amount_salaam));
                            }
                        }
                    }
                    else
                        System.out.println("fadlan dooro lambar sax ah");
                }
                
                // maareynta
                else if (check == 7){
                    System.out.println("Maareynta");
                    System.out.println("1.Bedel numberka sirta ha");
                    System.out.println("2.bedel luqada");
                    System.out.println("3.wargalin mobile lumay");
                    System.out.println("4.lacag xerasho");
                    System.out.println("U celi lacag qaldantay");
                    System.out.println("EnableMobile Banking ");
                    int maareyn = input.nextInt();
                    if (maareyn == 1){
                        System.out.println("Fadlan geli pin-kaaga cusub");
                        int bin = input.nextInt();
                        System.out.println("Waad ku guuleysatay inaad binkaga badasho");
                    }
                    else if (maareyn == 2){
                        System.out.println("Fadlan dooro luqada");
                        System.out.println("1.Engish");
                        System.out.println("2.Somali");
                        int luqad = input.nextInt();
                        if (luqad == 1){
                            System.out.println("You have succcessfully changed your language");
                        }
                        else if (luqad == 2){
                            System.out.println("Waad ku guuleysatay inaad luqadada baasho");
                        }
                        else
                            System.out.println("Fadlan dooor number sax ah");
                    }
                    else if (maareyn == 3) {
                        System.out.println("Fadlan geli mobile-ka lumay");
                        int lumya_num = input.nextInt();
                        System.out.println("Fadlan geli numberkiisa sirta ah");
                    }
                    else if (maareyn == 4){
                        System.out.println("Fadlan geli number-ka khaladka ah");
                        int khalad_num = input.nextInt();
                        System.out.println("fadlan geli numberka saxda");
                        int num_sax = input.nextInt();
                    }
                    else if (maareyn == 5){
                        System.out.println("Fadlan geli aqoonsiga lacag diraha");
                        int  aqoonsi = input.nextInt();
                    }
                    else if (maareyn == 6){
                        System.out.println("Fadlan Geli numberka is diiwaan gelinta");
                        int diiwan_num = input.nextInt();
                    }
                }
                else if (check == 8){
                    System.out.println("1.Itus haraagaga");
                    System.out.println("2.wada bixi");
                    System.out.println("3.qeyb bixi");
                    int biil = input.nextInt();
                    if (biil == 1){
                        System.out.println("Fadlan geli reference number");
                        int reference = input.nextInt();
                    }
                    else if (biil == 2){
                        System.out.println("Fadlan geli reference number");
                        int reference = input.nextInt();
                    }
                    else if (biil == 3){
                        System.out.println("Fadlan geli reference number");
                        int reference = input.nextInt();
                    }
                    else
                        System.out.println("Fadlan dooro number sax ah");

                }
                else
                    System.out.println("Fadlan dooro numbe sax ah");



            }
            else {
                System.out.println("Fadlan iska Hubi pinkada");
            }

        }
        else {
            System.out.println("Macsalama (that wrong way )");
        }
    }
}
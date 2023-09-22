package hotel;
import java.util.*;
class swiggy
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\t\t \"Swiggy are you hungry\"\n\n");
		System.out.println("Select the hotel\n\n1.Buhari\n2.S.S Hyderabadi\n3.Eat's of Arab\n4.Amma Canteen\n");
		int hotel=s.nextInt();
		switch(hotel)
		{
			case 1:
			{
				System.out.println("\t\t\t\"Thank you for Selecting Buhari\"\n");
				System.out.println("Please select your food\n1.chicken biriyani\n2.mutton biriyani\n3.Fish\n4.chicken 65\n");
				int food=s.nextInt();
				switch(food)
				{
					case 1:
					{
						int price=100;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						Thread.sleep(2000);
						System.out.println("total bill:"+bill);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount1=s.nextDouble();
								if (amount1==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp1=Math.random()*9999+9999;
									int check1=(int)otp1;
									System.out.println(check1);
									int user_otp1=s.nextInt();
									if(user_otp1==check1)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 2:
						{
						int price=150;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(2000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount2=s.nextDouble();
								if (amount2==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp2=Math.random()*9999+9999;
									int check2=(int)otp2;
									System.out.println(check2);
									int user_otp2=s.nextInt();
									if(user_otp2==check2)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount3=s.nextDouble();
								if (amount3==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp3=Math.random()*9999+9999;
									int check3=(int)otp3;
									System.out.println(check3);
									int user_otp3=s.nextInt();
									if(user_otp3==check3)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 3:
						{
						int price=180;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(2000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount4=s.nextDouble();
								if (amount4==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp4=Math.random()*9999+9999;
									int check4=(int)otp4;
									System.out.println(check4);
									int user_otp4=s.nextInt();
									if(user_otp4==check4)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount5=s.nextDouble();
								if (amount5==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp5=Math.random()*9999+9999;
									int check5=(int)otp5;
									System.out.println(check5);
									int user_otp5=s.nextInt();
									if(user_otp5==check5)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 4:
						{
						int price=80;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(2000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount6=s.nextDouble();
								if (amount6==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp6=Math.random()*9999+9999;
									int check6=(int)otp6;
									System.out.println(check6);
									int user_otp6=s.nextInt();
									if(user_otp6==check6)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount7=s.nextDouble();
								if (amount7==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp7=Math.random()*9999+9999;
									int check7=(int)otp7;
									System.out.println(check7);
									int user_otp7=s.nextInt();
									if(user_otp7==check7)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
				}
			}
			break;
					case 2:
						{
				System.out.println("\t\t\t\"Thank you for Selecting S.S Hyderabadi\"\n");
				System.out.println("Please select your food\n1.chicken biriyani\n2.mutton biriyani\n3.Fish\n4.chicken 65\n");
				int food1=s.nextInt();
				switch(food1)
				{
					case 1:
					{
						int price=110;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 2:
						{
						int price=170;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(2000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 3:
						{
						int price=140;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 4:
						{
						int price=100;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
				}
						}
						break;
					case 3:
							{
				System.out.println("\t\t\t\"Thank you for Selecting Eat's of Arab\"\n");
				System.out.println("Please select your food\n1.chicken biriyani\n2.mutton biriyani\n3.Fish\n4.chicken 65\n");
				int food2=s.nextInt();
				switch(food2)
				{
					case 1:
					{
						int price=120;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 2:
						{
						int price=200;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 3:
						{
						int price=160;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 4:
						{
						int price=100;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
				}
							}
							break;
					case 4:
						{
				System.out.println("\t\t\t\"Thank you for Selecting Amma Canteen\"\n");
				System.out.println("Please select your food\n1.chicken biriyani\n2.mutton biriyani\n3.Fish\n4.chicken 65\n");
				int food3=s.nextInt();
				switch(food3)
				{
					case 1:
					{
						int price=90;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 2:
						{
						int price=110;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 3:
						{
						int price=110;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
					case 4:
						{
						int price=60;
						System.out.println("Please enter the quantity\n");
						int qty=s.nextInt();
						double bill=price*qty;
						System.out.println("total bill:"+bill);
						Thread.sleep(3000);
						System.out.println("Please select the payment mode\n1.google pay\n2.phonepe");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}
						case 2:
							{
								System.out.println("Please enter the amount");
								double amount=s.nextDouble();
								if (amount==bill)
								{
									System.out.println("please enter the otp:");
									Thread.sleep(3000);
									double otp=Math.random()*9999+9999;
									int check=(int)otp;
									System.out.println(check);
									int user_otp=s.nextInt();
									if(user_otp==check)
									{
										System.out.println("Request processing please wait");
										Thread.sleep(3000);
										System.out.println("Your order recived successfully");
										System.out.println("Delivery will be done in 30minutes");
											System.out.println("\t\t\t\t Thank You"+ (char)1);
									}
									else
									{
										System.out.println("otp is incorrect");
										Thread.sleep(2000);
										System.out.println("Payment failed");
									}
								}
									else
									{
										System.out.println("Please enter the valid amount");
										Thread.sleep(2000);
										System.out.println("payment failed");
									}
								break;
						}

		}
		break;
					}
				}
						}
		}
	}
}
						
					
					
		
	


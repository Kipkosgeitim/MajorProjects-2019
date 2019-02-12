#include <iostream>
using namespace std;

class bank{
private:
	char name[30];
	char accName[20];
	char type[20];
	int balance;
	int dop;
	int with;
	
	
public:
	void menu(void);
	void get(void);
	void check(void);
	void deposit(void);
	void withdraw(void);
	void BankInfo(void);
	
	
};
void bank::menu()
{
	int no;
	cout<<"\t\n choose your option from 1 to 6\n";
	cout<<"\t1.create a new account\n";
	cout<<"\t2.deposit your money\n";
	cout<<"\t3.check your balance\n";
	cout<<"\t4.withdraw money\n";
	cout<<"\t5.your account`s info\n";
	cout<<"\t6.exit";
	cout<<"\n";
	
	cin>>no;
	switch(no)
	{
		case 1:
			get();
			break;
		case 2:
			deposit();
			break;
		case 3:
			check();
			break;
		case 4:
			withdraw();
			break;
		case 5:
			BankInfo();
			break;
	}
}
void bank::get()
{
	int go;
	cout<<"\t\t\n enter name:";
	cin>>name;
	cout<<"\n";
	cout<<"\t\t\n enter account name:";
	cin>>accName;
	cout<<"\n";
	cout<<"\t\t\n enter the type of account:";
	cin>>type;
	cout<<"\n";
	cout<<"\t\t\n enter how much you want to deposit?:";
	cin>>balance;
	cout<<"\n";
	cout<<"\t\t\n hit zero to go to main menu:";
	cout<<"\n";
	cin>>go;
	
	if(go==0)
	{
		menu();
	}
	else return;
}
void bank::deposit()
{
	int go;
	cout<<"enter amount you want to deposit in your account\n";
	cin>>dop;
	balance+=dop;
	cout<<"\t\t\n hit zero to go to main menu:";
	cout<<"\n";
	cin>>go;
	
	if(go==0)
	{
		menu();
	}
	else return;
	
}
void bank::check()
{
	int go;
	cout<<"your account balance is:\n";
	cout<<balance;
	cout<<"\n";
	cout<<"\t\t\n hit zero to go to main menu:";
	
	cout<<"\n";
	cin>>go;
	
	if(go==0)
	{
		menu();
	}
	else return;
}
void bank::withdraw()
{
	int go;
	cout<<"enter amount you want to withdraw\n";
	cin>>with;
	cout<<"you have withdraw :Ksh"<<with<<"\t succesfully\t";
	balance-=with;
	cout<<"balance is:\n"<<balance;
	
	cout<<"\t\t\n hit zero to go to main menu:";
	
	cout<<"\n";
	cin>>go;
	
	if(go==0)
	{
		menu();
	}
	else return;
	
	
	cout<<"\n";
}
void bank::BankInfo()
{
	int go;
	cout<<"your name is:"<<name;
	cout<<"\n";
	cout<<"account name is:"<<accName;
	cout<<"\n";
	cout<<"type of account is:"<<type;
	cout<<"\n";
	cout<<"account balance is:"<<balance;
	
		cout<<"\t\t\n hit zero to go to main menu:";
	
	cout<<"\n";
	cin>>go;
	
	if(go==0)
	{
		menu();
	}
	else return;
	
	
	cout<<"\n";
}


int main()
{
	bank obj;
	obj.menu();
	
	return 0;
}



1. task 1
  #include<bits/stdc++.h>
using namespace std;

class Student
{
public:
    string name,id;
    double cgpa;
    void input(){
        cout<< "Enter Your Name: ";
        getline(cin>>ws,name);
        cout<< "Enter Your ID: ";
        getline(cin>>ws,id);
        cout<< "Enter Your CGPA: ";
        cin>> cgpa;
    }
    void output(){
        cout<< "Your Name: "<< name<<'\n';
        cout<< "Your ID: "<< id<<'\n';
        cout<< "Your CGPA: "<< cgpa<<'\n';
    }
};


int main()
{
    Student student;
    student.input();
    student.output();

}

2. task 2
  
#include<bits/stdc++.h>
using namespace std;

class Calculator
{
public:
    double a,b;
    void SetValues(){
        cout<< "Enter two numbers: ";
        cin>>a>>b;
    }
    void add(){
        cout<< "a + b = "<< a+b<< '\n';
    }
    void subtruct(){
        cout<< "a - b = "<< a-b<< '\n';
    }
    void multiply(){
        cout<< "a x b = "<< a * b<< '\n';
    }
    void devide(){
        if(b==0)
        {
            cout<< "Tumar Mathat dush"<<'\n';
        }
        else
        cout<< "a / b = "<< a/b<< '\n';
    }
};


int main()
{
    Calculator asign;
    asign.SetValues();
    asign.add();
    asign.subtruct();
    asign.multiply();
    asign.devide();

}

3. task 3
  #include<bits/stdc++.h>
using namespace std;

class Rectangle
{
public:
    double length, width;
    void SetDimension(){
       cout<< "Enter length and width: ";
        cin>>length>>width;
    } 
    void area(){
        cout<< "Area = "<<length * width<< '\n';
    }
    void perimeter(){
        cout<< "Perimeter = "<< 2*(length + width)<< '\n';
    }
};


int main()
{
    Rectangle asign;
    asign.SetDimension();
    asign.area();
    asign.perimeter();
}

4. task 4.

  #include<bits/stdc++.h>
using namespace std;

class BankAccount
{
public:
    string accountNumber ;
    double balance = 0;
    void deposit(){
        double x;
       cout<< "Enter Amount to deposit: ";
        cin>>x;
        balance+=x;
        cout<< "Successful.\nNew Balance: "<< balance<< '\n'; 
    } 
    void withdraw(){
        double x;
       cout<< "Enter Amount to withdraw: ";
        cin>>x;
        if(balance<x)
        {
            cout<< "Insufficient Balance";
        }
        else
        {
            balance-=x;
            cout<< "Successful.\nNew Balance: "<< balance<< '\n';
        }
    } 
    void displayBalance(){
        cout<< "balance = "<<balance<< '\n';
    }
};


int main()
{
    BankAccount asign;
    asign.deposit();
    asign.withdraw();
    asign.displayBalance();
}

5. task 5

  #include<bits/stdc++.h>
using namespace std;

class Circle
{
public:
    string accountNumber ;
    double radius, pi = 3.1416;
    void setRadius(){
       cout<< "Enter Radius: ";
        cin>>radius;
    } 
    void area(){
        
        cout<< "Area: "<< pi*radius*radius;
    } 
    void circumference(){
        cout<< "circumference = "<<2*pi*radius<< '\n';
    }
};


int main()
{
    Circle asign;
    asign.setRadius();
    asign.area();
    asign.circumference();
}

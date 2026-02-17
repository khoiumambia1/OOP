1. Access class.

#include<bits/stdc++.h>
using namespace std;

class Box
{
    public:
    float height;
    float width;
    float depth;
    
    void input()
    {
        cout<< "Enter Height: ";
        cin>> height;
        cout<< "Enter width: ";
        cin>> width;
        cout<< "Enter depth: ";
        cin>> depth;
    }

    float calculateVolume()
    {
        return height*width*depth;
    }
};

int main()
{
    Box b;
    b.input();

    cout<< "Volume of the box is: "<< b.calculateVolume()<< '\n';
}


2. Main function input. Show output.


#include<bits/stdc++.h>
using namespace std;

class Student
{
    public:
    string id,name;
    
    void display()
    {
        cout<< "ID: "<<id<< '\n';
        cout<< "Name: "<< name<< '\n';
    }
};

int main()
{
    Student s1;
    s1.id = "242-115-327";
    s1.name = "Manzurul Ambia";

    s1.display();
    return 0;
}

3. Create multiple refernce veriable.

#include<bits/stdc++.h>
using namespace std;

class Student
{
    public:
    string id,name;
    
    void display()
    {
        cout<< "ID: "<<id<< ' ';
        cout<< "Name: "<< name<< '\n';
    }
};

int main()
{
    Student s1,s2;
    s1.id = "242-115-327";
    s1.name = "Manzurul Ambia";
    s2.id = "242-115-344";
    s2.name = "Al-amin Chowdhury";

    s1.display();
    s2.display();
    return 0;
}

4. task 1

#include<bits/stdc++.h>
using namespace std;

class Rectangle
{
    public:
    float length;
    float width;
    
    void calculateArea()
    {
        cout<< "Area = "<< length*width;
    }
};

int main()
{
    Rectangle r;
    cout<< "Enter Lengtht: ";
    cin>> r.length;
    cout<< "Enter width: ";
    cin>> r.width;
    r.calculateArea();
    return 0;
}

5. task 2

#include<bits/stdc++.h>
using namespace std;

class Number
{
    public:
    int num;
    void EvenOdd()
    {
        if(num%2==0)
        cout<< "Even";
        else
        cout<< "Odd";
    }
};

int main()
{
   Number n;
   cout<< "Enter Number: ";
   cin>>n.num;
   n.EvenOdd();
    return 0;
}

6. task 3

#include<bits/stdc++.h>
using namespace std;

class Student
{
    public:
    int marks;
    string name;
    void displayResult()
    {
        cout<< "Name: "<< name<< " Marks = "<< marks<<'\n';
    }
};

int main()
{
   Student s1,s2;
    s1.marks = 55;
    s1.name = "Manzurul Ambia";
    s2.marks = 99;
    s2.name = "Al-amin Chowdhury";
    s1.displayResult();
    s2.displayResult();
    return 0;
}

7. task 4

#include<bits/stdc++.h>
using namespace std;

class Temperature
{
    public:
    float celsius;
    void ConverttoFarhenheit()
    {
        cout<< "Farhenheit value: "<<((9*celsius)/5)+32<<'\n';
    }
};

int main()
{
   Temperature t;
   cout<< "Celsius Value: ";
   cin>>t.celsius;
   t.ConverttoFarhenheit();
    return 0;
}

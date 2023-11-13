#include <iostream>
#include <cmath>

const double PI = 3.14159;
using namespace std;

class Circle{
    private : double radius;

    public:
    Circle(double radius){
        this->radius = radius;
    }

    double calculatearea(){
        return PI*pow(radius,2);
    }

    double calculateCircumference(){
        return 2*PI*radius;
    }

};


int main(){
    double radius;
    cout    << " Please enter the radius of the circle "<< endl;
    cin >> radius;

    Circle c(radius);

    double area = c.calculatearea();
    cout << "Area " << area << endl;

    double circumference = c.calculateCircumference();
    cout << "Circumference " << circumference << endl;
    return 0;
}
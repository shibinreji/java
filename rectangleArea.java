class rectangle
{
double length;
double breadth;
void setData(double l,double b)
{
length=l;
breadth =b;
}
double area()
{
double rectArea;
rectArea=length*breadth;
return rectArea;
}
}
class rectangleArea
{
public static void main(String args[])
{
rectangle a=new rectangle();
a.setData(12.48,13);
double result=a.area();
System.out.println("ARea of the rectangle is "+result);
}
} 

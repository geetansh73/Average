class avg
{
int sum,avg;
void calcavg(int a[])
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
int avg=sum/a.length;
System.out.print(avg);
}
public static void main(String geetansh[])
{
int marks[]=new int[5];
marks[0]=70;
marks[1]=50;
marks[2]=80;
marks[3]=75;
marks[4]=90;
avg obj=new avg();
obj.calcavg(marks);
}
}

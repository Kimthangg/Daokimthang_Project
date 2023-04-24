package Daokimthang_Project.Lab4.Lab4_3;

public class Employee extends Person {
    String employer_name, date_hired;
    public Employee(){}
    public Employee(String ten,int tuoi,char gioitinh,String employer_name, String date_hired){
        super(ten, tuoi, gioitinh);
        this.employer_name = employer_name;
        this.date_hired = date_hired;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\tNha tuyen dung: "+employer_name+"\tNgay thue: "+date_hired;
    }
}

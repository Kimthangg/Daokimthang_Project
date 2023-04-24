package Daokimthang_Project.Lab4.Lab4_3;

public class PartTimeEmployee extends Employee {
    int hours_Per_Week;
    public PartTimeEmployee(){}
    public PartTimeEmployee(String ten,int tuoi,char gioitinh,String employer_name, String date_hired,int hours_Per_Week) {
        super(ten, tuoi, gioitinh, employer_name, date_hired);
        this.hours_Per_Week = hours_Per_Week;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\tGio thue moi tuan: "+hours_Per_Week;
    }
}   

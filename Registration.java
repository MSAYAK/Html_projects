package pozo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Institue_Table")
public class Registration {
	
private String In_Name;



@Id
@Column(name="In_Code")
@GeneratedValue(strategy=GenerationType.AUTO)
private int In_Code;
private int DiseCode;
private String In_Uni;
private String Password;
private String C_Password;
private String Add_Line1;
private String Add_Line2;
private String City;
private int Pincode;






public Registration() {
	super();
}
public Registration(String in_Name, int in_Code, int diseCode, String in_Uni, String password, String c_Password,
		String add_Line1, String add_Line2, String city, int pincode) {
	super();
	In_Name = in_Name;
	In_Code = in_Code;
	DiseCode = diseCode;
	In_Uni = in_Uni;
	Password = password;
	C_Password = c_Password;
	Add_Line1 = add_Line1;
	Add_Line2 = add_Line2;
	City = city;
	Pincode = pincode;
}
public String getIn_Name() {
	return In_Name;
}
public void setIn_Name(String in_Name) {
	In_Name = in_Name;
}
public int getIn_Code() {
	return In_Code;
}
public void setIn_Code(int in_Code) {
	In_Code = in_Code;
}
public int getDiseCode() {
	return DiseCode;
}
public void setDiseCode(int diseCode) {
	DiseCode = diseCode;
}
public String getIn_Uni() {
	return In_Uni;
}
public void setIn_Uni(String in_Uni) {
	In_Uni = in_Uni;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getC_Password() {
	return C_Password;
}
public void setC_Password(String c_Password) {
	C_Password = c_Password;
}
public String getAdd_Line1() {
	return Add_Line1;
}
public void setAdd_Line1(String add_Line1) {
	Add_Line1 = add_Line1;
}
public String getAdd_Line2() {
	return Add_Line2;
}
public void setAdd_Line2(String add_Line2) {
	Add_Line2 = add_Line2;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getPincode() {
	return Pincode;
}
public void setPincode(int pincode) {
	Pincode = pincode;
}
@Override
public String toString() {
	return "Registration [In_Name=" + In_Name + ", In_Code=" + In_Code + ", DiseCode=" + DiseCode + ", In_Uni=" + In_Uni
			+ ", Password=" + Password + ", C_Password=" + C_Password + ", Add_Line1=" + Add_Line1 + ", Add_Line2="
			+ Add_Line2 + ", City=" + City + ", Pincode=" + Pincode + "]";
}
















}




 
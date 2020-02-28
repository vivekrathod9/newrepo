package ind.com.indexial.HbmMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="std_oto")
public class Student {
@Id
int stdId;
String stdName;
@OneToOne(cascade=CascadeType.ALL)
Address  address;
@Override
public String toString() {
	return "Student [stdId=" + stdId + ", stdName=" + stdName + ", address=" + address + "]";
}
public Student(int stdId, String stdName, Address address) {
	super();
	this.stdId = stdId;
	this.stdName = stdName;
	this.address = address;
}
public int getStdId() {
	return stdId;
}
public void setStdId(int stdId) {
	this.stdId = stdId;
}
public String getStdName() {
	return stdName;
}
public void setStdName(String stdName) {
	this.stdName = stdName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}





}

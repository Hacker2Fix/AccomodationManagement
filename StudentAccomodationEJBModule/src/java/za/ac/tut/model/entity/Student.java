/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Hello
 */
@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String name;
    private String surname;
    private String gender;
    private String idno;
    private String bursary_status;
    private String phoneNum;
    private String email;
    private String gurdian;
    private String gurdian_name;
    private String gurdianPhoneNum;
    private Integer roomNo;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date creationDate;
    

    public Student() {
    }

    public Student(Long id, String name, String surname, String gender, String idno, String bursary_status, String phoneNum, String email, String gurdian, String gurdian_name, String gurdianPhoneNum, Integer roomNo, Date creationDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.idno = idno;
        this.bursary_status = bursary_status;
        this.phoneNum = phoneNum;
        this.email = email;
        this.gurdian = gurdian;
        this.gurdian_name = gurdian_name;
        this.gurdianPhoneNum = gurdianPhoneNum;
        this.roomNo = roomNo;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getBursary_status() {
        return bursary_status;
    }

    public void setBursary_status(String bursary_status) {
        this.bursary_status = bursary_status;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getGurdian() {
        return gurdian;
    }

    public void setGurdian(String gurdian) {
        this.gurdian = gurdian;
    }

    public String getGurdian_name() {
        return gurdian_name;
    }

    public void setGurdian_name(String gurdian_name) {
        this.gurdian_name = gurdian_name;
    }

    public String getGurdianPhoneNum() {
        return gurdianPhoneNum;
    }

    public void setGurdianPhoneNum(String gurdianPhoneNum) {
        this.gurdianPhoneNum = gurdianPhoneNum;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.model.entity.Student[ id=" + id + " ]";
    }
    
}

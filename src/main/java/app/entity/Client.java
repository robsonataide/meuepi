package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.eclipse.persistence.annotations.*;
/**
 * Classe que representa a tabela CLIENT
 * @generated
 */
@Entity
@Table(name = "\"CLIENT\""
)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "fk_serviceProvided", contextProperty = "Company")
public class Client implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 2021124072l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String name;
  /**
   * @generated
   */
  @Column(name = "email", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  /**
   * @generated
   */
  @Column(name = "password", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String password;
  /**
   * @generated
   */
  @Column(name = "mobile", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String mobile;
  /**
   * @generated
   */
  @Column(name = "phone", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String phone;
  
  /**
   * Construtor
   * @generated
   */
  public Client(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Client setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém name
   * @param name name
   * return name
   * @generated
   */
  public java.lang.String getName(){
    return this.name;
  }
  
  /**
   * Define name
   * @param name name
   * @generated
   */
  public Client setName(java.lang.String name){
    this.name = name;
    return this;
  }
  
  /**
   * Obtém email
   * @param email email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Client setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém password
   * @param password password
   * return password
   * @generated
   */
  public java.lang.String getPassword(){
    return this.password;
  }
  
  /**
   * Define password
   * @param password password
   * @generated
   */
  public Client setPassword(java.lang.String password){
    this.password = password;
    return this;
  }
  
  /**
   * Obtém mobile
   * @param mobile mobile
   * return mobile
   * @generated
   */
  public java.lang.String getMobile(){
    return this.mobile;
  }
  
  /**
   * Define mobile
   * @param mobile mobile
   * @generated
   */
  public Client setMobile(java.lang.String mobile){
    this.mobile = mobile;
    return this;
  }
  
  /**
   * Obtém phone
   * @param phone phone
   * return phone
   * @generated
   */
  public java.lang.String getPhone(){
    return this.phone;
  }
  
  /**
   * Define phone
   * @param phone phone
   * @generated
   */
  public Client setPhone(java.lang.String phone){
    this.phone = phone;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof Client))
        return false;
      
      Client other = (Client)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela COMPANY
 * @generated
 */
@Entity
@Table(name = "\"COMPANY\""
)
@XmlRootElement
public class Company implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1679827954l;
  
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
  @Column(name = "address", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String address;
  
  /**
   * Construtor
   * @generated
   */
  public Company(){
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
  public Company setId(java.lang.String id){
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
  public Company setName(java.lang.String name){
    this.name = name;
    return this;
  }
  
  /**
   * Obtém address
   * @param address address
   * return address
   * @generated
   */
  public java.lang.String getAddress(){
    return this.address;
  }
  
  /**
   * Define address
   * @param address address
   * @generated
   */
  public Company setAddress(java.lang.String address){
    this.address = address;
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
      
      if(!(obj instanceof Company))
        return false;
      
      Company other = (Company)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

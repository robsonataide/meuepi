package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

/**
 * Classe que representa a tabela SERVICEPROVIDED
 * @generated
 */
@Entity
@Table(name = "\"SERVICEPROVIDED\""
)
@XmlRootElement
public class ServiceProvided implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -753833146l;
  
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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "durationEstimated", nullable = false, unique = false, insertable=true, updatable=true)
  private Date durationEstimated;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_company", referencedColumnName = "id", insertable=true, updatable=true)
  private Company company;
  
  /**
   * Construtor
   * @generated
   */
  public ServiceProvided(){
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
  public ServiceProvided setId(java.lang.String id){
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
  public ServiceProvided setName(java.lang.String name){
    this.name = name;
    return this;
  }
  
  /**
   * Obtém durationEstimated
   * @param durationEstimated durationEstimated
   * return durationEstimated
   * @generated
   */
  public Date getDurationEstimated(){
    return this.durationEstimated;
  }
  
  /**
   * Define durationEstimated
   * @param durationEstimated durationEstimated
   * @generated
   */
  public ServiceProvided setDurationEstimated(Date durationEstimated){
    this.durationEstimated = durationEstimated;
    return this;
  }
  
  /**
   * Obtém company
   * @param company company
   * return company
   * @generated
   */
  public Company getCompany(){
    return this.company;
  }
  
  /**
   * Define company
   * @param company company
   * @generated
   */
  public ServiceProvided setCompany(Company company){
    this.company = company;
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
      
      if(!(obj instanceof ServiceProvided))
        return false;
      
      ServiceProvided other = (ServiceProvided)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

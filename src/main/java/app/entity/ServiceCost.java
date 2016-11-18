package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

import org.eclipse.persistence.annotations.*;
/**
 * Classe que representa a tabela SERVICECOST
 * @generated
 */
@Entity
@Table(name = "\"SERVICECOST\""
)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "fk_serviceProvided", contextProperty = "Company")
public class ServiceCost implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -261015598l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "cost", nullable = false, unique = false, precision=9, scale=2, insertable=true, updatable=true)
  private java.lang.Double cost;
  /**
   * @generated
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "starts", nullable = false, unique = false, insertable=true, updatable=true)
  private Date starts;
  /**
   * @generated
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "ends", nullable = true, unique = false, insertable=true, updatable=true)
  private Date ends;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_serviceProvided", referencedColumnName = "id", insertable=false, updatable=false)
  private ServiceProvided serviceProvided;
  
  /**
   * Construtor
   * @generated
   */
  public ServiceCost(){
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
  public ServiceCost setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém cost
   * @param cost cost
   * return cost
   * @generated
   */
  public java.lang.Double getCost(){
    return this.cost;
  }
  
  /**
   * Define cost
   * @param cost cost
   * @generated
   */
  public ServiceCost setCost(java.lang.Double cost){
    this.cost = cost;
    return this;
  }
  
  /**
   * Obtém starts
   * @param starts starts
   * return starts
   * @generated
   */
  public Date getStarts(){
    return this.starts;
  }
  
  /**
   * Define starts
   * @param starts starts
   * @generated
   */
  public ServiceCost setStarts(Date starts){
    this.starts = starts;
    return this;
  }
  
  /**
   * Obtém ends
   * @param ends ends
   * return ends
   * @generated
   */
  public Date getEnds(){
    return this.ends;
  }
  
  /**
   * Define ends
   * @param ends ends
   * @generated
   */
  public ServiceCost setEnds(Date ends){
    this.ends = ends;
    return this;
  }
  
  /**
   * Obtém serviceProvided
   * @param serviceProvided serviceProvided
   * return serviceProvided
   * @generated
   */
  public ServiceProvided getServiceProvided(){
    return this.serviceProvided;
  }
  
  /**
   * Define serviceProvided
   * @param serviceProvided serviceProvided
   * @generated
   */
  public ServiceCost setServiceProvided(ServiceProvided serviceProvided){
    this.serviceProvided = serviceProvided;
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
      
      if(!(obj instanceof ServiceCost))
        return false;
      
      ServiceCost other = (ServiceCost)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

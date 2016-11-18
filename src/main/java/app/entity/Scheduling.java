package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

import org.eclipse.persistence.annotations.*;
/**
 * Classe que representa a tabela SCHEDULING
 * @generated
 */
@Entity
@Table(name = "\"SCHEDULING\""
)
@XmlRootElement
@Multitenant(MultitenantType.SINGLE_TABLE)
@TenantDiscriminatorColumn(name = "fk_serviceProvided", contextProperty = "Company")
public class Scheduling implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1306413477l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "scheduleFor", nullable = false, unique = false, insertable=true, updatable=true)
  private Date scheduleFor;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_serviceProvided", referencedColumnName = "id", insertable=false, updatable=false)
  private ServiceProvided serviceProvided;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_client", referencedColumnName = "id", insertable=true, updatable=true)
  private Client client;
  
  /**
   * Construtor
   * @generated
   */
  public Scheduling(){
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
  public Scheduling setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém scheduleFor
   * @param scheduleFor scheduleFor
   * return scheduleFor
   * @generated
   */
  public Date getScheduleFor(){
    return this.scheduleFor;
  }
  
  /**
   * Define scheduleFor
   * @param scheduleFor scheduleFor
   * @generated
   */
  public Scheduling setScheduleFor(Date scheduleFor){
    this.scheduleFor = scheduleFor;
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
  public Scheduling setServiceProvided(ServiceProvided serviceProvided){
    this.serviceProvided = serviceProvided;
    return this;
  }
  
  /**
   * Obtém client
   * @param client client
   * return client
   * @generated
   */
  public Client getClient(){
    return this.client;
  }
  
  /**
   * Define client
   * @param client client
   * @generated
   */
  public Scheduling setClient(Client client){
    this.client = client;
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
      
      if(!(obj instanceof Scheduling))
        return false;
      
      Scheduling other = (Scheduling)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

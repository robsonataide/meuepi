package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

/**
 * Classe que representa a tabela EXECUTION
 * @generated
 */
@Entity
@Table(name = "\"EXECUTION\""
)
@XmlRootElement
public class Execution implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 912995064l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "serviceCost", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String serviceCost;
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
  @Column(name = "ends", nullable = false, unique = false, insertable=true, updatable=true)
  private Date ends;
  /**
   * @generated
   */
  @OneToOne 
  @JoinColumn(name="fk_scheduling", referencedColumnName = "id", insertable=true, updatable=true)
  private Scheduling scheduling;
  
  /**
   * Construtor
   * @generated
   */
  public Execution(){
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
  public Execution setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém serviceCost
   * @param serviceCost serviceCost
   * return serviceCost
   * @generated
   */
  public java.lang.String getServiceCost(){
    return this.serviceCost;
  }
  
  /**
   * Define serviceCost
   * @param serviceCost serviceCost
   * @generated
   */
  public Execution setServiceCost(java.lang.String serviceCost){
    this.serviceCost = serviceCost;
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
  public Execution setStarts(Date starts){
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
  public Execution setEnds(Date ends){
    this.ends = ends;
    return this;
  }
  
  /**
   * Obtém scheduling
   * @param scheduling scheduling
   * return scheduling
   * @generated
   */
  public Scheduling getScheduling(){
    return this.scheduling;
  }
  
  /**
   * Define scheduling
   * @param scheduling scheduling
   * @generated
   */
  public Execution setScheduling(Scheduling scheduling){
    this.scheduling = scheduling;
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
      
      if(!(obj instanceof Execution))
        return false;
      
      Execution other = (Execution)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}

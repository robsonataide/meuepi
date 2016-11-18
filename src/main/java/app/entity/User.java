package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela USER
 * @generated
 */
@Entity
@Table(name = "\"USER\""
,uniqueConstraints=@UniqueConstraint(columnNames={
"login" 
})
)
@XmlRootElement
public class User implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 2648042l;
  
  /**
   * @generated
   */
  @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  /**
   * @generated
   */
  @Column(name = "name", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String name;
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "login", nullable = false, unique = true, insertable=true, updatable=true)
  private java.lang.String login;
  /**
   * @generated
   */
  @Column(name = "password", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String password;
  /**
   * @generated
   */
  @Column(name = "theme", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String theme;
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
  public User(){
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
  public User setEmail(java.lang.String email){
    this.email = email;
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
  public User setName(java.lang.String name){
    this.name = name;
    return this;
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
  public User setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém login
   * @param login login
   * return login
   * @generated
   */
  public java.lang.String getLogin(){
    return this.login;
  }
  
  /**
   * Define login
   * @param login login
   * @generated
   */
  public User setLogin(java.lang.String login){
    this.login = login;
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
  public User setPassword(java.lang.String password){
    this.password = password;
    return this;
  }
  
  /**
   * Obtém theme
   * @param theme theme
   * return theme
   * @generated
   */
  public java.lang.String getTheme(){
    return this.theme;
  }
  
  /**
   * Define theme
   * @param theme theme
   * @generated
   */
  public User setTheme(java.lang.String theme){
    this.theme = theme;
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
  public User setCompany(Company company){
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
      
      if(!(obj instanceof User))
        return false;
      
      User other = (User)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
/**
 * Classe que representa a camada de negócios de ServiceProvidedBusiness
 * 
 * @generated
 **/
@Service("ServiceProvidedBusiness")
public class ServiceProvidedBusiness {


    /**
     * Instância da classe ServiceProvidedDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ServiceProvidedDAO")
    protected ServiceProvidedDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ServiceProvided post(final ServiceProvided entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public ServiceProvided get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       ServiceProvided result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ServiceProvided put(final ServiceProvided entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<ServiceProvided> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<ServiceProvided> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ServiceCost> findServiceCost(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<ServiceCost> result = repository.findServiceCost(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Scheduling> findScheduling(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<Scheduling> result = repository.findScheduling(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }



  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Client> listClient(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Client> result = repository.listClient(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteClient(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteClient(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }


}
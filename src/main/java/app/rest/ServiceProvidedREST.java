package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de ServiceProvided
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/ServiceProvided")
public class ServiceProvidedREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ServiceProvidedBusiness")
    private ServiceProvidedBusiness serviceProvidedBusiness;

    /**
     * @generated
     */
      @Autowired
      @Qualifier("ClientBusiness")
      private ClientBusiness clientBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("ServiceCostBusiness")
      private ServiceCostBusiness serviceCostBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("SchedulingBusiness")
      private SchedulingBusiness schedulingBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public ServiceProvided post(@Validated @RequestBody final ServiceProvided entity) throws Exception {
        return serviceProvidedBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ServiceProvided put(@Validated @RequestBody final ServiceProvided entity) throws Exception {
        return serviceProvidedBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ServiceProvided put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final ServiceProvided entity) throws Exception {
        return serviceProvidedBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        serviceProvidedBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<ServiceProvided>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(serviceProvidedBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ServiceCost")    
  public HttpEntity<PagedResources<ServiceCost>> findServiceCost(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(serviceProvidedBusiness.findServiceCost(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ServiceCost/{relationId}")    
  public void deleteServiceCost(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.serviceCostBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/ServiceCost/{relationId}")
  public ServiceCost putServiceCost(@Validated @RequestBody final ServiceCost entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
  return this.serviceCostBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/ServiceCost")
  public ServiceCost postServiceCost(@Validated @RequestBody final ServiceCost entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  ServiceProvided serviceProvided = this.serviceProvidedBusiness.get(instanceId);
  entity.setServiceProvided(serviceProvided);
  return this.serviceCostBusiness.post(entity);
  }   

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Scheduling")    
  public HttpEntity<PagedResources<Scheduling>> findScheduling(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(serviceProvidedBusiness.findScheduling(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Scheduling/{relationId}")    
  public void deleteScheduling(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.schedulingBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Scheduling/{relationId}")
  public Scheduling putScheduling(@Validated @RequestBody final Scheduling entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
  return this.schedulingBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Scheduling")
  public Scheduling postScheduling(@Validated @RequestBody final Scheduling entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  ServiceProvided serviceProvided = this.serviceProvidedBusiness.get(instanceId);
  entity.setServiceProvided(serviceProvided);
  return this.schedulingBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Client")
  public HttpEntity<PagedResources<Client>> listClient(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(serviceProvidedBusiness.listClient(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Client")
  public ServiceProvided postClient(@Validated @RequestBody final Client entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      Scheduling newScheduling = new Scheduling();

      ServiceProvided instance = this.serviceProvidedBusiness.get(instanceId);

      newScheduling.setClient(entity);
      newScheduling.setServiceProvided(instance);
      
      this.schedulingBusiness.post(newScheduling);

      return newScheduling.getServiceProvided();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Client/{relationId}")
  public void deleteClient(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.serviceProvidedBusiness.deleteClient(instanceId, relationId);
  }  




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public ServiceProvided get(@PathVariable("id") java.lang.String id) throws Exception {
      return serviceProvidedBusiness.get(id);
  }
}
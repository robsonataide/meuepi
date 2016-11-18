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
 * Controller para expor serviços REST de Client
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Client")
public class ClientREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ClientBusiness")
    private ClientBusiness clientBusiness;

    /**
     * @generated
     */
      @Autowired
      @Qualifier("ServiceProvidedBusiness")
      private ServiceProvidedBusiness serviceProvidedBusiness;
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
    public Client post(@Validated @RequestBody final Client entity) throws Exception {
        return clientBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Client put(@Validated @RequestBody final Client entity) throws Exception {
        return clientBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Client put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Client entity) throws Exception {
        return clientBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        clientBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Client>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(clientBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Scheduling")    
  public HttpEntity<PagedResources<Scheduling>> findScheduling(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clientBusiness.findScheduling(instanceId,  pageable )), HttpStatus.OK);
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
  Client client = this.clientBusiness.get(instanceId);
  entity.setClient(client);
  return this.schedulingBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/ServiceProvided")
  public HttpEntity<PagedResources<ServiceProvided>> listServiceProvided(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(clientBusiness.listServiceProvided(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/ServiceProvided")
  public Client postServiceProvided(@Validated @RequestBody final ServiceProvided entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      Scheduling newScheduling = new Scheduling();

      Client instance = this.clientBusiness.get(instanceId);

      newScheduling.setServiceProvided(entity);
      newScheduling.setClient(instance);
      
      this.schedulingBusiness.post(newScheduling);

      return newScheduling.getClient();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/ServiceProvided/{relationId}")
  public void deleteServiceProvided(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
    this.clientBusiness.deleteServiceProvided(instanceId, relationId);
  }  




  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Client get(@PathVariable("id") java.lang.String id) throws Exception {
      return clientBusiness.get(id);
  }
}
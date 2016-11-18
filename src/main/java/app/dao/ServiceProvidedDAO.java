package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 
/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ServiceProvidedDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ServiceProvidedDAO extends JpaRepository<ServiceProvided, java.lang.String> {

  /**
   * Obtém a instância de ServiceProvided utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ServiceProvided entity WHERE entity.id = :id")
  public ServiceProvided findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ServiceProvided utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ServiceProvided entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from ServiceProvided c")
  public Page<ServiceProvided> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ServiceCost entity WHERE entity.serviceProvided.id = :id")
  public Page<ServiceCost> findServiceCost(@Param(value="id") java.lang.String id,  Pageable pageable );
  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Scheduling entity WHERE entity.serviceProvided.id = :id")
  public Page<Scheduling> findScheduling(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.client FROM Scheduling entity WHERE entity.serviceProvided.id = :id")
  public Page<Client> listClient(@Param(value="id") java.lang.String id,  Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Scheduling entity WHERE entity.serviceProvided.id = :instanceId AND entity.client.id = :relationId")
  public int deleteClient(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);



}
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
@Repository("ClientDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClientDAO extends JpaRepository<Client, java.lang.String> {

  /**
   * Obtém a instância de Client utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Client entity WHERE entity.id = :id")
  public Client findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Client utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Client entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Client c")
  public Page<Client> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Scheduling entity WHERE entity.client.id = :id")
  public Page<Scheduling> findScheduling(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.serviceProvided FROM Scheduling entity WHERE entity.client.id = :id")
  public Page<ServiceProvided> listServiceProvided(@Param(value="id") java.lang.String id,  Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Scheduling entity WHERE entity.client.id = :instanceId AND entity.serviceProvided.id = :relationId")
  public int deleteServiceProvided(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);



}
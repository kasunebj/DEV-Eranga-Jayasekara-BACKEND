package com.ABC.gps.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ABC.gps.Dto.Details;

@Repository
public interface DetailaRepo extends CrudRepository<Details, Long> {

    Details getDetailById(Long id);


    void delete(Long id);
}

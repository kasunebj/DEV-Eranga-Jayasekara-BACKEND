package com.ABC.gps.Services;

import org.springframework.beans.factory.annotation.Autowired;
import com.ABC.gps.Repository.DetailaRepo;
import com.ABC.gps.Dto.Details;
public class DetailService {

    public class DetailsService {
        @Autowired
        private DetailaRepo Drepo;

        public Details add(Details detail){
            Drepo.save(detail);
            return detail;
        }

        public Details get( Long Id){ return Drepo.getDetailById(Id); }

        public void rmv( Long Id){ Drepo.delete(Id); }

    }
}

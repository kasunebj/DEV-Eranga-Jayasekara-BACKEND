package com.ABC.gps.gpsController;

import com.ABC.gps.Dto.Details;
import com.ABC.gps.Services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/retsgps")
    @Api(value="Restgps", description="Gps data Management ABC")
    public class Controller {

        @Autowired
        private DetailService.DetailsService detailsService;

        @ApiOperation(value = "Add a vehicle details")
        @GetMapping("/details")
        public void addDetails(@RequestBody Details details){ detailsService.add(details); }

        @ApiOperation(value = "get vehicle detail with specific id ")
        @GetMapping("/details/{id}")
        public Details getDetails(@RequestParam("id")Long id){ return detailsService.get(id); }

        @ApiOperation(value = "Remove vehicle detail")
        @DeleteMapping ("/details/{id}")
        public void rmvDetails(@RequestParam("id")Long id){ detailsService.rmv(id); }

        @ApiOperation(value = "update details")
        @PutMapping("/details/{id}")
        public void editDetails(@RequestBody Details details,@RequestParam Long id){
            details.setId(id);
            detailsService.add(details); }
    }


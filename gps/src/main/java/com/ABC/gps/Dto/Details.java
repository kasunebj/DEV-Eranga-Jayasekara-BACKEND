package com.ABC.gps.Dto;
import javax.persistence.*;

    @Entity
    @Table(name = "Details")
    public class Details {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO) private Long Id ;

        @Column(name ="speed") private String Speed;

        @Column(name ="sLongitude") private String Longitude;

        @Column(name ="Latitude") private  String Latitude;

        @Column(name ="Altitude") private String Altitude;

        @Column(name ="Address") private String Address;

        @Column(name ="Address") private String Andel;

        @Column(name ="Address") private String Company;

        public Long getId() { return Id; }

        public void setId(Long id) { Id = id; }

        public String getSpeed() { return Speed; }

        public void setSpeed(String speed) { Speed = speed; }

        public String getLongitude() { return Longitude; }

        public void setLongitude(String longitude) { Longitude = longitude; }

        public String getLatitude() { return Latitude; }

        public void setLatitude(String latitude) { Latitude = latitude; }

        public String getAltitude() { return Altitude; }

        public void setAltitude(String altitude) { Altitude = altitude; }

        public String getAddress() { return Address; }

        public void setAddress(String address) { Address = address; }

        public String getAndel() { return Andel; }

        public void setAndel(String andel) { Andel = andel; }

        public String getCompany() { return Company; }

        public void setCompany(String company) { Company = company; }
    }



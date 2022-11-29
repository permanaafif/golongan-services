/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.afifpermana.golongan.services.service;

import com.afifpermana.golongan.services.entity.Golongan;
import com.afifpermana.golongan.services.repository.GolonganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Apip
 */
@Service
public class GolonganService {
    @Autowired
    private GolonganRepository golonganRepository;
    
    public Golongan saveGolongan(Golongan golongan) {
        if (golongan.getGolonganGajiPokok() == 1) {
            long gp = 1000000;
            golongan.setGolonganGajiPokok(gp);
        } else if (golongan.getGolonganGajiPokok() == 2){
            long gp = 750000;
            golongan.setGolonganGajiPokok(gp);
        } else if (golongan.getGolonganGajiPokok() == 3){
            long gp = 500000;
            golongan.setGolonganGajiPokok(gp);
        } 
        return golonganRepository.save(golongan);
    }
    
    public Golongan findGolonganById(Long golonganId){
        return golonganRepository.findByGolonganId(golonganId);
    }
    
}

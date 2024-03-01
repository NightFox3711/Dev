package com.prueba1.service.impl;

import com.prueba1.dao.cletaDao;
import com.prueba1.domain.cleta;
import com.prueba1.service.cletaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class cletaServiceImpl implements cletaService {
    
    @Autowired
    private cletaDao cletaDao;

    @Override
    @Transactional(readOnly=true)
    public List<cleta> getcletas(boolean activos) {
        var lista=cletaDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public cleta getcleta(cleta cleta) {
        return cletaDao.findById(cleta.getidcleta()).orElse(null);
    }

    @Override
    @Transactional
    public void save(cleta cleta) {
        cletaDao.save(cleta);
    }

    @Override
    @Transactional
    public void delete(cleta cleta) {
        cletaDao.delete(cleta);
    }
}

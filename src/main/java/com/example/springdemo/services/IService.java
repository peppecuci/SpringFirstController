package com.example.springdemo.services;

import com.example.springdemo.entities.Player;

import java.util.List;

public interface IService<TENTITY, TDTO, TID> {

    List<TDTO> getAll();
    TDTO getById(TID id);
    boolean update(TID id, TENTITY entity);
    boolean delete(TID id);
    TDTO toInsert(TENTITY entity);



}

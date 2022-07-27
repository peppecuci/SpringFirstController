package com.example.springdemo.services;

import java.util.List;

public interface IService<TENTITY, TID> {

    List<TENTITY> getAll();
    TENTITY getById(TID id);
    boolean update(TID id, TENTITY entity);
    boolean delete(TID id);
    TENTITY insert(TENTITY entity);

}

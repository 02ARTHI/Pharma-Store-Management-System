package com.learning.PharmaStoreManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.PharmaStoreManagement.model.MedicalStore;

public interface IMediRepository extends JpaRepository<MedicalStore, Integer> {

}

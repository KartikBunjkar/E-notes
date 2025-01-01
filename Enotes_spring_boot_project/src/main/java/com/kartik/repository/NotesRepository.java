package com.kartik.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.entity.Notes;
import com.kartik.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{

	public Page<Notes> findByUser(User user, Pageable pageable);
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{
	
}

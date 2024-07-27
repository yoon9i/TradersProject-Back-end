package com.exam.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.exam.dto.MovementDTO;


public interface MovementService {
	
	public List<MovementDTO> findAll();
	public List<MovementDTO> findByOrdercode(Long ordercode);
	public List<MovementDTO> findGroupedByMovdate();
	public List<MovementDTO> findAllByOrderByMovdateDesc();
	
	// 날짜순으로 모든 데이터찾기
	public List<MovementDTO> findAllSortedByDate();
    // 날짜별로 데이터를 그룹화하여 반환
    Map<LocalDate, List<MovementDTO>> findAllGroupedByDate();
}
package com.xantrix.webapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xantrix.webapp.entity.DettListini;
import com.xantrix.webapp.entity.Listini;
import com.xantrix.webapp.repository.PrezziRepository;

@Service
@Transactional
public class PrezziServiceImpl implements PrezziService
{
	@Autowired
	PrezziRepository prezziRepository;

	@Override
	public DettListini SelPrezzo(String CodArt, String Listino)
	{
		return prezziRepository.SelByCodArtAndList(CodArt, Listino);
	}
	
	@Override
	public void DelPrezzo(String CodArt, String IdList) 
	{
		prezziRepository.DelRowDettList(CodArt, IdList);
	}

}

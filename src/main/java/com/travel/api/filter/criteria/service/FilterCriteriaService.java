package com.travel.api.filter.criteria.service;

import java.util.List;

import com.travel.api.filter.criteria.bean.FilterCriteriaBean;

public interface FilterCriteriaService<T> {

	public List<?> getListOfFilteredData(Class<?> clazz, List<FilterCriteriaBean> criteriaList, Integer limit);

}

package com.travel.api.filter.criteria.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.api.constant.Constants;
import com.travel.api.filter.criteria.bean.FilterCriteriaBean;
import com.travel.api.filter.criteria.service.FilterCriteriaService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public class FilterCriteriaServiceImpl<T> implements FilterCriteriaService<T> {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<?> getListOfFilteredData(Class<?> clazz, List<FilterCriteriaBean> criteriaList, Integer limit) {
		// TODO Auto-generated method stub

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<?> cq = cb.createQuery(clazz);
		Root<?> root = cq.from(clazz);
		cq.orderBy(cb.desc(root.get("mDate")));
		List<Predicate> predicates = new ArrayList<>();

		if (criteriaList != null && !criteriaList.isEmpty()) {

			Iterator<FilterCriteriaBean> itr = criteriaList.iterator();

			while (itr.hasNext()) {

				FilterCriteriaBean filterBean = itr.next();

				if (filterBean.getOperation().equals(Constants.EQUALS)) {
					predicates.add(cb.equal(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.NOT_EQUALS)) {
					predicates.add(cb.notEqual(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.Gr_Then)) {
					predicates.add(cb.greaterThan(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().endsWith(Constants.Gr_Then_EQ)) {
					predicates.add(cb.greaterThanOrEqualTo(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().endsWith(Constants.Less_Then)) {
					predicates.add(cb.lessThan(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.Less_Then_EQ)) {
					predicates.add(cb.lessThanOrEqualTo(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.STARTS_WITH)) {
					predicates.add(cb.like(root.get(filterBean.getAttribute()), filterBean.getValue() + "%"));
				} else if (filterBean.getOperation().equals(Constants.CONTAINS)) {
					predicates.add(cb.like(root.get(filterBean.getAttribute()), "%" + filterBean.getValue() + "%"));
				} else if (filterBean.getOperation().endsWith(Constants.MATCHES)) {
					predicates.add(cb.like(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.NOT_MATCHES)) {
					predicates.add(cb.notLike(root.get(filterBean.getAttribute()), filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.AMONG)) {
					predicates.add(cb.in(root.get(filterBean.getAttribute())).value(filterBean.getValue()));
				} else if (filterBean.getOperation().equals(Constants.NOT_AMONG)) {
					predicates.add(cb.in(root.get(filterBean.getAttribute())).value(filterBean.getValue()).not());
				}

			}
			cq.where(predicates.toArray(new Predicate[0]));
		}
		TypedQuery<?> query = entityManager.createQuery(cq);

		if (limit != null && limit != 0) {
			query.setMaxResults(limit);
		}

		return query.getResultList();
	}

}

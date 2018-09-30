package com.lijx.cat.repository;


import com.lijx.cat.entity.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jxli on 2018/9/19.
 */
public interface OrganizationRepository extends PagingAndSortingRepository<Organization,Long> {

	Organization findTop1ByleaderId(Long leaderId);
}

package com.leone.boot.quartz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 *
 * @author leone
 * @since 2018-09-06
 **/
public interface TaskRepository extends JpaRepository<JobBean, Integer> {

}

package com.lijx.cat.repository;

import com.lijx.cat.entity.Task;
import java.util.Date;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by cjw on 2018/9/19.
 */
public interface TaskRepository extends PagingAndSortingRepository<Task, Long> {

  @Modifying
  @Query("update Task t set t.actionFeedback = ?2, t.collectTelRemark = ?3, t.collectTime = ?4"
      + " where t.orderId = ?1")
  int updateTaskActionByOrderId(String orderId, String actionFeedback, String remark,
      Date collectTime);

  Task findTopByOrderId(String orderId);
}

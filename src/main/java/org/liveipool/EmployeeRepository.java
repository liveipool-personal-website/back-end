package org.liveipool;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liveipool on 2018/5/6.
 */
public interface EmployeeRepository extends JpaRepository<Employee,String> {
}

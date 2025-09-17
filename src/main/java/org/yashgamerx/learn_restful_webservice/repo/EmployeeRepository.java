package org.yashgamerx.learn_restful_webservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yashgamerx.learn_restful_webservice.dao.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
